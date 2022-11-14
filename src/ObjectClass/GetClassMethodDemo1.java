package ObjectClass;

import Access_Modifier.Practice;
import Access_Modifier1.ProductDemo1;
import Anonymous_Class.Abstract.Demo.Main;
import Call_By_Value.Addition;


public class GetClassMethodDemo1 {
    public static void main(String[] args) {
        GetClassMethodDemo1 getClassMethodDemo1=new GetClassMethodDemo1();
        Class class1=getClassMethodDemo1.getClass();
        System.out.println(class1.getName());

        GetClassMethodDemo newGetClassMethodDemo=new GetClassMethodDemo();
        Class newclass=newGetClassMethodDemo.getClass();
        System.out.println(newclass.getName());

        Practice practice1=new Practice();
        Class pract=practice1.getClass();
        System.out.println(pract.getName());

        ProductDemo1 productDemo11=new ProductDemo1();
        Class pract1=productDemo11.getClass();
        System.out.println(pract1.getName());

        Main mainAA=new Main();
        Class mAA=mainAA.getClass();
        System.out.println(mAA.getName());

        Anonymous_Class.Interfacee.Demo.Main mainI=new Anonymous_Class.Interfacee.Demo.Main();
        Class clsI=mainI.getClass();
        System.out.println(clsI.getName());

        Addition addition1=new Addition();
        Class clsAdd=addition1.getClass();
        System.out.println(clsAdd.getName());



























    }

}
