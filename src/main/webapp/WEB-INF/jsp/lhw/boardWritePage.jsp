<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 작성</h1>
	<form action="lhwBoardWritePost.do" method="post"> 
		제목 : <input type="text" name="title"></br>
		작성자 : </br>
		내용 : <textarea rows="" cols="" name="contents"></textarea> </br></br>
		<button type="submit">작성</button>
	</form>
</body>
</html>