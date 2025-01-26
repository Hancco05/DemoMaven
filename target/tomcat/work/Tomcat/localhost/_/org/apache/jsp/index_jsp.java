/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-01-26 00:57:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("    <html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Salud Mental en Chile</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <h1>Bienestar y Salud Mental en Chile</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <h2>¿Por qué es importante la salud mental?</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("                La salud mental es un pilar fundamental en la calidad de vida de las personas. Afecta la manera en que\r\n");
      out.write("                pensamos,\r\n");
      out.write("                sentimos y actuamos en nuestra vida cotidiana, y es crucial para afrontar los desafíos de la vida de\r\n");
      out.write("                manera saludable.\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <h2>Situación actual de la salud mental en Chile</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("                Según estudios recientes, Chile es uno de los países de América Latina con los índices más altos de\r\n");
      out.write("                problemas de salud mental,\r\n");
      out.write("                como la depresión y la ansiedad. Factores como el estrés laboral, la desigualdad social y el acceso\r\n");
      out.write("                limitado a servicios de salud\r\n");
      out.write("                mental afectan significativamente a la población chilena.\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <h3>Principales desafíos de salud mental en Chile:</h3>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>Altos índices de estrés y ansiedad entre la población joven.</li>\r\n");
      out.write("                <li>Déficit de profesionales especializados en salud mental.</li>\r\n");
      out.write("                <li>Estigmatización de los trastornos mentales en la sociedad.</li>\r\n");
      out.write("                <li>Acceso limitado a tratamientos asequibles.</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <h3>Consejos para mejorar la salud mental:</h3>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>Mantener una rutina diaria saludable.</li>\r\n");
      out.write("                <li>Buscar ayuda profesional sin temor.</li>\r\n");
      out.write("                <li>Practicar la meditación y la atención plena.</li>\r\n");
      out.write("                <li>Participar en actividades recreativas y sociales.</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <h2>Recursos de apoyo en Chile</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("                Afortunadamente, existen diversas instituciones en Chile que ofrecen ayuda y apoyo en temas de salud\r\n");
      out.write("                mental,\r\n");
      out.write("                tales como el Ministerio de Salud (MINSAL), la Fundación ProCultura, y diversas líneas de ayuda como\r\n");
      out.write("                Salud Responde (600 360 7777).\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("            <button onclick=\"mostrarMensaje()\">Haz clic para un consejo</button>\r\n");
      out.write("            <p id=\"mensaje\"></p>\r\n");
      out.write("\r\n");
      out.write("            <h1>Salud Mental en Chile</h1>\r\n");
      out.write("            <p>Descarga nuestro informe completo sobre la situación actual de la salud mental en el país.</p>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"generatePdf\">\r\n");
      out.write("                <button class=\"btn\">Descargar Informe en PDF</button>\r\n");
      out.write("            </a>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("            <p>&copy; 2025 Cuidemos Nuestra Mente | Línea de ayuda: 600 360 7777</p>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/scripts.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
