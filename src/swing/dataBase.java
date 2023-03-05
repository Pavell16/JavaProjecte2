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
                {"2", "Killua Zoldyck", "", "Masculí", "Hunter x Hunter", "/swing/img/KilluaZoldyck.png"},
                {"3", "Kuroko Tetsuya", "", "Masculí", "Kuroko no Basket", "/swing/img/KurokoTetsuya.png"},
                {"4", "Klein Moretti", "", "Masculí", "Lord Of The Mysteries", "/swing/img/Klein.jpg"},
                {"5", "Lelouch Lamperouge", "", "Masculí", "Code Geass", "/swing/img/LelouchLamperouge.png"},
                {"6", "Saber", "", "Femení", "Fate/Stay Night", "/swing/img/Saber.png"},
                {"7", "Asta", "", "Masculí", "Black Clover", "/swing/img/Asta.png"},
                {"8", "Penelope Eckart", "", "Femení", "Death Is the Only Ending for the Villainess", "/swing/img/PenelopeEckart.png"},
                {"9", "Pyo Wol", "", "Masculí", "Reaper of the Drifting Moon", "/swing/img/PyoWol.jpg"},
                {"10", "Rick Sanchez", "", "Masculí", "Rick y Morty", "/swing/img/RickSanchez.png"},
                {"11", "Dunn Smith", "", "Masculí", "Lord Of The Mysteries", "/swing/img/dunn.jpg"},
                {"12", "Sung Jin-Woo", "", "Masculí", "Solo Leveling", "/swing/img/SungJin-Woo.png"},
                {"13", "Inuyasha", "", "Masculí", "Inuyasha", "/swing/img/Inuyasha.png"},
                {"14", "Sasha Braus", "", "Femení", "Shingeki no Kyojin", "/swing/img/SashaBraus.png"},
                {"15", "Nezuko Kamado", "", "Femení", "Kimetsu no Yaiba", "/swing/img/NezukoKamado.png"},
                {"16", "Winry Rockbell", "", "Femení", "FullMetal Alchemist Brotherhood", "/swing/img/WinryRockbell.png"},
                {"17", "Satoru Gojo", "", "Masculí", "Jujutsu Kaisen", "/swing/img/SatoruGojo.png"},
                {"18", "Edward Elric", "", "Masculí", "FullMetal Alchemist Brotherhood", "/swing/img/EdwardElric.png"},
                {"19", "Sukuna", "", "Masculí", "Jujutsu Kaisen", "/swing/img/Sukuna.png"},
                {"20", "Levi Ackerman", "", "Masculí", "Shingeki no Kyojin", "/swing/img/LeviAckerman.png"}
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