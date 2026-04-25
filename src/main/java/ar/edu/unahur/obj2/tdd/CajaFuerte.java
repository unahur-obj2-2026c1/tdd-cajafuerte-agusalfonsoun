package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {

  private Boolean abierta = true;
  private Integer codigo;

  public boolean estaAbierta() {
    return this.abierta;
  }

  public void abrir(Integer unCodigo) {
    if (codigoCorrecto(unCodigo)) {
      this.abierta = true;
    }
  }

  public void cerrar(Integer codigo) {
   if (abierta()) {
     this.codigo = codigo;
     this.abierta = false;
   }
  }

  private Boolean abierta () {
    return this.abierta.equals(true);
  }

  private Boolean codigoCorrecto(Integer codigo) {
    return this.codigo.equals(codigo);
  }
}
