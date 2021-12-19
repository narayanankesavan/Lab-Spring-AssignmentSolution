create database studentsdb;
use studentsdb;

create table student
(
id int primary key auto_increment,
fname varchar(50),
lname varchar(50),
course varchar(50),
country varchar(50)
);
insert into student(fname,lname,course,country)
values('Suraj','Bhatia','M.Tech','India');


create table users
(
user_id int primary key auto_increment,
password varchar(200),
username varchar(200)
);
# user1 123456 $2a$12$fPG46xw31I6NnJfgR.UPjOAB5ZXk9Riq5/fF7mIiCek8iV.hMIApu
# user2 1234 $2a$12$N3tpuXet7YlYK2Xe2bWayux4/SimjLPA964wCWro2mduLVcHE9TOq


insert into users(user_id,password,username)
values(1,'$2a$12$fPG46xw31I6NnJfgR.UPjOAB5ZXk9Riq5/fF7mIiCek8iV.hMIApu','user1');

insert into users(user_id,password,username)
values(2,'$2a$12$N3tpuXet7YlYK2Xe2bWayux4/SimjLPA964wCWro2mduLVcHE9TOq','user2');


create table roles
(
role_id int primary key auto_increment,
name varchar(50)
);
insert into roles
values(1,'ADMIN');
insert into roles
values(2,'USER');

create table users_roles
(
user_id int,
role_id int,
foreign key(user_id) references users(user_id),
foreign key(role_id) references roles(role_id)
);

insert into users_roles
values(1,1);
insert into users_roles
values(2,2);






