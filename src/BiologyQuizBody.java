import java.util.List;

public class BiologyQuizBody {
    private final List<QuizPart> biologyQuizParts;

    public BiologyQuizBody() {
        this.biologyQuizParts = List.of(
                new QuizPart(
                        1,
                        "What is the human body's largest organ?",
                        List.of("Liver", "Skin", "Lung", "Stomach"),
                        2),
                new QuizPart(
                        2,
                        "Who discovered penicillin?",
                        List.of("Watson", "Linnaeus", "Fleming", "Campbell"),
                        3),
                new QuizPart(
                        3,
                        "How many species are estimated to live on Earth?",
                        List.of("9.7 million", "8.7million", "5.7million", "4.7million"),
                        2),
                new QuizPart(
                        4,
                        "What is the smallest unit of life?",
                        List.of("Cell", "Atom", "Molecule", "Organelle"),
                        1),
                new QuizPart(
                        5,
                        "Organisms that do not have a membrane bound nucleus are called:?",
                        List.of("Prokaryotes", "Eukaryotes", "Heterotroph", "Autotroph"),
                        1),
                new QuizPart(
                        6,
                        "How do viruses reproduce??",
                        List.of("They divide by mitosis", "Sexually, by external fertilization", "Inserting DNA into the host cell", "Replication outside the host"),
                        3),
                new QuizPart(
                        7,
                        "Which of the following is smallest?",
                        List.of("Eukaryote cell", "Bacteria", "Bacteriophage", "Cell membrane protein"),
                        3),
                new QuizPart(
                        8,
                        "If a DNA molecule is found to be composed of 40% thymine, what percentage of guanine would be expected.?",
                        List.of("10%", "20%", "30%", "40%"),
                        1),
                new QuizPart(
                        9,
                        "What do plants and animals have in common?",
                        List.of("Both are heterotrophic", "Both are autotrophic", "Both are prokaryotic", "Both are eukaryotic"),
                        4),
                new QuizPart(
                        10,
                        "Which of the following pairs is MOST closely related?",
                        List.of("Dog and tapeworm", "Tapeworm and bacteria", "Mushroom and tree", "Ameba and bacteria"),
                        1),
                new QuizPart(
                        11,
                        "Which of the following is the product of the Krebs cycle?",
                        List.of("ATP", "NADH", "FADH", "All of these"),
                        4),
                new QuizPart(
                        12,
                        "Which of the following is NOT a type of passive transport?",
                        List.of("Diffusion", "Osmosis", "Endocytosis", "Facilitated diffusion"),
                        3),
                new QuizPart(
                        13,
                        "Enzymes are composed of what organic molecule?",
                        List.of("Sugars", "DNA", "Fatty acids", "Proteins"),
                        4),
                new QuizPart(
                        14,
                        "Which of the following is found in plant cells, but not animal cells?",
                        List.of("Cell wall", "Vacuole", "Mitochondria", "Endoplasmic reticulum"),
                        1));
//                new QuizPart(
//                        15,
//                        "A cell with a diploid number of 24 undergoes meiosis, how many chromosomes are in each daughter cell?",
//                        List.of("6", "12", "24", "48"),
//                        2));
    }

    public List<QuizPart> getQuiz() {
        return biologyQuizParts;
    }

}
