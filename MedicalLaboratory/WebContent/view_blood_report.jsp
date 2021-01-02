<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body bgcolor="lightskyblue">
<center><h2>WELCOME TO BLOOD TEST REPORT PAGE</h2></center>
<a href="patient_home.jsp">Home</a> |
<a href="index.html">Log-Out</a>
<br>
<%@page import="com.pojo.BloodTest,com.main.BloodTestBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<BloodTest> bt=BloodTestBean.getByPatientId(id);
Iterator<BloodTest> i=bt.iterator();
while(i.hasNext())
{
 	BloodTest pt=i.next();
%>
<table border="2" align="center" width="400" height="5" cellpadding="10">
<tr>
<td>Test Id : </td><td><%=pt.getBid() %></td></tr>
<tr>
<td>Patient Id : </td><td><%=pt.getPat_id() %></td></tr>
<tr>
<td>Patient Name : </td><td><%=pt.getPatient_name() %></td></tr>
<tr>
<td>Referred_by_doctor :  </td><td><%=pt.getReferred_by_doctor() %></td></tr>
<tr>
<td>Date and Time : </td><td><%=pt.getDate_and_time() %></td></tr>
<tr>
<td>Blood_group : </td><td><%=pt.getBlood_group() %></td></tr>
<tr>
<td>Hemoglobin : </td><td><%=pt.getHemoglobin() %></td></tr>
<tr>
<td>RBC Count : </td><td><%=pt.getRbc_count() %></td></tr>
<tr>
<td>MCV : </td><td><%=pt.getMcv() %></td></tr>
<tr>
<td>MCH : </td><td><%=pt.getMch() %></td></tr>
<tr>
<td>MCHC : </td><td><%=pt.getMchc() %></td></tr>
<tr>
<td>RDW : </td><td><%=pt.getRdw() %></td></tr>
<tr>
<td>WBC Count : </td><td><%=pt.getWbc_count() %></td></tr>
<%} %>
<center> <button onclick="window.print()"> Print Report </button></center><br><br>
</body>
</html>