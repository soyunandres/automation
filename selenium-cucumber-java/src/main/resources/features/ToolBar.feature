
Feature: Abrir aplicaciones en windows usando la barra de tareas

  Scenario Outline: Abrir aplicaciones por medio de la barra de búsqueda de windows
    Given Estamos en un sistema operativo Windows
    When Presionamos la tecla windows
    And Escribimos  <aplicacion> en el cuadro de búsqueda
    And Damos enter
    Then Se abre una ventana con la aplicación
    Examples:
      | aplicacion        |
      | Escritorio remoto |