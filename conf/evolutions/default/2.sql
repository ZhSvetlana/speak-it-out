# --- !Ups


INSERT INTO `USER`(`id`,`first_name`,`second_name`,`birth_date`,`gender`,`email`,`password`,`level`) VALUES (1,'Sviatlana','Zhuravitskaya','2000-03-05','f','svet_grodno@mail.ru','password',1);

INSERT INTO `CATEGORY` (`id`,`name`) VALUES (1, 'animals');

INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (1, 'bear', 'images/animals/bear.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (2, 'cat', 'images/animals/cat.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (3, 'chicken', 'images/animals/chicken.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (4, 'cow', 'images/animals/cow.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (5, 'dog', 'images/animals/dog.png', 1, 1);
INSERT INTO `WORD` (`id`,`spelling`,`picture`,`level`,`category_id`) VALUES (4, 'duck', 'images/animals/duck.png', 1, 1);

INSERT INTO `USER`(`personID`,`email`,`firstname`,`lastname`,`birthday`,`address`,`phonenumber`,`pesel`,`password`,`typeOfAccount`, `numberOfPoints`) VALUES (100,'customer@gmail.com','Michalina','Gepart',NULL,NULL,NULL,NULL,'customer','CUSTOMER', 0);
INSERT INTO `USER`(`personID`,`email`,`firstname`,`lastname`,`birthday`,`address`,`phonenumber`,`pesel`,`password`,`typeOfAccount`, `numberOfPoints`) VALUES (101,'owner@gmail.com','Marcelina','Izworska',NULL,NULL,NULL,NULL,'owner','OWNER', 0);
INSERT INTO `USER`(`personID`,`email`,`firstname`,`lastname`,`birthday`,`address`,`phonenumber`,`pesel`,`password`,`typeOfAccount`, `numberOfPoints`) VALUES (102,'admin@gmail.com','Sveta','Zhuravitskaya',NULL,NULL,NULL,NULL,'admin','ADMIN', 0);


INSERT INTO `Auto`(`autoID`,`color`,`year`,`brand`,`model`,`numberOfDoors`,`maxSpeed`,`airConditioning`,`numberOfPlaces`,`engineCapacity`,`price`,`points`,`localization`,`photoLink`) VALUES (1 ,'yellow',2014, 'Lamborghini','Huracan',2,400,'y',2,5,300,30,2,'carPictures/lamborghini_huracan.jpg');
INSERT INTO `Auto`(`autoID`,`color`,`year`,`brand`,`model`,`numberOfDoors`,`maxSpeed`,`airConditioning`,`numberOfPlaces`,`engineCapacity`,`price`,`points`,`localization`,`photoLink`) VALUES (2 ,'white',2014, 'Fiat','Fiat500',2,200,'y',4,2,60,6,2,'carPictures/fiat_fiat500.jpg');
INSERT INTO `Auto`(`autoID`,`color`,`year`,`brand`,`model`,`numberOfDoors`,`maxSpeed`,`airConditioning`,`numberOfPlaces`,`engineCapacity`,`price`,`points`,`localization`,`photoLink`) VALUES (3 ,'white',2014, 'Aston Martin','Vantage',2,200,'y',4,2,200,6,2,'carPictures/astonMartin_vantage.jpg');
INSERT INTO `Auto`(`autoID`,`color`,`year`,`brand`,`model`,`numberOfDoors`,`maxSpeed`,`airConditioning`,`numberOfPlaces`,`engineCapacity`,`price`,`points`,`localization`,`photoLink`) VALUES (4 ,'orange',2014, 'Buddy','Electric',2,200,'y',4,2,20,6,2,'carPictures/buddy_electric.jpg');


# --- !Downs

drop table User;

drop table Category;

drop table Word;