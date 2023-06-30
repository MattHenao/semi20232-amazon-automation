# language: es
Característica: ingresar metodo de pago
  Yo como comprador
  Quiero ingresar un metodo de pago
  Para poder comprar productos

  @manual
  @manual-result:passed
  Escenario: ingresar metodo de pago
    Cuando ingreso informacion para metodo de pago
    Entonces puedo usar ese metodo de pago
      | - Ingresar a tu cuenta de Amazon         |
      | - Buscar producto y dar click en Buy now |
      | - Ingresar todos los datos requeridos    |
      | - Confirmar compra                       |