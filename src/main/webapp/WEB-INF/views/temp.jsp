<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/21/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<c:url var="APIurl" value="/api-admin-user"/>--%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%@ include file="/common/web/header.banner.1920x300.jsp" %>
<!-- Cart view section -->
<section id="aa-myaccount">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="aa-myaccount-area">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="aa-myaccount-login">
                                <h4>Login</h4>
                                <form class="login100-form validate-form" action="/j_spring_security_check" id="formLogin" method="post">
                                    <c:if test="${param.incorrectAccount != null}">
                                        <div class="alert alert-danger">
                                            Username or password is incorrect
                                        </div>
                                    </c:if>
                                    <c:if test="${param.accessDenied != null}">
                                        <div class="alert alert-danger">
                                            you Not authorize
                                        </div>
                                    </c:if>


                                    <span class="login100-form-title p-b-34">
						Account Login
					</span>
                                    <div class="wrap-input100 rs1-wrap-input100 validate-input m-b-20" data-validate="Type user name">
                                        <input id="first-name" class="input100" type="text" id="userName" name="j_username" placeholder="User name">
                                        <span class="focus-input100"></span>
                                    </div>
                                    <div class="wrap-input100 rs2-wrap-input100 validate-input m-b-20" data-validate="Type password">
                                        <input class="input100" type="password" id="password" name="j_password" placeholder="Password">
                                        <span class="focus-input100"></span>
                                    </div>

                                    <div class="container-login100-form-btn">
                                        <button class="login100-form-btn">
                                            Sign in
                                        </button>
                                    </div>

                                    <div class="w-full text-center p-t-27 p-b-239">
						<span class="txt1">
							Forgot
						</span>

                                        <a href="#" class="txt2">
                                            User name / password?
                                        </a>
                                    </div>

                                    <div class="w-full text-center">
                                        <a href="#" class="txt3">
                                            Sign Up
                                        </a>
                                    </div>
                                </form>
                            </div>
                            <c:if test="${param.incorrectAccount != null}">
                                <div><font color="#ff0a00" >Username or password is incorrect</font></div>
                            </c:if>
                        </div>


                        <div class="col-md-6">
                            <div class="aa-myaccount-register">
                                <h4>Register</h4>
                                <form id="formSubmit" class="aa-login-form">

                                    <label>Username or Email address<span>*</span></label>
                                    <input type="text" placeholder="Username or email" name="userName">
                                    <label>Password<span>*</span></label>
                                    <input type="password" placeholder="Password" name="password">
                                    <label>Phone<span>*</span></label>
                                    <input type="text" placeholder="Phone" name="phone">
                                    <label>Email<span>*</span></label>
                                    <input type="text" placeholder="Email" name="email">

                                    <button id="btnChangePass" type="submit" class="aa-browse-btn">Register</button>
                                    <input type="hidden" value="2" name="roleId">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- / Cart view section -->
<%@ include file="/common/web/subscribe.jsp" %>
</body>
</html>
