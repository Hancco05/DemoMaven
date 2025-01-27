<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Salud Mental en Chile</title>
        <link rel="stylesheet" href="styles.css">
    </head>

    <body>
        <header>
            <h1>Bienestar y Salud Mental en Chile</h1>
        </header>
        <h1>Bienvenido a la aplicación</h1>

        <p><a href="sendEmail.jsp">Ir a enviar un correo</a></p>

        <section class="content">
            <h2>¿Por qué es importante la salud mental?</h2>
            <p>
                La salud mental es un pilar fundamental en la calidad de vida de las personas. Afecta la manera en que
                pensamos,
                sentimos y actuamos en nuestra vida cotidiana, y es crucial para afrontar los desafíos de la vida de
                manera saludable.
            </p>

            <h2>Situación actual de la salud mental en Chile</h2>
            <p>
                Según estudios recientes, Chile es uno de los países de América Latina con los índices más altos de
                problemas de salud mental,
                como la depresión y la ansiedad. Factores como el estrés laboral, la desigualdad social y el acceso
                limitado a servicios de salud
                mental afectan significativamente a la población chilena.
            </p>

            <h3>Principales desafíos de salud mental en Chile:</h3>
            <ul>
                <li>Altos índices de estrés y ansiedad entre la población joven.</li>
                <li>Déficit de profesionales especializados en salud mental.</li>
                <li>Estigmatización de los trastornos mentales en la sociedad.</li>
                <li>Acceso limitado a tratamientos asequibles.</li>
            </ul>

            <h3>Consejos para mejorar la salud mental:</h3>
            <ul>
                <li>Mantener una rutina diaria saludable.</li>
                <li>Buscar ayuda profesional sin temor.</li>
                <li>Practicar la meditación y la atención plena.</li>
                <li>Participar en actividades recreativas y sociales.</li>
            </ul>

            <h2>Recursos de apoyo en Chile</h2>
            <p>
                Afortunadamente, existen diversas instituciones en Chile que ofrecen ayuda y apoyo en temas de salud
                mental,
                tales como el Ministerio de Salud (MINSAL), la Fundación ProCultura, y diversas líneas de ayuda como
                Salud Responde (600 360 7777).
            </p>

            <button onclick="mostrarMensaje()">Haz clic para un consejo</button>
            <p id="mensaje"></p>

            <h1>Salud Mental en Chile</h1>
            <p>Descarga nuestro informe completo sobre la situación actual de la salud mental en el país.</p>
            
            <a href="generatePdf">
                <button class="btn">Descargar Informe en PDF</button>
            </a>
        </section>

        <footer>
            <p>&copy; 2025 Cuidemos Nuestra Mente | Línea de ayuda: 600 360 7777</p>
        </footer>

        <script src="js/scripts.js"></script>
    </body>

    </html>