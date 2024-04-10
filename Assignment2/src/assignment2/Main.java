/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;




public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("*****Quản lí thông tin*****");
        menu.addNewOption("1. Input List Books: <Z->A>: \n");
        menu.addNewOption("2. Add new books: \n");
        menu.addNewOption("3. Find book to code: \n");
        menu.addNewOption("4. End.");
        BookList bm = new BookList();
        int choice;
        while(true){
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    bm.printBookList();
                    break;
                }
                case 2:{
                    bm.addNewBook();
                    break;
                }
                case 3:{
                    bm.searchBookByCode();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }
    }
}

