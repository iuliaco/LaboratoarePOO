import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problema1 extends Frame implements ActionListener {
    private JButton b;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    public Problema1 (String titlu ) {
        super ( titlu );
        setLayout (new FlowLayout ());
        add( new JLabel ("Prob 1"));
        JButton b = new JButton("Apasa");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        b.addActionListener(this);


        add(b);
        pack();

        setVisible (true);
    }
    public static void main ( String args []) {
        new Problema1 (" Hello ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = t1.getText();
        s = s + t2.getText();
        s = s + t3.getText();
        t4.setText(s);
    }
}