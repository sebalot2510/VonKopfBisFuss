package Kap3;

/**
 *
 * @author Sebastian
 */
public class TestArrays {
    
    public static void main(String[] args ) {
        
        String[] inseln = new String[4];
        int[] index = new int[4];
        
        inseln[0] = "Bermudas";
        inseln[1] = "Fidschi";
        inseln[2] = "Azoren";
        inseln[3] = "Kuba";
        
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        
        int y = 0;
        int ref;
        
        while ( y < 4) {
            ref = index[y];
            System.out.print("Insel = ");
            System.out.println(inseln[ref]);
            y = y + 1;
        }
    }
    
}
