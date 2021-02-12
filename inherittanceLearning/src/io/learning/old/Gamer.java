package io.learning.old;

// java 8 changed interface
// since java 8 inteface are no longer 100% abstract
// but they still are abstract
public interface Gamer {
    // can I declare variable here
    // Interfaces are not allowed to have any instance variable
    // any variable declare in interface will automatically
    // considered as public static final
    int gameCount = 0;
    void playGame(int drawCount);

    String getWinner();

    static void printHello(){
        System.out.println("HELLO");
    }

}

// any static values - they are created when class get loaded
// classes have inherittance
