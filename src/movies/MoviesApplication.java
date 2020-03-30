package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("Which movies would you like to view?\n\t0 - Exit\n\t1 - All\n\t2 - Animated\n\t3 - Comedy\n\t4 - Drama\n\t5 - Horror\n\t6 - Musical\n\t7 - Sci-fi\n\nPlease pick one:");
        Input newInput = new Input(); //why does this have to be here?
        String myScanner = Input.getString();

        if (myScanner.equals("0")) {
            System.out.println("Bye bye then!");
            System.exit(5);
        }
        if (myScanner.equals("1")) {
            System.out.println("All movies it is then!");
            //display them ALL!
            for (Movie eachMovie : MoviesArray.findAll()) {
                System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
            }
            //somehow get it to continue
        }
        else {
            switch (myScanner) {
                case "2":
                    //display animated
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("animated"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
                case "3":
                    //display comedy
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("comedy"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
                case "4":
                    //display drama
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("drama"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
                case "5":
                    //display horror
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("horror"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
                case "6":
                    //display musical
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("musical"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
                case "7":
                    //display scifi
                    for (Movie eachMovie : MoviesArray.findAll()) {
                        if (eachMovie.getCategory().equals("scifi"))
                            System.out.println(eachMovie.getName() + " - " + eachMovie.getCategory());
                    }
                    break;
            }
            //somehow get it to continue
        }
    }
}
