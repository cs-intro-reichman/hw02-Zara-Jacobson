/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
      
        int n = Integer.parseInt(args[0]);

        printDamkaBoard(n);
    }

    private static void printDamkaBoard(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                System.out.print((i + j) % 2 == 0 ? "* " : "  ");
            }
            
            System.out.println();
        }
    }
}
