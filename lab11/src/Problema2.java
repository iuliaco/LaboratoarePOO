import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Lab11.Book;

import java.awt.*;

public class Problema2 extends JFrame {
    //    private static Component listBook;
    JList listBook;
    JPanel info;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JTextField t2;
    DefaultListModel<Book> book;
    public Problema2(DefaultListModel<Book> book) {
        this.book = new DefaultListModel<>();
        this.book = book;
        listBook = new JList(book);
        JPanel info = new JPanel();
        l1 = new JLabel("Titlu");
        l2 = new JLabel("Autor");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        setLayout(new FlowLayout());

        JScrollPane scroll = new JScrollPane(listBook);
        info.add(l1);
        info.add(l2);
        info.add(t1);
        info.add(t2);
        listBook.addListSelectionListener(new Listener());
        add(info);
        add(scroll);
        setSize(1000, 100);
        setVisible(true);
        pack();
    }
    class Listener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            System.out.println("aaaa");
                if(listBook.isSelectionEmpty())
                    return;
                t1.setText(book.getElementAt(listBook.getSelectedIndex()).getAuthor());
                t2.setText(book.getElementAt(listBook.getSelectedIndex()).getName());
        }
    }
}

class Test_0 {
    public static void main(String[] args) {

        Lab11.Book book1 = new Book("Pe aripi de vant", "Jules Verne", "/");
        Book book2 = new Book("Pe aripi de vant2", "Jules Verne2", "/");
        Book book3 = new Book("Pe aripi de vant3", "Jules Verne3", "/");
        Book book4 = new Book("Pe aripi de vant", "Jules Verne", "/");
        Book book5 = new Book("Pe aripi de vant2", "Jules Verne2", "/");
        Book book6 = new Book("Pe aripi de vant3", "Jules Verne3", "/");
        Book book7 = new Book("Pe aripi de vant", "Jules Verne", "/");
        Book book8 = new Book("Pe aripi de vant2", "Jules Verne2", "/");
        Book book9 = new Book("Pe aripi de vant3", "Jules Verne3", "/");
        DefaultListModel<Book> book = new DefaultListModel<Book>();
        book.add(0, book1);
        book.add(1, book2);
        book.add(2, book3);
        book.add(3, book4);
        book.add(4, book5);
        book.add(5, book6);
        book.add(6, book7);
        book.add(7, book8);
        book.add(8, book9);

        new Problema2(book);
    }
}