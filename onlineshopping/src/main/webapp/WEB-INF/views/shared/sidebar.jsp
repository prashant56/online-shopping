 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
             <p class="lead">Shop Name</p>
                <c:forEach var="category" items="${categories }">
                <div class="list-group">
                    <a href="${contextRoot }/show/category/${category.id}/products" class="list-group-item" id = "a_${category.name }" > ${category.name }</a>
                    
                </div>
                </c:forEach>
