# language: es
Característica: realizar captcha
  Yo como comprador
  Quiero realizar el captcha
  Para poder entrar a la pagina

  @manual
  @manual-result:passed
  Escenario: realizar captcha
    Cuando entro a la pagina y me salta captcha
    Entonces ingreso el captccha para entrar
      | - Ingresar pagina Amazon     |
      | - Ingresar captcha requerido |
      | - Ingresar a la pagina       |