# A Simple Bookshop
A simple bookshop API. 

## Brief Description
A simple bookshop implemented to practice and aid understanding of concepts learnt in building Microservice Architecture.

The features are summarized below:
* Create/Read staff
* Create/Read books 
* Sell books
* View sales

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites
System requirements for this project to work includes:
* Java Development Kit (JDK) (v8 or higher)
* Maven 
* MySQL(v5 or higher)

### Installation
To install the dependencies in the ***pom.xml***, click on the "import changes" prompt after each service folder contained in the project folder has been opened.

### Running the project
To run the project on your local machine, run the following files **together** in the following service directories:  
* ***BookshopEurekaServerApplication.java***  
`bookshop-microservices/bookshop_eureka_server/src/main/java/com/emeka/bookshop_eureka_server/`

* ***BookshopInventoryApplication.java***  
`bookshop-microservices/bookshop_inventory/src/main/java/com/emeka/bookshop_inventory/`

* ***BookshopSalesApplication.java***  
`bookshop-microservices/bookshop_sales/src/main/java/com/emeka/bookshop_sales/`

* ***BookshopStaffManagementApplication.java***  
`bookshop-microservices/bookshop_staff_management/src/main/java/com/emeka/bookshop_staff_management/`

The various services can be tested via Postman with the following URLs: 
* Inventory - [http://localhost:8081]()  
* Sales - [http://localhost:8085]()
* Staff Management - [http://localhost:8080/staff]()

In addition, the Eureka Server UI can be visualized in the web browser via the URL: [http://localhost:8761]()


## Built With
* [Spring Boot](https://spring.io/projects/spring-boot) - The Java web framework used
* [MySQL](https://www.mysql.com/) - SQL Database
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - The Object Relational Mapping (ORM) dependency for Spring Boot
* [Eureka Server](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html) - Service Discovery
* [Hystrix](https://spring.io/guides/gs/circuit-breaker/) - Fault tolerance & resilience
* [Maven](https://www.npmjs.com/) - Dependency Manager for Java

