<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockspring.model.*"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List stockList=(List)request.getAttribute("stockList");
System.out.println(stockList);
%>

<table border="2">
<tr>
<td>Stock<td>
<td>Price</td>
<td>Date</td>
<td>CEO</td>
<td>Company Name</td>
</tr>

<% for(int i=0;i<stockList.size();i++){
	Stock stock=(Stock)stockList.get(i);
	%>
<tr>
<td><%= stock.getStockId() %><td>
<td><%= stock.getCurrentPrice() %></td>
<td><%= stock.getDate() %></td>
<td><%= stock.getTime() %></td>
<td><%= stock.getCompany().getCompanyName() %></td>


</tr>
<% }%>

</table>

</body>
</html>