# --- !Ups

create table answer (
  id                        integer primary key AUTO_INCREMENT,
  audio                     varchar(255),
  spelling                  varchar(255),
  game_session_id           integer,
  word_id                   integer,
  foreign key (game_session_id) references game_session (id),
  foreign key (word_id) references word (id)
)
;

create table category (
  id                        integer primary key AUTO_INCREMENT,
  name                      varchar(255)
)
;

create table game_session (
  id                        integer primary key AUTO_INCREMENT,
  sequence_number           integer,
  date                      date,
  correct_answers           integer,
  user_id                   integer,
  foreign key (user_id) references user (id)
)
;

create table user (
  id                        integer primary key AUTO_INCREMENT,
  first_name                varchar(255),
  second_name               varchar(255),
  birth_date                date,
  gender                    varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  level                     integer
)
;

create table word (
  id                        integer primary key AUTO_INCREMENT,
  spelling                  varchar(255),
  picture                   varchar(255),
  level                     integer,
  category_id               integer,
  foreign key (category_id) references category (id)
)
;

-- alter table answer add constraint fk_answer_gameSession_1 foreign key (game_session_id) references game_session (id);
-- create index ix_answer_gameSession_1 on answer (game_session_id);
-- alter table answer add constraint fk_answer_word_2 foreign key (word_id) references word (id);
-- create index ix_answer_word_2 on answer (word_id);
-- alter table game_session add constraint fk_game_session_user_3 foreign key (user_id) references user (id);
-- create index ix_game_session_user_3 on game_session (user_id);
-- alter table word add constraint fk_word_category_4 foreign key (category_id) references category (id);
-- create index ix_word_category_4 on word (category_id);



# --- !Downs

PRAGMA foreign_keys = OFF;

drop table answer;

drop table category;

drop table game_session;

drop table user;

drop table word;

PRAGMA foreign_keys = ON;

