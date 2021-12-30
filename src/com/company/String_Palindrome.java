import java.util.Scanner;
class StringPalindrome{


     public static void main(String[] args) {

           String revStr = "";
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
           String str = sc.nextLine();
           int n = str.length();
           
           for(int i = n -1 ; i >=0 ; i--)   {
             
               revStr = revStr + str.charAt(i);
             }
            if(str.toLowerCase().equals(revStr.toLowerCase())) {

                  System.out.println(str + " is a Palindrome String");
             }
             else{
                 
                  System.out.println(str + " is not a Palindrome String");
                 }
             }
   }
