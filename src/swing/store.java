package swing;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class store extends JFrame {
    ImageRenderer imageRenderer = new ImageRenderer();


    public static void main(String[] args) {
        store frame = new store();
        frame.pack();
        frame.setVisible(true);
    }
    public store() {

        // Table content
        String[][] items = {
                {"XP Booster", "Potenciador d'experiència que té 3 h de durada.", "100", "/swing/img/exp.png"},
                {"2 rolls", "Et permet tirar 2 rolls més cada vegada permanentment", "150", "/swing/img/rolls.png"},
                {"1 claim", "Disposaràs d'un claim adicional cada 48h", "500", "/swing/img/claim.png"},
                {"Rang bronze", "+ 5% de monedes obtingudes!", "250", "/swing/img/bronze (1).png"},
                {"Rang plata", "+ 10% de monedes obtingudes ", "350", "/swing/img/plata (1).png"},
                {"Rang or", "+50 monedes cada vegada que es reclami un personatge", "500", "/swing/img/or (1).png"},
                {"Rang safir", "Hola", "610", "/swing/img/safir (1).png"},
                {"Rang rubi", "Hola", "780", "/swing/img/ruby (1).png"},
                {"Rang esmeralda", "Hola", "900", "/swing/img/esmeralda (1).png"},
                {"Sort", "Augmenta la probabilitat de que surti un personatge car!", "1500", "/swing/img/suerte.jpg"},

        };
        String[] columna = {"Nom", "Descripció", "Preu", "Imatge"};

        // Table
        final JTable botiga = new JTable(items, columna);
        botiga.setPreferredScrollableViewportSize(new Dimension(300, 235));
        botiga.getColumnModel().getColumn(3).setCellRenderer(imageRenderer);

        // Set custom renderer for image column
        botiga.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());

        // Scrollpane for table
        JScrollPane scrollPane = new JScrollPane(botiga);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        botiga.getColumnModel().getColumn(3).setPreferredWidth(150);

        // Set the row height based on the height of the image
        botiga.setRowHeight(260);

        // Window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Frame properties
        setTitle("Anime Store!");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Subclass for image renderer
    public static class ImageRenderer extends DefaultTableCellRenderer {
        private final JLabel label;

        public ImageRenderer() {
            label = new JLabel();
            label.setHorizontalAlignment(JLabel.CENTER);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value != null) {
                ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource((String) value)));
                label.setIcon(icon);
            } else {
                label.setIcon(null);
            }
            return label;
        }
    }
}