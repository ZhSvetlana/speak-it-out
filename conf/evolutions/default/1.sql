# --- !Ups

create table answer (
  id                        integer primary key AUTOINCREMENT,
  audio                     varchar(255),
  spelling                  varchar(255),
  gameSession_Id           integer,
  word_Id                   integer,
  foreign key (gameSession_Id) references gameSession (id),
  foreign key (word_Id) references word (id)
)
;

create table category (
  id                        integer primary key AUTOINCREMENT,
  name                      varchar(255)
)
;

create table gameSession (
  id                        integer primary key AUTOINCREMENT,
  sequenceNumber           integer,
  date                      timestamp,
  correctAnswers           integer,
  user_Id                   integer,
  foreign key (user_Id) references user (id)
)
;

create table user (
  id                        integer primary key AUTOINCREMENT,
  firstName                varchar(255),
  secondName               varchar(255),
  birthDate                date,
  gender                    varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  level                     integer
)
;

create table word (
  id                        integer primary key AUTOINCREMENT,
  spelling                  varchar(255),
  picture                   varchar(255),
  level                     integer,
  category_Id               integer,
  foreign key (category_Id) references category (id)
)
;

-- alter table answer add constraint fk_answer_gameSession_1 foreign key (game_session_id) references game_session (id);
create index ix_answer_gameSession_1 on answer (gameSession_Id);
-- alter table answer add constraint fk_answer_word_2 foreign key (word_id) references word (id);
create index ix_answer_word_2 on answer (word_Id);
-- alter table game_session add constraint fk_game_session_user_3 foreign key (user_id) references user (id);
create index ix_gameSession_user_3 on gameSession (user_Id);
-- alter table word add constraint fk_word_category_4 foreign key (category_id) references category (id);
create index ix_word_category_4 on word (category_Id);



# --- !Downs

PRAGMA foreign_keys = OFF;

drop table answer;

drop table category;

drop table gameSession;

drop table user;

drop table word;

PRAGMA foreign_keys = ON;

