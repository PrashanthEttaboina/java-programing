<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO PATHOLOGIST BLOOD TEST REPORT PAGE</h2></center>
<br>
<a href="pathologist_home.jsp">Home</a> 
<table border="2" align="center" width="600" height="5" cellpadding="5">
<tr>
<td>Hemoglobin</td>
<td>RBC Count</td>
<td>MCV</td>
<td>MCH</td>
<td>MCHC</td>
<td>RDW</td>
<td>WBC Count</td>
</tr>
<tr>
<td>13.0-17.0g/dl</td>
<td>4.5-5.5 millions</td>
<td>83.0-101.0 fl</td>
<td>27.32 pg</td>
<td>31.5-34.5 gm/dl</td>
<td>11.6-14.0 %</td>
<td>4000-10,000 cells/ml</td>
</tr>
</table>
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,com.main.BloodTestBean,com.pojo.BloodTest,java.util.*" %>
<%int id=Integer.parseInt(request.getParameter("id")); %>
<%

List<BloodTest> bl=BloodTestBean.searchById(id);
Iterator<BloodTest> i=bl.iterator();
while(i.hasNext())
{
	BloodTest sd=i.next();
	%>	

<form action="./generate_blood_report" method="post" align ="center">
<br>
<label>Blood Test Id :</label>
<input type="text" name="bid" value="<%=sd.getBid() %>"><br><br>
<input type="hidden" name="pat_id" value="<%=sd.getPat_id() %>">
<input type="hidden" name="patient_gender" value="<%=sd.getPatient_gender() %>">
<input type="hidden" name="date_of_birth" value="<%=sd.getDate_of_birth() %>">
<input type="hidden" name="patient_phone" value="<%=sd.getPatient_phone() %>">

<input type="hidden" name="test_type" value="<%=sd.getTest_type() %>">
<input type="hidden" name="referred_by_doctor" value="<%=sd.getReferred_by_doctor() %>">
<input type="hidden" name="date_and_time" value="<%=sd.getDate_and_time() %>">
<label>Name : </label>
<input type="text" name="patient_name" value="<%=sd.getPatient_name() %>">
<br><br>
<label> Blood Group : </label>
<select name="blood_group">
<option value ="A+">A+</option>
<option value ="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="O+">O+</option>
<option value ="O-">O-</option>
<option value ="AB+">AB+</option>
<option value ="AB-">AB-</option>
</select>
<br><br>
<label> Hemoglobin : </label>
<input type="text" name="hemoglobin" placeholder="Enter hemoglobin"><br><br>
<label>RBC count : </label>
<input type="text" name="rbc_count" placeholder="Enter rbc count">
<br><br>
<label>MCV : </label>
<input type="text" name="mcv" placeholder="Enter mcv">
<br><br>
<label>MCH : </label>
<input type="text" name="mch" placeholder="Enter mch">
<br><br>
<label>MCHC : </label>
<input type="text" name="mchc" placeholder="Enter mchc">
<br><br>
<label>RDW : </label>
<input type="text" name="rdw" placeholder="Enter rdw">
<br><br>
<label>WBC count : </label>
<input type="text" name="wbc_count" placeholder="Enter wbc">
<br><br>

<input type="Submit" value="Update">
<br><br>
<a href="index.html">
Home
</a>
</form>

<% }%>
</body>
</html>