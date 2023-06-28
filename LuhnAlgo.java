import java.util.*;
public class LuhnAlgo {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        String ccnum = myscanner.nextLine();

        if(checkLuhn(ccnum)){
            System.out.println("VALID");
        }
        else{
            System.out.println("INVALID");
        }
        myscanner.close();
    }
    

        public static boolean checkLuhn(String ccnum){
            int nDigits = ccnum.length();
            int nSum = 0;
            boolean isSecond = false;

            for(int i = nDigits - 1; i >= 0; i--)
            {
                int d = ccnum.charAt(i) - '0';

                if (isSecond == true)
                d = d * 2;

                nSum += d / 10;
                nSum += d % 10;

                isSecond = !isSecond;
            }
            return (nSum % 10 == 0);
        }
    }

    

