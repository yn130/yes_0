-- DML (Data Definition Lanaguage)
create table customer (
	custid char(10) primary key, -- pk
    custname varchar(10) not null,
    addr char(10) not null,
    phone char(11),
    birth date
);

create table orders (
	orderid int primary key auto_increment, -- pk
    custid char(10) not null, -- fk
    prodname char(6) not null,
    price int not null,
    amount smallint not null,
    foreign key (custid) references customer(custid) on update cascade on delete cascade -- fk 설정
);

-- 외래키 제약조건
-- 두 테이블 사이에 관계를 맺음 -> 데이터의 무결성
-- 다른 테이블의 기본키를 이 테이블의 외래키로 연결

-- 용어
-- 기준 테이블: 기본키를 갖는 테이블 (customer)
-- 참조 테이블: 외래키가 있는 테이블 (orders)
-- 외래키 연결: foreign key (참조테이블_열이름) references 기준테이블(열이름)

-- on update cascade: 기준 테이블의 데이터가 변경되면 참조 테이블의 데이터도 변경
-- on delete cascade: 기준 테이블의 데이터가 삭제되면 참조 테이블의 데이터도 삭제

-- 테이블끼리 관계를 맺고 나면 테이블 삭제할 때 주의
-- customer.custid, orders.custid "관계"를 맺음
-- customer에 존재하는 회원만 orders 테이블에 데이터를 추가 
-- orders테이블이 존재하고 있는 상황에서 customer 테이블을 삭제(drop)하면?
-- orders 테이블은 어떤 고객의 생일 정보를 알고 싶어도 customer 테이블 자체가 날라갔기 때문에 알 수 없음.
-- pk-fk 연결된 테이블은 외래키가 설정된 테이블 (참조테이블)이 먼저 삭제 
-- (1) orders 테이블 삭제 -> (2) customer 테이블 삭제

-- [insert] 
insert into customer (custid, custname, addr, phone, birth)
	values ('lucky', '강해원', '미국 뉴욕', '01022223333', '2002-03-05');

insert into customer (addr, phone, birth, custid, custname)
	values ('대한민국 부산', '01098765432', '2007-04-28', 'wow', '이지은');

-- 필드명을 명시하지 않는경우 컬럼이 정의된 순서대로 값을 넣기
insert into customer
	values ('happy', '최시은', '일본 오키나와', '01033331234', '1970-10-31');

-- 여러 튜플을 동시에 추가
insert into customer values 
	('asdf', '강세희', '대한민국 부산', '01033331235', '2004-11-11'),
    ('sdfg', '윤지성', '일본 도쿄', '01033331236', '1950-02-15'),
    ('dfgh', '이재은', '미국 뉴욕', '01033331237', '2004-06-07');

insert into customer values ('kiwi', '김키위', '대한민국 서울', '01012341234', '1990-03-17');
insert into customer values ('apple', '이사과', '대한민국 포항', '01012344321', '1992-06-17');

select * from customer;
