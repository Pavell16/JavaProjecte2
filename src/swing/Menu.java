package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame implements ActionListener{
    public JButton database, store, commands, rolls;
    public Menu(){
        //Title Start
        setLayout(null);
        JLabel title = new JLabel("MudaeMadeInChina");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(425,5,270,75);
        add(title);
        //Title END

        //Descripcio Start
        setLayout(null);
        JLabel descripcio = new JLabel("Benvinguts al nostre programa de coleccionar personatges d'anime! ");
        descripcio.setBounds(350, 5, 500, 175);
        add(descripcio);
        //Descripcio END

        //Imatge1 Start
        JLabel cat = new JLabel(new ImageIcon("/swing/img/gamercat.jpg"));
        cat.setBounds(20, 150, 150, 150);
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

    public static void main(String[] args){
        //Homepage
        Menu Homepage = new Menu();
        Homepage.setBounds(700,0,1100, 500);
        Homepage.setResizable(true);
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
            store dec = new store();
            dec.setVisible(true);
            dec.setBounds(500,250,560,350);
            //Obrir Finestra amb botiga Start
        }else if (e.getSource() == commands){
            //Obrir Finestra amb comandes Start
            commands dec = new commands();
            dec.setVisible(true);
            dec.setBounds(500,250,560,350);
            //Obrir Finestra amb comandes Start
        } else if (e.getSource() == rolls) {
            //Obrir Finestra amb rolls Start
            pulls dec = new pulls();
            dec.setVisible(true);
            dec.setBounds(500,250,560,550);
            this.dispose();
            //Obrir Finestra amb rolls Start
        }

    }
}
