package edu.chalmers.tda593.hotelcalifornia.example.persistence;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 2014-12-11.
 */
public class PersistenceExample {

    private EntityManager em;

    @Inject
    PersistenceExample(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Transactional
    public void insertExampleEntity() {
        ExampleEntity exampleEntity = new ExampleEntity("Hello!");
        ExampleSubEntity exampleSubEntity = new ExampleSubEntity("Sub Hello!");

        exampleEntity.addSubEntity(exampleSubEntity);

        em.persist(exampleSubEntity);
        em.persist(exampleEntity);
    }

    @Transactional
    public void printExampleEntities() {
        // Print all ExampleEntities in the database
        System.out.println("ExampleEntities in DB:");
        List<ExampleEntity> result = em.createQuery("from ExampleEntity", ExampleEntity.class).getResultList();
        for (ExampleEntity entity : result) {
            System.out.println(entity);
            for(ExampleSubEntity subEntity : entity.getSubEntities()) {
                System.out.println("\t" + subEntity);
            }
        }
    }
}
