package e_builder;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.Builder()
                .addName("java")
                .builder();
        StringBuilder builder = new StringBuilder();
    }
}
