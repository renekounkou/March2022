import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar ConvertibleCar;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();
		String lowerTop = null;
		String raiseTop = null;

		this.ConvertibleCar = new ConvertibleCar(model, engine, ignitionSystem);
		
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.ConvertibleCar;

		String actualModel = car.getModel();

		assertEquals(actualModel, car.getModel() , "Cannot build a Miata Model.");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.ConvertibleCar;
		
		boolean isStarted = car.getIsStarted();

		assertFalse(isStarted, "Can start a convertible car.");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.ConvertibleCar;
		String lowerTop = car.getLowerTop();
		assertEquals(lowerTop, car.getLowerTop(), "The Top cannot be lowered.");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.ConvertibleCar;
		String raiseTop = car.getRaiseTop();
		assertEquals(raiseTop, car.getRaiseTop(), "The Top cannot be raised.");
	}
}