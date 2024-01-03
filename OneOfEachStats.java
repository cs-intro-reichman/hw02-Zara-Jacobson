import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		
        Random generator = new Random(seed);  
        boolean girl = false;
        boolean boy = false;
        int childCount = 0;

        double sum = 0;
        int familyOf2 = 0;
        int familyOf3 = 0;
        int familyOf4 = 0;

        int mode = 0;

        for (int i = 0; i < T; i++) {
        	childCount = 0;
        	boy = false;
        	girl = false;

        	do {
        		double rnd = generator.nextDouble();
        		if (rnd < 0.5) {
        			girl = true;
        		} else {
        			boy = true;
        		}
        		childCount++;

        	} while (!boy || !girl);
        	if (childCount == 2) {
        		familyOf2++;
        	} else if (childCount == 3 ) {
        		familyOf3++;
        		} else {
        			familyOf4++;
        		}
        		sum += childCount;
        	}

        	mode = Math.max(Math.max(familyOf2, familyOf3), familyOf4);

        	System.out.println("Average: " + (sum/T) + " children to get at least one of each gender.");
        	System.out.println("Number of families with 2 children: " + familyOf2);
        	System.out.println("Number of families with 3 children: " + familyOf3);
        	System.out.println("Number of families with 4 or more children: " + familyOf4);
        	System.out.println("The most common number of children is " + ((mode == familyOf2) ? "2." : (mode == familyOf3) ? "3." : "4."));
        }

		
	}
