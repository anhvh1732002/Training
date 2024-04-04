package memory;

public class NonPrimitiveVar {
    static void celebrateBirthday(Student p) {
        p.setAge(p.getAge() + 1);
    }
    public static void main(String[] args) {
        Student student = new Student("Vu Hoang Anh", 20);

        //student is a Non-Primitives variable
        //pass the object student => change age
        celebrateBirthday(student);
        System.out.println(student.getAge());
    }
}
