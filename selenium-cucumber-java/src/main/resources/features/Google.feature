Feature: Probar la búsqueda de google
  Scenario: Buscar algo en google
    Given Ingresamos a la página de google
    When Esccribimos algo en la barra de búsqueda
    And Damos enter
    Then Nos muestra los resultados de la búsqueda
