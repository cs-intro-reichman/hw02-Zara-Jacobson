
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
        boolean hasBoy = false;
        boolean hasGirl = false;
        int childrenCount = 0;

        while (!(hasBoy && hasGirl)) {
            // Randomly decide the gender of the child (0 for boy, 1 for girl)
            int gender = (int) (Math.random() * 2);

            // Update the boolean variables based on the gender
            if (gender == 0) {
                System.out.print("b ");
                hasBoy = true;
            } else {
                System.out.print("g ");
                hasGirl = true;
            }

            childrenCount++;
        }

        System.out.println("\nYou made it... and you now have " + childrenCount + " children.");
    }
}


