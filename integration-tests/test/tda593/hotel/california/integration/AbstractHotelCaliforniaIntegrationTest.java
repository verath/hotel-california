package tda593.hotel.california.integration;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Before;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import tda593.hotel.california.util.HotelCaliforniaManagersHandler;

import javax.xml.soap.SOAPException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;

/**
 * An abstract helper class for setting up the hotel california system.
 * 
 * @author Peter
 *
 */
public abstract class AbstractHotelCaliforniaIntegrationTest {

	Logger logger = Logger
			.getLogger(AbstractHotelCaliforniaIntegrationTest.class.getName());

	protected static Boolean canConnectToBankingComponent = true;
	protected HotelCaliforniaManagersHandler managersHandler;

	@Before
	public void initialize() throws Exception {
		if (canConnectToBankingComponent == null) {
			// HACK: Since the banking component only works when on Chalmers
			// network we use a mock component when we are not at chalmers or
			// for some other reason can not reach the banking component.
			try {
				// First do a quick test using an HTTP request. This is so that
				// we can quick-fail with a by us specified timeout (the banking
				// component does not allow us to set a custom timeout)
				URLConnection connection = new URL(
						"http://cepc36.ce.chalmers.se:8080/bankservice/BankService")
						.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();

				// It seems like we can connect. Use the "real" component once
				// just to make sure
				AdministratorRequires
						.instance()
						.getBalance("", "", 0, 0, "", "");
				canConnectToBankingComponent = true;
			} catch (SocketTimeoutException | SOAPException ex) {
				canConnectToBankingComponent = false;
				logger.log(
						Level.WARN,
						"Could not connect to remote banking component. Using mock banking service instead.");
			}
		}

		managersHandler = new HotelCaliforniaManagersHandler(
				!canConnectToBankingComponent);
	}
}
