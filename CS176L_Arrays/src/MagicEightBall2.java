/**
 * Class that models a Magic Eight Ball
 * @author AnnaNardelli
 *
 */
public class MagicEightBall2 {
	
	//Set up array literal.
	private String[] answers;
	
	//Constructor
	public MagicEightBall2() {
		answers = new String[] {"It is certain",
				"It is decidedly so",
				"Without a doubt",
				"Yes definitely",
				"You may rely on it",
				"As I see it yes",
				"Most likely",
				"Outlook good",
				"Yes",
				"Signs point to yes",
				"Reply hazy try again",
				"Ask again later",
				"Better not tell you now",
				"Cannot predict now",
				"Concentrate and ask again",
				"Don't count on it",
				"My reply is no",
				"My sources say no",
				"Outlook not so good",
				"Very doubtful" };
	}
	
	//Returns a random answer.
	public String getAnswer() {
		int answerIndex = (int)(Math.random() * 20);
		return answers[answerIndex];
	}
	
	//Lists all possible answers.
	public void listAnswers() {
		for (String answer: answers) {
			System.out.println(answer);
		}
		System.out.println("");
	}
}
