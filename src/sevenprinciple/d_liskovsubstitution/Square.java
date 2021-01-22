package sevenprinciple.d_liskovsubstitution;

public class Square extends Rectangle{
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
       return getLength();
    }

    @Override
    public void setWidth(int width) {
        setLength(width);
    }

    @Override
    public int getHeight() {
        return getLength();
    }

    @Override
    public void setHeight(int height) {
        setLength(height);
    }
}
