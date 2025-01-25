package com.saludmental;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet("/generate-pdf")
public class GeneratePdfServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=salud_mental_chile.pdf");

        Document document = new Document();
        try {
            OutputStream out = response.getOutputStream();
            PdfWriter.getInstance(document, out);
            document.open();

            // Contenido del PDF
            document.add(new Paragraph("Salud Mental en Chile"));
            document.add(new Paragraph("----------------------------------------------------"));
            document.add(new Paragraph("En Chile, la salud mental es una preocupación creciente."));
            document.add(new Paragraph(
                    "El gobierno ha implementado políticas para abordar el aumento de los trastornos mentales."));
            document.add(
                    new Paragraph("A pesar de los esfuerzos, persisten desafíos en el acceso a atención psicológica."));
            document.add(new Paragraph("Se recomienda una mayor inversión en recursos de salud mental."));

            document.close();
            out.flush();
        } catch (DocumentException e) {
            throw new IOException(e.getMessage());
        }
    }
}
