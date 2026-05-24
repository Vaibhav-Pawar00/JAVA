public class bitQues {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is a even number!");
        }else{
            System.out.println(n + " is a odd number!");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // Method - 1
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // Method - 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i){
        int bitMask = (-1)<<i;
        return n & bitMask;
    }

    public static int clearRangeofIBits(int n, int i, int j){
        int a = (-1) << j+1; 
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n&bitMask;
    }

    public static void main(String []args){
        // Odd or Even using Bit Manioulation
        oddOrEven(3);
        oddOrEven(17);
        oddOrEven(26);

        // get ith Bit - get the what is there in the ith position 0 or 1
        System.out.println(getIthBit(10, 2));

        // set ith bit - set or change the ith bit to 0 if 1 or 1 if 0
        System.out.println(setIthBit(10, 2));

        // clear ith bit - clears to 0
        System.out.println(clearIthBit(10, 3));

        // update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        // clear last ith bith - clear the last ith bits to 0
        System.out.println(clearIBits(15, 2));

        // clear the range of ith bit (from ith position to jth position)
        System.out.println(clearRangeofIBits(10, 2, 4));
        System.out.println(clearRangeofIBits(2515, 2, 7));
    }
}
