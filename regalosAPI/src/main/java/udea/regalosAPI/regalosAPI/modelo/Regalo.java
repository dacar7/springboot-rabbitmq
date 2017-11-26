package udea.regalosAPI.regalosAPI.modelo;

/**
 * Created by David on 25/11/2017.
 */
public class Regalo {
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  private String id;
  private String nombre;
  private String tipo;
  private double valor;
}
