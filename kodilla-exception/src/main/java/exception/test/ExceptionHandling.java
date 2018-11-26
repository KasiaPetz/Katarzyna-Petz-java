package exception.test;

public class ExceptionHandling {

    SecondChallange secondChallange = new SecondChallange();
    try {
        secondChallange.probablyIWillThrowException(1.2, 1.5);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

