import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class Problema2 extends JFrame implements ActionListener {
    static JRadioButton rasp1;
    static JRadioButton rasp2;
    static JRadioButton rasp3;
    static JRadioButton rasp4;
    static JLabel intrebare;
    static JLabel verif;
    static JButton b;
    static ButtonGroup group;
    Problema2(String titlu ) {
        super ( titlu );
        String intr = new String();
        String r1 = new String();
        String r2 = new String();
        String r3 = new String();
        String r4 = new String();

        try {
            File file = new File("D:\\laboratoarePOO\\lab10\\src\\intrebare.txt");
            Scanner sc = new Scanner(file);
            intr = sc.nextLine();
            r1 = sc.nextLine();
            r2 = sc.nextLine();
            r3 = sc.nextLine();
            r4 = sc.nextLine();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        group = new ButtonGroup();
        setLayout(new FlowLayout());
        intrebare = new JLabel(intr);
        verif = new JLabel("verificare");
        rasp1 = new JRadioButton(r1);
        rasp2 = new JRadioButton(r2);
        rasp3 = new JRadioButton(r3);
        rasp4 = new JRadioButton(r4);
        group.add(rasp1);
        group.add(rasp2);
        group.add(rasp3);
        group.add(rasp4);

        add(intrebare);
        add(rasp1);
        add(rasp2);
        add(rasp3);
        add(rasp4);
        add(verif);

        b = new JButton("Check");
        b.addActionListener(this);
        add(b);

        setSize(300, 300);
        setVisible (true);
    }

    public static void main(String[] args) {
        Problema2 p = new Problema2("Problema 2");

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
        if (e.getSource() instanceof JButton ) {
            if(rasp1.isSelected()){
                verif.setText("corect");
            }else{
                verif.setText("gresit");
            }
        }
    }
}
