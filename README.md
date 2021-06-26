# spring-boot-microservice-example
A sample spring boot microservice application with Eureka and Api gateway


#client service
Here we have implemented two client service named as user-service and contact-service
port 9050 and 9051 has been configured here for both the client service respectively

#Eureka
e_server-service is the Eureka service where we have configured both the client service
Eureka server has been configured with default port of 8761

#Api-Gateway
This service has the routing mechanism for our client service
Our api-gateway has been configured with port 8762