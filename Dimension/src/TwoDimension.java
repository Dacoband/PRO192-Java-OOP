
public class TwoDimension {
    int marks [][];
    public void storeMarks() {
        // Instantiate the array 
        marks = new int [4][2];
        System.out.println("Storing Marks. Please wait....");
        marks[0][0] = 23;
        marks[0][1] = 65;
        marks[1][0] = 42;
        marks[1][1] = 47;
        marks[2][0] = 60;
        marks[2][1] = 75;
        marks[3][0] = 75;
        marks[3][1] = 50;
    }
    public void displayMarks() {
        System.out.println("Marks are: ");
        //Display the marks
        for(int row = 0; row < marks.length;row++) {
            System.out.println("Roll no." + (row + 1));
            //inner loop
            for (int col = 0; col <  marks[row].length;col++) {
                System.out.println(marks[row][col]);
        }
        }
        }
  
    
    public static void main(String[] args){
        OneDimension oneDimenObj = new OneDimension ();
        oneDimenObj.storeMarks ();
        oneDimenObj.displayMarks ();
    }
    
}
