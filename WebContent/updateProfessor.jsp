<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<form id="ff" method="post">
	<input type="hidden" name="id" />
		<div>
		<label for="ssn">ssn:</label> 
		<input type="text" name="ssn" />
	</div>
	<div>
		<label for="department">部门:</label> 
		<input type="text" name="department" />
	</div>
	<div>
		<label for="name">姓名:</label> 
		<input type="text" name="name" />
	</div>
	<div>
		<label for="title">教师:</label> 
		<input type="text" name="title" />
	</div>
	
	<div>
		<a id="submit" href="#" class="easyui-linkbutton">更新</a>
		<a id="reset" href="#" class="easyui-linkbutton">重 置</a>
	</div>
</form>

</body>
</html>