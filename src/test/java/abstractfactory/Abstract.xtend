package abstractfactory

import abstractFactory.FabricaVehiculoElectricidad
import abstractFactory.FabricaVehiculoGasolina
import org.junit.Before
import org.junit.Test
import org.junit.Assert

class Abstract {
	FabricaVehiculoElectricidad fabricaElectricidad
	FabricaVehiculoGasolina fabricaGasolina

	@Before
	def void init() {
		fabricaElectricidad = new FabricaVehiculoElectricidad()
		fabricaGasolina = new FabricaVehiculoGasolina()

	}

	@Test
	def void CreoAutomovilElectrico() {
		var autoElectrico = fabricaElectricidad.creaAutomovil("modelo1", "Verde", 20, 10.00)
		autoElectrico.mostrarCaracteristicas()
		Assert.assertEquals(20, autoElectrico.getPotencia())
	}

	@Test
	def void creoScooterElectrico() {
		var scooterElectrico = fabricaElectricidad.creaScooter("modelo2", "azul", 30)
		scooterElectrico.mostrarCaracteristicas()
		Assert.assertEquals(30, scooterElectrico.getPotencia())
	}

	@Test
	def void CreoAutomovilGasolina() {
		var autoGasolina = fabricaGasolina.creaAutomovil("Modelo Gasolina auto", "rojo", 30, 40.00)
		autoGasolina.mostrarCaracteristicas()
		Assert.assertEquals(30, autoGasolina.getPotencia())
	}

	@Test
	def void CreoScooterGasolina() {
		var scooterGasolina = fabricaGasolina.creaScooter("Modelo Gasolina scooter", "verde", 50)
		scooterGasolina.mostrarCaracteristicas()
		Assert.assertEquals(50, scooterGasolina.getPotencia())
	}
}
