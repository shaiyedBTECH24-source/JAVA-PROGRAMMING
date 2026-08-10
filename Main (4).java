import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();

        int[] attendance = new int[7];

        int present = 0;
        int absent = 0;

        for (int i = 0; i < 7; i++) {

            attendance[i] = sc.nextInt();

            // Check invalid input
            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Attendance Input");
                return;
            }

            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double percentage = (present / 7.0) * 100;

        System.out.printf("Attendance = %.2f%%\n", percentage);
        System.out.println("Absent Days = " + absent);

        if (percentage >= 90) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}