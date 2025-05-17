<%@page language="java" %>
<html>
<head>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Result <%= session.getAttribute("result") %> </h2>
The way below is to add the variables using Jsp standard library. It will automatically search the session object
<br/> and return the result.
<h2>Result ${result} </h2>

</body>
</html>