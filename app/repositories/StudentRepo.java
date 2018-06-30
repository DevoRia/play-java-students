package repositories;

import models.Model;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import java.util.List;

public class StudentRepo implements Repository{

    @Inject
    private JPAApi jpa;

    @Override
    public List findAll() {
        return jpa.withTransaction(entityManager -> entityManager.createQuery("select s from Student s").getResultList());
    }

    @Override
    public void save(Model model) {

    }

    @Override
    public void edit(Model model) {

    }

    @Override
    public void remove(Model model) {

    }
}
