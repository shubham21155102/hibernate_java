## Hibernate FrameWork Based Initial Setup and Intro

**Spring Data JPA** is a part of the Spring Data family. It makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers.
(JAVA PERSISTANCE API)

- **JPA** is a specification that defines an API for object-relational mappings and for managing persistent objects.
- **Hibernate** is an implementation of the JPA specification.
- **Spring Data JPA** is a library/framework that adds an extra layer of abstraction on the top of our JPA provider. It makes it easier to build Spring-powered applications that use data access technologies.
- **Spring Data JPA** is a part of the Spring Data family. It makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers.
- **Spring Data JPA** provides repository support for the Java Persistence API (JPA). It eases development of applications that need to access JPA data sources.
- 

| Aspect        | Spring                     | Spring Boot                              | Spring Core                      | Spring Data JPA                        |
| ------------- | -------------------------- | ---------------------------------------- | -------------------------------- | -------------------------------------- |
| Description   | Comprehensive framework    | Simplifies Spring-based applications     | Central part for IoC and DI      | Simplifies data access with JPA        |
| Purpose       | Build enterprise Java apps | Rapidly set up and configure apps        | Manages objects and dependencies | Higher-level abstraction over JPA      |
| Features      | Various modules            | Auto-configuration, starter dependencies | IoC, DI, Bean management         | Repository interfaces, JPA integration |
| Key Component | IoC container              | Simplified configuration and deployment  | Dependency management            | Data access and CRUD operations        |
| Role          | Foundation framework       | Simplifies Spring configuration          | Manages object lifecycles        | Simplifies database interactions       |

## Hibernate

- A popular java ORM framework
- ORM: Object Relational Mapping
- -------------------------------|.                   -------------------------
- |      **App**
- |     id                        <------>                             Database
- |     name                <(O)  (R)>
- |     state                    <(M)>
- 

## Session Factory vs Session

**immutable/singleton** -> - session factory

**can be multiple** -> session
