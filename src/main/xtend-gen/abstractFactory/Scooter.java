package abstractFactory;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class Scooter {
  private String modelo;
  
  private String color;
  
  private int potencia;
  
  public Scooter(final String modelo, final String color, final int potencia) {
    this.modelo = modelo;
    this.color = color;
    this.potencia = potencia;
  }
  
  public abstract void mostrarCaracteristicas();
  
  @Pure
  public String getModelo() {
    return this.modelo;
  }
  
  public void setModelo(final String modelo) {
    this.modelo = modelo;
  }
  
  @Pure
  public String getColor() {
    return this.color;
  }
  
  public void setColor(final String color) {
    this.color = color;
  }
  
  @Pure
  public int getPotencia() {
    return this.potencia;
  }
  
  public void setPotencia(final int potencia) {
    this.potencia = potencia;
  }
}
