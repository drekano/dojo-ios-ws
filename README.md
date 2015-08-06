# dojo-ios-ws
Webservices usado no dojo de IOS

# Insert
curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" , "email" : "teste@teste.com.br", "password" : "123"}' http://localhost:8080/people

# Update
curl -X PUT -H "Content-Type:application/json" -d '{ "firstName": "Bilbo", "lastName": "Baggins" }' http://localhost:8080/people/1

# Delete
curl -X DELETE http://localhost:8080/people/1

# Find by id
curl http://localhost:8080/people/1

# Login
curl -i -X POST  -d 'email=teste@teste.com.br&password=123' http://localhost:8080/login
