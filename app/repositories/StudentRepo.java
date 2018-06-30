package repositories;

import models.Model;
import models.Student;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.function.Function;

public class StudentRepo implements Repository{

    @Inject
    private JPAApi jpa;

    @Override
    public List findAll() {
        return jpa.withTransaction(entityManager -> entityManager.createQuery("select s from Student s").getResultList());
    }

    @Override
    public void save(Model model) {
        jpa.withTransaction(em -> em.merge(model));
    }

    @Override
    public void edit(Model model) {
        save(model);
    }

    @Override
    public void remove(Model model) {
    }
}
