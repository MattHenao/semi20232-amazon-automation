# language: es
Característica: agregar verificacion a dos pasos
  Yo como comprador
  Quiero agregar verificacion a dos pasos
  Para tener mejor seguridad en mi cuenta

  @manual
  @manual-result:passed
  Escenario: agregar verificacion a dos pasos
    Cuando realizo la verificacion a dos pasos
    Entonces tengo mas seguridad en mi cuenta
      | - Ingresar a tu cuenta de Amazon |
      | - Ir a Account                   |
      | - Click en Login & Security      |
      | - Click en 2-step verification   |
      | - Click en Get Started           |
      | - Realizar los pasos que dice    |