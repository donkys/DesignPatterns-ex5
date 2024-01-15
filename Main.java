public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Sarun", "KMITL")
                .age(18)
                .build();
        System.out.println(student);

        Student student2 = new Student.StudentBuilder("Witchaya", "KMITL")
                .age(17)
                .build();
        System.out.println(student2);
    }
}