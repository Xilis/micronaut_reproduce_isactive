CREATE TABLE bananas
(
    banana_id BIGINT PRIMARY KEY,
    is_active BOOLEAN DEFAULT FALSE
);

ALTER SYSTEM SET log_statement = "all";
SELECT PG_RELOAD_CONF();
