<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		
		
		var actionForm = $("#actionForm");
		$(".pagination a").on("click",function(e) {
			e.preventDefault();

			actionForm.find("[name='pageNum']").val($(this).attr('href'));
			actionForm.submit();
		});
		var formObj = $("form");
		
		$('button').on("click",function(e){
			e.preventDefault();
		
			var operation = $(this).data("oper");
			
			formObj.attr("action","/playlist/list").attr("method","get");
			var pageNumTag = $("input[name='pageNum']").clone();
			var amountTag =$("input[name='amount']").clone();
			
			formObj.empty();
			formObj.append(pageNumTag);
			formObj.append(amountTag);
		
		formObj.submit();
		});
	});
/* 	$(".move").on("click",function(e){
		
		e.preventDefault();
		actionForm.append("<input type='hidden' name='bno' value'"+
				$(this).attr("href")+"'>");
		actionForm.attr("action","/board/get");
		actionForm.submit();
	});
	 */
	 
</script>

<style type="text/css">
.weekList {
	margin: 3%;
	padding: 3%;
}
.listHeader {
	padding: 20px 20px;
	margin-bottom: 30px;
	font-weight: bold;
	color: lightslategrey;
}

.h5message {
	text-align: center;
	font-size: 18px;
}

.listTable {
	height: 500px;
	
}
tr { 
	border-bottom: solid 1px silver;
}
th {
	text-align: center;
}

.tx {
	text-align: center;
}
.page-nav {
	display: flex;
}
.page-nav ul {
	display: flex;
	list-style: none;
	justify-content: center;
}

.page-nav ul li {
	color: snow;
}

.search-form {
	border: solid 1px rgb(241, 241, 241);
	display: flex;
	justify-content: center;
	padding: 20px 30px 20px 30px;
	background-color: rgb(241, 241, 241);
}
.page-nav ul {
		display: flex;
		list-style: none;
		justify-content: center;
		margin-top: 16px;
	}
	
	.num {
		border-radius: 3px 3px;
		text-decoration: none;
		border: 1px silver solid;		
		display: inline-block;
		width: 30px;
		background-color: lightslategrey;
		text-align: center;
		color: white;
	}
	
	.priLi, .numLi, .nexLi {
		padding: 0;
	}
	
	.pri, .nex {
		border-radius: 3px 3px;
		text-decoration: none;
		border: 1px silver solid;
		display: inline-block;
		width: 50px;
		background-color: lightslategrey; 
		text-align: center;
		color: white;
		
	}
	
	.pri:hover {
		text-decoration: none;
		background-color: snow;
		color: lightslategrey;
	}
	
	.num:hover {
		text-decoration: none;
		background-color: snow;
		color: lightslategrey;
	}
	
	.nex:hover {
		text-decoration: none;
		background-color: snow;
		color: lightslategrey;
	}
	

#write-button {	
	margin-top: 20px;
	width: 100px;
}
.write-button {
	padding: 0;
	background-color: silver;
}

.write-button:hover {
	color: lightslategrey; 
}
</style>

<title>playlist</title>
</head>
<body>
	<h1>선곡표</h1>
	<!--<h1>선곡표 및 선물 당첨</h1>
