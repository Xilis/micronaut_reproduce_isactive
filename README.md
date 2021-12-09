# Issue

The `isActive` property does not get mapped to the `is_active` column correctly. Using the `@MappedProperty` annotation
does not change anything.

```
2021-12-09 12:49:51.467 UTC [77] ERROR:  column banana_.active does not exist at character 28
2021-12-09T12:49:51.467249574Z 2021-12-09 12:49:51.467 UTC [77] HINT:  Perhaps you meant to reference the column "banana_.is_active".
2021-12-09T12:49:51.467254274Z 2021-12-09 12:49:51.467 UTC [77] STATEMENT:  SELECT banana_."banana_id",banana_."active",banana_."is_active" FROM "bananas" banana_
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

