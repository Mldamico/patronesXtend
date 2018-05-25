package abstractFactory;

import abstractFactory.Scooter;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class ScooterGasolina extends Scooter {
  public ScooterGasolina(final String modelo, final String color, final int potencia) {
    super(modelo, color, potencia);
  }
  
  public void mostrarCaracteristicas() {
    String _modelo = this.getModelo();
    String _plus = ("Scooter de gasolina de modelo: " + _modelo);
    String _plus_1 = (_plus + " de color: ");
    String _color = this.getColor();
    String _plus_2 = (_plus_1 + _color);
    String _plus_3 = (_plus_2 + 
      " de potencia: ");
    int _potencia = this.getPotencia();
    String _plus_4 = (_plus_3 + Integer.valueOf(_potencia));
    InputOutput.<String>println(_plus_4);
  }
}
