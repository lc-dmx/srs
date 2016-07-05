<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>选课</title>

</head>
<body>
    <form id="form1" class="liger-form" data-validate="{}">
        <div class="fields">
            <input data-type="text" data-label="StudentName" data-name="StudentName" validate="{required:true,minlength:5}" />
            <input data-type="text" data-label="ID Number" data-name="ID" validate="{required:true}" />
            <input data-type="text" data-label="Total Course" data-name="TotalCourse" validate="{required:false}" />
        </div>
        <div>
            <div style="margin: 4px; float: left;">
                <p>Schedule Of Classes</p>
                <div id="listbox1"></div>
            </div>
            <div style="margin: 4px; float: left;" class="middle">
                <p>&nbsp;&nbsp;</p>
                <input type="button" onclick="moveToRight()" value="->" />
                <input type="button" onclick="moveToLeft()" value="<-" />
            </div>
            <div style="margin: 4px; float: left;">
                <p>RegisteredFor</p>
                <div id="listbox2"></div>
            </div>
        </div>
    </form>
    <div class="liger-button" data-click="f_validate" data-width="150">Save</div>
</body>

</html>
