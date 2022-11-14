package LambdaExpression;

public interface Student {
    int Info(int id);

class StudImpl implements Student{

    @Override
    public int Info(int id) {
        return id;
    }
}
    public class StudTest{
        public static void main(String[] args) {
          Student student=new Student() {
              @Override
              public int Info(int id) {
                  return id;
              }
          };
            System.out.println(student.Info(20));
            //*************************************************
            Student student1=new StudImpl();
            System.out.println(student1.Info(30));
            //************************************************
            Student lambda=(id)->id;
            System.out.println(lambda.Info(40));
        }
    }
}



