package swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Menu extends JFrame implements ActionListener{
    public JButton database, store, commands, rolls;
    public JLabel cat, descripcio, title;
    public Menu() throws IOException {
        //Title Start
        setLayout(null);
        title = new JLabel("MudaeMadeInChina");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(425,5,270,75);
        add(title);
        //Title END

        //Descripcio Start
        descripcio = new JLabel("Benvinguts al nostre programa de coleccionar personatges d'anime! ");
        descripcio.setBounds(350, 5, 500, 175);
        add(descripcio);
        //Descripcio END

        //Imatge1 Start
        BufferedImage image = ImageIO.read(getClass().getResource("/swing/img/gamercat(1).jpg"));
        cat = new JLabel(new ImageIcon(image));
        cat.setBounds(75, 40, 200, 113);
        add(cat);
        //Imatge1 END

        //Opció 1 -- Data Base
        database = new JButton("Veure la Base de Dades dels personatges");
        database.setBounds(325, 125, 450, 50);
        add(database);
        database.addActionListener(this);

        //Opció 2 -- Store
        store = new JButton("Botiga");
        store.setBounds(325, 200 , 450, 50);
        add(store);
        store.addActionListener(this);

        //Opció 3 -- Rolls
        rolls = new JButton("Tirar Rolls");
        rolls.setBounds(325, 275, 450, 50);
        add(rolls);
        rolls.addActionListener(this);

        //Opció 4 -- Commands
        commands = new JButton("Llista de comandes");
        commands.setBounds(325, 350, 450, 50);
        add(commands);
        commands.addActionListener(this);
    }

    public static void main(String[] args) throws IOException {
        //Homepage
        Menu Homepage = new Menu();
        Homepage.setBounds(250,250,1100, 500);
        Homepage.setResizable(false);
        Homepage.setTitle("MudaeMadeInChina");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == database){
            //Obrir Finestra amb dataBase Start
            dataBase dec = new dataBase();
            dec.setVisible(true);
            dec.setBounds(500,250,560,350);
            //Obrir Finestra amb dataBase Start
        }else if (e.getSource() == store){
            //Obrir Finestra amb botiga Start
            store si = new store();
            si.setVisible(true);
            si.setBounds(500,250,560,350);
            //Obrir Finestra amb botiga Start
        }else if (e.getSource() == commands){
            //Obrir Finestra amb comandes Start
            commands no = new commands();
            no.setVisible(true);
            no.setBounds(700,800,1100, 700);
            //Obrir Finestra amb comandes Start
        } else if (e.getSource() == rolls) {
            //Obrir Finestra amb rolls Start
            pulls tu = null;
            try {
                tu = new pulls();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            tu.setVisible(true);
            tu.setBounds(500,250,560,700);
            this.dispose();
            //Obrir Finestra amb rolls Start
        }

    }
}
