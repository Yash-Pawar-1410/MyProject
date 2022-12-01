package ImmutableClass;
// make class final
final class CreateImmutable {
    // make class member private
    private int empId;
    private int empPone;
    // initialize the instance variable using constructor
    CreateImmutable(int a,int b){
        empId=a;
        empPone=b;
    }
    // taking public getters to rerun the copy of clas member ( we can not take public setters inside the immutable class

    public int getEmpId() {
        return empId;
    }

    public int getEmpPone() {
        return empPone;
    }

    public static void main(String[] args) {
        CreateImmutable createImmutable=new CreateImmutable(20,915886444);
        System.out.println("Employee id is "+createImmutable.getEmpId());
        System.out.println("Employee phone no is "+createImmutable.getEmpPone());
    }
}
