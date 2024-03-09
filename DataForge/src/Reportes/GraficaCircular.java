package Reportes;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
/**
 *
 * @author manuel
 */
public class GraficaCircular {
        public static String crearGraficaCircular(String cadena, JTabbedPane tabbedPane) {
        String[] partes = cadena.split("\\|");
        String titulo = null;
        String[] labels = null;
        double[] values = null;

        for (String parte : partes) {
            parte = parte.trim();
            if (parte.startsWith("TITULO:")) {
                titulo = parte.split(":")[1].trim().replace("\"", ""); // Eliminar comillas
            } else if (parte.startsWith("LABEL:")) {
                String[] labelsArray = parte.split(":")[1].trim().split(",");
                labels = new String[labelsArray.length];
                for (int i = 0; i < labelsArray.length; i++) {
                    labels[i] = labelsArray[i].replace("\"", ""); // Eliminar comillas
                }
            } else if (parte.startsWith("VALUES:")) {
                String[] valuesArray = parte.split(":")[1].trim().split(",");
                values = new double[valuesArray.length];
                for (int i = 0; i < valuesArray.length; i++) {
                    values[i] = Double.parseDouble(valuesArray[i]);
                }
            }
        }

        if (titulo == null || labels == null || values == null) {
            return "Error: Faltan Datos Para La Gráfica Circular";
        }

        PieDataset dataset = createDataset(labels, values);
        JFreeChart pieChart = ChartFactory.createPieChart(
                titulo,
                dataset,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(tabbedPane.getWidth(), tabbedPane.getHeight()));

        JPanel panelExistente = obtenerPanelExistente(tabbedPane, titulo);
        if (panelExistente != null) {
            panelExistente.add(chartPanel);
        } else {
            JPanel nuevoPanel = new JPanel();
            nuevoPanel.add(chartPanel);
            tabbedPane.addTab(titulo, nuevoPanel);
        }
        return "Gráfica Circular '" + titulo + "' Creada Correctamente.";
    }
    private static PieDataset createDataset(String[] labels, double[] values) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < labels.length; i++) {
            dataset.setValue(labels[i], values[i]);
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
}
