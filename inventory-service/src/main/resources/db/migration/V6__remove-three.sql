DELETE FROM inventory
WHERE id IN (
    SELECT id
    FROM inventory
    ORDER BY id DESC
    LIMIT 10
);