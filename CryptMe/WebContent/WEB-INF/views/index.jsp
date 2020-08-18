<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

  <title>CryptMe | Share Files Securely</title>
  
  <link href="${pageContext.request.contextPath}/resources/css/main.style.css" rel="stylesheet">
  
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
          <li><a href="./" title="" class="active">Home</a></li>
          <li><a href="./login" title="">Login</a></li>
          <li><a href="./signup" title="">Sign Up</a></li>
        </ul>
      </div>
    </div>
  </nav>
</header>

<div class="section-container">
	<div class="container">
        <div class="row">                   
            <div class="col-md-7">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/index-main-img.png" alt="">
            </div>

            <div class="col-md-5">
                <ul class="features">
                    <li>
                        <h3>Data Security</h3>
                        <p>Encrypt any files in your private folder which cannot be viewed by anyone until it is decrypted.</p>
                    </li>
                    <li>
                        <h3>Ease of Use</h3>
                        <p>All the functions on the site are easy to use and all the features are triggered on a single click.</p>
                    </li>
                    <li>
                        <h3>Availability</h3>
                        <p>Accessibility guaranteed with 100% availability rate and all features completely free for use.</p>
                    </li>
                </ul>
            </div> 
        </div>
	</div>
</div>

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

</body>

</html>