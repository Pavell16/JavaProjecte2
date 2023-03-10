package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class commands extends JFrame implements ActionListener{


    public commands(){
        //Title Start
        setLayout(null);
        JLabel title = new JLabel("LLista de comandes");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(650,5,270,75);
        add(title);
        //Title END

        //Descripcio Start
        setLayout(null);
        JLabel descripcio = new JLabel("Benvinguts! Aquí trobarem les comandes disponibles al nostre programa.");
        descripcio.setBounds(550, 5, 500, 175);
        add(descripcio);
        //Descripcio END


        // Command 1 -- Husbandos
        JLabel ha = new JLabel("Per tirar rolls de husbandos --> $ha");
        ha.setBounds(670, 125, 500, 100);
        add(ha);

        //SEPARACIÓ 1
        JLabel sep1 = new JLabel("--------------------------------------------------------------------------------------");
        sep1.setBounds(600, 225, 500, 5);
        add(sep1);

        //Command 2 -- Waifus
        JLabel wa = new JLabel("Per tirar rolls de waifus --> $wa");
        wa.setBounds(670, 250 , 500, 100);
        add(wa);

        //SEPARACIÓ 2
        JLabel sep2 = new JLabel("--------------------------------------------------------------------------------------");
        sep2.setBounds(600, 350, 500, 5);
        add(sep2);

        //Command 3 -- TU
        JLabel tu = new JLabel("Per veure quants rolls et queden per tirar rolls --> $tu");
        tu.setBounds(600, 375, 500, 100);
        add(tu);

        //SEPARACIÓ 3
        JLabel sep3 = new JLabel("--------------------------------------------------------------------------------------");
        sep3.setBounds(600, 475, 500, 5);
        add(sep3);

        //Command 3 -- ROLLS
        JLabel rolls = new JLabel("Per afegir 10 rolls més --> $rolls");
        rolls.setBounds(670, 500, 500, 100);
        add(rolls);
    }

    public static void main(String[] args){
        //Homepage
        commands Homepage = new commands();
        Homepage.setBounds(700,800,1100, 700);
        Homepage.setResizable(true);
        Homepage.setTitle("LListaComandes");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
