import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.Scanner;

public class Problema3 extends JFrame implements ActionListener {
    static JCheckBox rasp1;
    static JCheckBox rasp2;
    static JCheckBox rasp3;
    static JCheckBox rasp4;
    static JLabel intrebare;
    static JLabel verif;
    static JButton b;
    static ButtonGroup group;
    Problema3(String titlu ) {
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
        rasp1 = new JCheckBox(r1);
        rasp2 = new JCheckBox(r2);
        rasp3 = new JCheckBox(r3);
        rasp4 = new JCheckBox(r4);

        add(intrebare);
        add(rasp1);
        add(rasp2);
        add(rasp3);
        add(rasp4);
        add(verif);

        b = new JButton("Check");
        b.setEnabled(false);
        b.addActionListener(this);
        rasp1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                b.setEnabled((e.getStateChange()==1?true:false));
            }
        });
        rasp2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                b.setEnabled((e.getStateChange()==1?true:false));
            }
        });
        rasp3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                b.setEnabled((e.getStateChange()==1?true:false));
            }
        });
        rasp4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                b.setEnabled((e.getStateChange()==1?true:false));
            }
        });
        add(b);

        setSize(300, 300);
        setVisible (true);
    }

    public static void main(String[] args) {
        Problema3 p = new Problema3("Problema 3");

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
        if (e.getSource() instanceof JButton ) {
            if(rasp1.isSelected()){
                rasp1.setForeground(Color.GREEN);
            }else{
                rasp1.setForeground(Color.RED);
            }
            if(!rasp2.isSelected()){
                rasp2.setForeground(Color.GREEN);
            }else{
                rasp2.setForeground(Color.RED);
            }
            if(rasp3.isSelected()){
                rasp3.setForeground(Color.GREEN);
            }else{
                rasp3.setForeground(Color.RED);
            }
            if(!rasp4.isSelected()){
                rasp4.setForeground(Color.GREEN);
            }else{
                rasp4.setForeground(Color.RED);
            }
        }
    }
}
