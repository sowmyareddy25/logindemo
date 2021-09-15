<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<style>
form{
     background-color: white;
     width: 250px;
     height: 200 px;
     border-style: solid;
     border-color: black;
     padding: 20px;
}


</style>

<div>
   <form action = "/login" method="post">
       <div>UserName  <input type="text" name="userName" value=""> <br> </div>
       <div><br></div>
       <div>Password &nbsp; <input type="text" name="password" value=""><br></div>
        <div><br></div>
        <div>&nbsp;<input type="submit"  value="Login" style="background-color: lime;"><br></div>
        <div><br></div>
        <div>&nbsp;<input type ="button" value ="Register" style="background-color: red;"><br></div>
        <div><br></div>
   </form>
</div>