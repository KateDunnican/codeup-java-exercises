import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"fluffy", "fuzzy", "spotted", "chonky", "needy", "lizardly", "sunny", "pointy", "bulbous", "enormous"};
    public static String[] nouns = {"dog", "cat", "string", "bird", "cactus", "pan", "cement", "laptop", "water", "dirt"};

    public static String combinationMaker(String[] x, String[] y){
        String randomAdj = x[new Random().nextInt(x.length)];
        String randomNoun = y[new Random().nextInt(y.length)];
        return randomAdj + "-" + randomNoun;
    }

    public static void main(String[] args) {
        System.out.println(combinationMaker(adjectives, nouns));
    }
}
