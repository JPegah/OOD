# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table assignment (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_assignment primary key (id)
);

create table comment_system (
  id                            bigint auto_increment not null,
  constraint pk_comment_system primary key (id)
);

create table course (
  dtype                         varchar(10) not null,
  course_num                    varchar(255) not null,
  course_name                   varchar(255),
  department                    varchar(255),
  year                          integer,
  term                          integer,
  group_number                  integer,
  constraint pk_course primary key (course_num)
);

create table course_map (
  id                            bigint auto_increment not null,
  constraint pk_course_map primary key (id)
);

create table course_material (
  id                            bigint auto_increment not null,
  constraint pk_course_material primary key (id)
);

create table grade (
  id                            bigint auto_increment not null,
  value                         integer,
  constraint pk_grade primary key (id)
);

create table inbox (
  dtype                         varchar(10) not null,
  user_id                       bigint,
  constraint uq_inbox_user_id unique (user_id)
);

create table message (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  content                       varchar(255),
  time                          datetime(6),
  writer                        varchar(255),
  constraint pk_message primary key (id)
);

create table message_thread (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  subject                       varchar(255),
  constraint pk_message_thread primary key (id)
);

create table my_user (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  password                      varchar(255),
  eaddress                      varchar(255),
  inbox_id                      bigint,
  user_id                       bigint,
  student_id                    bigint,
  constraint uq_my_user_user_id unique (user_id),
  constraint pk_my_user primary key (id)
);

create table project (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_project primary key (id)
);

create table project_phase (
  id                            bigint auto_increment not null,
  deadline                      datetime(6),
  constraint pk_project_phase primary key (id)
);

create table resources (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_resources primary key (id)
);

create table task (
  dtype                         varchar(10) not null,
  id                            bigint auto_increment not null,
  constraint pk_task primary key (id)
);

alter table inbox add constraint fk_inbox_user_id foreign key (user_id) references my_user (id) on delete restrict on update restrict;

alter table my_user add constraint fk_my_user_user_id foreign key (user_id) references my_user (id) on delete restrict on update restrict;


# --- !Downs

alter table inbox drop foreign key fk_inbox_user_id;

alter table my_user drop foreign key fk_my_user_user_id;

drop table if exists assignment;

drop table if exists comment_system;

drop table if exists course;

drop table if exists course_map;

drop table if exists course_material;

drop table if exists grade;

drop table if exists inbox;

drop table if exists message;

drop table if exists message_thread;

drop table if exists my_user;

drop table if exists project;

drop table if exists project_phase;

drop table if exists resources;

drop table if exists task;

