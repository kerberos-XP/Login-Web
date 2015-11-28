<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Golan WEB</title>

        <!-- CSS -->
        <link rel="stylesheet" href="resources/css/bootstrap.css">
        <link rel="stylesheet" href="resources/css/estilo.css">
        <link rel="stylesheet" href="resources/css/login.css">

    </head>

    <body>

        <div class="background-image"></div>
        <div class="content">
            <hgroup>
                <h1></h1>
                <h2>Gestión Beneficiarios Farmacia Popular</h2>
            </hgroup>
            
            <form class="form-signin">
                <div class="group">
                    <input type="email" required=""><span class="highlight"></span><span class="bar"></span>
                    <label>Correo Electrónico</label>
                </div>
                <div class="group">
                    <input type="password" required=""><span class="highlight"></span><span class="bar"></span>
                    <label>Contraseña</label>
                </div>
                <button type="submit" class="button buttonBlue">Iniciar Sesión</button>
            </form>
            
            <footer>
                <p>Desarrollado por <a href="http://www.golanerp.cl/" target="_blank">Golan Ltda</a></p>
            </footer>
        </div>

        <!-- Javascript -->
        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/login.js"></script>

    </body>

</html>