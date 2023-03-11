package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class commands extends JFrame{

    public JButton returnMenu;
    public commands(){
        //Title Start
        setLayout(null);
        JLabel title = new JLabel("LLista de comandes");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(400,5,270,75);
        add(title);
        //Title END

        //Descripcio Start
        setLayout(null);
        JLabel descripcio = new JLabel("Benvinguts! Aquí trobarem les comandes disponibles al nostre programa.");
        descripcio.setBounds(300, 5, 500, 175);
        add(descripcio);
        //Descripcio END


        // Command 1 -- Husbandos
        JLabel ha = new JLabel("Per tirar rolls de husbandos --> $ha");
        ha.setBounds(420, 125, 500, 100);
        add(ha);

        //SEPARACIÓ 1
        JLabel sep1 = new JLabel("--------------------------------------------------------------------------------------");
        sep1.setBounds(350, 200, 500, 5);
        add(sep1);

        //Command 2 -- Waifus
        JLabel wa = new JLabel("Per tirar rolls de waifus --> $wa");
        wa.setBounds(420, 200 , 500, 100);
        add(wa);

        //SEPARACIÓ 2
        JLabel sep2 = new JLabel("--------------------------------------------------------------------------------------");
        sep2.setBounds(350, 300, 500, 5);
        add(sep2);

        //Command 3 -- TU
        JLabel tu = new JLabel("Per veure quants rolls et queden per tirar rolls --> $tu");
        tu.setBounds(350, 300, 500, 100);
        add(tu);

        //SEPARACIÓ 3
        JLabel sep3 = new JLabel("--------------------------------------------------------------------------------------");
        sep3.setBounds(350, 400, 500, 5);
        add(sep3);

        //Command 3 -- ROLLS
        JLabel rolls = new JLabel("Per afegir 10 rolls més --> $rolls");
        rolls.setBounds(420, 400, 500, 100);
        add(rolls);

        //SEPARACIÓ 4
        JLabel sep4 = new JLabel("--------------------------------------------------------------------------------------");
        sep4.setBounds(350, 500, 500, 5);
        add(sep4);

        //easter egg
        JLabel easteregg = new JLabel("Easteregg --> $rick");
        easteregg.setBounds(420, 500, 500, 100);
        add(easteregg);


    }

    public static void main(String[] args){
        //Homepage
        commands Homepage = new commands();
        Homepage.setBounds(700,800,1100, 700);
        Homepage.setResizable(false);
        Homepage.setTitle("LListaComandes");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }


}
