import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Collections.shuffle;

public class Quiz {

    private final Scanner scanner;
    private final ArrayList<QuizPart> quizParts;

    public Quiz(Scanner scanner, List<QuizPart> quizParts) {
        this.scanner = scanner;
        this.quizParts = new ArrayList<>(quizParts);
    }

    public void runQuiz() throws InterruptedException {


        System.out.println("Good luck");
        Thread.sleep(1000);

        System.out.println("Starting quiz");


        Thread.sleep(2000);
        AtomicInteger score = new AtomicInteger();

        shuffle(quizParts);
        quizParts.forEach(quizPart -> {
            System.out.println(quizPart.getQuestion());

            for (int i = 0; i < quizPart.getAnswers().size(); i++) {
                System.out.println((i + 1) + ". " + quizPart.getAnswers().get(i));
            }

            System.out.print("Choose answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == quizPart.getCorrectAnswer()) {
                System.out.println("Correct");
                score.getAndIncrement();
            } else {
                System.out.println("Incorrect");
            }
            System.out.println("\n");
        });

        Thread.sleep(1000);
        System.out.println("Thank you");

        System.out.println("Your score is: " + score);

        Thread.sleep(1500);
        System.out.println("Bye");
    }
}