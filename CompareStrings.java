import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        boolean strEqual = s1.equals(s2);
        System.out.println("the two given strings are equal : " + strEqual);

        if(s1.length()>0 && s2.length()>0){
            char c1 = s1.charAt(0);
            char c2 = s2.charAt(0);
            System.out.println("First character of the first string: "+c1);
            System.out.println("First character of the second string: "+c2);
            System.out.println("Are the first characters equal: "+ (c1 == c2));
        }else{
            System.out.println("Warning: string cannot be empty!");
        }

        scanner.close();
    }
}
