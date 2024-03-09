package Reportes;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;


/**
 *
 * @author manuel
 */
public class GraficaLineal {
    public static String crearGraficaLineas(String cadena, JTabbedPane tabbedPane) {
        String[] partes = cadena.split("\\|");
        String titulo = null;
        String tituloX = null;
        String[] ejex = null;
        String[] ejey = null;
        String tituloY = null;

        for (String parte : partes) {
            parte = parte.trim();
            if (parte.startsWith("TITULO:")) {
                titulo = parte.split(":")[1].trim().replace("\"", "");
            } else if (parte.startsWith("TITULOX:")) {
                tituloX = parte.split(":")[1].trim().replace("\"", "");
            } else if (parte.startsWith("EJEX:")) {
                ejex = parte.split(":")[1].trim().split(",");
                for (int i = 0; i < ejex.length; i++) {
                    ejex[i] = ejex[i].replace("\"", "");
                }
            } else if (parte.startsWith("EJEY:")) {
                ejey = parte.split(":")[1].trim().split(",");
            } else if (parte.startsWith("TITULOY:")) {
                tituloY = parte.split(":")[1].trim().replace("\"", "");
            }
        }
        if (titulo == null || tituloX == null || ejex == null || ejey == null || tituloY == null) {
            return "Error: Faltan Datos Para La Gráfica de Líneas";
        }
        CategoryDataset dataset = createDataset(ejex, ejey);
        JFreeChart lineChart = ChartFactory.createLineChart(
                titulo,
                tituloX,
                tituloY,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(tabbedPane.getWidth(), tabbedPane.getHeight()));
        JPanel panelExistente = obtenerPanelExistente(tabbedPane, titulo);
        if (panelExistente != null) {
            panelExistente.add(chartPanel);
        } else {
            JPanel nuevoPanel = new JPanel();
            nuevoPanel.add(chartPanel);
            tabbedPane.addTab(titulo, nuevoPanel);
        }
        return "Gráfica Lineal '" + titulo + "' Creada Correctamente.";
    }

    private static CategoryDataset createDataset(String[] ejex, String[] ejey) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ejex.length; i++) {
            dataset.addValue(Double.parseDouble(ejey[i]), "Datos", ejex[i]);
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