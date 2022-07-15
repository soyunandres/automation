Feature: Probar la conexión a escritorio remoto

  Scenario: Probar la conexión VPN
    Given Tengo instalado forticlient
    When Abro forticlient
    And Tengo la configuración de la VPN
    And Ingreso las credenciales de la VPN y me conecto
    Then Ya puedo establecer la conexión mediante la VPN