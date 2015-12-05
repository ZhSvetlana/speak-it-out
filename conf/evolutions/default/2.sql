# --- !Ups


INSERT INTO `USER`(`id`,`firstName`,`secondName`,`birthDate`,`gender`,`email`,`password`,`level`) VALUES (1,'Sviatlana','Zhuravitskaya','2000-03-05','f','svet_grodno@mail.ru','password',1);

INSERT INTO `CATEGORY` (`id`,`name`) VALUES (1, 'animals');

INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (1, 'bear', 'images/animals/bear.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (2, 'cat', 'images/animals/cat.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (3, 'chicken', 'images/animals/chicken.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (4, 'cow', 'images/animals/cow.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (5, 'dog', 'images/animals/dog.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (6, 'duck', 'images/animals/duck.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (7, 'fish', 'images/animals/fish.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (8, 'mouse', 'images/animals/mouse.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (9, 'pig', 'images/animals/pig.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (10, 'rabbit', 'images/animals/rabbit.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (11, 'camel', 'images/animals/camel.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (12, 'crocodile', 'images/animals/crocodile.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (13, 'elephant', 'images/animals/elephant.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (14, 'fox', 'images/animals/fox.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (15, 'frog', 'images/animals/frog.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (16, 'horse', 'images/animals/horse.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (17, 'lion', 'images/animals/lion.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (18, 'tiger', 'images/animals/tiger.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (19, 'wolf', 'images/animals/wolf.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (20, 'zebra', 'images/animals/zebra.png', 2, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (21, 'butterfly', 'images/animals/butterfly.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (22, 'crow', 'images/animals/crow.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (23, 'dolphin', 'images/animals/dolphin.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (24, 'eagle', 'images/animals/eagle.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (25, 'kangaroo', 'images/animals/kangaroo.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (26, 'parrot', 'images/animals/parrot.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (27, 'penguin', 'images/animals/penguin.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (28, 'pigeon', 'images/animals/pigeon.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (29, 'sheep', 'images/animals/sheep.png', 3, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`categoryId`) VALUES (30, 'snake', 'images/animals/snake.png', 3, 1);

# --- !Downs

drop table User;

drop table Category;

drop table Word;