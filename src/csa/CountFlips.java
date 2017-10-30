package csa;

/**
 * Write a description of class CountFlips here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountFlips
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    //--------------------------------------------------------------------------------
    //Flips a coin multiple times and counts the number of heads and tails that result
    //--------------------------------------------------------------------------------
    public static void main(String[] args){
        final int NUM_FLIPS = 1000;
        int heads=0, tails=0;
        
        Coin myCoin = new Coin();
        
        for (int count=1; count <= NUM_FLIPS; count++){
            myCoin.flip();
            
            if (myCoin.isHeads())
                heads++;
            else
                tails++;
        }
        
        System.out.println ("The number flips: " + NUM_FLIPS);
        System.out.println ("The number of heads: " + heads);
        System.out.println ("The number of tails: " + tails);
    }
}
