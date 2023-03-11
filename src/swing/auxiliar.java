package swing;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class auxiliar extends JFrame {
    ImageRenderer imageRenderer = new ImageRenderer();


    public static void main(String[] args) {
        auxiliar frame = new auxiliar();
        frame.pack();
        frame.setVisible(true);
    }
    public auxiliar() {

        // Table content
        String[][] data = {
                {"1", "Kim Dokja", "220", "Masculí", "Omniscient Reader's Viewpoint", "/swing/img/dokja.jpg"},
                {"2", "Killua Zoldyck", "310", "Masculí", "Hunter x Hunter", "/swing/img/KilluaZoldyck_redim.jpg"},
                {"3", "Kuroko Tetsuya", "180", "Masculí", "Kuroko no Basket", "/swing/img/KurokoTetsuya.jpg"},
                {"4", "Klein Moretti", "200", "Masculí", "Lord Of The Mysteries", "/swing/img/KleinMoretti.jpg"},
                {"5", "Lelouch Lamperouge", "310", "Masculí", "Code Geass", "/swing/img/LelouchLamperouge.jpg"},
                {"6", "Saber", "570", "Femení", "Fate/Stay Night", "/swing/img/Saber.jpg"},
                {"7", "Asta", "430", "Masculí", "Black Clover", "/swing/img/Asta.jpg"},
                {"8", "Penelope Eckart", "80", "Femení", "Death Is the Only Ending for the Villainess", "/swing/img/PenelopeEckart.jpg"},
                {"9", "Pyo Wol", "260", "Masculí", "Reaper of the Drifting Moon", "/swing/img/PyoWolredim.jpg"},
                {"10", "Rick Sanchez", "50", "Masculí", "Rick y Morty", "/swing/img/RickSanchez.jpg"},
                {"11", "Dunn Smith", "150", "Masculí", "Lord Of The Mysteries", "/swing/img/DunnSmith.jpg"},
                {"12", "Sung Jin-Woo", "520", "Masculí", "Solo Leveling", "/swing/img/SunJinWoo.jpg"},
                {"13", "Inuyasha", "140", "Masculí", "Inuyasha", "/swing/img/Inuyasha.jpg"},
                {"14", "Sasha Braus", "210", "Femení", "Shingeki no Kyojin", "/swing/img/SashaBraus.jpg"},
                {"15", "Nezuko Kamado", "600", "Femení", "Kimetsu no Yaiba", "/swing/img/NezukoKamado.jpg"},
                {"16", "Winry Rockbell", "90", "Femení", "FullMetal Alchemist Brotherhood", "/swing/img/WinryRockbell.jpg"},
                {"17", "Satoru Gojo", "590", "Masculí", "Jujutsu Kaisen", "/swing/img/SatoruGojo.jpg"},
                {"18", "Edward Elric", "350", "Masculí", "FullMetal Alchemist Brotherhood", "/swing/img/EdwardElric.jpg"},
                {"19", "Sukuna", "400", "Masculí", "Jujutsu Kaisen", "/swing/img/Sukuna.jpg"},
                {"20", "Levi Ackerman", "500", "Masculí", "Shingeki no Kyojin", "/swing/img/LeviAckerman.jpg"},
                {"21","Noelle Silva","270","Femení","Black Clover","/swing/img/noelle.jpg"},
                {"22","Rin Tohsaka","790","Femení","Fate/Stay Night","/swing/img/rin.jpg"},
                {"23","Yuno Gasai","550","Femení","Mirai Nikki","/swing/img/yunogasai.jpg"},
                {"24","Emma ","610","Femení","Yakusoku no Neverland","/swing/img/emma.jpg"},
                {"25","Maka Albarn","170","Femení","Soul Eater","/swing/img/maka.jpg"},
                {"26","Akame","430","Femení","Akame Ga Kill","/swing/img/akame.jpg"},

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