<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation page</title>
<script src="js/jquery.js" type="text/javascript"></script>
<style type="text/css">
table.result {
   border-collapse: collapse;
   table-layout:fixed;
}
table.data {
   border-collapse: collapse;
   width: 100%;
}
pre {
   white-space: pre-wrap;       /* CSS 3 */
   white-space: -moz-pre-wrap;  /* Mozilla, since 1999 */
   white-space: -pre-wrap;      /* Opera 4-6 */
   white-space: -o-pre-wrap;    /* Opera 7 */
   word-wrap: break-word;       /* Internet Explorer 5.5+ */
}
</style>
</head>
<body>
        
        <% CatalougeRequest catalouge = (CatalougeRequest) request.getAttribute("data"); %>
        <c:forEach var="entry" items="${catalouge.getList()}">
        Category:  ${entry.category} <br/>
        Product: ${entry.product} <br/>
        Location: ${entry.location} <br/>
        </c:forEach>        
        CustomerId: ${catalouge.getCustomerId()} <br/>
        
</body>
</html>