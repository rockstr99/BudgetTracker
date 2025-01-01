<html>
<head>
    <title>Result</title>
</head>
<body>
    <h2>Form Data</h2>
    <form:form method="post" action="/expenses/submit" modelAttribute="expense">

    Source Code:  ${masterSetup.sourceCode}<br/>
    Source Description:  ${masterSetup.sourceDescription}<br/>
    Source Balance:  ${masterSetup.sourceBalance}<br/>
        <input type="submit" value="Submit"/>


    </form:form>
</body>
</html>