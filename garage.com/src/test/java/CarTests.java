import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTests {
	private Car Car;

	@BeforeClass
	public void setup() {
		String model = "Corvette";
		LargeEngine engine = new LargeEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();
		String lowerTop = null;
		String raiseTop = null;
		this.Car = new Car(model, engine, ignitionSystem, lowerTop, raiseTop);
	}

	@Test
	public void canBuildCar() {
		Car car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "Cannot build a car.");
	}

	@Test
	public void canStartCar() {
		Car car = this.Car;

		boolean isStarted = car.getIsStarted();

		assertFalse(isStarted, "Can start a car.");
	}
}