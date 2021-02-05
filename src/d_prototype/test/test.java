package d_prototype.test;

public class test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("wjf");
        Student clone = student.clone();
        System.out.println(clone.toString());
    }

    public static class Student implements Cloneable{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public Student clone() {
            try {
                return (Student)super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
