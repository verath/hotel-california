package edu.chalmers.tda593.hotelcalifornia.example.persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

/**
 * Created by Peter on 2014-12-11.
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        Injector injector = Guice.createInjector(
                new JpaPersistModule("edu.chalmers.tda593.hotelcalifornia"));

        injector.getInstance(PersistenceInitializer.class);
        PersistenceExample persistenceExample = injector.getInstance(PersistenceExample.class);

        persistenceExample.printExampleEntities();
        persistenceExample.insertExampleEntity();
        persistenceExample.printExampleEntities();
    }
}
