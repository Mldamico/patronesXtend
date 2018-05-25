package abstractFactory;

import abstractFactory.Automovil;
import abstractFactory.Scooter;

@SuppressWarnings("all")
public interface FabricaVehiculo {
  public abstract Automovil creaAutomovil(final String modelo, final String color, final int potencia, final double espacio);
  
  public abstract Scooter creaScooter(final String modelo, final String color, final int potencia);
}
