package ImmutableClass;

final class Demo {
    private int studId;
    private int collegeId;

    Demo(int studId, int collegeId){
        this.studId=studId;
        this.collegeId=collegeId;
    }

    public int getStudId() {
        return studId;
    }

    public int getCollegeId() {
        return collegeId;
    }
}
class DemoImp{
    public static void main(String[] args) {
        Demo demo=new Demo(121, 200001);
        System.out.println("Student id is "+demo.getStudId());
        System.out.println("College id is "+demo.getCollegeId());
    }
}
