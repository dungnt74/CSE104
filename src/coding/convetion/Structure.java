package coding.convetion;

public class Structure {
    public static void main(String[] args) {
        new StudentManage();
    }

    // the structure of a class
    public static class StudentManage {

        // 1. Constants
        public static final int MAX_AGE = 100;

        // 2. Fields
        private String name;
        private int age;

        // 3. Constructor
        public void Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 4. Methods
        public String getName() {
            return name;
        }
    }
}
