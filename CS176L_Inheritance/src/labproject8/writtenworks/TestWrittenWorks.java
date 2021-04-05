/**
 * Tests WrittenWorks
 */
package labproject8.writtenworks;

public class TestWrittenWorks {

	public static void main (String[] args) {
		Novel greatExpectations = new Novel ("Great Expectations",
				"Charles Dickens", 1861, "Bildungsroman", 59);
		
		System.out.println("Novel:");
		System.out.println("------");
		System.out.println(greatExpectations);
		
		System.out.println();
		
		ShortStory storyOfAnHour = new ShortStory ("The Story of an Hour",
				"Kate Chopin", 1894, "Fiction", 18, false);
		
		System.out.println("Short Story:");
		System.out.println("------------");
		System.out.println(storyOfAnHour);
	}
}
