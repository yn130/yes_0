show databases;
use codingon;

create table visitor (
	id int not null primary key auto_increment,
    name varchar(10) not null,
    comment mediumtext
)