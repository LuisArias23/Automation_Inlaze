@Suite @Login
Feature: CP01 - Validar inicio de sesion

  Background: Valida el inicio de sesion con credeciales validas e invalidas

    Given el usuario navega al sitio web

  @ValidCredential
  Scenario: 1 - Validar con credenciales correctas
    When ingresa credenciales validas
    Then la aplicacion debe mostrar el modulo princial

  @InvalidCredential
  Scenario: 2 - Validar con contraseña incorrectas
    When ingresa con contraseña incorrectas
    Then la aplicacion debe mostrar un mensaje de error de password

  @InvalidCredential
  Scenario: 3 - Validar con correo incorrecto
    When ingresa con correo errado
    Then la aplicacion debe mostrar un mensaje de error de User

  @CamposVacios @UserNull
  Scenario: 4 - Validar campo correo vacio
    When ingresa con correo vacio
    Then la aplicacion no debe habilitar el boton SING IN

  @CamposVacios @passwordNull
  Scenario: 5 - Validar campo password vacio
    When ingresa con password vacio
    Then la aplicacion no debe habilitar el boton SING IN

  @NameUser
  Scenario: 6 - Validar Visualizacion del Nombre del usuario
    When ingresa credenciales validas
    Then Se visualiza el nombre del usuario en la aplicacion

  @close
  Scenario: 6 - Validar cierre de sesion
    When ingresa credenciales validas
    And seleccona la opcion Logut
    Then la aplicacion cierra sesion de manera corecta