<div class=container-sm>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">방송일</th>
				<th scope="col">제목</th>
				<th scope="col">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>${board.bno}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.regdate}" /></td>
					<td>${board.title }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>	  -->

	<div class="container-sm">

		<div class="row">

			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>#번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="board">
						<tr>
							<td>${board.bno}</td>
							<td><c:url value="/playlist/get" var="boardLink">
									<c:param value="${board.bno }" name="bno" />
									<c:param value="${pageMaker.cri.pageNum }" name="pageNum" />
									<c:param value="${pageMaker.cri.amount }" name="amount" />
									<c:param value="${pageMaker.cri.type }" name="type" />
									<c:param value="${pageMaker.cri.keyword }" name="keyword" />
								</c:url> <a href="${boardLink }"> <c:out value="${board.title}" />
							</a></td>
							<td><fmt:formatDate pattern="yyyy-MM-dd"
									value="${board.regdate}" /></td>
							<td><c:out value="${board.hit }"/></td>
							</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


	<div class="container-sm mt-3">
	<div class="row justify-content-center">
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		  
		  	<c:if test="${pageMaker.prev }">
		  		<c:url value="/playlist/list" var="prevLink">
		  			<c:param value="${pageMaker.startPage -1 }" name="pageNum" />
		  			<c:param value="${pageMaker.cri.amount }" name="amount" />
		  			<c:param name="type" value="${pageMaker.cri.type }"/>
		    		<c:param name="keyword" value="${pageMaker.cri.keyword }"/>
		  		</c:url>
			    <li class="page-item">
			    <%-- <a class="page-link" href="${prevLink }">Previous</a> --%>
			    <a class="page-link" href="${pageMaker.startPage -1 }">Previous</a>
			    </li>
		  	</c:if>
		    
		    <c:forEach var="num" begin="${pageMaker.startPage }"
		    					 end="${pageMaker.endPage }">
		    	<c:url value="/playlist/list" var="pageLink" >
		    		<c:param name="pageNum" value="${num }" />
		    		<c:param name="amount" value="${pageMaker.cri.amount }" />
		    		<c:param name="type" value="${pageMaker.cri.type }"/>
		    		<c:param name="keyword" value="${pageMaker.cri.keyword }"/>
		    	</c:url>
		    	<li class="page-item ${pageMaker.cri.pageNum eq num ? 'active' : '' }">
		    	<%-- <a class="page-link" href="${pageLink }">${num }</a> --%>
		    	<a class="page-link" href="${num }">${num }</a>
		    	</li>
		    </c:forEach>
		    
		    <c:if test="${pageMaker.next }">
		    	<c:url value="/playlist/list" var="nextLink">
		    		<c:param name="pageNum" value="${pageMaker.endPage +1 }"/>
		    		<c:param name="amount" value="${pageMaker.cri.amount }" />
		    		<c:param name="type" value="${pageMaker.cri.type }"/>
		    		<c:param name="keyword" value="${pageMaker.cri.keyword }"/>
		    	</c:url>
			    <li class="page-item">
			    	<%-- <a class="page-link" href="${nextLink }">Next</a> --%>
		    		<a class="page-link" href="${pageMaker.endPage +1 }">Next</a>
			    </li>
		    </c:if>
		  </ul>
		</nav>
	</div>
</div>


	<div class="d-none">
		<form id="actionForm" action="${root }/playlist/list">
			<input name="pageNum" value="${pageMaker.cri.pageNum }" /> <input
				name="amount" value="${pageMaker.cri.amount }" /> <input name="type"
				value="${pageMaker.cri.type }" /> <input name="keyword"
				value="${pageMaker.cri.keyword }" /> <input type="submit" />
		</form>
	</div>


	<div class="container-sm" >
 <form action="${root }/playlist/list" id="searchForm" class="form-inline my-2 my-lg-0">	
   기간별 <input name="date" required value="${board.regdate}"  type="date">
	      <input name="date" required value="${board.regdate}"  type="date"> 
 	 <br>분류<br/> <select name="type" class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref">
	    <option value="T" ${pageMaker.cri.type eq 'T' ? 'selected' : '' }>제목</option>
	    <option value="C" ${pageMaker.cri.type eq 'C' ? 'selected' : '' }>가수</option>
	    <option value="W" ${pageMaker.cri.type eq 'W' ? 'selected' : '' }>작성자</option>
	  </select>	
      <input name="keyword" required value="${pageMaker.cri.keyword }" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <input type="hidden" name="pageNum" value="1" />
      <input type="hidden" name="amount" value="${pageMaker.cri.amount }" />
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
	</div>


</body>
</html>