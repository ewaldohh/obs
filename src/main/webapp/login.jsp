<!-- login.jsp -->
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="center-form">
        <form id="loginForm" action="login" method="POST">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username">
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
            <br>
            <input class="login-button" type="submit" value="Login">
        </form>
    </div>
</body>
</html>
