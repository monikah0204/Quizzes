import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz geographyQuiz = new Quiz(scanner,new GeographyQuizBody().getQuiz());
        Quiz biologyQuiz = new Quiz(scanner,new BiologyQuizBody().getQuiz());

        try {
            System.out.println("Welcome");
            System.out.println("1.Biology Quiz \n2.Geography Quiz");
            System.out.print("Choose quiz: ");
            int userQuiz = scanner.nextInt();
            System.out.println();
            if (userQuiz == 1) {
                biologyQuiz.runQuiz();
            } else {
                geographyQuiz.runQuiz();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
