public class Triangle extends Shape{
    private String style;
    public Triangle(){}
    public Triangle(double width, double height, String style){
        super(width,height,"triangle");
        this.style = style;
    }
    @Override
    public double area(){
    return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is "+style);
    }

}
