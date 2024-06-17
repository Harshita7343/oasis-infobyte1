import java.util.Scanner;

public class QuizGame {
  private String[] questions = {
    "What is the capital of France?",
    "Who is the CEO of Tesla?",
    "What is the largest planet in our solar system?",
    "who is thw captain of csk?",
    "who is the president of america"
  };

  private String[] answers = {
    "Paris",
    "Elon Musk",
    "Jupiter",
    "Mahendra singh dhoni",
    "Joe biden"
  };

  private String[] categories = {
    "History",
    "Business",
    "Science"
  };

  private int score = 0;
  private String userName;

  public void playGame() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the quiz game!");
    System.out.print("Enter your name: ");
    userName = scanner.nextLine();

    System.out.println("Choose a category:");
    for (int i = 0; i < categories.length; i++) {
      System.out.println((i + 1) + ". " + categories[i]);
    }
    int categoryChoice = scanner.nextInt();
    scanner.nextLine(); // consume newline left-over

    int questionIndex = categoryChoice - 1;
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[questionIndex]);
      String userAnswer = scanner.nextLine();

      if (userAnswer.equalsIgnoreCase(answers[questionIndex])) {
        System.out.println("Correct!");
        score++;
      } else {
        System.out.println("Incorrect. The correct answer is " + answers[questionIndex]);
      }

      questionIndex = (questionIndex + 1) % questions.length;
    }

    System.out.println("Your final score is " + score + "/" + questions.length);
    System.out.println("Thanks for playing, " + userName + "!");
  }

  public static void main(String[] args) {
    QuizGame game = new QuizGame();
    game.playGame();
  }
}