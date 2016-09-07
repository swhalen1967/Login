<jsp:useBean id="registerBean" class="edu.acc.j2ee.login.RegisterBean" scope="request">
    <jsp:setProperty name="registerBean" property="*"/>
</jsp:useBean>
<jsp:forward page="/register"/>
