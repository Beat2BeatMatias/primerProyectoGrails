<%--
  Created by IntelliJ IDEA.
  User: mfariasfalki
  Date: 2019-04-23
  Time: 20:22
--%>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta name="layout" content="public"/>
    <title>Home Page</title>

    <asset:javascript src="jquery-3.1.1.js" />

    <script type="text/javascript">
            $( document ).ready(function() {
            console.log( "jQuery 3.1.1 loaded!" );

        });
    </script>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome ${name}!</h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <p>There are ${vehicleTotal} vehicles in the database.</p>

        <ul>
            <g:each in="${vehicleList}" var="vehicle">
                <li>
                    <g:link controller="vehiculo" action="show" id="${vehicle.id}">
                        ${vehicle.name} - ${vehicle.year} ${vehicle.make.name} ${vehicle.model.name}
                    </g:link>
                </li>
            </g:each>
        </ul>

        <g:form action="updateName" style="margin: 0 auto; width:320px">
            <g:textField name="name" value="" />
            <g:submitButton name="Update name" />
        </g:form>

    </section>
</div>

</body>
</html>
