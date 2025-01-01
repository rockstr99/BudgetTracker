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
                  <th>Source Code</th>
                  <th>Source Description</th>
                  <th>Source Balance</th>
              </tr>
          </thead>
          <tbody>
              <c:forEach var="source" items="${sources}">
                  <tr>
                      <td>${source.sourceCode}</td>
                      <td>${source.sourceDescription}</td>
                      <td>${source.sourceBalance}</td>
                  </tr>
              </c:forEach>
          </tbody>
      </table>
</body>
</html>