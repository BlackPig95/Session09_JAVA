package baitap.shape;

public class Square extends Rectangle implements Colorable
{
    public Square()
    {
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return getWidth();
    }

    public void setSide(double side)
    {
        setWidth(side);
        setHeight(side);
    }

//    @Override Stackoverflow
//    public void setWidth(double width)
//    {
//        setSide(width);
//    }
//
//    public void setHeight(double height)
//    {
//        setSide(height);
//    }

    public String toString()
    {
        return "A Square with side = "
                + String.format("%.2f", getSide())
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent)
    {
        System.out.println("Percent increased: " + percent);
        this.setSide(this.getSide() * percent + this.getSide());
    }

    @Override
    public void howToColor()
    {
        System.out.println("Color all four sides");
    }
}
