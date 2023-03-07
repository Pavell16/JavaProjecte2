package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class pulls extends JFrame implements ActionListener {
    private JLabel title, Name, Gender, Anime;
    public String Cname = "", CGender = "", Canime = "", Cphoto = "";
    public int dineros;
    private static JTextField comands;
    private JButton send;

    public  String[][] characters = {
        {"1", "Kim Dokja", "", "Masculí", "Omniscient Reader's Viewpoint", "/swing/img/dokja.jpg"},
        {"2", "Killua Zoldyck", "", "Masculí", "Hunter x Hunter", "/swing/img/KilluaZoldyck_redim.jpg"},
        {"3", "Kuroko Tetsuya", "", "Masculí", "Kuroko no Basket", "/swing/img/KurokoTetsuya.jpg"},
        {"4", "Klein Moretti", "", "Masculí", "Lord Of The Mysteries", "/swing/img/KleinMoretti.jpg"},
        {"5", "Lelouch Lamperouge", "", "Masculí", "Code Geass", "/swing/img/LelouchLamperouge.jpg"},
        {"6", "Saber", "", "Femení", "Fate/Stay Night", "/swing/img/Saber.jpg"},
        {"7", "Asta", "", "Masculí", "Black Clover", "/swing/img/Asta.jpg"},
        {"8", "Penelope Eckart", "", "Femení", "Death Is the Only Ending for the Villainess", "/swing/img/PenelopeEckart.jpg"},
        {"9", "Pyo Wol", "", "Masculí", "Reaper of the Drifting Moon", "/swing/img/PyoWolredim.jpg"},
        {"10", "Rick Sanchez", "", "Masculí", "Rick y Morty", "/swing/img/RickSanchez.jpg"},
        {"11", "Dunn Smith", "", "Masculí", "Lord Of The Mysteries", "/swing/img/DunnSmith.jpg"},
        {"12", "Sung Jin-Woo", "", "Masculí", "Solo Leveling", "/swing/img/SunJinWoo.jpg"},
        {"13", "Inuyasha", "", "Masculí", "Inuyasha", "/swing/img/Inuyasha.jpg"},
        {"14", "Sasha Braus", "", "Femení", "Shingeki no Kyojin", "/swing/img/SashaBraus.jpg"},
        {"15", "Nezuko Kamado", "", "Femení", "Kimetsu no Yaiba", "/swing/img/NezukoKamado.jpg"},
        {"16", "Winry Rockbell", "", "Femení", "FullMetal Alchemist Brotherhood", "/swing/img/WinryRockbell.jpg"},
        {"17", "Satoru Gojo", "", "Masculí", "Jujutsu Kaisen", "/swing/img/SatoruGojo.jpg"},
        {"18", "Edward Elric", "", "Masculí", "FullMetal Alchemist Brotherhood", "/swing/img/EdwardElric.jpg"},
        {"19", "Sukuna", "", "Masculí", "Jujutsu Kaisen", "/swing/img/Sukuna.jpg"},
        {"20", "Levi Ackerman", "", "Masculí", "Shingeki no Kyojin", "/swing/img/LeviAckerman.jpg"}
    };
    public pulls(){
        //Title Start
        setLayout(null);
        title = new JLabel("Pulls");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(230,5,270,75);
        add(title);
        //Title END

        //comands
        comands = new JTextField("comands");
        comands.setBounds(130, 100, 270,30);
        add(comands);
        //comands END

        //Send
        send = new JButton("Send");
        send.setBounds(210, 150, 100, 30);
        send.addActionListener(this);
        add(send);
        //Send END

        //Character Name
        Name = new JLabel("Name: " + Cname);
        Name.setBounds(130,200,600,30);
        add(Name);
        //Character name END

        //Character Gender
        Gender = new JLabel("Genere: " + CGender);
        Gender.setBounds(130,220,600,30);
        add(Gender);
        //Character Gender END

        //Character Anime
        Anime = new JLabel("Anime: " + CGender);
        Anime.setBounds(130,240,600,30);
        add(Anime);
        //Character Anime END

        //Character Photo
        ImageIcon icon = new ImageIcon(getClass().getResource(characters[3][5]));
        JLabel label = new JLabel(icon);
        add(label);
        //Character Photo END

    }

    public static void main(String args[]){
        //Homepage
        pulls Homepage = new pulls();
        Homepage.setBounds(0,0,560,550);
        Homepage.setResizable(false);
        Homepage.setTitle("MudaePulls");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }

    public void pullCharacter(){

    };


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == send){
            Cname = comands.getText();
            Name.setText("Name: "+ Cname);
            ImageIcon icon2 = new ImageIcon(getClass().getResource(characters[3][5]));
            JLabel label2 = new JLabel(icon2);
            JOptionPane.showMessageDialog(null, label2 );


        }
    }
}

