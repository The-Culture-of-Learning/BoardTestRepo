<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<div class="cotainer">
	<h1>lhw게시판</h1>
	<table class="table table-dark">
    <thead>
      <tr>
        <th>no</th>
        <th>제목</th>
        <th>내용</th>
        <th>조회수</th>
        <th>날짜</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="postList">
      <tr>
        <td>${postList.no}</td>
        <td>${postList.title}</td>
        <td>${postList.contents}</td>
        <td>0</td>
        <td>${postList.write_date}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

<button type="button"><a href="lhwBoardWritePage.do">게시글 작성</a></button>

</body>
</html>