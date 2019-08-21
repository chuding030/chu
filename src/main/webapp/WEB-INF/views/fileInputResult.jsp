<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form method="post" action="upload" enctype="multipart/form-data">
		<input type="file" name="file1"> <input type="submit"
			value="새로운 파일 부르기">
	</form>
	<form method="post" action="upload_add" enctype="multipart/form-data">
		<table border="">
			<thead>
				<tr>
					<th>삭제여부</th>
					<th>이름</th>
					<th>나이</th>
					<th>성별</th>
					<th>번호</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${nodelist }" var="item">
					<tr>
						<td><input type="checkbox"></td>
						<td> <input type = "text" value= "${item.name }"> </td>
						<td> <input type = "text" value= "${item.age }"> </td>
						<td> <input type = "text" value= "${item.gender }"> </td>
						<td> <input type = "text" value= "${item.phone }"> </td>
						<td> <input type = "text" value= "${item.address }"> </td>
						<!-- <td align="right"><input type="button" value="삭제"></td> -->
					</tr>
				</c:forEach>
				<tr>
					<td colspan="6" align="right">
					<input type="button" value="삭제">
					<input type="button" value="저장">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>