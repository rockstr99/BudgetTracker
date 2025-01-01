<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
   <table border="1">
          <thead>
              <tr>
                  <th>Expense Description</th>
                  <th>Expense Amount</th>
                  <th>Source</th>
              </tr>
          </thead>
          <tbody>
              <c:forEach var="expense" items="${expenses}">
                  <tr>
                      <td>${expense.expenseDescription}</td>
                      <td>${expense.expenseAmount}</td>
                      <td>${expense.source}</td>
                  </tr>
              </c:forEach>
          </tbody>
      </table>
</body>
</html>