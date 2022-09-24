/** Print the ASCII value of the character 'h' */

package Known_Data_Type;

public class Assignment_4 {
    public static void main(String[] args) {
        char ch='h';
        System.out.println((int) ch);

    }
}

// What is type casting => converting one data type value into another data type value
/*     Explicit type casting => when we assign bigger data value into smaller data type value
                             => we tell to the compiler we are fine with the data loss
                             => developer responsible for explicit type casting
                             => it is also called upcasting ar narrowing
        int a=2176;
        byte b=(byte)a;
        System.out.println(b);
                OR
        System.out.println((byte)a);
 */
/*
        Implicit type casting => when we assign smaller data value into bigger data type value
                              => there won't be any data loss in case of implicit type casting
                              => java compiler responsible for implicit type casting
                              => it is also called down-casting or widening
        short a=12799;
        System.out.println((int) a);
 */
