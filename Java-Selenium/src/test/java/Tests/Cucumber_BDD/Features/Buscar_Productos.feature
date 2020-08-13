#Contiene todos los escenarios de prueba escritos en lenguaje Gherkin
Feature: Buscar producto en Sitio
  Busco dreses y valido que la busqueda se haga bien.

Scenario: En el buscador del sitio se debe buscar tshirt
  Given El usuario ingresa a index page
  When  El usuario ingresa producto a Buscar en el elemento de busqueda
  Then  El usuario hace el click en el btn de Buscar
  Then  Los resultados de la busqueda aparecen



