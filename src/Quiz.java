import java.util.List;
import java.util.Scanner;

public class Quiz {

    private final Scanner scanner;
    private final List<QuizPart> quizParts;

    public Quiz(Scanner scanner, List<QuizPart> quizParts) {
        this.scanner = scanner;
        this.quizParts = quizParts;
    }

    public void runQuiz() throws InterruptedException {

       
        System.out.println("Welcome");
        Thread.sleep(1500);

        System.out.println("Good luck");
        Thread.sleep(1000);

        System.out.println("Starting quiz");


        Thread.sleep(2000);


        quizParts.forEach(quizPart -> {
            System.out.println(quizPart.getQuestion());

            for (int i = 0; i < quizPart.getAnswers().size(); i++) {
                System.out.println((i + 1) + ". " + quizPart.getAnswers().get(i));
            }

            System.out.print("Choose answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == quizPart.getCorrectAnswer()) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
            System.out.println("\n");
        });

        Thread.sleep(1000);
        System.out.println("Thank you");

        Thread.sleep(1500);
        System.out.println("Bye");
    }
}