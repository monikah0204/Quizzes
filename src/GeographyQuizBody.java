import java.util.List;

public class GeographyQuizBody {
    private final List<QuizPart> geographyQuizParts;

    public GeographyQuizBody() {
        this.geographyQuizParts = List.of(
                new QuizPart(
                        1,
                        "What is the capital of Malta??",
                        List.of("Valetta", "Mdina", "Birgu", "Bormla"),
                        1),
                new QuizPart(
                        2,
                        "What is the capital of Peru?",
                        List.of("Cuzco", "Huaraz", "Sullana", "Lima"),
                        4),
                new QuizPart(
                        3,
                        "Which country has the longest coastline in the world??",
                        List.of("Russia", "Peru", "Canada", "China"),
                        3),
                new QuizPart(
                        4,
                        "What is the biggest island in the world?",
                        List.of("Greenland", "New Guinea", "Madagascar", "Borneo"),
                        1),

                new QuizPart(
                        5,
                        "In which country would you find Machu Picchu?",
                        List.of("Peru", "Chile", "Bolivia", "Ecuador"),
                        1),
                new QuizPart(
                        6,
                        "Which animal appears on the flag of Sri Lanka?",
                        List.of("Horse", "Eagle", "Parrot", "Lion"),
                        4),

                new QuizPart(
                        7,
                        "Which city currently has the highest population in the world?",
                        List.of("Delhi", "Jakarta", "Tokyo", "New York"),
                        3),
                new QuizPart(
                        8,
                        "What is the name of the smallest country in the world?",
                        List.of("Nauru", "Liechtenstein", "Monaco", "Vatican City"),
                        4),

                new QuizPart(
                        9,
                        "Which sea is the largest in the world?",
                        List.of("Philippine Sea", "Coral Sea", "Arabian Sea", "Caribbean Sea"),
                        1),
                new QuizPart(
                        10,
                        "What is the name of the largest desert in the world?",
                        List.of("Sahara Desert", "Antarctic Desert", "Arctic Desert", "Gobi Desert"),
                        2),
                new QuizPart(
                        11,
                        "How many countries are in Europe?",
                        List.of("48", "40", "36", "44"),
                        4),
                new QuizPart(
                        12,
                        "How many countries are in European Union?",
                        List.of("25", "27", "30", "32"),
                        2),
                new QuizPart(
                        13,
                        "How many time zones does Australia have?",
                        List.of("2", "3", "4", "5"),
                        2),
                new QuizPart(
                        14,
                         "Where do Hippopotamus live?",
                        List.of("In East Africa", "In West Africa", "In East Australia", "In West Australia"),
                        1),
                new QuizPart(
                        15,
                        "What is the height of Mount Everest?",
                        List.of("9488m", "9648m", "8988m", "8849m"),
                        4));
    }

    public List<QuizPart> getQuiz() {
        return geographyQuizParts;
    }

}
