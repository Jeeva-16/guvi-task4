public class MainVoter {
    public static void main(String[] args) {
        try {
            // Attempt to create a Voter with valid age
            voter voter1 = new voter(1, "Alice", 25);
            System.out.println(voter1);

            // Attempt to create a Voter with invalid age
            voter voter2 = new voter(2, "Bob", 16);
            System.out.println(voter2);
        } catch (MyException e) {
            // Handle the custom checked exception
            System.out.println(e.getMessage());
        }
    }

}
