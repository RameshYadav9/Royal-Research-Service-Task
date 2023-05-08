<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header" />

<section style="padding:10px;min-height:400px">
  <h2>Greet</h2>
  <form>
  	<lable>Enter user name;
  		<input type="text" name="unm" required/>
  		
  		</lable>
  		<button>Greet</button>  
  </form>
  
  <c:if test="${greeting ne null}">
  	<p><strong>${greeting}</strong>
  	</c:if>
</section>

<jsp:include page="/footer" />