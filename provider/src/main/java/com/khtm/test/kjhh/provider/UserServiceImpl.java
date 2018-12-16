package com.khtm.test.kjhh.provider;

import com.khtm.test.kjhh.common.User;
import com.khtm.test.kjhh.common.UserService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext(name = "user-service")
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void addUser(User user) {
        entityManager.persist(user);
    }
}
