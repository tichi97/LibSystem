/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author nkenani
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Borrow {
    private String borrowID;
    private LocalDate dateBorrowed;
    private LocalDate dueDate;
    private LocalDate dateReturned;
    private LibraryItem items;
    private Member members;
    private long fine;

    /**
     * @return the borrowID
     */
    public void calculateFine(){
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(dueDate, today);
        setFine(days*15);
    }
    
    public String getBorrowID() {
        return borrowID;
    }

    /**
     * @param borrowID the borrowID to set
     */
    public void setBorrowID(String borrowID) {
        this.borrowID = borrowID;
    }

    /**
     * @return the dateBorrowed
     */
    public LocalDate getDateBorrowed() {
        return dateBorrowed;
    }

    /**
     * @param dateBorrowed the dateBorrowed to set
     */
    public void setDateBorrowed(LocalDate dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    /**
     * @return the dateSubmitted
     */
    public LocalDate getDateReturned() {
        return dateReturned;
    }

    /**
     * @param dateSubmitted the dateSubmitted to set
     */
    public void setDateReturned(LocalDate dateReturned) {
        this.dateReturned = dateReturned;
    }

    /**
     * @return the items
     */
    public LibraryItem getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(LibraryItem items) {
        this.items = items;
    }

    /**
     * @return the members
     */
    public Member getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(Member members) {
        this.members = members;
    }

    /**
     * @return the dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the fine
     */
    public long getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(long fine) {
        this.fine = fine;
    }
    
}
