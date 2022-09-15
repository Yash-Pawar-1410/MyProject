public class StarPrint {
    public static void main(String[] args) {
        // Right side triangle pattern
        /*
       int i, j, row=6;
       for (i=0; i<row; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
         */

// Left side star pattern
        /*
        int i,j, row=6;
        for (i=0; i<row; i++)
        {
            for(j=2*(row-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
                System.out.print("* ");
            {
                System.out.println();
            }
        }
         */

// Left downward triangle star pattern
        /*
        int i,j,row=4;
        for (i=row-1; i>=0;i--)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
         */


// Right down triangle star pattern

        /*
        int i,j,k, row=4;

        for (i=row; i>=1; i--)
        {
            for (j=row; j>i; j--)
            {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

         */

// Pyramid star pattern


// Sand-glass star pattern
        /*
        int i,j,k,row=5;
        for (i=0; i<=row-1; i++)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i=row-1; i>=0; i--)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
         */



    }
}
