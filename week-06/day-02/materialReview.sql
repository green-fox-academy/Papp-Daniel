create database blog;

use blog;

create table users (
	id int primary key auto_increment,
    name varchar(30),
    age int
);

insert into users (name, age) values ('Sanyi', 30);
insert into users (name, age) values ('Dani', 22);
insert into users (name, age) values ('Robi', 21);

select * from users;

create table posts (
	id int primary key auto_increment,
    title varchar(100),
    contant text,
    author_id int
);

insert into posts (title, contant, author_id) values ('New blogpost', 'Nice new blogpost', 1);
insert into posts (title, contant, author_id) values ('Second blogpost', 'Nice second blogpost', 1);
insert into posts (title, contant, author_id) values ('Second blogpost', 'Nice second blogpost', 2);

select name, count(posts.id) from users
left join posts on posts.author_id = users.id
group by users.name
order by users.name;

update posts set contant = 'This is a very nice blogpost' where id = 2;

delete from posts where id = 2;
select * from posts;



