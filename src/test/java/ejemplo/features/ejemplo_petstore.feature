@petstore_user
Feature: User
  As a user
  I want to register on petstore
  So I can buy petstore services


  Background:
    * url petStoreUrl
	#helper
    * def base_class = Java.type('ejemplo.utils.BaseUtil')
	* def util = new base_class()
	#request
    * def req_create_user = read('../request/create_user.json')
    #response
    * def res_create_user = read('../response/create_user.json')
    * def res_get_user = read('../response/get_user.json')


##### EJEMPLO UTILIZANDO DATOS ALEATORIOS
  @petstore_user_01 
  Scenario: Create user with random data
  	# CREATE USER
  	* def id = util.RandomNumber(5)
    * set req_create_user.id = id
    * set req_create_user.username = 'user'+id
    * set req_create_user.firstName = util.RandomString(8)
    * set req_create_user.lastName = util.RandomString(8)
    * set req_create_user.email = id + '@'+ util.RandomDomain()
    * set req_create_user.password = "112233"
    * set req_create_user.phone = util.RandomNumber(9)
    * set req_create_user.userStatus = 1
    Given path paths.user
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'
    And request req_create_user
    When method post
    Then status 200
    And print response
    And match response == res_create_user
    
    # GET CREATED USER
    Given path paths.user,req_create_user.username
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'
    When method get
    Then status 200
    And print response
    And match response == res_get_user