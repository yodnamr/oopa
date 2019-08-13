public class CallStudent {

    public static void main(String[] args) {
        System.out.println("Hello World..... :.....");
        Student nalinee = new Student();
        System.out.println("Object nalinee = "+nalinee);
        nalinee.addCourse();
        nalinee.dropCourse();
        nalinee.payment();
        nalinee.enrollment();
        System.out.println("====================");
        
        //crete object GraduateStudent
        GraduateStudent yaya = new GraduateStudent();
        System.out.println("Object yaya = "+yaya);
        yaya.oralExamination();
        yaya.thesisExamination();
        yaya.enrollment();
        yaya.addCourse();
        yaya.dropCourse();
        yaya.payment();
    }
}
