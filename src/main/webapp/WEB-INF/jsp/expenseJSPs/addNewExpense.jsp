<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h2>Form Data</h2>
     <form:form method="post" action="/expenses/submitNewExpense" modelAttribute="expense">
            Expense Description: <form:input path="expenseDescription" /><br/>
              Expense Amount:  <form:input path="expenseAmount" /><br/>
            Expense Source:
              <form:select path="source">
                                    <form:options items="${sources}" />
                                </form:select><br/>
            <input type="submit" value="Submit"/>
        </form:form>

</body>
</html>