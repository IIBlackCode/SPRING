# SPRING
Spring Web Project 2022-01-04

코드로 배우는 스프링 웹프로젝트





[PART 1 프로젝트의 기본 구조 구성]

-[CHAPTER 01] 개발 환경의 설정
	
	1.1 STS 설치와 개발환경
	1.2 스프링 프로젝트를 시작하는 두 가지 방법
	1.3 Spring Project를 이용한 프로젝트 생성
	1.4 프로젝트의 실행 점검

-[CHAPTER 02] 스프링에 대한 간단 소개
	
	2.1 스프링 프레임워크가 개발의 대세가 된 이유
	2.2 스프링의 주요 특징

-[CHAPTER 03] 스프링에 대한 간단 소개

	3.1 MySQL의 설치 [MariaDB VER]
	3.2 MySQL Workbench의 활용
	3.3 MySQL 연결 테스트와 jUnit
	3.4 작업 내역의 정리

-[CHAPTER 04] 스프링 + MyBatis + MySQL의 설정

	4.1 일반적인 스프링 웹 프로젝트의 구성
	4.2 MyBatis와의 구성
	4.3 MyBatis 연동을 위한 준비
	4.4 MySQL과의 연결을 담당하는 DataSource 설정하기
	4.5 MyBatis연결
	4.6 작업 내역의 정리

-[CHAPTER 05] 모델2 방식과 스프링 MVC

	5.1 모델2 패턴의 이해
	5.2 스프링 MVC의 컨트롤러
	5.3 WAS 없이 컨트롤러를 테스트하기
	
-[CHAPTER 06] 스프링 + MyBatis
	
	6.1 테이블 생성 및 개발준비
	6.2 DAO 인터페이스의 작성
	6.3 XML Mapper의 작성
	6.4 DAO 인터페이스의 구현
	6.5 스프링에 빈으로 등록하기
	6.6 테스트 코드의 작성
	6.7 MyBatis의 로그 log4jdbc-log4j2
	6.8 MyBatis의 #{} 문법
	6.9 정리
	
	
	
		
	
[PART 2 기본적인 기능의 게시물 관리]

-[CHAPTER 01] 등록, 수정, 삭제, 조회 기능의 구현

	1.1 개발 목표 인식
	1.2 각 영역에 따른 개발의 준비
	1.3 프로젝트의 생성
	1.4 개발 전 준비 - 데이터베이스 관련
	1.5 스프링의 UTF-8 처리 필터 등록
	1.6 CSS, JavaScript 준비
	1.7 작업 내역 정리

-[CHAPTER 02] 영속(persistence)계층, 비즈니스 계층

	2.1 BoardVO의 작성
	2.2 DAO의 생성과 XML Mapper작업
	2.3 계층별 구현 - 비즈니스 계층

-[CHAPTER 03] 등록 구현 - 컨트롤러와 프레젠테이션 계층

	3.1 컨트롤러의 구현
	3.2 컨트롤로의 동작 확인과 루트 경로 지정
	3.3 뷰(view)의 구현 - 등록

-[CHAPTER 04] 전체 목록 구현

	4.1 컨트롤러의 완성 및 JSP의 완성
	4.2 목록에 추가로 구현해야 하는 사항들

-[CHAPTER 05] 조회 구현

	5.1 BoardController의 기능 추가와 뷰 처리
	5.2 수정, 삭제로의 링크 처리

-[CHAPTER 06] 삭제/수정 처리
	
	6.1 삭제 처리
	6.2 수정 처리

-[CHAPTER 07] 예외 처리
	
	7.1 예외 처리에 대한 팁
	
-[CHAPTER 08] 페이징 처리 - 영속(persistence)계층, 비즈니스 계층

	8.1 페이징 처리 방식
	8.2 페이징 처리 개발에 필요한 지식
	8.3 MyBatis의 BoardDAO처리
	8.4 DAO 처리를 도와줄 Criteria 클래스 만들기
	8.5 BoardService 수정하기

-[CHAPTER 09] 

	9.1 1차 화면 테스트
	9.2 화면 하단의 페이징 처리
	9.3 페이징 처리용 클래스 설계하기
	9.4 BoardController와 뷰 처리
	9.5 페이징을 위한 SQL문의 처리
	9.6 페이징 처리의 개선을 위한 TIP
	9.7 목록 페이지와 정보 

-[CHAPTER 10]
	
