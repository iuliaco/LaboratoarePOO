import Lab11.Book;

import javax.swing.*;
import java.util.Vector;

public class Problema1 {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        Lab11.Book book1 = new Lab11.Book("Pe aripi de vant", "Jules Verne", "/");
        Lab11.Book book2 = new Lab11.Book("Pe aripi de vant2", "Jules Verne2", "/");
        Lab11.Book book3 = new Lab11.Book("Pe aripi de vant3", "Jules Verne3", "/");
        Lab11.Book book4 = new Lab11.Book("Pe aripi de vant", "Jules Verne", "/");
        Lab11.Book book5 = new Lab11.Book("Pe aripi de vant2", "Jules Verne2", "/");
        Lab11.Book book6 = new Lab11.Book("Pe aripi de vant3", "Jules Verne3", "/");
        Lab11.Book book7 = new Lab11.Book("Pe aripi de vant", "Jules Verne", "/");
        Lab11.Book book8 = new Lab11.Book("Pe aripi de vant2", "Jules Verne2", "/");
        Lab11.Book book9 = new Lab11.Book("Pe aripi de vant3", "Jules Verne3", "/");
        Vector<Lab11.Book> book = new Vector<Lab11.Book>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);
        book.add(book6);
        book.add(book7);
        book.add(book8);
        book.add(book9);
        JList vector = new JList(book);
        JScrollPane scroll = new JScrollPane(vector);
        f.add(scroll);
        f.setSize(1000,100);
        f.setVisible(true);

    }
}
