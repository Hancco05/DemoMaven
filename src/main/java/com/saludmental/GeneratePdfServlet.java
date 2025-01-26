package com.saludmental;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

@WebServlet("/generate-pdf")
public class GeneratePdfServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=salud_mental_chile.pdf");

        try (PDDocument document = new PDDocument()) {
            // Crear una nueva página
            PDPage page = new PDPage();
            document.addPage(page);

            // Crear un flujo de contenido
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();

            // Establecer la fuente y tamaño
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
            contentStream.newLineAtOffset(100, 750); // Ajustar la posición

            // Agregar contenido al PDF
            contentStream.showText("Salud Mental en Chile");
            contentStream.newLine();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.showText("En Chile, la salud mental es una preocupación creciente.");
            contentStream.newLine();
            contentStream.showText(
                    "El gobierno ha implementado políticas para abordar el aumento de los trastornos mentales.");
            contentStream.newLine();
            contentStream.showText("A pesar de los esfuerzos, persisten desafíos en el acceso a atención psicológica.");
            contentStream.newLine();
            contentStream.showText("Se recomienda una mayor inversión en recursos de salud mental.");

            contentStream.endText();
            contentStream.close();

            // Escribir el documento al OutputStream
            try (OutputStream out = response.getOutputStream()) {
                document.save(out);
                out.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Error al generar el PDF", e);
        }
    }
}
