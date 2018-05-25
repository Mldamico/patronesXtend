package abstractFactory;

import abstractFactory.Automovil;
import abstractFactory.AutomovilGasolina;
import abstractFactory.FabricaVehiculo;
import abstractFactory.Scooter;
import abstractFactory.ScooterGasolina;

@SuppressWarnings("all")
public class FabricaVehiculoGasolina implements FabricaVehiculo {
  public Automovil creaAutomovil(final String modelo, final String color, final int potencia, final double espacio) {
    return new AutomovilGasolina(modelo, color, potencia, espacio);
  }
  
  public Scooter creaScooter(final String modelo, final String color, final int potencia) {
    return new ScooterGasolina(modelo, color, potencia);
  }
}
