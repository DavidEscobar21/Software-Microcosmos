/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.FacturasDevueltas;
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
public class FacturasDevueltasJpaController implements Serializable {

    public FacturasDevueltasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("DB");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FacturasDevueltas facturasDevueltas) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(facturasDevueltas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFacturasDevueltas(facturasDevueltas.getIdFacturaDevuelta()) != null) {
                throw new PreexistingEntityException("FacturasDevueltas " + facturasDevueltas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FacturasDevueltas facturasDevueltas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            facturasDevueltas = em.merge(facturasDevueltas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = facturasDevueltas.getIdFacturaDevuelta();
                if (findFacturasDevueltas(id) == null) {
                    throw new NonexistentEntityException("The facturasDevueltas with id " + id + " no longer exists.");
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
            FacturasDevueltas facturasDevueltas;
            try {
                facturasDevueltas = em.getReference(FacturasDevueltas.class, id);
                facturasDevueltas.getIdFacturaDevuelta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The facturasDevueltas with id " + id + " no longer exists.", enfe);
            }
            em.remove(facturasDevueltas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FacturasDevueltas> findFacturasDevueltasEntities() {
        return findFacturasDevueltasEntities(true, -1, -1);
    }

    public List<FacturasDevueltas> findFacturasDevueltasEntities(int maxResults, int firstResult) {
        return findFacturasDevueltasEntities(false, maxResults, firstResult);
    }

    private List<FacturasDevueltas> findFacturasDevueltasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FacturasDevueltas.class));
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

    public FacturasDevueltas findFacturasDevueltas(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FacturasDevueltas.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturasDevueltasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FacturasDevueltas> rt = cq.from(FacturasDevueltas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
