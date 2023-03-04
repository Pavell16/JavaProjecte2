package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Face extends JFrame implements ActionListener{
    private JLabel title;

    private JButton characterList, PullACharacter, ViewIlustrations;
    public Face(){
        //Title Start
        setLayout(null);
        title = new JLabel("MudaeMadeInChina");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(180,5,270,75);
        add(title);
        //Title END
    }
    public static void main(String args[]){
        //Homepage
        Face Homepage = new Face();
        Homepage.setBounds(0,0,560,350);
        Homepage.setResizable(false);
        Homepage.setTitle("MudaeMadeInChina");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
