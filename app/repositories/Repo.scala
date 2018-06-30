package repositories
import java.util

import javax.inject.Inject
import models.Model
import play.db.jpa.JPAApi

class Repo @Inject()(jpa: JPAApi) extends Repository{

  override def findAll(): util.List[_] = jpa.withTransaction(_.createQuery("select s from Student s").getResultList)

  override def save(model: Model): Unit = jpa.withTransaction(_.persist(model))

  override def edit(model: Model): Unit = jpa.withTransaction(_.merge(model))

  override def remove(model: Model): Unit = jpa.withTransaction(em => em.remove(em.merge(model)))
}
