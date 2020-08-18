<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta content="IE=edge" http-equiv="X-UA-Compatible">
  <meta content="width=device-width,initial-scale=1" name="viewport">
  <meta content="description" name="description">
  <meta name="google" content="notranslate" />
  
  <meta name="msapplication-tap-highlight" content="no">
  
  <link href="./assets/apple-touch-icon.png" rel="apple-touch-icon">
  <link href="${pageContext.request.contextPath}/resources/images/crypt-me-favicon.png" rel="icon">

  <title>CryptMe | My Profile</title>
  
  <link href="${pageContext.request.contextPath}/resources/css/crypt.main.css" rel="stylesheet">
  
</head>

<body>

<header>
  <nav class="navbar  navbar-fixed-top navbar-default">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle uarr collapsed" data-toggle="collapse" data-target="#navbar-collapse-uarr">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="./" title="">
          <img src="${pageContext.request.contextPath}/resources/images/crypt-me-logo.svg" class="navbar-logo-img" alt="">
        </a>
      </div>

      <div class="collapse navbar-collapse" id="navbar-collapse-uarr">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="./profile" title="" class="active">My Profile</a></li>
          <li><a href="./logout" title="">Logout</a></li>
        </ul>
      </div>
    </div>
  </nav>
</header>

<form:form method="POST" action="./uploadFile" modelAttribute="uploadForm" enctype="multipart/form-data">
<div class="section-container">
	<div class="container">
		<div class="row">
			<div class="col-md-4"><h4></h4></div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<form:errors path="*" cssClass="errorBlock" element="div" />
			</div>
		</div>
		<div class="row">
        	<br>                   
			<div class="col-md-2">
				<form:label path="uploadFile">Upload Document</form:label>
				<form:input type="file" path="uploadFile"></form:input>
			</div>
        </div>
        <div class="row">
        	<br>                
			<div class="col-md-2"><button type="submit" class="btn btn-primary btn-sm">Upload</button></div>
        </div>
	</div>
</div>
</form:form>

<footer>
    <div class="section-container footer-container">
        <div class="container">
            <div class="row">
                    <div class="col-md-4">
                        <h4>About us</h4>
                        <p>CryptMe is a Secure Online File Sharing system integrated with Cryptographic Technology.</p>
                    </div>
					
                    <div class="col-md-4"></div>
					
                    <div class="col-md-4">
                        <p>
                            <a href="https://facebook.com" class="social-round-icon white-round-icon fa-icon" title="">
                            <i class="fa fa-facebook" aria-hidden="true"></i>
                          </a>
                          <a href="https://twitter.com" class="social-round-icon white-round-icon fa-icon" title="">
                            <i class="fa fa-twitter" aria-hidden="true"></i>
                          </a>
                          <a href="https://www.linkedin.com" class="social-round-icon white-round-icon fa-icon" title="">
                            <i class="fa fa-linkedin" aria-hidden="true"></i>
                          </a>
                        </p>
                        <p><small>© CryptMe | Share Files Securely</small></p>    
                    </div>
            </div>
        </div>
    </div>
</footer>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/crypt.main.js"></script>

</body>

</html>