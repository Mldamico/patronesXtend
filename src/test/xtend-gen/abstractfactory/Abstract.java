package abstractfactory;

import abstractFactory.Automovil;
import abstractFactory.FabricaVehiculoElectricidad;
import abstractFactory.FabricaVehiculoGasolina;
import abstractFactory.Scooter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class Abstract {
  private FabricaVehiculoElectricidad fabricaElectricidad;
  
  private FabricaVehiculoGasolina fabricaGasolina;
  
  @Before
  public void init() {
    FabricaVehiculoElectricidad _fabricaVehiculoElectricidad = new FabricaVehiculoElectricidad();
    this.fabricaElectricidad = _fabricaVehiculoElectricidad;
    FabricaVehiculoGasolina _fabricaVehiculoGasolina = new FabricaVehiculoGasolina();
    this.fabricaGasolina = _fabricaVehiculoGasolina;
  }
  
  @Test
  public void CreoAutomovilElectrico() {
    Automovil autoElectrico = this.fabricaElectricidad.creaAutomovil("modelo1", "Verde", 20, 10.00);
    autoElectrico.mostrarCaracteristicas();
    Assert.assertEquals(20, autoElectrico.getPotencia());
  }
  
  @Test
  public void creoScooterElectrico() {
    Scooter scooterElectrico = this.fabricaElectricidad.creaScooter("modelo2", "azul", 30);
    scooterElectrico.mostrarCaracteristicas();
    Assert.assertEquals(30, scooterElectrico.getPotencia());
  }
  
  @Test
  public void CreoAutomovilGasolina() {
    Automovil autoGasolina = this.fabricaGasolina.creaAutomovil("Modelo Gasolina auto", "rojo", 30, 40.00);
    autoGasolina.mostrarCaracteristicas();
    Assert.assertEquals(30, autoGasolina.getPotencia());
  }
  
  @Test
  public void CreoScooterGasolina() {
    Scooter scooterGasolina = this.fabricaGasolina.creaScooter("Modelo Gasolina scooter", "verde", 50);
    scooterGasolina.mostrarCaracteristicas();
    Assert.assertEquals(50, scooterGasolina.getPotencia());
  }
}
