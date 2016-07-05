<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>

<body>
			<div title="选课"> 
				<ul>
					<li><a title="send_content_dataGrid.action" href="#">所有课程</a></li>	
			   </ul>
		    </div> 
			 <div title="查看我的选课结果">  
			  <ul>
			    	<li><a title="send_student_transcriptGrid.action" href="#">本学期已选课程</a></li>	
					<li><a title="send_student_oldSection.action" href="#">其他学期的课程</a></li>	
					<li><a title="send_student_transcriptGradeGrid.action" href="#">我的成绩单</a></li>	
			   </ul>
			 </div>   
			  <div title="老师、课程管理">  
			    <ul>
<!-- 			    	<li><a title="send_manage_section.action" href="#">课程学生名单查询</a></li>	 -->
					<li><a title="send_manage_professorGrid.action" href="#">老师增删改</a></li>	
					<li><a title="send_manage_sectionGrid.action" href="#">课程增删改</a></li>	
			   </ul>
			 </div>   
		</div>  
		<!-- 菜单 end-->	
	</div>
	<!-- main begin-->
	 <div data-options="region:'center',title:'操作管理页面'" style="padding:1px;background:#fff;">
		<!-- 系统初始化tab begin-->
    	<div id="tt" class="easyui-tabs" data-options="fit:true">   
		    <div title="系统初始化页面" style="padding:20px;display:none;">   
				此处后面会动态加载网页, 网页中显示的是系统的信息  
				<h1>${SessionScope.student}</h1>
				  <s:property value="#Model.Student.ssn"/><br/>  
				<s:debug/>
		    </div>
		</div>
		<!-- 系统初始化tab end -->
	</div>
	<!-- main end-->
</body>

</html>
