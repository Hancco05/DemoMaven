<%@ page contentType="text/html; charset=UTF-8" language="java" %>
    <html>

    <head>
        <title>Enviar Correo</title>
    </head>

    <body>
        <h2>Enviar un correo a Gmail</h2>
        <form action="sendEmail" method="post">
            <label for="email">Correo destinatario:</label>
            <input type="email" id="email" name="email" required><br><br>

            <label for="subject">Asunto:</label>
            <input type="text" id="subject" name="subject" required><br><br>

            <label for="message">Mensaje:</label>
            <textarea id="message" name="message" rows="5" required></textarea><br><br>

            <input type="submit" value="Enviar">
        </form>
    </body>

    </html>