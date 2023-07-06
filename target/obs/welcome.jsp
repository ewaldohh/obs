<!-- welcome.jsp -->
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2 id="username">Welcome, ${username}</h2>
    <p>You have successfully logged in.</p>

    <form id="calculationForm" action="CalculationServlet" method="POST">
        <table style="border: 1px solid black;">
            <thead>
                <tr style="background-color:Blue; color:white;">
                    <th>Department</th>
                    <th>Student ID</th>
                    <th>Marks</th>
                    <th>Pass %</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td rowspan="4">Dep 1</td>
                    <td>S1</td>
                    <td>35</td>
                    <td rowspan="4" id="pasDep1">${pasDep1}</td>
                    <input type="hidden" name="dep11" value="35">
                </tr>
                <tr>
                    <td>S2</td>
                    <td>70</td>
                    <input type="hidden" name="dep12" value="70">
                </tr>
                <tr>
                    <td>S3</td>
                    <td>60</td>
                    <input type="hidden" name="dep13" value="60">
                </tr>
                <tr>
                    <td>S4</td>
                    <td>90</td>
                    <input type="hidden" name="dep14" value="90">
                </tr>
                <tr>
                    <td>Dep 2</td>
                    <td>S5</td>
                    <td>30</td>
                    <td id="passDep2">${pasDep2}</td>
                    <input type="hidden" name="dep2" value="30">
                </tr>
                <tr>
                    <td rowspan="3">Dep 3</td>
                    <td>S6</td>
                    <td>32</td>
                    <td rowspan="3" id="passDep3">${pasDep3}</td>
                    <input type="hidden" name="dep31" value="32">
                </tr>
                <tr>
                    <td>S7</td>
                    <td>70</td>
                    <input type="hidden" name="dep32" value="70">
                </tr>
                <tr>
                    <td>S8</td>
                    <td>20</td>
                    <input type="hidden" name="dep33" value="20">
                </tr>
            </tbody>
        </table>
        <input id="submitButton" type="submit" value="Calculate">
    </form>
</body>
</html>
