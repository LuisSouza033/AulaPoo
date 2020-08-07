public class Retangle extends Shape{
    public Retangle(){}
    public Retangle(double width, double height){
        super(width,height,"Retangle");
    }
    @Override
    public double area(){
        return getWidth() * getHeight();
    }
}
