/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author Nan Mihai
 */
public class Book {
    private String name;
    private String author;
    private String iconName;
 
    public Book(String name, String author, String iconName) {
        this.name = name;
        this.author = author;
        this.iconName = iconName;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", iconName='" + iconName + '\'' +
                '}';
    }

    public String getIconName() {
        return iconName;
    }
 
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}
