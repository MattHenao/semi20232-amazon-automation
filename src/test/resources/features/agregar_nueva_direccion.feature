# language: es
Característica: agregar nueva direccion de entrega
  Yo como comprador
  Quiero agregar una nueva direccion
  Para que me envien los productos a esa direccion

  @manual
  @manual-result:passed
  Escenario: agregar nueva direccion de entrega
    Cuando agrego nueva direccion de entrega
    Entonces los productos me llegan a esa direccion
      | - Ingresar a tu cuenta de Amazon    |
      | - Ir a Account                      |
      | - Click en Your addresses           |
      | - Click en Add address              |
      | - Ingresar informacion de direccion |
      | - Click en Add address              |