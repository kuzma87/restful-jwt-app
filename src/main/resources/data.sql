INSERT INTO user (id, username, password, enabled) VALUES (1, 'user1', '$2a$10$De0garU25DmywIebw3n.Yet5sZAlxHc1MgIShDsdhvhUdfr7fMea2', TRUE );

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);

INSERT INTO hotel (id, name, has_pool, has_slides, has_tennis) VALUES (1, 'Hotel1', TRUE, TRUE, FALSE);
INSERT INTO hotel (id, name, has_pool, has_slides, has_tennis) VALUES (2, 'Hotel2', FALSE, FALSE, TRUE);
INSERT INTO hotel (id, name, has_pool, has_slides, has_tennis) VALUES (3, 'Hotel3', TRUE, TRUE, TRUE);
INSERT INTO hotel (id, name, has_pool, has_slides, has_tennis) VALUES (4, 'Hotel4', TRUE, FALSE , TRUE);

INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (2, 3, TRUE, TRUE, TRUE, 1);
INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (3, 1, TRUE, FALSE, TRUE, 1);
INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (1, 1, FALSE, FALSE, FALSE, 2);
INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (1, 1, FALSE, FALSE, FALSE, 3);
INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (1, 1, FALSE, FALSE, FALSE, 3);
INSERT INTO room (type, view, has_tv, has_balcony, has_air_cond, hotel_id) VALUES (1, 1, FALSE, FALSE, FALSE, 4);