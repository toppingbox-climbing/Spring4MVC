-- 회원 테이블

    create table member (
        mno         int           auto_increment,
        userid      varchar(18)   unique,
        passwd      varchar(18)   not null,
        name        varchar(10)   not null,
        email       varchar(50)   not null,
        regdate     datetime(50)  default    current_timestamp,
        primary key (mno)
    );

-- 현지시간으로 지정하기, timestamp 쓰지 않으면 서버시간은로 지정됨
-- 제약조건은 따로 만들기도 한다.
-- alt+table 제약조건 add table 해서 ?

-- 게시판 테이블

    create table board (
        bno         int             auto_increment,
        title       varchar(50)     not null,
        userid      varchar(18)     not null,
        regdate     datetime(50)    default    current_timestamp,
        views       int             default 0,
        contents    text            not null,
        primary key (bno),
        foreign key (userid) references member(userid)
    );
-- 외래키 / 식별관계 or 비식별관계
-- 외래키 설정하는 이유 / 데이터의 무결성