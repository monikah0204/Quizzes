import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<QuizPart> biologyQuizParts = new BiologyQuizBody().getQuiz();
        List<QuizPart> geographyQuizParts = new GeographyQuizBody().getQuiz();
        List<QuizPart> mixedQuizParts = new ArrayList<>();
        mixedQuizParts.addAll(biologyQuizParts);
        mixedQuizParts.addAll(geographyQuizParts);

        Quiz geographyQuiz = new Quiz(scanner, geographyQuizParts);
        Quiz biologyQuiz = new Quiz(scanner, biologyQuizParts);
        Quiz mixedQuiz = new Quiz(scanner, mixedQuizParts);

        try {
            System.out.println("Welcome");
            System.out.println("1.Biology Quiz \n2.Geography Quiz \n3.Mixed Quiz");
            System.out.print("Choose quiz: ");
            int userQuiz = scanner.nextInt();
            System.out.println();
            if (userQuiz == 1) {
                biologyQuiz.runQuiz();
            } else if (userQuiz == 2) {
                geographyQuiz.runQuiz();
            } else {
                mixedQuiz.runQuiz();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
