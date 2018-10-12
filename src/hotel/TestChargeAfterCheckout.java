import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestChargeAfterCheckout {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testChargeAfterCheckout() {
		String selection = "d";
		int roomId = 101;
		state = state.ACCEPT;
		String Type = "v";
		int number = 1
		int ccv = 1
		String selection = "r";
		int roomId = 101;
		String serviceType = "s";
		int cost = 25;
		
		try {
			String result = hotel.addServiceCharge(roomNumber, serviceType, cost);
		}
		catch (Exception e) {
		    fail("Should not have thrown Exception");
		 }

	}

}
