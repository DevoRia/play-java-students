package services;

import models.Model;
import repositories.Repo;

import javax.inject.Inject;
import java.util.List;

public class DataService {

    @Inject
    private Repo repo;

    public List<Model> findAll() {
        return (List<Model>) repo.findAll();
    }

    public void save(Model model){
        repo.save(model);
    }

    public void edit(Model model){
        repo.edit(model);
    }

    public void remove(Model model) {
        repo.remove(model);
    }
}
