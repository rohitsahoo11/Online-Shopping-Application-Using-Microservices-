CREATE TABLE inventory (
    id BIGSERIAL PRIMARY KEY,
    sku_code VARCHAR(255) NOT NULL,
    quantity INT NOT NULL
);