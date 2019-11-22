package constractor;

public class Sky {
    public Sky(String colorCode){
this.color = colorCode;

    }

    public Sky(int visibleStars,String color){
        this.color=color;
        this.visibleStars=visibleStars;

    }


    String  color;
    int visibleStars;

    public void info(){
        System.out.println("Collor:" + this.color);
        System.out.println("Stars "+ this.visibleStars);
    }
    public static void main(String[] args) {
        Sky refSky = new Sky("blue");                  //refSky(reference) Sky(constructor)
        refSky.color="Blue";
        System.out.println(refSky.color);

        Sky s2 = new Sky(7,"Yellow");
        s2.info();




    }
}
