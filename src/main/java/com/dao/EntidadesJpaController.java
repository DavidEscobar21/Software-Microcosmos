/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Entidades;
import com.dao.exceptions.NonexistentEntityException;
import com.dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author david
 */
public class EntidadesJpaController implements Serializable {

    public EntidadesJpaController() {
        this.emf =  Persistence.createEntityManagerFactory("DB");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Entidades entidades) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entidades);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEntidades(entidades.getIdEntidad()) != null) {
                throw new PreexistingEntityException("Entidades " + entidades + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Entidades entidades) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entidades = em.merge(entidades);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = entidades.getIdEntidad();
                if (findEntidades(id) == null) {
                    throw new NonexistentEntityException("The entidades with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entidades entidades;
            try {
                entidades = em.getReference(Entidades.class, id);
                entidades.getIdEntidad();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entidades with id " + id + " no longer exists.", enfe);
            }
            em.remove(entidades);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Entidades> findEntidadesEntities() {
        return findEntidadesEntities(true, -1, -1);
    }

    public List<Entidades> findEntidadesEntities(int maxResults, int firstResult) {
        return findEntidadesEntities(false, maxResults, firstResult);
    }

    private List<Entidades> findEntidadesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Entidades.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Entidades findEntidades(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Entidades.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntidadesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Entidades> rt = cq.from(Entidades.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
