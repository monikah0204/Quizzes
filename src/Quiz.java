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
        int questionsNumber = Math.min(quizParts.size(), 15);
        for (int i = 0; i < questionsNumber; i++) {
            System.out.println(quizParts.get(i).getQuestion());

            for (int j = 0; j < quizParts.get(i).getAnswers().size(); j++) {
                System.out.println((j + 1) + ". " + quizParts.get(i).getAnswers().get(j));
            }

            int userAnswer;
            do {
                System.out.print("Choose answer: ");
                userAnswer = scanner.nextInt();
            } while (Main.isNotNumberFromRange(userAnswer, 1 , quizParts.get(i).getAnswers().size()));

            if (userAnswer == quizParts.get(i).getCorrectAnswer()) {
                System.out.println("Correct");
                score.getAndIncrement();
            } else {
                System.out.println("Incorrect");
            }
            System.out.println("\n");
        }

        Thread.sleep(1000);
        System.out.println("Thank you");

        System.out.println("Your score is: " + score);

        Thread.sleep(1500);
        System.out.println("Bye");
    }
}