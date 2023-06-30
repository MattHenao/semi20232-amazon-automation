# language: es
Característica: crear cuenta de amazon
  Yo como comprador
  Quiero crear cuenta de amazon
  Para poder comprar productos

  @manual
  @manual-result:passed
  Escenario: crear una cuenta de amazon
    Cuando doy click en New customer? Start here.
    Entonces ingreso mis datos para crear cuenta
      | - Ingresar nombre                                  |
      | - Ingresar correo electronico o numero de telefono |
      | - Ingresar contraseña                              |
      | - Confirmar contraseña                             |
      | - Verificar email por codigo                       |