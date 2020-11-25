  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
   <head>
      <title>Login Page</title>
      <meta charset="utf-8">
      <meta name="viewport"
         content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <!-- Reference Bootstrap files -->
      <link rel="stylesheet"
         href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script
         src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
      <script
         src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   </head>
   
   
  
   
   <body background=" <c:url value='/images/mount.jpg'/> " >
      <div>
         <div id="loginbox" style="margin-top: 60px;" class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
            <div class="panel panel-info">
               <div class="panel-heading">
                  <div class="panel-title">Sign In</div>
               </div>
               <h3 style="padding-left: 50px">
                  Kayhan <span class="glyphicon glyphicon-education"></span> Academy
               </h3>
               <div style="padding-top: 10px; padding-bottom: 50px" class="panel-body">
                  <!-- Login Form -->
                  <form action="${pageContext.request.contextPath}/authenticateTheUser"  method="POST" class="form-horizontal">
                     <!-- Place for messages: error, alert etc ... -->
                     <div class="form-group">
                        <div class="col-xs-15">
                        
                        
                        <div>
            <!-- login errro message and logout message -->

					<c:if test="${param.error != null}">
					
					<div  class="alert alert-danger col-xs-offset-1 col-xs-10">
					
					Invalid Username and password
					
					</div>
					
					</c:if>	
					
					
					<c:if test="${param.logout != null}">
					
					<div  class="alert alert-success col-xs-offset-1 col-xs-10">
					
					YOU HAVE BEEN LOGGED OUT!
					
					</div>
					
					</c:if>	
					
					


                        </div>
                           
                        </div>
                     </div>
                     
                     
                     <!-- User name -->
                     <div style="margin-bottom: 25px" class="input-group">
                        <span class="input-group-addon"><i
                           class="glyphicon glyphicon-user"></i></span> <input type="text"
                           name="username" placeholder="username" class="form-control">
                     </div>
                     <!-- Password -->
                     <div style="margin-bottom: 25px" class="input-group">
                        <span class="input-group-addon"><i
                           class="glyphicon glyphicon-lock"></i></span> <input type="password"
                           name="password" placeholder="password" class="form-control">
                     </div>
                     <!-- Login/Submit Button -->
                     <div style="margin-top: 30px" class="form-group">
                        <div class="col-sm-6 controls">
                            

                                <!-- login and logout buttons -->
                                
                                <button type="submit" class="btn btn-success" >log in</button>
								<a href="${pageContext.request.contextPath}/register" >
								
									<button type="button" class="btn btn-info">Sign Up</button>
								
								
								</a>


                         
                        </div>
                     </div>
                     <!-- I'm manually adding Cross-Site Request Forgery tokens for autmaticaly log out-->
                    
                        <input type="hidden" name="${_csrf.parameterName }"  value="${_csrf.token }" />
                        
                        
                  </form>
               </div>
            </div>
         </div>
      </div>
      <div style="width: 90%; padding-top: 50px; color: white; " class="float-right">
         <h4>login instraction</h4>
      </div>
   </body>
</html>