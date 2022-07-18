@toolbaropenapp
Feature: Manejar la barra de herramientas de windows
  Scenario: Abrir aplicaciones por medio de la barra de búsqueda de windows
    Given Estamos en un sistema operativo Windows
    When Presionamos la tecla windows
    And Escribimos Escritorio remoto
    And Damos enter
    Then Se abre una ventana con el nombre Escritorio remoto