# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table course (
  id                            bigint auto_increment not null,
  constraint pk_course primary key (id)
);

create table course_map (
  id                            bigint auto_increment not null,
  constraint pk_course_map primary key (id)
);

create table inbox (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_inbox primary key (id)
);

create table message (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_message primary key (id)
);

create table message_thread (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_message_thread primary key (id)
);

create table user (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  password                      varchar(255),
  eaddress                      varchar(255),
  inbox_id                      bigint,
  user_id                       bigint,
  student_id                    bigint,
  constraint uq_user_user_id unique (user_id),
  constraint pk_user primary key (id)
);

alter table user add constraint fk_user_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;


# --- !Downs

alter table user drop foreign key fk_user_user_id;

drop table if exists course;

drop table if exists course_map;

drop table if exists inbox;

drop table if exists message;

drop table if exists message_thread;

drop table if exists user;

