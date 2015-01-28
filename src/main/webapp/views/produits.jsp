<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8"/>
 <title>Accueil</title>
 <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
 <div class="cadre">
  <s:form action="save" method="post">
    <s:textfield label="REF" name="produit.reference"></s:textfield>
    <s:textfield key="produit.designation" name="produit.designation" ></s:textfield>
    <s:textfield label="Prix" name="produit.prix"></s:textfield>
    <s:textfield label="Quantité" name="produit.quantite"></s:textfield>
    <s:checkbox label="Promo" name="produit.promo"></s:checkbox>
    <s:hidden name="editMode"></s:hidden>
    <s:submit value="save"></s:submit>
  </s:form>
  </div>
  <div class="cadre">
   <table class="table1">
     <tr>
       <th>ID</th><th>DES</th><th>PRIX</th><th>QUANTITE</th><th>PROMO</th>
     </tr>
     <s:iterator value="produits">
        <tr>
          <td><s:property value="reference"/></td>
          <td><s:property value="designation"/></td>
          <td><s:property value="prix"/></td>
          <td><s:property value="quantite"/></td>
          <td><s:property value="promo"/></td>
          <s:url action="delete" var="url1">
            <s:param name="ref">
              <s:property value="reference"/>
            </s:param>
          </s:url>
          <s:url action="edit" var="url2">
            <s:param name="ref">
              <s:property value="reference"/>
            </s:param>
          </s:url>
          <td><s:a href="%{url1}">Supprimer</s:a></td>
           <td><s:a href="%{url2}">Edit</s:a></td>
        </tr>
     </s:iterator>
   </table>
  </div>
</body>
</html>