<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body  bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO LAB TEST APPOINTMENT REGISTRATION PAGE</h1></center>
<br>
<a href="patient_home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 


<form action="./apply_lab_test" method="post" align="center">
<label>Patient Name :</label>
<input type="text" name="pname" placeholder="Enter patient name"><br><br>
<label>Select Gender : </label>
<input type="radio" name="pgender" value="Male">Male 
<input type="radio" name="pgender" value="Female">Female
<input type="radio" name="pgender" value="Other">Other
<br><br>
<label>Email id :</label>
<input type="email" name="pemail" placeholder="Enter email"><br><br>

<label>Mobile Number :</label>
<input type="number" name="phone" placeholder="Enter phone number"><br><br>
<label>Age :</label>
<input type="number" name="age" placeholder="Enter Age"><br><br>

<label>Select Blood Group : </label>
<select name="blood_group">
<option value="A+">A+</option>
<option value="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select><br><br>
<label>Test Name : </label>
<select name="test_name" >
<option value ="blood_test">Blood Test</option>
<option value="urine_test">Urine Test</option>
</select><br><br>
<label>Select the Date and Time for test :</label>
<input type="datetime-local" name="date_and_time" value="Enter date and time"><br><br>
<input type="submit" value ="Apply">
</form>
</body>
</html>