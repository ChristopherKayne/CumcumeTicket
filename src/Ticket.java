
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI BRAVO
 */
public class Ticket {


    private int ID;
    private String title;
    private String description;
    private double price;
    private int stock;
    private String creator;
    private java.time.LocalDateTime created_date;
    private java.time.LocalDateTime updated_date;
    
    public Ticket() {
        setID(0);
        setTitle("");
        setDescription("");
        setPrice(0);
        setStock(0);
        setCreator("");
        setCreated_date(LocalDateTime.now());
        setUpdated_date(LocalDateTime.now());
    }

    public Ticket(int ID, String title, String Description, double price, int stock, String creator, LocalDateTime created_date, LocalDateTime updated_date) {
        setID(this.ID);
        setTitle(this.title);
        setDescription(this.description);
        setPrice(this.price);
        setStock(this.stock);
        setCreator(this.creator);
        setCreated_date(this.created_date);
        setUpdated_date(this.updated_date);
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public LocalDateTime getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(LocalDateTime updated_date) {
        this.updated_date = updated_date;
    }
    
}
