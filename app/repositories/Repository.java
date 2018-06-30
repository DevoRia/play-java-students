package repositories;

import models.Model;

import java.util.List;

public interface Repository {

    List findAll();
    void save (Model model);
    void edit (Model model);
    void remove (Model model);
}
