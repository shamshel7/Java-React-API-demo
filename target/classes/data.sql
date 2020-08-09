DROP TABLE IF EXISTS messages;

CREATE TABLE messages (
    id INT PRIMARY KEY,
    NAME VARCHAR(250) NOT NULL,
    EMAIL VARCHAR(250) NOT NULL,
    ENQUIRY VARCHAR(MAX) NOT NULL
);

INSERT INTO messages (
    ID,
    NAME,
    EMAIL,
    ENQUIRY
) VALUES
    (1, 'First_Last_1', 'abc1@gmail.com', 'hello'),
    (2, 'First_Last_2', 'abc2@gmail.com', 'goodbye'),
    (3, 'First_Last_3', 'abc3@gmail.com', 'how are you?');



DROP TABLE IF EXISTS form_data;

CREATE TABLE form_data (
    id VARCHAR(250) PRIMARY KEY,
    FIELD_NAME VARCHAR(250) NOT NULL
);

INSERT INTO form_data (
    ID,
    FIELD_NAME
) VALUES
    ('name', 'Name'),
    ('email', 'E-mail'),
    ('enquiry', 'Enquiry');