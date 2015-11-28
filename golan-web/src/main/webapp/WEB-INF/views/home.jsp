<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->

        <title>Golan WEB</title>

        <!-- CSS -->
        <link rel="stylesheet" href="resources/css/bootstrap.css">
        <link rel="stylesheet" href="resources/css/estilo.css">
        <link rel="stylesheet" href="resources/css/login.css">

    </head>

    <body>

        <div class="background-image"></div>
        <div class="content">
            <form class="form-signin">
                <h2>Gestión Beneficiarios Farmacia Popular</h2><br><br>
                <div class="group">
                    <input type="email" required><span class="highlight"></span><span class="bar"></span>
                    <label>Correo Electrónico</label>
                </div>
                <div class="group">
                    <input type="password" required><span class="highlight"></span><span class="bar"></span>
                    <label>Contraseña</label>
                </div>
                <button type="submit" class="button buttonBlue">Iniciar Sesión</button>
                <a href="#">¿Olvidó su contraseña?</a>
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