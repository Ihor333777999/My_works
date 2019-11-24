//Create a class Phone.
//        Instance variables: touchscreen, model, memory, color, phoneNumber.
//        Create a constructor that accepts two parameters(model, color) and set to corresponding instance variables.
//        Overload the constructor that accepts 4 parameters(model, color, memory, touchscreen).
//        Set values and check memory. If given memory is negative value then print “invalid memory” and don’t set memory value. Otherwise set the memory value.
package constractor;

public class Phone {
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model,String color){
      this.model=model;
      this.color=color;

    }
    public Phone(String model,String color,int memory,boolean touchscreen){
        this.model=model;
        this.color=color;
        this.touchscreen=touchscreen;
        if (memory<0){
            System.err.println("invalid memory");
        }else {
            this.memory = memory;
        }

}
public  void info(){
    System.out.println("\nmodel "+ this.model);
    System.out.println("memory "+ this.memory);
    System.out.println("color "+ this.color);
    System.out.println("touch screen "+ this.touchscreen);
    System.out.println("phone number "+this.phoneNumber);
}
public boolean text ( long phoneNumber,String text){
        String pString =phoneNumber+"";
        if (pString.length()==10 && !text.isEmpty()){
            System.out.println(text+ " is sent to " + phoneNumber);
            return  true;
        }else{
            System.out.println("invalid");
            return  false;
        }
}


    }


