<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO APPOINTMENT REGISTRATION PAGE</h1></center>
<br>
<a href="Patient_Home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 

<form action="./apply_appointment" method="post" align="center">
<label>Patient Name :</label>
<input type="text" name="patient_name" placeholder="Enter patient name"><br><br>
<label>Mobile Number :</label>
<input type="number" name="phone" placeholder="Enter phone number"><br><br>
<label>Email id :</label>
<input type="email" name="email" placeholder="Enter email"><br><br>
<label>Select Gender : </label>
<input type="radio" name="gender" value="Male">Male 
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Other">Other
<br><br>
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
<label>Specialist : </label>
<select name="specialist" >
<option value ="ENT">ENT</option>
<option value =Dermatologist>Dermatologist</option>
<option value="Neurologist">Neurologist</option>
<option value="Dentist">Dentist</option>
<option value="Cardiologist">Cardiolist</option>
<option value ="Psychiatrist">Psychiatrist</option>
<option value ="Pediatrician">Pediatrician</option>
<option value ="Gynecologist">Gynecologist</option>
</select><br><br>
<label>Select the Date for Appointment :</label>
<input type="date" name="date_of_appointment" value="Enter appointment date"><br><br>
<label>Select the time for Appointment :</label>
<input type = "radio" name= "time_of_appointment" value="Morning">Morning
<input type = "radio" name= "time_of_appointment" value="Afternoon">Afternoon
<input type = "radio" name= "time_of_appointment" value="Evening">Evening
<br><br><br>
<input type="submit" value ="Apply">
</form>
</body>
</html>