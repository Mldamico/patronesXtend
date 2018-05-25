package abstractFactory

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
abstract class Scooter {
	String modelo;
	String color;
	int potencia;
	
	new(String modelo, String color, int potencia){
		this.modelo = modelo;
		this.color= color;
		this.potencia = potencia;
	}
	
	def void mostrarCaracteristicas();
}

class ScooterElectricidad extends Scooter {
	new(String modelo, String color, int potencia){
		super(modelo,color,potencia)
	}
	
	override mostrarCaracteristicas(){
		println("Scooter electrica de modelo: " +
modelo + " de color: " + color +
" de potencia: " + potencia)
	}
}

class ScooterGasolina extends Scooter {
	new(String modelo, String color, int potencia){
		super(modelo,color,potencia)
	}
	
	override mostrarCaracteristicas(){
		println("Scooter de gasolina de modelo: " +
modelo + " de color: " + color +
" de potencia: " + potencia)
	}
}