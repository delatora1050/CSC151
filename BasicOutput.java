import java.util.Scanner; 

public class BasicOutput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int numSquared;
      int numCubed;
      int numAdd;
      int numMul;
      
      
      System.out.println("Enter integer:");
      userNum = scnr.nextInt();  
      
      numSquared = userNum * userNum;
      numCubed = userNum * userNum * userNum;
      
      
      System.out.println("You entered: " + userNum);
      
      System.out.println(userNum + " squared is " + numSquared);
      System.out.println("And " + userNum + " cubed is " + numCubed + "!!");
      
      System.out.println("Enter another integer:");
      userNum = scnr.nextInt();
      
      numAdd = 4 + userNum;
      numMul = 4 * userNum;
      
      System.out.println("4 + 5 is " + numAdd);
      System.out.println("4 * 5 is " + numMul);
      
      
      
   }
}
