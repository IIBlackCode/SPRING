# SPRING
Spring Web Project 2022-03-11

코드로 배우는 스프링 웹프로젝트

DB : MariaDB
SERVER : LINUX 20.04 LTS
TOMCAT : 8.5v

***
## [PART 1 프로젝트의 기본 구조 구성]

### -[CHAPTER 01] 개발 환경의 설정
	
	1.1 STS 설치와 개발환경
	1.2 스프링 프로젝트를 시작하는 두 가지 방법
	1.3 Spring Project를 이용한 프로젝트 생성
	1.4 프로젝트의 실행 점검

### -[CHAPTER 02] 스프링에 대한 간단 소개
	
	2.1 스프링 프레임워크가 개발의 대세가 된 이유
	2.2 스프링의 주요 특징

### -[CHAPTER 03] 스프링에 대한 간단 소개

	3.1 MySQL의 설치 [MariaDB VER]
	3.2 MySQL Workbench의 활용
	3.3 MySQL 연결 테스트와 jUnit
	3.4 작업 내역의 정리

### -[CHAPTER 04] 스프링 + MyBatis + MySQL의 설정

	4.1 일반적인 스프링 웹 프로젝트의 구성
	4.2 MyBatis와의 구성
	4.3 MyBatis 연동을 위한 준비
	4.4 MySQL과의 연결을 담당하는 DataSource 설정하기
	4.5 MyBatis연결
	4.6 작업 내역의 정리

### -[CHAPTER 05] 모델2 방식과 스프링 MVC

	5.1 모델2 패턴의 이해
	5.2 스프링 MVC의 컨트롤러
	5.3 WAS 없이 컨트롤러를 테스트하기
	
### -[CHAPTER 06] 스프링 + MyBatis
	
	6.1 테이블 생성 및 개발준비
	6.2 DAO 인터페이스의 작성
	6.3 XML Mapper의 작성
	6.4 DAO 인터페이스의 구현
	6.5 스프링에 빈으로 등록하기
	6.6 테스트 코드의 작성
	6.7 MyBatis의 로그 log4jdbc-log4j2
	6.8 MyBatis의 #{} 문법
	6.9 정리
	
	
	
	
***
## [PART 2 기본적인 기능의 게시물 관리]

### -[CHAPTER 01] 등록, 수정, 삭제, 조회 기능의 구현

	1.1 개발 목표 인식
	1.2 각 영역에 따른 개발의 준비
	1.3 프로젝트의 생성
	1.4 개발 전 준비 - 데이터베이스 관련
	1.5 스프링의 UTF-8 처리 필터 등록
	1.6 CSS, JavaScript 준비
	1.7 작업 내역 정리

### -[CHAPTER 02] 영속(persistence)계층, 비즈니스 계층

	2.1 BoardVO의 작성
	2.2 DAO의 생성과 XML Mapper작업
	2.3 계층별 구현 - 비즈니스 계층

### -[CHAPTER 03] 등록 구현 - 컨트롤러와 프레젠테이션 계층

	3.1 컨트롤러의 구현
	3.2 컨트롤로의 동작 확인과 루트 경로 지정
	3.3 뷰(view)의 구현 - 등록

### -[CHAPTER 04] 전체 목록 구현

	4.1 컨트롤러의 완성 및 JSP의 완성
	4.2 목록에 추가로 구현해야 하는 사항들

### -[CHAPTER 05] 조회 구현

	5.1 BoardController의 기능 추가와 뷰 처리
	5.2 수정, 삭제로의 링크 처리

### -[CHAPTER 06] 삭제/수정 처리
	
	6.1 삭제 처리
	6.2 수정 처리

### -[CHAPTER 07] 예외 처리
	
	7.1 예외 처리에 대한 팁
	
### -[CHAPTER 08] 페이징 처리 - 영속(persistence)계층, 비즈니스 계층

	8.1 페이징 처리 방식
	8.2 페이징 처리 개발에 필요한 지식
	8.3 MyBatis의 BoardDAO처리
	8.4 DAO 처리를 도와줄 Criteria 클래스 만들기
	8.5 BoardService 수정하기

### -[CHAPTER 09] 페이징 처리 - 컨트롤러와 프레젠테이션 계층

	9.1 1차 화면 테스트
	9.2 화면 하단의 페이징 처리
	9.3 페이징 처리용 클래스 설계하기
	9.4 BoardController와 뷰 처리
	9.5 페이징을 위한 SQL문의 처리
	9.6 페이징 처리의 개선을 위한 TIP
	9.7 목록 페이지와 정보 

