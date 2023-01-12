import java.util.List;

public class GeographyQuizBody {
    private final List<QuizPart> geographyQuizParts;

    public GeographyQuizBody() {
        this.geographyQuizParts = List.of(
                new QuizPart(
                        1,
                        "Które zwierze ma 4 nogi?",
                        List.of("Krowa", "Kura", "Kruk", "Kaczka"),
                        1),
                new QuizPart(
                        2,
                        "Które zwierze ma 2 nogi?",
                        List.of("Krowa", "Kot", "Koń", "Kaczka"),
                        4)
        );
    }

    public List<QuizPart> getQuiz() {
        return geographyQuizParts;
    }

}
