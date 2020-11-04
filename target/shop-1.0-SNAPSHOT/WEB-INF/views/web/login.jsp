<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/21/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                                <form action="/j_spring_security_check" class="aa-login-form" method="post">

                                    <label>Username or Email address<span>*</span></label>
                                    <input type="text" placeholder="Username or email" name="j_username">

                                    <label>Password<span>*</span></label>
                                    <input type="password" placeholder="Password" name="j_password">
                                    <input type="hidden" value="login" name="action">

                                    <button type="submit" class="aa-browse-btn">Login</button>
                                    <label class="rememberme" for="rememberme"><input type="checkbox" id="rememberme"> Remember me </label>
                                    <p class="aa-lost-password"><a href="#">Lost your password?</a></p>
                                    <c:if test="${param.incorrectAccount != null}">
                                        <div class="alert alert-danger">
                                            Username or password is incorrect
                                        </div>
                                    </c:if>
                                </form>
                            </div>
                        </div>


                        <div class="col-md-6">
                            <div class="aa-myaccount-register">
                                <h4>Register</h4>
                                <form id="formSubmit" action="/" class="aa-login-form">

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
