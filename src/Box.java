public class Box {
    static String boxtype= "Fancy";
    double length,width, height;
 
    public Box(double length) {
       this.length = length;
    }
 
    public double getVolume() {
       doSomething();
       System.out.println(boxtype);
        return width*height*length;
    }
 
    public static void doSomething() {
       System.out.println(count("ANC"));
       System.out.println("Enjoying the static ");
    }
 
    public static int count(String boxtype){
       Box.boxtype = boxtype;
       return 0;
    }
 
 }
 