Feature: Manejar la barra de herramientas de windows
  Scenario: Abrir aplicaciones por medio de la barra de búsqueda
    Given Estamos en un sistema operativo Windows
    When Presionamos la tecla windows
    And Escribimos <aplicacion>
    And Damos enter
    Then Se abre <aplicación>