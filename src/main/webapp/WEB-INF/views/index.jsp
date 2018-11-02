<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 11/2/18
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <form method="post" action="/result">
    <label>
      First Number:
      <input type="text" name="firstNum">
    </label><br>
    <label>
      Second Number:
      <input type="text" name="secondNum">
    </label><br>
    <input type="submit" formaction="/add" value="Addition(+)">
    <input type="submit" formaction="/sub" value="Subtraction(-)">
    <input type="submit" formaction="/multi" value="Multilication(X)">
    <input type="submit" formaction="/devi" value="Devision(/)">
  </form>
  </body>
</html>
