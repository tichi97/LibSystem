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

import java.util.ArrayList;
public class Report {
    
    public static void displayCatalogue(ArrayList<LibraryItem> LibraryItems){
        System.out.println("==============================================");
        System.out.println("LIBRARY CATALOGUE");
        System.out.println("==============================================");
        
        for(LibraryItem LibraryItem : LibraryItems){
            String title = LibraryItem.getTitle();
            System.out.println("[title] " + title);
            
            ArrayList<String> authors = LibraryItem.getAuthors(); 
            
            int length = authors.size();
            for(int i=0; i<length;i++){
            	 System.out.println("[author] " + authors.get(i));
            }
            
            String type = LibraryItem.getType();
            
            System.out.println("[type] "+ type);
            System.out.println(" ");
        }        
    }
    
    public static void displayAudioBooks(ArrayList<AudioBook> audiobooks){
        System.out.println("==============================================");
        System.out.println("LIST OF AUDIO BOOKS");
        System.out.println("==============================================");
        
        for(AudioBook AudioBook : audiobooks){
            String title = AudioBook.getTitle();
            ArrayList<String> authors = AudioBook.getAuthors();
            String duration = AudioBook.getDuration(); 
            
            System.out.println("[title] " + title);
            
            int length = authors.size();
            for(int i=0; i<length;i++){
            	 System.out.println("[author] " + authors.get(i));
            }
            
            
            System.out.println("[duration] "+ duration);
            System.out.println(" ");
        }        
    }
    
    public static void displayBorrowedItems(ArrayList<Borrow> borrows){
        System.out.println("==============================================");
        System.out.println("LIST OF BORROWED ITEMS");
        System.out.println("==============================================");
        
        for(Borrow Borrow : borrows){
            String title = Borrow.getItems().getTitle();
            String bdate = Borrow.getDateBorrowed().toString();
            String ddate = Borrow.getDueDate().toString();
            String name = Borrow.getMembers().getName();
            
            System.out.println("[title] " + title +"\n" + "[borrowed date] " + bdate + "\n" + "[due date] "+ ddate + "\n"+ "[borrowed by] "+ name);
            System.out.println(" ");
        }        
    }
    
    public static void displayOverdue(ArrayList<Borrow> borrows){
        System.out.println("==============================================");
        System.out.println("LIST OF OVERDUE ITEMS");
        System.out.println("==============================================");
        
        for(Borrow Borrow : borrows){
            String title = Borrow.getItems().getTitle();
            String bdate = Borrow.getDateBorrowed().toString();
            String ddate = Borrow.getDueDate().toString();
            String name = Borrow.getMembers().getName();
            long fine = Borrow.getFine();
            if(fine>0){
                
                System.out.println("[title] " + title +"\n" + "[borrowed date] " + bdate + "\n" + "[due date] "+ ddate + "\n"+ "[borrowed by] "+ name + "\n" + "[fine]" + fine);
                System.out.println(" ");
            }
            
            
            
        }        
    }
    
       
        
    
}
