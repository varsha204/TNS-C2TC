package MarksProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        ArrayList scoreList = new ArrayList();
        for (int i = 0; i < n; i++) {
            scoreList.add(scores[i]); 
        }

        System.out.println("Elements in the ArrayList:");
        for (Object score : scoreList) {
            System.out.println(score);
        }
        sc.close();
    }
}
