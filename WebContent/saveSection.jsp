<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>

</head>
<body>
<form id="ff" method="post" action="section_save">
			<label for="instructor.id">任课教师:</label> 
			<input class="easyui-combobox" 
			name="instructor.id"
			data-options="
					url:'${basePath}/professor_queryList.action',
					method:'get',
					valueField:'id',
					textField:'name',
					multiple:false,
					panelHeight:'auto'
			">

	<div>
		<label for="sectionNo">sectionNo（数字）:</label> 
		<input type="text" name="sectionNo" />
	</div>
	<div>
		<label for="dayOfWeek">dayOfWeek(一个字母):</label> 
		<input type="text" name="dayOfWeek" />
	</div>
	<div>
		<label for="timeOfDay">timeOfDay:</label> 
		<input type="text" name="timeOfDay" />
	</div>
	<div>
		<label for="room">room:</label> 
		<input type="text" name="room" />
	</div>
		<div>
		<label for="seatingCapacity">学分（数字）:</label> 
		<input type="text" name="seatingCapacity" />
	</div>
	
	<div>
				<label for="representedCourse.id">所属Course:</label> 
			<input class="easyui-combobox" 
			name="representedCourse.id"
			data-options="
					url:'${basePath}/course_queryList.action',
					method:'get',
					valueField:'id',
					textField:'courseName',
					multiple:false,
					panelHeight:'auto'
			">
	</div>
	
	<div>
		<a id="submit" href="#" class="easyui-linkbutton">添 加</a>
		<a id="reset" href="#" class="easyui-linkbutton">重 置</a>
	</div>
</form>

</body>
</html>