# Issue

The `isActive` property does not get mapped to the `is_active` column correctly. Using the `@MappedProperty` annotation
does not change anything.

```
SELECT banana_."banana_id",banana_."active",banana_."is_active",banana_."is_active",banana_."very_interesting" FROM "bananas" banana_
```
## Description

## Reproduction steps

- `docker-compose up` to start postgres container which will automatically execute the db/db.sql file to create table
- launch app
- go to localhost:8080/swagger-ui and execute the call, observing the error

## Micronaut 3.2.1 Documentation

- [User Guide](https://docs.micronaut.io/3.2.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.2.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.2.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature data-jdbc documentation

- [Micronaut Data JDBC documentation](https://micronaut-projects.github.io/micronaut-data/latest/guide/index.html#jdbc)

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature openapi documentation

- [Micronaut OpenAPI Support documentation](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/index.html)

- [https://www.openapis.org](https://www.openapis.org)

