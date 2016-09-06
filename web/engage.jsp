<jsp:useBean id="loginbean" class="edu.acc.j2ee.login.User" scope="request">
    <jsp:setProperty name="loginbean" property="*"/>
</jsp:useBean>
<jsp:forward page="/controller"/>