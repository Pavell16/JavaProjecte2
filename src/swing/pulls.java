package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.regex.Pattern;
import java.io.IOException;


public class pulls extends JFrame implements ActionListener {
    private JLabel title, Coins;
    public String Cname = "", CGender = "", Canime = "", Cphoto = "", price="";
    public int counter = 10;
    public long doraCoins = 0;
    private static JTextField comands;
    private JButton send;

    public  String[][] characters = {
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
    public pulls(){
        //Title Start
        setLayout(null);
        title = new JLabel("Pulls");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(230,5,270,75);
        add(title);
        //Title END

        //comands
        comands = new JTextField("$ha");
        comands.setBounds(130, 100, 270,30);
        add(comands);
        //comands END

        //Send
        send = new JButton("Send");
        send.setBounds(210, 150, 100, 30);
        send.addActionListener(this);
        add(send);
        //Send END

        //DoraCoins
        Coins = new JLabel("DoraCoins" + doraCoins);
        Coins.setBounds(400,5,100,30);
        add(Coins);
        //DoraCoins
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


    public void pullCharacterMale(){
        Random random = new Random();
        int characterpull = random.nextInt((26-1)+1)+1;

        Cname = characters[characterpull-1][1];
        price = characters[characterpull-1][2];
        doraCoins = doraCoins + Integer.parseInt(characters[characterpull-1][2]);
        Coins.setText("DoraCoins" + doraCoins);
        CGender = characters[characterpull-1][3];
        Canime = characters[characterpull-1][4];
        ImageIcon icon = new ImageIcon(getClass().getResource(characters[characterpull-1][5]));
        JLabel foto = new JLabel(icon);
        if (CGender.equals("Masculí")){
            // Jpanel per a combinar la iatge del personatge amb la seva informació
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(new JLabel("<html><b>Nom:</b> " + Cname + "<br>" +
                    "<b>DoraCoins:</b> "+ price + "<br>" +
                    "<b>Genere:</b> " + CGender + "<br>" +
                    "<b>Anime:</b> " + Canime + "</html>"), BorderLayout.CENTER);
            panel.add(foto, BorderLayout.SOUTH);


            JOptionPane.showMessageDialog(null, panel, "Pull",
                    JOptionPane.INFORMATION_MESSAGE);

        }else {
            pullCharacterMale();
        }

    };

    public void pullCharacterFemale(){
        Random random = new Random();
        int characterpull = random.nextInt((26-1)+1)+1;

        Cname = characters[characterpull-1][1];
        price = characters[characterpull-1][2];
        doraCoins = doraCoins + Integer.parseInt(characters[characterpull-1][2]);
        Coins.setText("DoraCoins" + doraCoins);
        CGender = characters[characterpull-1][3];
        Canime = characters[characterpull-1][4];
        ImageIcon icon = new ImageIcon(getClass().getResource(characters[characterpull-1][5]));
        JLabel foto = new JLabel(icon);
        if (CGender.equals("Femení")){
            // Jpanel per a combinar la iatge del personatge amb la seva informació
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(new JLabel("<html><b>Nom:</b> " + Cname + "<br>" +
                    "<b>DoraCoins:</b> "+ price + "<br>" +
                    "<b>Genere:</b> " + CGender + "<br>" +
                    "<b>Anime:</b> " + Canime + "</html>"), BorderLayout.CENTER);
            panel.add(foto, BorderLayout.SOUTH);


            JOptionPane.showMessageDialog(null, panel, "Pull",
                    JOptionPane.INFORMATION_MESSAGE);
        }else {
            pullCharacterFemale();
        }

    };

    public void ricktroll(){

        String url = "https://www.youtube.com/watch?v=mCdA4bJAGGk";
        String firefoxPath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        try {
            Runtime.getRuntime().exec(new String[] { firefoxPath, url });
        } catch (IOException e) {
            e.printStackTrace();
        }

    };

    public String getComand(){
        String comand = comands.getText();
        Pattern comandPattern = Pattern.compile("\\$");

        try{
            String[] command = comandPattern.split(comand);
            return command[1];
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Escriu be les commandes");
        }
        return "";



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == send){
            String command = getComand();
            switch (command){
                case "ha":
                    counter--;
                    if (counter > 0){
                        pullCharacterMale();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sense Pulls, prova mes tard");
                        counter = 0;
                    }

                    break;
                case "tu":
                    JOptionPane.showMessageDialog(null, "Pulls restants: " + counter);
                    break;
                case "rolls":
                    counter = counter + 10;
                    JOptionPane.showMessageDialog(null, "S'han afegit 10 pulls\n" +
                            "Pulls restants: " + counter);
                    break;
                case "wa":
                    counter--;
                    if (counter > 0){
                        pullCharacterFemale();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sense Pulls, prova mes tard");
                        counter = 0;
                    }
                    break;
                case "rick":
                    ricktroll();
                    break;
                case "":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ho hi ha cap comanda així");
                    break;
            }



        }
    }
}

