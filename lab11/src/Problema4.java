import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Lab11.Book;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Problema4 extends JFrame implements ActionListener {
    JTable tabel;
    JTree tree;
    public Problema4() {
        File file = new File("D:\laboratoarePOO\lab11");
        List<File> getSubdirs(File file) {
        List<File> subdirs = Arrays.asList(file.listFiles(new FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory();
            }
        }));
        subdirs = new ArrayList<File>(subdirs);

        List<File> deepSubdirs = new ArrayList<File>();
        for(File subdir : subdirs) {
            ((ArrayList<?>) deepSubdirs).addAll(getSubdirs(subdir));
        }
        subdirs.addAll(deepSubdirs);
        return subdirs;
    }

        setSize(1000, 100);
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}

class Test_1 {
    public static void main(String[] args) {


        new Problema4();
    }
}