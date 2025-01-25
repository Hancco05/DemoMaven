<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Salud Mental</title>
        <link rel="stylesheet" href="css/styles.css">
    </head>

    <body>
        <header>
            <h1>Bienestar y Salud Mental</h1>
        </header>

        <section class="content">
            <h2>¿Por qué es importante la salud mental?</h2>
            <p>
                La salud mental es fundamental para nuestro bienestar general. Afecta la forma en que pensamos, sentimos
                y actuamos.
                Es importante para afrontar el estrés, relacionarnos con los demás y tomar decisiones saludables.
            </p>

            <h3>Consejos para mantener una buena salud mental:</h3>
            <ul>
                <li>Mantener una dieta equilibrada.</li>
                <li>Hacer ejercicio regularmente.</li>
                <li>Dormir lo suficiente.</li>
                <li>Hablar sobre tus emociones con personas de confianza.</li>
            </ul>

            <button onclick="mostrarMensaje()">Haz clic para un consejo</button>
            <p id="mensaje"></p>
        </section>

        <footer>
            <p>&copy; 2025 Cuidemos Nuestra Mente</p>
        </footer>

        <script src="js/scripts.js"></script>
    </body>

    </html>