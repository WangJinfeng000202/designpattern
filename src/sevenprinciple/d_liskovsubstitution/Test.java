package sevenprinciple.d_liskovsubstitution;

public class Test {

    /**
     * 让长方形的高一直自增，直到宽 < 高
     * @param rectangle 长方形
     */
    private static void resize(Rectangle rectangle){
        while(rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width: "+ rectangle.getWidth() + "height: " + rectangle.getHeight());
        }
    }
}
