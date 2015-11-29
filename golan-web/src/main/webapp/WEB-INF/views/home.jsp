<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Golan WEB</title>

        <!-- CSS -->
        <link rel="stylesheet" href="resources/css/bootstrap.css">
        <link rel="stylesheet" href="resources/css/estilo.css">
        <link rel="stylesheet" href="resources/css/login.css">

    </head>

    <body>

        <div class="super-container">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-4 col-md-offset-4">
                        <h3 class="text-center login-title"></h3>
                        <div class="account-wall">
                            <form class="form-signin">
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
                                <p>Un producto de <a href="http://www.golanerp.cl/" target="_blank">Golan ERP</a></p>
                            </footer>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Javascript -->
        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/login.js"></script>

        <!-- Activar soporte de HTML5 en IE -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </body>

</html>