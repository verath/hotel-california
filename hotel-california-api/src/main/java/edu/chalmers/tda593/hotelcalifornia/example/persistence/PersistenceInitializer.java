package edu.chalmers.tda593.hotelcalifornia.example.persistence;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

/**
 * Created by Peter on 2014-12-12.
 */
public class PersistenceInitializer {

    @Inject
    public PersistenceInitializer(PersistService service) {
        service.start();
    }
}
