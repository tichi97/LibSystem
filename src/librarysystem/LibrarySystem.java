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
import java.time.Month;
import java.util.ArrayList;

public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book b1 = new Book();
        b1.setId("b001");
        b1.setTitle("Designing Secure Systems");
        b1.getAuthors().add("Bob Smith");
        b1.setPages(500);
        b1.setType("Book");
        
        Book b2 = new Book();
        b2.setId("b002");
        b2.setTitle("Web Design Unleashed");
        b2.getAuthors().add("Jake Sims");
        b2.getAuthors().add("Brian John");
        b2.setPages(374);
        b2.setType("Book");
        
        Book b3 = new Book();
        b3.setId("b003");
        b3.setTitle("Understanding TCP/IP Networks");
        b3.getAuthors().add("Laura Daniels");
        b3.setPages(822);
        b3.setType("Book");
        
        AudioBook a1 = new AudioBook();
        a1.getAuthors().add("Rose Cole");
        a1.setId("a001");
        a1.setTitle("Quiting a Habit in 21 Days");
        a1.setDuration("90 minutes");
        a1.setType("Audio Book");
        
        ArrayList<LibraryItem> LibraryItems = new ArrayList<>();
        LibraryItems.add(b1);
        LibraryItems.add(b2);
        LibraryItems.add(b3);
        LibraryItems.add(a1);
        
        ArrayList<AudioBook> audiobooks = new ArrayList<>();
        audiobooks.add(a1);
        
        Member m1 = new Member();
        m1.setIdno("m001");
        m1.setName("Nancy Jane");
        
        Member m2 = new Member();
        m2.setIdno("m002");
        m2.setName("Carl Hack");
        
        Borrow borrow1 = new Borrow();
        borrow1.setMembers(m1);
        borrow1.setItems(b1);
        LocalDate borrowDate = LocalDate.of(2018, Month.FEBRUARY, 2);
        LocalDate dueDate = LocalDate.of(2018, Month.FEBRUARY, 23);
        borrow1.setDateBorrowed(borrowDate);
        borrow1.setDueDate(dueDate);
        borrow1.calculateFine();
        
        Borrow borrow2 = new Borrow();
        borrow2.setMembers(m2);
        borrow2.setItems(b2);
        LocalDate borrowDate2 = LocalDate.of(2018, Month.MARCH, 14);
        LocalDate dueDate2 = LocalDate.of(2018, Month.APRIL, 4);
        borrow2.setDateBorrowed(borrowDate2);
        borrow2.setDueDate(dueDate2);
        borrow2.calculateFine();
        
        ArrayList<Borrow> Borrows = new ArrayList<>();
        Borrows.add(borrow1);
        Borrows.add(borrow2);
        
        Report.displayCatalogue(LibraryItems);
        Report.displayAudioBooks(audiobooks);
        Report.displayBorrowedItems(Borrows);
        Report.displayOverdue(Borrows);
        
    }
    
}
