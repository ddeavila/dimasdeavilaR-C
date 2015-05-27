/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.basededatos.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JTextField;
import unicordoba.registro.basededatos.controlador.exceptions.NonexistentEntityException;
import unicordoba.registro.basededatos.entity.Utencilio;

/**
 *
 * @author dimas
 */
public class UtencilioJpaController implements Serializable {

    public UtencilioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Utencilio utencilio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(utencilio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Utencilio utencilio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            utencilio = em.merge(utencilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = utencilio.getId();
                if (findUtencilio(id) == null) {
                    throw new NonexistentEntityException("The utencilio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Utencilio utencilio;
            try {
                utencilio = em.getReference(Utencilio.class, id);
                utencilio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The utencilio with id " + id + " no longer exists.", enfe);
            }
            em.remove(utencilio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Utencilio> findUtencilioEntities() {
        return findUtencilioEntities(true, -1, -1);
    }

    public List<Utencilio> findUtencilioEntities(int maxResults, int firstResult) {
        return findUtencilioEntities(false, maxResults, firstResult);
    }

    private List<Utencilio> findUtencilioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Utencilio.class));
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

    public Utencilio findUtencilio(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Utencilio.class, id);
        } finally {
            em.close();
        }
    }

    public int getUtencilioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Utencilio> rt = cq.from(Utencilio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void edit(JTextField codigoTextField, JTextField descripcionTextField, JTextField estadoTextField) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
