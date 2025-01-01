<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Master Setup</title>
</head>
<body>
    <h2>Form</h2>
    <form:form method="post" action="/sourceMasterController/submit" modelAttribute="masterSetup">
         Source Code: <form:input path="sourceCode" /><br/>
         Source Description: <form:input path="sourceDescription" /><br/>
         Source Balance: <form:input path="sourceBalance" /><br/>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
