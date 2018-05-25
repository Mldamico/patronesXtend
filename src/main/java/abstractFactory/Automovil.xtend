package abstractFactory

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
abstract class Automovil {
	String modelo;
	String color;
	int potencia;
	double espacio;

	new(String modelo, String color, int potencia, double espacio) {
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
	}

	def void mostrarCaracteristicas();
}

class AutomovilElectricidad extends Automovil {
	new(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio)
	}

	override mostrarCaracteristicas() {
		println(
			"Automovil electrico de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia +
				" de espacio: " + espacio)
	}
}

class AutomovilGasolina extends Automovil {
	new(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio)
	}

	override mostrarCaracteristicas() {
		println(
			"Automovil de gasolina de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia +
				" de espacio: " + espacio)
	}
}
