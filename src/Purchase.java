import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI BRAVO
 */
public class Purchase {

    private String username;
    private int ticket_id;
    private int qty;
    private double subtotal;
    private java.time.LocalDateTime created_date;
    private java.time.LocalDateTime updated_date;
    

    public Purchase() {
        setUsername("");
        setTicket_id(0);
        setQty(0);
        setSubtotal(0);
        setCreated_date(LocalDateTime.now());
        setUpdated_date(LocalDateTime.now());
    }

    public Purchase(String username, int ticket_id, int qty, double subtotal, LocalDateTime created_date, LocalDateTime updated_date) {
        setUsername(this.username);
        setTicket_id(this.ticket_id);
        setQty(this.qty);
        setSubtotal(this.subtotal);
        setCreated_date(this.created_date);
        setUpdated_date(this.updated_date);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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