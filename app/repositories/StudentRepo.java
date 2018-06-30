package repositories;

import models.Model;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import java.util.List;

public class StudentRepo implements Repository{

    @Inject
    JPAApi jpa;

    @Override
    public List<Model> findAll() {
        return null;
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
