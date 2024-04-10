
package assignment2;


import java.util.Scanner;

public class BookList {
    private static Book bookList[] = new Book[100];
    private static int sizeBook = 0;
    
    
    public BookList() {
    }
    
    public static void sortBookByQuantity(){
        if(sizeBook == 0){
            return;
        }
        for(int i = 0; i <= sizeBook - 2; i++){
            for(int j = i + 1; j <= sizeBook - 1; j++){
                if(bookList[i].getQuantity() < (bookList[j].getQuantity())){
                    //swap
                    Book bookTmp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = bookTmp;
                }
            }
        }
    }
    
    
    public static void printBookList(){
        if(sizeBook == 0){
            System.out.println("Empty!!!");
            return;
        }
        for(int i = sizeBook - 1; i >= 0; i--){
            bookList[i].showInfor();
        }
    }
  
    
    public static void addNewBook(){
        Scanner sc = new Scanner(System.in);  
        Book newBook = new Book();
        newBook.inputBook();
        boolean isFind = false;
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getCode().equals(newBook.getCode())){
                isFind = true;
                break;
            }
        }
        if(!isFind){
        
            bookList[sizeBook] = newBook;
            sizeBook++;
            System.out.println("Info New Book: ");
            newBook.showInfor();
        }
    }

    
    public static int searchPosByCode(String code){
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getCode().equalsIgnoreCase(code)){
                return i;
            }
        }
        return -1;
    } 
   
    public static Book searchBookByCode(String code){
        int pos = searchPosByCode(code);
        if(pos == -1) return null;
        return bookList[pos];
    }
    
    public static void searchBookByCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Code: ");
        String inputCode = sc.nextLine();
        Book codeWantFind = searchBookByCode(inputCode);
        if(codeWantFind == null){
            System.out.println("Not Found!");
        }else{
            System.out.println("Found,Info Book: ");
            codeWantFind.showInfor();
        }
    }
}
