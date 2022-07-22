
Feature: Conectarse al escritorio remoto

  Scenario: Conectarse al escritorio remoto con las credenciales correctas
    Given La ventana con la conexión al escritorio remoto está abierta
    When Doy clic en el botón Conectar al escritorio remoto
    And Doy clic en el botón conectar en la ventana de confianza de la conexión remota
    And Doy clic en el botón sí en la ventana de la confirmación del certificado de escritorio remoto
    Then Se muestra el escritorio del equipo remoto

