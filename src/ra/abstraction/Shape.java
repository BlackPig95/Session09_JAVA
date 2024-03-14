package ra.abstraction;

public abstract class Shape
{
    private int side;
    private String color;
    private boolean isFill;

    public Shape()
    {
    }

    public Shape(int side, String color, boolean isFill)
    {
        this.side = side;
        this.color = color;
        this.isFill = isFill;
    }

    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        this.side = side;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFill()
    {
        return isFill;
    }

    public void setFill(boolean fill)
    {
        isFill = fill;
    }

    public void displayInfo()
    {
        System.out.println("side = " + side + " | color= " + color + " | isFill= " + isFill);
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
