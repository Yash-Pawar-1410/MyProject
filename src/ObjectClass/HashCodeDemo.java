/** HashCode=> it is a native method which is print the memory location address of the
 * object.
 * it is not a real address*/
package ObjectClass;

import Access_Modifier.Practice;
import Access_Modifier.Revision;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student s=new Student(10,"bro");
        Practice pr=new Practice();
        Revision r=new Revision();
        //***********************************************
        System.out.println(s.hashCode());
        System.out.println(pr.hashCode());
        System.out.println(r.hashCode());
    }
}
