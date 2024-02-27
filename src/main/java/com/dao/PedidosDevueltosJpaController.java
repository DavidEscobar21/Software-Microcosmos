/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.PedidosDevueltos;
import com.clases.exceptions.NonexistentEntityException;
import com.clases.exceptions.PreexistingEntityException;
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
public class PedidosDevueltosJpaController implements Serializable {

    public PedidosDevueltosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("DB");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PedidosDevueltos pedidosDevueltos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pedidosDevueltos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPedidosDevueltos(pedidosDevueltos.getIdPedidosDevueltos()) != null) {
                throw new PreexistingEntityException("PedidosDevueltos " + pedidosDevueltos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PedidosDevueltos pedidosDevueltos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pedidosDevueltos = em.merge(pedidosDevueltos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pedidosDevueltos.getIdPedidosDevueltos();
                if (findPedidosDevueltos(id) == null) {
                    throw new NonexistentEntityException("The pedidosDevueltos with id " + id + " no longer exists.");
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
            PedidosDevueltos pedidosDevueltos;
            try {
                pedidosDevueltos = em.getReference(PedidosDevueltos.class, id);
                pedidosDevueltos.getIdPedidosDevueltos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedidosDevueltos with id " + id + " no longer exists.", enfe);
            }
            em.remove(pedidosDevueltos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PedidosDevueltos> findPedidosDevueltosEntities() {
        return findPedidosDevueltosEntities(true, -1, -1);
    }

    public List<PedidosDevueltos> findPedidosDevueltosEntities(int maxResults, int firstResult) {
        return findPedidosDevueltosEntities(false, maxResults, firstResult);
    }

    private List<PedidosDevueltos> findPedidosDevueltosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PedidosDevueltos.class));
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

    public PedidosDevueltos findPedidosDevueltos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PedidosDevueltos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidosDevueltosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PedidosDevueltos> rt = cq.from(PedidosDevueltos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
