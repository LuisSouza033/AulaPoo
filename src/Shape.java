public abstract class Shape {
    private double width; // largura
    private double height; // altura
    private String name; // Nome para a forma geométrica

    public Shape(){};

    public Shape(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void showDim(){
        System.out.println("Width and are Height: "+width+" and "+height);
    }
    public abstract double area();
}
