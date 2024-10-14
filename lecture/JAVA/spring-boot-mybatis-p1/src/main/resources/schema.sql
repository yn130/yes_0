show databases;

drop database codingon;

create database codingon default character set utf8 default collate utf8_general_ci;
 use codingon;
 -- users 테이블 생성
 create table users (
                       id bigint auto_increment primary key,
                       username varchar(50) not null,
                       email varchar(100) not null,
                       created_at timestamp default current_timestamp
);
 -- 더미 데이터 삽입
 insert into users (username, email) values
                                        ('john_doe', 'john.doe@example.com'),
                                        ('jane_smith', 'jane.smith@example.com'),
                                        ('bob_johnson', 'bob.johnson@example.com');
 select * from users;

 -- ///////////////////////////////////////////////////////////////////////////////////////////////////

  create table boards (
                       id int auto_increment primary key,
                       title varchar(20) not null,
                       content varchar(100) not null,
                       writer varchar(10) not null,
                       registered timestamp default current_timestamp
);
 -- 더미 데이터 삽입
 INSERT INTO boards (title, content, writer) VALUES
('Welcome', 'Welcome to the board!', 'Alice'),
('Announcement', 'Important update coming soon.', 'Bob'),
('Discussion', 'Let\'s talk about new features.', 'Charlie'),
('Feedback', 'Please share your feedback.', 'David'),
('Q&A', 'Feel free to ask questions.', 'Eve'),
('Bug Report', 'Found a bug? Report it here.', 'Frank'),
('Events', 'Upcoming events details here.', 'Grace'),
('Suggestions', 'We value your suggestions.', 'Henry'),
('Help', 'Need help? Post your issue here.', 'Ivy'),
('General Chat', 'Chat with other members.', 'Jack');

select * from boards;