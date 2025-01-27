<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Formulario de Envío de Correo</title>
</head>

<body>
    <header>
        <h1>Formulario de Envio de Correo</h1>
    </header>
    
    <p><a href="index.jsp">Ir a inicio</a></p>

    <div class="content">
        <h2>Enviar Correo a Gmail</h2>
        <form action="sendEmailServlet" method="post">
            <label for="to">Destinatario:</label><br>
            <input type="email" id="to" name="to" required><br><br>

            <label for="subject">Asunto:</label><br>
            <input type="text" id="subject" name="subject" required><br><br>

            <label for="message">Mensaje:</label><br>
            <textarea id="message" name="message" rows="4" cols="50" required></textarea><br><br>

            <input type="submit" value="Enviar">
        </form>
    </div>

    <footer>
        <p>&copy; 2025 Salud Mental</p>
    </footer>
</body>

</html>