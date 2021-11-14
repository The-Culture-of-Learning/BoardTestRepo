<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
<script type="text/javascript">
	document.addEventListener('keydown', function(event) {
	  if (event.keyCode === 13) {
	    event.preventDefault();
	  };
	}, true);
	
	function passwordCheck(pw,pwCheck) {
		if (pw != pwCheck) {
			$("#pwCheck").focus();
			alert("비밀번호가 다릅니다.");
			return true;
		}
	}
	function inValidValueCheck() {
		var id = $("#id").val();
		var pw = $("#pw").val();
		var pwCheck = $("#pwCheck").val();
		var name = $("#name").val();

		if (id == "") {
			$("#id").focus();
			alert("아이디는 필수입력입니다.");
			return;
		} else if (pw == "") {
			$("#pw").focus();
			alert("비밀번호는 필수입력입니다.");
			return;
		} else if (pwCheck == "") {
			$("#pwCheck").focus();
			alert("비밀번호체크는 필수입력입니다.");
			return;
		} else if (name == "") {
			$("#name").focus();
			alert("이름은 필수입력입니다.");
			return;
		} else if (passwordCheck(pw, pwCheck)) {
			return;
		} else {
			$("form").attr("onsubmit" , "return true");
		}
	}
</script>
</head>
<body>
<form action="joinPage.do" onsubmit="return false" method="post">
	ID : <input type="text" name="id" id="id"> 
	<button type="button">중복체크</button>
	</br>
	PW : <input type="password" name="pass" id="pw"> </br>
	PW 확인 : <input type="password" name="pwCheck" id="pwCheck"> </br>
	이름 : <input type="text" name="name" id="name" maxlength="5"> </br>
	<button type="submit" onclick="inValidValueCheck();">회원가입</button>
</form>
</body>
</html>