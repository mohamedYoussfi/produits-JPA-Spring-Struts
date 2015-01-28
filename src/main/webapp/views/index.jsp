<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8"/>
<title>Accueil</title>
</head>
<body>
  <s:url action="produits" var="url1"></s:url>
  <s:a href="%{url1}">Produits</s:a>
</body>
</html>