### -[CHAPTER 10] 검색 처리와 동적 SQL

	10.1 검색에 필요한 데이터와 SearchCriteria
	10.2 SearchBoardController의 작성
	10.3 검색에 필요한 JSP 수정
	10.4 MyBatis 동적 SQL
	10.5 BoardService와 SearchBoardController의 수정
	10.6 조회, 수정, 삭제 페이지의 처리
	10.7 등록 페이지 처리
	10.8 최종적인 결말 확인
	10.9 정리
	
	
	
	
***
## [PART 3 Ajax 댓글 처리]

### -[CHAPTER 01] RestController 와 Ajax

	1.1 @RestController의 소개
	1.2 예제 프로젝트의 생성
	1.3 테스트용 컨트롤러 생성하기
	
### -[CHAPTER 02] 댓글 처리와 REST
	
	2.1 Advanced REST Client를 이용한 테스트
	2.2 REST와 Ajax
	2.3 댓글 처리를 위한 준비

### -[CHAPTER 03] REST 방식의 ReplyController 작성
	
	3.1 등록 처리
	3.2 특정 게시물의 전체 댓글 목록의 처리
	3.3 수정 처리
	3.4 삭제 처리
	3.5 페이징 처리
	
### -[CHAPTER 04]

### -[CHAPTER 05]





***
## [PART 4]

### -[CHAPTER 01]

### -[CHAPTER 02]

### -[CHAPTER 03]

### -[CHAPTER 04]

### -[CHAPTER 05]





***
## [PART 5]

### -[CHAPTER 01]

### -[CHAPTER 02]

### -[CHAPTER 03]

### -[CHAPTER 04]

### -[CHAPTER 05]

### -[CHAPTER 06]

### -[CHAPTER 07]

### -[CHAPTER 08]





***
## [PART 6]

### -[CHAPTER 01]

### -[CHAPTER 02]

### -[CHAPTER 03]

### -[CHAPTER 04]
***
# log4jdbc.log4j2.properties

	#140 PAGE 

	# log4jdbc를 인식못하는 에러 발생 수정
	# log4jdbc.drivers=org.mariadb.jdbc.Driver 추가

	log4jdbc.drivers=org.mariadb.jdbc.Driver
	log4jdbc.spylogdelegator.name=net.sf.log4jdbc.log.slf4j.Slf4jSpyLogDelegator

***
# mybatis-config.xml

	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE configuration
	  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
	  "http://mybatis.org/dtd/mybatis-3-config.dtd">
	  <!-- 183 PAGE -->

	<configuration>

		<typeAliases>
			<package name="org.zerock.board.domain"/>
		</typeAliases>

	</configuration>

***
# DATABASE QUERRY [MariaDB Ver]
<pre>
	<code>
	
CREATE DATABASE BOOK_EX;


DROP TABLE tbl_board;
DROP TABLE tbl_member;


CREATE TABLE tbl_member(

	userid		VARCHAR(50) 	NOT NULL PRIMARY KEY,
	userpw		VARCHAR(50) 	NOT NULL,
	username	VARCHAR(50) 	NOT NULL,
	email		VARCHAR(100)	NOT NULL,
	regdate		TIMESTAMP 	NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	updatedate	TIMESTAMP 	NOT NULL DEFAULT CURRENT_TIMESTAMP()

);

CREATE TABLE tbl_board(

	bno	INT 		NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title	VARCHAR(200) 	NOT NULL,
	content	TEXT 		NULL,
	writer	VARCHAR(50)	NOT NULL,
	regdate	TIMESTAMP 	NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	viewcnt	INT		DEFAULT 0,
	ip	VARCHAR(50)	DEFAULT '0.0.0.0'
	del_yn 	VARCHAR(1)	DEFAULT 'n',
);

CREATE TABLE tbl_reply (
	RNO 		INT 		NOT NULL AUTO_INCREMENT,
	BNO 		INT 		NOT NULL DEFAULT 0,
	REPLYTEXT 	VARCHAR(1000) 	NOT NULL,
	REPLYER 	VARCHAR(50) 	NOT NULL,
	REGDATE 	TIMESTAMP 	NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	UPDATEDATE 	TIMESTAMP 	NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	PRIMARY 	KEY(RNO)
);


ALTER TABLE TBL_REPLY ADD CONSTRAINT FK_BOARD
FOREIGN KEY (BNO) REFERENCES tbl_board (BNO);


	</code>
</pre>


