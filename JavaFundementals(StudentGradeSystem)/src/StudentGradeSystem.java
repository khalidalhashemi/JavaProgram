import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();

        System.out.println("Enter marks for 3 subjects: ");
        System.out.print("Subject 1: Science: ");
        double scienceMark = scanner.nextDouble();

        System.out.print("Subject 2: Math: ");
        double mathMark = scanner.nextDouble();

        System.out.print("Subject 3: English: ");
        double englishMark = scanner.nextDouble();

    }
}
