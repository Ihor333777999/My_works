package classes;

public class PaperPlane {
    public static void main(String[] args) {
        //Create 2 flags objects
        //Set all values to first one only
        //and copy first objects instance variable values to second one and reset/reassign the first object values to zero
        //to numbers and "a" to String
        Flag newFlag1 = new Flag();
        Flag newFlag2 = new Flag();
        newFlag1.country = "Argentina";
        newFlag1.color="red";
        newFlag1.size = 345;
        newFlag1.material="plastic";

        newFlag2.country= newFlag1.country;
        newFlag2.color= newFlag1.color;
        newFlag2.size= newFlag1.size;
        newFlag2.material=newFlag1.material;

        newFlag1.country="a";
        newFlag1.color="a";
        newFlag1.size=0;
        newFlag1.material="a";

        newFlag1.info();
        newFlag2.info();

        // upgrae flag to 255 and gold
        newFlag1.upgrade(255 ,"gold");
        newFlag1.info();
    }
}
