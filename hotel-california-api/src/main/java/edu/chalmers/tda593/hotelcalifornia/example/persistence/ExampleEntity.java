package edu.chalmers.tda593.hotelcalifornia.example.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Peter on 2014-12-11.
 */
@Entity
public class ExampleEntity {
    @Id
    @GeneratedValue
    private int id;

    private String message;

    @OneToMany
    private Set<ExampleSubEntity> subEntities = new HashSet<>();

    public ExampleEntity(String message) {
        this.message = message;
    }

    protected ExampleEntity() {
    }

    public void addSubEntity(ExampleSubEntity subEntity) {
        subEntities.add(subEntity);
    }

    public Collection<ExampleSubEntity> getSubEntities() {
        return subEntities;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
