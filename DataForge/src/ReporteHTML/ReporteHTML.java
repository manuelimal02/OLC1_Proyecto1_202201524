package ReporteHTML;
import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import dataforge.Token;
import dataforge.ErrorLexico;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;

/**
 *
 * 
 * @author manuel
 */
public class ReporteHTML {

    public static void Generar_Reporte_Tokens(LinkedList<Token> tokens, String outputPath) {
        try {
            Path carpetaReporte = Path.of("Reportes");
            if (!Files.exists(carpetaReporte)) {
                Files.createDirectory(carpetaReporte);
            }
            Path rutaArchivo = Path.of("Reportes", outputPath);
            try (BufferedWriter codigoHTML = new BufferedWriter(new FileWriter(rutaArchivo.toString()))) {
                codigoHTML.write("<!DOCTYPE html>\n<html>\n<head>\n");
                codigoHTML.write("<style>\n");
                codigoHTML.write("body {\n"
                        + "    font-family: 'Arial', sans-serif;\n"
                        + "    text-align: center;\n"
                        + "}\n");
                codigoHTML.write("table {\n"
                        + "    font-family: 'Arial', sans-serif;\n"
                        + "    border-collapse: collapse;\n"
                        + "    width: 70%;\n"
                        + "    margin: 20px auto;\n"
                        + "}\n");
                codigoHTML.write("th, td {\n"
                        + "    border: 1px solid #dddddd;\n"
                        + "    text-align: left;\n"
                        + "    padding: 8px;\n"
                        + "}\n");
                codigoHTML.write("th {\n"
                        + "    background-color: #f2f2f2;\n"
                        + "    font-weight: bold;\n"
                        + "}\n");
                codigoHTML.write("h1 {\n"
                        + "    font-family: 'Times New Roman', sans-serif;\n"
                        + "    text-align: center;\n"
                        + "    color: #333333;\n"
                        + "}\n");
                codigoHTML.write("</style>\n");
                codigoHTML.write("<title>Tabla De Tokens</title>\n");
                codigoHTML.write("</head>\n<body>\n");
                codigoHTML.write("<h1>Tabla De Tokens</h1>\n");
                codigoHTML.write("<table>\n");
                codigoHTML.write("<tr><th>No.</th><th>Tipo</th><th>Lexema</th><th>Línea</th><th>Columna</th></tr>\n");

                int numeroToken = 1;
                for (Token token : tokens) {
                    codigoHTML.write("<tr>");
                    codigoHTML.write("<td>" + numeroToken++ + "</td>");
                    codigoHTML.write("<td>" + token.getTipo() + "</td>");
                    codigoHTML.write("<td>" + token.getLexema() + "</td>");
                    codigoHTML.write("<td>" + token.getLinea() + "</td>");
                    codigoHTML.write("<td>" + token.getColumna() + "</td>");
                    codigoHTML.write("</tr>\n");
                }
                codigoHTML.write("</table>\n");
                codigoHTML.write("</body>\n</html>");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void Generar_Reporte_ErrorLexico(LinkedList<ErrorLexico> error_lexico, String outputPath) {
        try {
            Path carpetaReporte = Path.of("Reportes");
            if (!Files.exists(carpetaReporte)) {
                Files.createDirectory(carpetaReporte);
            }
            Path rutaArchivo = Path.of("Reportes", outputPath);
            try (BufferedWriter codigoHTML = new BufferedWriter(new FileWriter(rutaArchivo.toString()))) {
                codigoHTML.write("<!DOCTYPE html>\n<html>\n<head>\n");
                codigoHTML.write("<style>\n");
                codigoHTML.write("body {\n"
                        + "    font-family: 'Arial', sans-serif;\n"
                        + "    text-align: center;\n"
                        + "}\n");
                codigoHTML.write("table {\n"
                        + "    font-family: 'Arial', sans-serif;\n"
                        + "    border-collapse: collapse;\n"
                        + "    width: 70%;\n"
                        + "    margin: 20px auto;\n"
                        + "}\n");
                codigoHTML.write("th, td {\n"
                        + "    border: 1px solid #dddddd;\n"
                        + "    text-align: left;\n"
                        + "    padding: 8px;\n"
                        + "}\n");
                codigoHTML.write("th {\n"
                        + "    background-color: #f2f2f2;\n"
                        + "    font-weight: bold;\n"
                        + "}\n");
                codigoHTML.write("h1 {\n"
                        + "    font-family: 'Times New Roman', sans-serif;\n"
                        + "    text-align: center;\n"
                        + "    color: #333333;\n"
                        + "}\n");
                codigoHTML.write("</style>\n");
                codigoHTML.write("<title>Tabla De Errores</title>\n");
                codigoHTML.write("</head>\n<body>\n");
                codigoHTML.write("<h1>Tabla De Errores</h1>\n");
                codigoHTML.write("<table>\n");
                codigoHTML.write("<tr><th>No.</th><th>Tipo</th><th>Descripción</th><th>Línea</th><th>Columna</th></tr>\n");

                int numeroToken = 1;
                for (ErrorLexico error : error_lexico) {
                    codigoHTML.write("<tr>");
                    codigoHTML.write("<td>" + numeroToken++ + "</td>");
                    codigoHTML.write("<td>" + error.getTipo() + "</td>");
                    codigoHTML.write("<td>" + error.getLexema() + "</td>");
                    codigoHTML.write("<td>" + error.getLinea() + "</td>");
                    codigoHTML.write("<td>" + error.getColumna() + "</td>");
                    codigoHTML.write("</tr>\n");
                }
                codigoHTML.write("</table>\n");
                codigoHTML.write("</body>\n</html>");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
