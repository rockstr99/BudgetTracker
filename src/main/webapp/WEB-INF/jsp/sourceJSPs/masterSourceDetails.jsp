<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <div class="container">
        <div class="row">
            <div class="col">
    <table class="table table-striped table-hover table-bordered border-dark text-center" >
          <thead>
              <tr>
                  <th>Source Code</th>
                  <th>Source Description</th>
                  <th>Source Balance</th>
              </tr>
          </thead>
          <tbody>
          <c:if test ="${empty sources}">
          <tr>
            <td colspan="3"  class="text-center">No records found!</td>
           </tr>
          </c:if>

              <c:forEach var="source" items="${sources}">
                  <tr>
                      <td>${source.sourceCode}</td>
                      <td>${source.sourceDescription}</td>
                      <td>${source.sourceBalance}</td>
                  </tr>
              </c:forEach>
          </tbody>
      </table>
            </div>
        </div>
    </div>
</body>
</html>