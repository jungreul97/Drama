<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/dramaPrj/dramaInsert" method="post">
		<input type="text" name="dname" placeholder="����" /><br/>
		<input type="number" name="dprice" placeholder="����" /><br/>
		<input type="text" name="dgenre" placeholder="�帣" /><br/>
		<input type="date" name="ddate" placeholder="�濵��" /><br/>
		<input type="number" name="dage" placeholder="���̵��" /><br/>
		<input type="file" name="dthumb" placeholder="������" /><br/>
		<input type="file" name="dvideo" placeholder="����" /><br/>
		<input type="text" name="actname" placeholder="�ֿ����" /><br/>
		<textarea cols="50" rows="10" name="dtext"></textarea><br/>
		<input type="submit" value="Ȯ��">
	</form>
</body>
</html>