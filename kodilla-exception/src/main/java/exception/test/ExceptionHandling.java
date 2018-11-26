package exception.test;

public class ExceptionHandling {
        public static void main (String[] args) {

        SecondChallange secondChallange = new SecondChallange();
        try {
            secondChallange.probablyIWillThrowException(1.2, 1.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

