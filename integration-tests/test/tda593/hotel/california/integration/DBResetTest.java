package tda593.hotel.california.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.persistence.NoResultException;

import org.junit.Test;

import tda593.hotel.california.booking.LegalEntityManager;

/**
 * Created by Peter on 2014-12-30.
 */
public class DBResetTest extends AbstractHotelCaliforniaIntegrationTest {

	@Test
	public void testOne() {
		LegalEntityManager legalEntityManager = managersHandler
				.getLegalEntityManager();

		try {
			legalEntityManager.getPerson("1");
			fail("Person exist");
		} catch (NoResultException ex) {
		}

		legalEntityManager.createPerson("Thomas", "Anderson", "1",
				"0712345678", "neo@matrix.com");

		assertNotNull(legalEntityManager.getPerson("1"));
	}

	@Test
	public void testTwo() {
		LegalEntityManager legalEntityManager = managersHandler
				.getLegalEntityManager();

		try {
			legalEntityManager.getPerson("1");
			fail("Person exist");
		} catch (NoResultException ex) {
		}

		legalEntityManager.createPerson("Thomas", "Anderson", "1",
				"0712345678", "neo@matrix.com");

		assertNotNull(legalEntityManager.getPerson("1"));
	}
}
