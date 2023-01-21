public class CaseA {
    void m1(Object obj) {
        System.out.println("one");
    }
}
    class B extends CaseA {
        void m1(Object obj) {
            super.m1(null);
            System.out.println("two");
        }

        void m2(Object obj) {
            System.out.println("three");
            this.m1(null);
        }
    }

