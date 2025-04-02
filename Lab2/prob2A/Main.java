package prob2A;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        
        System.out.println(student);
        System.out.println(student.getGradeReport());
        
        System.out.println("Student's grade report: " + student.getGradeReport());
        System.out.println("Grade report's student: " + student.getGradeReport().getStudent());
    }
} 