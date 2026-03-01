import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        
        try {
            if (breadth <= 0 || height <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            int area = breadth * height;
            System.out.println(area);
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
        
        sc.close();
    }
}
