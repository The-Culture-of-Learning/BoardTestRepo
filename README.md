# Kaoni 지식관리연구소, 솔루션 1팀의 총 4명의 테스트용 게시판 연습 repo 입니다.



### Spec

- jdk 11
- tomcat 9.0
- ...



### Flow

- 첫 페이지

  index.jsp(login)

- 로그인 시 

  boardListMain.jsp(각자의 게시판 링크가 걸려있는 버튼들이 존재하는 페이지.)

- 버튼클릭 시

  각자의 <name:CBG>boardList.jsp와 같이 게시판 출력.

  

  

### package 명

- Controller는 Controller 패키지로 묶는다.(controller > memberController)
  - Controller에는 두가지의 Controller가 존재한다.
  - 하나는 String을 return하는 page 이동을 담당하는 <name>UrlController:  memberUrlContrller
  - 하나는 HashMap<> 을 return하는 data를 넘기는 <name>RestController:  memberResrController
- Mapper는 mapper 패키지로 묶는다. (mapper > memberMapper)
- DTO들은 repository 패키지로 묶는다.(repository > memberRepository)
- Service는 Service로 나눈다.



### SourceTree

![image-20211114145820381](https://raw.githubusercontent.com/The-Culture-of-Learning/BoardTestRepo/master/README.assets/image-20211114145820381.png)

