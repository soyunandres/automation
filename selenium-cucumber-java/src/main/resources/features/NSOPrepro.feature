Feature: Validar NSO preoproducción
  Scenario: Abrir NSO preproductivo
    Given Se visualiza el ícono de acceso directo de NSO
    When Se da doble clic en el ícono de acceso directo de NSO
    And Se da clic en el botón Yes de la ventana user account control
    And Se ingresan los datos de usuario 110021 y contraseña 1
    And Se da clic en el botón Aceptar en la pantalla del login de NSO
    And Se selecciona en el catálogo la cartera TODO y se da clic en aceptar
    Then Se visualiza la terminal de NSO


