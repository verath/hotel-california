package edu.chalmers.tda593.hotelcalifornia.example.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Peter on 2014-12-12.
 */
@Entity
public class ExampleSubEntity {

    @Id
    @GeneratedValue
    private int id;

    private String message;

    protected ExampleSubEntity() {}

    public ExampleSubEntity(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExampleSubEntity{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
