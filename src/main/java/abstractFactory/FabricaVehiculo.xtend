package abstractFactory

interface FabricaVehiculo {
	
	def Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
	def Scooter creaScooter(String modelo, String color, int potencia);
}

class FabricaVehiculoElectricidad implements FabricaVehiculo {
	override Automovil creaAutomovil(String modelo, String color, int potencia, double espacio){
		return new AutomovilElectricidad(modelo, color, potencia, espacio);		
	}
	override Scooter creaScooter(String modelo, String color, int potencia){
		return new ScooterElectricidad(modelo, color,potencia);
	}
}

class FabricaVehiculoGasolina implements FabricaVehiculo {
		override Automovil creaAutomovil(String modelo, String color, int potencia, double espacio){
		return new AutomovilGasolina(modelo, color, potencia, espacio);		
	}
	override Scooter creaScooter(String modelo, String color, int potencia){
		return new ScooterGasolina(modelo, color,potencia);
	}
}