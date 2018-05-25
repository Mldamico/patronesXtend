package abstractFactory;

import abstractFactory.Automovil;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class AutomovilElectricidad extends Automovil {
  public AutomovilElectricidad(final String modelo, final String color, final int potencia, final double espacio) {
    super(modelo, color, potencia, espacio);
  }
  
  public void mostrarCaracteristicas() {
    String _modelo = this.getModelo();
    String _plus = ("Automovil electrico de modelo: " + _modelo);
    String _plus_1 = (_plus + " de color: ");
    String _color = this.getColor();
    String _plus_2 = (_plus_1 + _color);
    String _plus_3 = (_plus_2 + " de potencia: ");
    int _potencia = this.getPotencia();
    String _plus_4 = (_plus_3 + Integer.valueOf(_potencia));
    String _plus_5 = (_plus_4 + 
      " de espacio: ");
    double _espacio = this.getEspacio();
    String _plus_6 = (_plus_5 + Double.valueOf(_espacio));
    InputOutput.<String>println(_plus_6);
  }
}
