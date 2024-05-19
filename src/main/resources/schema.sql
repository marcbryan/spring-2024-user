INSERT INTO "user" (full_Name, email, password, phone_number)
VALUES ('Juan Palomo', 'juanpa@gmail.com', '12345', 654233521)
     , ('Francisco Pérez', 'fperez@gmail.com', 'blabla', 612446666)
     , ('José Manuel García', 'jmgarcia@terra.es', 'manue', 608721126)
     , ('Carles Vidal', 'vidal_c@gmail.com', 'admin', 654233521)
     , ('Nil Carbonell', 'neil@gmail.com', 'root', 654233521)
     ;

-- Inserts alertas
INSERT INTO alert ("from", product_id, "to", user_id)
VALUES ('2024-05-17', 1, '2024-05-24', 1)
    ,  ('2024-05-18', 1, '2024-05-23', 2)
    ,  ('2024-05-20', 1, '2024-05-22', 3)

    ,  ('2024-05-17', 2, '2024-05-23', 1)
    ,  ('2024-05-19', 2, '2024-05-24', 2)
    ,  ('2024-05-18', 2, '2024-05-25', 3)

    ,  ('2024-05-20', 3, '2024-05-25', 1)
    ,  ('2024-05-18', 3, '2024-05-25', 2)
    ,  ('2024-05-19', 3, '2024-05-23', 3)

    ,  ('2024-05-20', 4, '2024-05-24', 1)
    ,  ('2024-05-21', 4, '2024-05-25', 2)
    ,  ('2024-05-23', 4, '2024-05-26', 3)
;
