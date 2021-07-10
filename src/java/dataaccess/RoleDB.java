package dataaccess;

import javax.persistence.EntityManager;
import models.Role;

public class RoleDB {
    public Role get(String owner) {

        EntityManager em = DBUtil.getEmFactory().createEntityManager();

        try {
            Role role = em.find(Role.class, owner);
            return role;

        } finally {
            em.close();
        }
    }
}
