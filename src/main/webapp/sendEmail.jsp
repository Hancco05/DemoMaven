<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Enviar Correo</title>
    </head>

    <body>
        <h2>Enviar un correo electrónico</h2>
        <form action="sendEmail" method="post">
            <label for="email">Correo destino:</label>
            <input type="email" id="email" name="email" required>
            <br><br>

            <label for="subject">Asunto:</label>
            <input type="text" id="subject" name="subject" required>
            <br><br>

            <label for="message">Mensaje:</label>
            <textarea id="message" name="message" required></textarea>
            <br><br>

            <input type="submit" value="Enviar correo">
        </form>
    </body>

    </html>