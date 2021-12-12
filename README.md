---------------------------------------------------------------
Projeto web services com Spring Boot e JPA / Hibernate 
 
Objetivos 
 * Criar projeto Spring Boot Java 
 * Implementar modelo de domínio 
 * Estruturar camadas lógicas: resource, service, repository 
 * Configurar banco de dados de teste (H2) 
 * Povoar o banco de dados 
 * CRUD - Create, Retrieve, Update, Delete 
 * Tratamento de exceções 
---------------------------------------------------------------
 * Spring Boot, Apache Tomcat, Maven, H2, Postman
![1](https://user-images.githubusercontent.com/29668363/145061589-38220f71-f8f8-4a71-b28e-604fa50eee63.PNG)
---------------------------------------------------------------
 * Model aplication
![1](https://user-images.githubusercontent.com/29668363/145062725-176b0bef-1cfa-456e-a220-563ed8001eb8.PNG)
---------------------------------------------------------------
 * Domain Instance
![1](https://user-images.githubusercontent.com/29668363/145063821-6d9430f0-8726-48d3-bc21-e8220ef7ded9.PNG)
---------------------------------------------------------------
 * Logical Layers
![1](https://user-images.githubusercontent.com/29668363/145064200-514b6bfd-5bf0-4cd0-ad3a-f589bc179bc2.PNG)
---------------------------------------------------------------
Project created 
 
Checklist: 
*  File -> New -> Spring Starter Project 
 *  Maven 
 *  Java 11 
 *  Packing JAR 
 *  Dependencies: Spring Web Starter 
--------------------------------------------------------------- 
User entity and resource 
 
Basic entity checklist: 
 * Basic attributes 
 * Associations (instantiate collections) 
 *  Constructors 
 *  Getters & Setters (collections: only get) 
 *  hashCode & equals 
 *  Serializable 
 
 ---------------------------------------------------------------
 
 Checklist:
 * JPA & H2 dependencies
 * application.properties
 * application-test.properties
 * Entity: JPA mapping

Dependencies:
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>
  
  <dependency>
     <groupId>com.h2database</groupId>
     <artifactId>h2</artifactId>
     <scope>runtime</scope>
  </dependency>
  
application.properties:
  spring.profiles.active=test
  spring.jpa.open-in-view=true
 
application-test.properties:
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.username=sa
   spring.datasource.password=
   spring.h2.console.enabled=true
   spring.h2.console.path=/h2-console
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true

 ---------------------------------------------------------------
 *PA repository, dependency injection, database seeding
Checklist:
  * UserRepository extends JPARepository<User, Long>
  * Configuration class for "test" profile
  * @Autowired UserRepository
  * Instantiate objects in memory
  * Persist objects
    Objects:
    User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
    User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
  ---------------------------------------------------------------

