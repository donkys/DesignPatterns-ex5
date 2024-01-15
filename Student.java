public class Student {
    private String name;
    private String university;

    //เนื่องจาก int null ไม่ได้
    private Integer age; 

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age; 
    }

    public static class StudentBuilder {
        private final String name;
        private final String university;

        private Integer age;

        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("University: ").append(university).append("\n");
        if (age != null) {
            sb.append("Age: ").append(age).append("\n");
        }
        return sb.toString();
    }
}