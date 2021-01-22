package sevenprinciple.d_liskovsubstitution.imporove;

public class Square implements QuardRangle{

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
    public int getHeight() {
        return getLength();
    }
}
