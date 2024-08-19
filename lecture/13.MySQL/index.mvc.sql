create user 'user'@'%' identified by '1234'; -- 계정 추가 
grant all privileges on *.* to 'user'@'%' with grant option; -- 새로운 계정에 권한 부여
flush privileges; -- 캐시 지우고 새로운 설정
select * from mysql.user; -- 계정 생성 확인

alter user 'user'@'%' identified with mysql_native_password by '1234'; -- 인증 방식 변경

show databases;
use codingon;

create table visitor (
	id int not null primary key auto_increment,
    name varchar(10) not null,
    comment mediumtext
);

desc visitor;

insert into visitor values 
(null, '홍길동', '내가 왔다.'),
(null, '이찬혁', '으라차차');

insert into visitor values (null, '이수현', '아자자자');

select * from visitor;