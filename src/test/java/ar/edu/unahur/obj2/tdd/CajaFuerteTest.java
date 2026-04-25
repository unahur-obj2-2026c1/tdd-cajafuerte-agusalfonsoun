package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
  @Test
  public void queLaCajaFuerteEsteAbiertaAlCrearse(){
    CajaFuerte caja = new CajaFuerte();
    assertTrue(caja.estaAbierta());
  }

  @Test
  public void queSePuedeCerrarLaCajaFuerteConUnCodigo(){
    CajaFuerte caja = new CajaFuerte();
    caja.cerrar(1234);
    assertFalse(caja.estaAbierta());
  }

  @Test
  public void queSePuedaAbrirLaCajaFuerteConElCodigoCodigo(){
    CajaFuerte caja = new CajaFuerte();
    caja.cerrar(1234);
    caja.abrir(1234);
    assertTrue(caja.estaAbierta());
  }

  @Test
  public void queNoPuedeAbrirLaCajaFuerteConElCodigoCodigoIncorrecto(){
    CajaFuerte caja = new CajaFuerte();
    caja.cerrar(1234);
    caja.cerrar(4321);
    caja.abrir(1234);
    assertTrue(caja.estaAbierta());
  }

  @Test
  public void queNoPuedeCerrarLaCajaFuerteEstandoCerrada(){
    CajaFuerte caja = new CajaFuerte();
    caja.cerrar(1234);
    caja.cerrar(4321);
    caja.abrir(1234);
    assertTrue(caja.estaAbierta());
  }

  /* 
    6. La Caja Fuerte se bloquea tras 3 intentos fallidos.
    Dado que la caja fuerte ha sido cerrada con un código.
    Cuando se intenta abrir con un código incorrecto 3 veces.
    Entonces la caja fuerte debe quedar bloqueada.

    7. Ojo con fallos eventuales.
      caja.cerrar(1234);
      caja.abrir(2032); 1
      caja.abrir(1224); 2
      caja.abrir(1234);
      caja.cerrar(8344); -> aca deberia resetear ...
      caja.abrir(8343); 3 
      assertTrue(caja.estaBloqueada());
  */

}