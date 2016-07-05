<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
</head>
<body>
<form id="ff" method="post" action="section_save">
	
	<div>
		<label for="ssn">ssn:</label> 
		<input type="text" name="ssn" />
	</div>
	<div>
		<label for="department">department:</label> 
		<input type="text" name="department" />
	</div>
	<div>
		<label for="name">name:</label> 
		<input type="text" name="name" />
	</div>
	<div>
		<label for="title">简称:</label> 
		<input type="text" name="title" />
	</div>
	
	<div>
		<a id="submit" href="#" class="easyui-linkbutton">添 加</a>
		<a id="reset" href="#" class="easyui-linkbutton">重 置</a>
	</div>
</form>


</body>
</html>