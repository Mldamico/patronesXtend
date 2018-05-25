package abstractFactory;

import abstractFactory.Automovil;
import abstractFactory.AutomovilElectricidad;
import abstractFactory.FabricaVehiculo;
import abstractFactory.Scooter;
import abstractFactory.ScooterElectricidad;

@SuppressWarnings("all")
public class FabricaVehiculoElectricidad implements FabricaVehiculo {
  public Automovil creaAutomovil(final String modelo, final String color, final int potencia, final double espacio) {
    return new AutomovilElectricidad(modelo, color, potencia, espacio);
  }
  
  public Scooter creaScooter(final String modelo, final String color, final int potencia) {
    return new ScooterElectricidad(modelo, color, potencia);
  }
}
