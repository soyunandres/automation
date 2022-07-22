
Feature: Validar NSO de preproducción
  @ValidarAmbiente @ToolBar @NSO @Preproduccion
  Scenario Outline: Abrir aplicaciones por medio de la barra de búsqueda de windows
    Given Estamos en un sistema operativo Windows
    When Presionamos la tecla windows
    And Escribimos  <aplicacion> en el cuadro de búsqueda
    And Damos enter
    Then Se abre una ventana con la aplicación
    Examples:
      | aplicacion        |
      | Escritorio remoto |


  @ValidarAmbiente @RemoteDesktop @NSO @Preproduccion
  Scenario: Conectarse al escritorio remoto con las credenciales correctas
    Given La ventana con la conexión al escritorio remoto está abierta
    When Doy clic en el botón Conectar al escritorio remoto
    And Doy clic en el botón conectar en la ventana de confianza de la conexión remota
    And Doy clic en el botón sí en la ventana de la confirmación del certificado de escritorio remoto
    Then Se muestra el escritorio del equipo remoto

  @ValidarAmbiente @RemoteDesktop @NSO @Preproduccion
  Scenario: Abrir NSO preproductivo
    Given Se visualiza el ícono de acceso directo de NSO
    When Se da doble clic en el ícono de acceso directo de NSO
    And Se da clic en el botón Yes de la ventana user account control
    And Se ingresan los datos de usuario 110021 y contraseña 1
    And Se da clic en el botón Aceptar en la pantalla del login de NSO
    Then Se visualiza la terminal de NSO

