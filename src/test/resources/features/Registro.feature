@Suite @Registro
Feature: CP01 - Registros de Usuarios

  Background: Valida el registro de los usuarios

    Given el usuario ingresa sitio web

  @RegistroExitoso
  Scenario: 1 - Validar el registros de usuario con datos correctos
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente
    Then al seleccionar el boton Sing up la aplicacion hace el registro correctamente

  @CampoNombre
  Scenario: 2 - Validar el registros con una palabra en el campo nombre
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente y solo ingresa una paabra en el campo nombre
    Then la aplicacion no habilita el boton Sing Up

  @CampoCorreo
  Scenario: 3 - Validar el cumpimiento del formato del correo
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente e ingresa el correo en un formato diferente al admitido
    Then la aplicacion no habilita el boton Sing Up

  @CampoCorreDuplicado
  Scenario: 4 - Validar registro de usuario con correo registrado
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente e ingresa un correo ya registrado
    Then la aplicacion no debe dejar registrar al usuario

  @CampoContraseña
  Scenario: 5 - Validar longitud campo contraseña
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente e ingresa una contraseña de longitud menor a la permitida
    Then la aplicacion no habilita el boton Sing Up

  @CampoContraseña
  Scenario: 6 - Validar contraseña sin cracteres especiales
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente e ingresa una contraseña sin cracteres especiales
    Then la aplicacion no habilita el boton Sing Up

  @CampoObligatorios
  Scenario: 7 - Validar campo obligatorio Full Name
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente sin el campo full name
    Then la aplicacion no habilita el boton Sing Up

  @CampoObligatorios
  Scenario: 8 - Validar campo obligatorio Email
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente sin el campo Email
    Then la aplicacion no habilita el boton Sing Up
  @CampoObligatorios
  Scenario: 9 - Validar campo obligatorio Password
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente sin el campo Password
    Then la aplicacion no habilita el boton Sing Up
  @CampoObligatorios
  Scenario: 10 - Validar campo obligatorio Confirmacion Password
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente sin el campo Confirmacion Password
    Then la aplicacion no habilita el boton Sing Up
  @CamposContraseña
  Scenario: 11 - Validar informe de contraseñas no coinciden
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente con contraseñas diferentes
    Then la aplicacion no habilita el boton Sing Up
    And se visualiza un alert indicando que las contraseñas no coinciden
  @CampoContraseñaEspacio
  Scenario: 12 - Validar registro con espacios en la  contraseña
    When selecciona la opcion Sing Up
    And Diligencia el formulario correctamente con espacios en la contraseñas
    Then la aplicacion no habilita el boton Sing Up
