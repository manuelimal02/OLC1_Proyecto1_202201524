package Reportes;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
/**
 *
 * @author manuel
 */
public class GraficaHistograma {
        public static String crearHistograma(String cadena, JTabbedPane tabbedPane) {
        String[] partes = cadena.split("\\|");
        String titulo = null;
        int[] values = null;

        for (String parte : partes) {
            parte = parte.trim();
            if (parte.startsWith("TITULO:")) {
                titulo = parte.split(":")[1].trim().replace("\"", ""); // Eliminar comillas
            } else if (parte.startsWith("VALUES:")) {
                String[] valuesArray = parte.split(":")[1].trim().split(",");
                values = new int[valuesArray.length];
                for (int i = 0; i < valuesArray.length; i++) {
                    values[i] = Integer.parseInt(valuesArray[i]);
                }
            }
        }

        if (titulo == null || values == null) {
            return "Error: Faltan Datos Para El Histograma";
        }

        DefaultCategoryDataset dataset = createDataset(values);
        JFreeChart barChart = ChartFactory.createBarChart(
                titulo,
                "Valor",
                "Frecuencia Absoluta",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(tabbedPane.getWidth(), tabbedPane.getHeight()));

        JPanel panelExistente = obtenerPanelExistente(tabbedPane, titulo);
        if (panelExistente != null) {
            panelExistente.add(chartPanel);
        } else {
            JPanel nuevoPanel = new JPanel();
            nuevoPanel.add(chartPanel);
            tabbedPane.addTab(titulo, nuevoPanel);
        }

        // Imprimir información ordenada
        String informacion = obtenerInformacion(values);
        System.out.println(informacion);
        return "Gráfica Histograma '" + titulo + "' Creada Correctamente.\n"+informacion;
    }

    private static DefaultCategoryDataset createDataset(int[] values) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Calcular frecuencia de cada valor
        java.util.Map<Integer, Integer> frecuencias = new java.util.HashMap<>();
        int frecuenciaAcumulada = 0;

        for (int value : values) {
            frecuencias.put(value, frecuencias.getOrDefault(value, 0) + 1);
            frecuenciaAcumulada++;
        }

        // Agregar datos al dataset
        for (java.util.Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            int valor = entry.getKey();
            int frecuenciaAbsoluta = entry.getValue();
            double frecuenciaRelativa = (double) frecuenciaAbsoluta / values.length;
            double frecuenciaAcumuladaRelativa = (double) frecuenciaAcumulada / values.length;
            dataset.addValue(frecuenciaAbsoluta, "Datos", String.valueOf(valor));
            System.out.printf("Valor: %d, Frecuencia Acumulada: %d, Relativa Absoluta: %.2f, Relativa Acumulada: %.2f\n",
                    valor, frecuenciaAcumulada, frecuenciaRelativa, frecuenciaAcumuladaRelativa);
        }
        return dataset;
    }
    private static JPanel obtenerPanelExistente(JTabbedPane tabbedPane, String titulo) {
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            if (tabbedPane.getTitleAt(i).equals(titulo)) {
                return (JPanel) tabbedPane.getComponentAt(i);
            }
        }
        return null;
    }

    private static String obtenerInformacion(int[] values) {
        java.util.Map<Integer, Integer> frecuencias = new java.util.HashMap<>();
        int frecuenciaAcumulada = 0;
        for (int value : values) {
            frecuencias.put(value, frecuencias.getOrDefault(value, 0) + 1);
            frecuenciaAcumulada++;
        }
        StringBuilder informacion = new StringBuilder("Información del Histograma:\n");
        informacion.append("Valor, Frecuencia Acumulada, Relativa Absoluta, Relativa Acumulada\n");
        for (java.util.Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            int valor = entry.getKey();
            int frecuenciaAbsoluta = entry.getValue();
            double frecuenciaRelativa = (double) frecuenciaAbsoluta / values.length;
            double frecuenciaAcumuladaRelativa = (double) frecuenciaAcumulada / values.length;

            informacion.append(String.format("%d, %d, %.2f, %.2f\n", valor, frecuenciaAcumulada,
                    frecuenciaRelativa, frecuenciaAcumuladaRelativa));

            frecuenciaAcumulada -= frecuenciaAbsoluta;
        }
        return informacion.toString();
    }
}