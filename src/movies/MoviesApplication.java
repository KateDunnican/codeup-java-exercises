package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("Which movies would you like to view?\n\t0 - Exit\n\t1 - All\n\t2 - Animated\n\t3 - Comedy\n\t4 - Drama\n\t5 - Horror\n\t6 - Musical\n\t7 - Sci-fi\n\nPlease pick one:");
        Input newInput = new Input(); //why does this have to be here?
        String myScanner = Input.getString();

        if (myScanner.equals("0")){
            System.out.println("Bye bye then!");
            System.exit(5);
        }
        if (myScanner.equals("1")){
            System.out.println("All movies it is then!");
            //display them ALL!

        }
        else {
            System.out.println("Movies by category it is then!\nWhich category (animated, comedy, drama, horror, musical, or scifi)?");
            switch (myScanner){
                case "2":
                    //display animated
                    break;
                case "3":
                    //display comedy
                    break;
                case "4":
                    //display drama
                    break;
                case "5":
                    //display horror
                    break;
                case "6":
                    //display musical
                    break;
                case "7":
                    //display scifi
                    break;
            }
        }
    }
}
