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
            <nav>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="info.jsp">Información</a></li>
                    <li><a href="generatePdf">Descargar PDF</a></li>
                    <li><a href="mailto:contacto@saludmental.cl">Contacto</a></li>
                </ul>
            </nav>
        </header>

        <main>
            <h2>Bienvenido a la aplicación</h2>

            <p><a href="sendEmail.jsp" class="btn">Ir a enviar un correo</a></p>

            <section class="content">
                <h2>¿Por qué es importante la salud mental?</h2>
                <p>
                    La salud mental es un pilar fundamental en la calidad de vida de las personas. Afecta la manera en
                    que
                    pensamos, sentimos y actuamos en nuestra vida cotidiana.
                </p>

                <h2>Situación actual en Chile</h2>
                <ul>
                    <li>Altos índices de estrés y ansiedad entre la población joven.</li>
                    <li>Déficit de profesionales especializados en salud mental.</li>
                    <li>Acceso limitado a tratamientos asequibles.</li>
                </ul>

                <h3>Consejos para mejorar la salud mental:</h3>
                <ul>
                    <li>Mantener una rutina diaria saludable.</li>
                    <li>Buscar ayuda profesional sin temor.</li>
                    <li>Practicar la meditación y la atención plena.</li>
                    <li>Participar en actividades recreativas y sociales.</li>
                </ul>

                <h2>Contacto</h2>
                <p>Si necesitas ayuda, puedes enviarnos un correo haciendo clic en el siguiente enlace:</p>
                <p><a href="mailto:contacto@saludmental.cl" class="email-link">Enviar un correo</a></p>
            </section>
        </main>

        <footer>
            <p>&copy; 2025 Cuidemos Nuestra Mente | Línea de ayuda: 600 360 7777</p>
        </footer>

        <script src="js/scripts.js"></script>
    </body>

    </html>