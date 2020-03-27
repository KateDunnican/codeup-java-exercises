import java.util.Random;

public class ServerNameGenerator {

    public static String combinationMaker(String[] x, String[] y){
        String randomAdj = x[new Random().nextInt(10)];
        String randomNoun = y[new Random().nextInt(10)];
        return randomAdj + "-" + randomNoun;
    }

    public static void main(String[] args) {
        //First way of initiating an array
        String[] adjectives = {"fluffy", "fuzzy", "spotted", "chonky", "needy", "lizardly", "sunny", "pointy", "bulbous", "enormous"};

        String[] nouns = {"dog", "cat", "string", "bird", "cactus", "pan", "cement", "laptop", "water", "dirt"};

        System.out.println(combinationMaker(adjectives, nouns));
    }
}
