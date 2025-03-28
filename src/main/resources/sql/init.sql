CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS spaces (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    owner_id INT NOT NULL REFERENCES users(id)
);
