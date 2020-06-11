<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<link rel="stylesheet" href="css/employee.css">
<link rel="stylesheet" href="css/menu.css">
<script language="JavaScript" src="js/menu.js"></script>
<script language="JavaScript" src="js/emp_menu_items.js"></script>
<script language="JavaScript" src="js/menu_tpl.js"></script>

 

<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">


<title>Show All Users</title>
</head>
<%
String role = (String)session.getAttribute("Role");
%>
<script>
function funcLoad() {
	document.PagForm.nbrRec.value = document.MForm.nbrRec.value;
	document.PagForm.submit();

}

</script>
<BODY CLASS="Body_Bgcolor"  topmargin="0" leftmargin="0">

<TABLE  width='100%' height='85' border='1'  >
 <TR bordercolor="#000000">
    <TD>
    <table border="0" cellpadding="0" cellspacing="0" width="100%"  bgcolor="#007c7a" background="images/EMP_bg_03.jpg">
		<tr>
			<td align="left">
				<table border="0" cellpadding="0" cellspacing="0" >
    				<tr>
    					<td><img src="images/EMP_logo_03.jpg" /></td>
    				</tr>
    			</table>
			</td>
 
			<td align="right">
				<table border="0" cellpadding="0" cellspacing="0" height = "90%">
    				<tr>
    					<td><img src="images/EMP_03.jpg" /></td>
    				</tr>
    			</table>
			</td>
		</tr>
	</table>
	</TD>
  </TR>
 
</TABLE>
<div  >
<%if(role!=null && role.trim().equals("ADMIN")){ %>
<script language="JavaScript"> 
		new menu (MENU_ITEMS, MENU_POS1);
</script>
<%}else{ %>
<script language="JavaScript"> 
		new menu (MENU_ITEMS1, MENU_POS2);
</script>
<%} %>
</div>

<!-- <table width='96%' align='center'>
<tr>
	<td align='right' class="Fld_CL">	
			<a href="UserController?action=insert">Add User</a>		
 
	</td>
</tr>
 

</table> -->
 <table width="96%" border="0" cellspacing="1" cellpadding="1"	align="center" >
	<tr><td><div align="center"><hr></div></td></tr>
 
</table>

<%if(role!=null && role.trim().equals("ADMIN")){ %>
<FORM NAME='MForm' METHOD="post">
    <table align="center" width="80%">
 
        <thead>
       
            <tr class="border">
                <th class="Table_Header" >User Id</th>
                <th class="Table_Header" >First Name</th>
                <th class="Table_Header">Last Name</th>
                <th class="Table_Header">DOB</th>
                <th class="Table_Header">Email</th>
                <th class="Table_Header">Department</th>
                <th class="Table_Header" colspan ="2">Action</th>
            </tr>
        </thead>
        <tbody >
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td class="Fld_Vl"><c:out value="${employee.userid}" /></td>
                    <td class="Fld_Vl"><c:out value="${employee.firstName}" /></td>
                    <td class="Fld_Vl"><c:out value="${employee.lastName}" /></td>
                    <td class="Fld_Vl"><fmt:formatDate pattern="yyyy-MMM-dd" value="${employee.dob}" /></td>
                    <td class="Fld_Vl"><c:out value="${employee.email}" /></td>
                    <td class="Fld_Vl"><c:out value="${employee.department.departName}" /></td>
                    <td class="Fld_Vl"><a href="UserController?action=edit&userId=<c:out value="${employee.userid}"/>">Update</a></td>
                    <td class="Fld_Vl"><a href="UserController?action=delete&userId=<c:out value="${employee.userid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
         <tr><td><br></td></tr>
        <tr><td colspan="8"><table align="center"><tr>
				<td class="Fld_Lb">Number of Records to display 
				</td>
				<td class="Fld_Vl"><select name="nbrRec" onchange="funcLoad();">
						<option value="5">--Select--</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="25">25</option>
						<option value="50">50</option>
						<option value="100">100</option>
				</select> <br /></td>
			</tr>
			</table></td>
        
         <tr><td><br></td></tr>
        <tr><td colspan="8"><table align="center"><tr>
  	 <% int offset = 0; 
      int ofset = 0; 
      if (request.getParameter("offset") != null) { 
    	  offset = Integer.parseInt(request.getParameter("offset") .toString()); 
    	  } 
      int total_count = 0; int total_page = 0; int per_page = 5; int max_page = 0;
      
      if (request.getParameter("nbrRec") != null) {
    	  per_page = Integer
					.parseInt(request.getParameter("nbrRec").toString());
		}
      if (offset > 1) {
          ofset = offset * per_page - per_page;
          max_page = offset * per_page;
      }
      else
          max_page  = per_page;
      
      
      total_count  = (Integer)request.getAttribute("userCnt");
      
      if (total_count % per_page == 0) {
          total_page = total_count / per_page;
      } else {
          total_page = total_count / per_page + 1;
      }
      
      int count = 0;
      if (offset > 1)
          count = offset * per_page - per_page;

      if (offset > 1) {
          int previous = offset - 1;
      %>
      
      
    <td class="Fld_Vl"><a href="UserController?action=listUser&nbrRec=<%=per_page%>&offset=<%=previous%>">Previous</a></td>
    <%
      }
      if (total_page > 0) {
          for (int i = 1; i <= total_page; i++) {
              if (request.getParameter("offset") == null) {
                  offset = 1;
              }
              if (i == offset) {

    %>
    
    <td class="Fld_Vl"><%=i%></td>
    <%
        } else {
    %>
    <td class="Fld_Vl"><a href="UserController?action=listUser&nbrRec=<%=per_page%>&offset=<%=i%>"><%=i%></a></td>
    <%
        }
          }
      }
      if (offset < total_page) {
          int next = offset + 1;

    %>
    
    <td class="Fld_Vl"><a href="UserController?action=listUser&nbrRec=<%=per_page%>&offset=<%=next%>">Next</a></td>
    <%
      }
    %>
        </tr></table></td></tr>
        
    </table>
    </form>
  <%}else{ %>
  <FORM ACTION='RLController?action=createStatusRpt"' METHOD="GET" name ="viewRL">
   <table align="center" width="80%">
 
        <thead>
       
            <tr class="border">
                <th class="Table_Header" >Compliance ID</th>
                <th class="Table_Header">Compliance Details</th>
                <th class="Table_Header" >Compliance Type</th>
                <th class="Table_Header">Create Date</th>
                <th class="Table_Header">Department Name</th>
               
               
            </tr>
        </thead>
        <tbody >
            <c:forEach items="${complianceList}" var="compliance">
                <tr>
                    <td class="Fld_Vl"><a href="RLController?action=createStatusRpt&compId=<c:out value="${compliance.complainceId}"/>" ><c:out value="${compliance.complainceId}" /></a></td>
                     <td class="Fld_Vl"><input type ="hidden" name ="action" value =""/><c:out value="${compliance.details}" /></td>
                    <td class="Fld_Vl"><c:out value="${compliance.rlType}" /></td>
                    <td class="Fld_Vl"><fmt:formatDate pattern="yyyy-MMM-dd" value="${compliance.createDate}" /></td>
                    <td class="Fld_Vl"><c:out value="${compliance.department.departName}" /></td>
                  
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </FORM>
  <%} %>
   
   
   <FORM ACTION='UserController?action=listUser' METHOD="GET" NAME='PagForm' METHOD="get">
   	<input type=hidden name="action" value="listUser"> 
   	<input type=hidden name="nbrRec" value=""> 
   </FORM>
   
</body>
</html>