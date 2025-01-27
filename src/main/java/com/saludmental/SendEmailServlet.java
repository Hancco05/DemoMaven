package com.saludmental;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import java.util.*;

@WebServlet("/sendEmailServlet")
public class SendEmailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recibir parámetros del formulario
        String to = request.getParameter("to");
        String subject = request.getParameter("subject");
        String messageText = request.getParameter("message");

        // Configuración de Gmail
        final String from = "tu-correo@gmail.com"; // Tu correo de Gmail
        final String password = "tu-contraseña"; // Tu contraseña de Gmail

        // Configuración del servidor SMTP de Gmail
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Obtener la sesión de correo
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Crear el mensaje MIME
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(messageText);

            // Enviar el correo
            Transport.send(message);

            // Responder al usuario con un mensaje de éxito
            response.getWriter().println("<h3>Correo enviado con éxito!</h3>");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            response.getWriter().println("<h3>Error al enviar el correo. Intenta nuevamente.</h3>");
        }
    }
}
