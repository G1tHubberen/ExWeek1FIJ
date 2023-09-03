# ExWeek1FIJ
I was able to connect with my database however the tables were not created and I ran out of time and solutions to fix it.


The idea with, and reasons for why to use, a ORM-mapper
   ***
   
The meaning of the terms JPA, Hibernate and Spring Data JPA and how they are connected
   JPA is a Java specification for managing relational data in applications. It provides a set of interfaces and annotations 
   that standardize how Java objects are mapped to relational database tables and how they can be persisted, retrieved, and queried.
   Hibernate is an implementation of the JPA specification. It is a powerful and widely used Object-Relational Mapping (ORM) framework 
   that provides a way to map Java objects to database tables.
   Spring Data JPA is a subproject of the Spring Framework that simplifies the implementation of JPA-based repositories.It builds 
   upon the JPA and Hibernate foundations and provides additional abstractions and features to make data access even easier.
   
How to create simple Java entities and map them to a database via the Spring Data API
   ***
   
How to control the mapping between individual fields in an Entity class and their matching columns in the database
   ***
   
How to auto generate IDs, and how to ensure we are using  a specific database's preferred way of doing it (Auto Increment in our case for  MySQL)
   private UUID generateId() {
        return UUID.randomUUID();
    }
   
How to use and define repositories and relevant query methods using Spring Data JPAs repository pattern
   ***
   
How to write simple "integration" tests, using H2 as a mock-database instead of MySQL
   ***
   
How to add (dev) connection details for you local MySQL database
   ***


   
