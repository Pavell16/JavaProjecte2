package swing;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class dataBase extends JFrame {
    ImageRenderer imageRenderer = new ImageRenderer();


    public static void main(String[] args) {
        auxiliar frame = new auxiliar();
        frame.pack();
        frame.setVisible(true);
    }
    public dataBase() {

        // Table content
        String[][] data = {
                {"1", "Kim Dokja", "", "Masculí", "Omniscient Reader's Viewpoint", "/swing/img/dokja150.jpg"},
                {"2", "Killua Zoldyck", "", "Masculí", "Hunter x Hunter", ""},
                {"3", "Kuroko Tetsuya", "", "Masculí", "Kuroko no Basket", ""},
                {"4", "Klein Moretti", "", "Masculí", "Lord Of The Mysteries", ""},
                {"5", "Lelouch Lamperouge", "", "Masculí", "Code Geass", ""},
                {"6", "Saber", "", "Femení", "Fate/Stay Night", ""},
                {"7", "Asta", "", "Masculí", "Black Clover", ""},
                {"8", "Penelope Eckart", "", "Femení", "Death Is the Only Ending for the Villainess", ""},
                {"9", "Pyo Wol", "", "Masculí", "Reaper of the Drifting Moon", ""},
                {"10", "Rick Sanchez", "", "Masculí", "Rick y Morty", ""},
                {"11", "Dunn Smith", "", "Masculí", "Lord Of The Mysteries", ""},
                {"12", "Sung Jin-Woo", "", "Masculí", "Solo Leveling", ""},
                {"13", "Inuyasha", "", "Masculí", "Inuyasha", ""},
                {"14", "Sasha Brown", "", "Femení", "Shingeki no Kyojin", ""},
                {"15", "Nezuko Kamado", "", "Femení", "Kimetsu no Yaiba", ""},
                {"16", "Winry Rockbell", "", "Femení", "FullMetal Alchemist Brotherhood", ""},
                {"17", "Satoru Gojo", "", "Masculí", "Jujutsu Kaisen", ""},
                {"18", "Edward Elric", "", "Masculí", "FullMetal Alchemist Brotherhood", ""},
                {"19", "Sukuna", "", "Masculí", "Jujutsu Kaisen", ""},
                {"20", "Levi Ackerman", "", "Masculí", "Shingeki no Kyojin", ""}
        };
        String[] columnNames = {"ID", "Nom", "Preu", "Genere", "Anime", "IMG"};

        // Table
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(600, 535));
        table.getColumnModel().getColumn(5).setCellRenderer(imageRenderer);

        // Set custom renderer for image column
        table.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());

        // Scrollpane for table
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        table.getColumnModel().getColumn(5).setPreferredWidth(150);

        // Set the row height based on the height of the image
        table.setRowHeight(260);

        // Window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Frame properties
        setTitle("Anime Database");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Subclass for image renderer
    public class ImageRenderer extends DefaultTableCellRenderer {
        private JLabel label;

        public ImageRenderer() {
            label = new JLabel();
            label.setHorizontalAlignment(JLabel.CENTER);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value != null) {
                ImageIcon icon = new ImageIcon(getClass().getResource((String) value));
                label.setIcon(icon);
            } else {
                label.setIcon(null);
            }
            return label;
        }
    }
}