public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 15;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
/* d	 	A decimal integer.
   f	 	A float.
   n	 	A new line character appropriate to the platform running the application. You should always use %n, rather than \n.
   tB	 	A date & time conversion—locale-specific full name of month.
   td, te	 	A date & time conversion—2-digit day of month. td has leading zeroes as needed, te does not.
   ty, tY	 	A date & time conversion—ty = 2-digit year, tY = 4-digit year.
   tl	 	A date & time conversion—hour in 12-hour clock.
   tM	 	A date & time conversion—minutes in 2 digits, with leading zeroes as necessary.
   tp	 	A date & time conversion—locale-specific am/pm (lower case).
   tm	 	A date & time conversion—months in 2 digits, with leading zeroes as necessary.
   tD	 	A date & time conversion—date as %tm%td%ty
 	08  	Eight characters in width, with leading zeroes as necessary.
 	+	    Includes sign, whether positive or negative.
 	,	    Includes locale-specific grouping characters.
 	-	    Left-justified..
 	.3	    Three places after decimal point.
 	10.3	Ten characters in width, right justified, with three places after decimal point.*/