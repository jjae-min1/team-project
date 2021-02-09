<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		
		$("#list a").click(function(e){
			e.preventDefault();
			
			actionForm.find("[name='day']").val($(this).attr('href'));
			
			actionForm.submit();
		});
	});
</script>	

<!--  
<script type="text/javascript">
	$(document).ready(function(){
		var actionForm = $("#actionForm");
		$(".box weekly a").click(function(e) {
			e.preventDefault();
			
			actionForm.find("[name='day']").val($(this).attr('href'));
			
			actionForm.submit();
		});
	});
</script>
-->
<title>Insert title here</title>
</head>
<body>

<!--  
<div id="container" class="container">
	<div class="box daily">
		<ul class="item corner" id="list">
			<li>
			<span>월</span>
			<a class="test" href="1">월</a>
			</li>
			<li>
			<span>화</span>
			<a href="2">화</a>
			</li>
			<li>
			<span>수</span>
			<a href="3">수</a>
			</li>
			<li>
			<span>목</span>
			<a href="4">목</a>
			</li>
			<li>
			<span>금</span>
			<a href="5">금</a>
			</li>
			<li>
			<span>토</span>
			<a href="6">토</a>
			</li>
			<li>
			<span>일</span>
			<a href="7">일</a>
			</li>
		</ul>
	</div>
</div>

<form id="actionForm" action="${root }/board/list">
	<input type="hidden" name="day" value="1">
	<input type="submit"/>
</form>
-->







< 
<div id="container" class="container">
	<!-- side -->
   	<aside class="side">
		<div class="vert">
			
			<div class="box daily">
				<strong class="title">매일코너</strong>
				<ul class="item corner">
					<li>밤에 톡톡</li>
					<li>사연과 신청곡</li>
				</ul>
			</div>
			
			<div class="box-round banner-float" style="display: none;">
				<span class="blind">배너영역</span>
			</div>
			
			<div id="weekContent" class="box weekly">
				<strong class="title">요일코너</strong>
				<ul class="item corner" id="list">
					<li>
						<span class="da">월</span>
						<a href="1" class="tit">영업합니다</a>
					</li>
					<li>
						<span class="da">화</span>
						<a href="2" class="tit">뮤직에세이, 노래 속 책갈피</a>
					</li>
					<li>
						<span class="da">수</span>
						<a href="3" class="tit">뮤직에세이, 노래 속 책갈피</a>
					</li>
					<li>
						<span class="da">목</span>
						<a href="4" class="tit">극한일상</a>
					</li>
					<li>
						<span class="da">금</span>
						<a href="5" class="tit">전지적 작사 시점</a>
					</li>
					<li>
						<span class="da">토</span>
						<a href="6" class="tit">SoSo썰_의뢰사연</a>
					</li>
					<li>
						<span class="da">일</span>
						<a href="7" class="tit">북 트래블러</a>
					</li>
				</ul>	
			</div>
			

		
		</div>
	</aside>

<form id="actionForm" action="/board/list">
		<input type="hidden" name="day" value="1">
		<input type="submit" />
</form>
</div>


</body>
</html>