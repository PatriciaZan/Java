import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    byte b = 100;
    short s = 10000;
    int in = 1000000;
    long l = 1000000L;
    float f = 10.5f;
    double d = 20.5;
    char c = 'A';
    String str = "Patricia";
    boolean boll = true;

    // Vector
    int[] vectors = {1,2,3,4};
    int[] myNumbers = new int[5]; // array size fixed


    // Conditional Structures----------------------------------------------------------------------
        if(boll){
            System.out.println("True");
        } else if( str == "Patricia") {
            System.out.println("Yes");
        }else{
            System.out.println("False");
        };

    // Dynamic List of elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Paty");
        list.add("Fernanda");
        list.add("João");

        System.out.println(list.get(0));

        //list.remove(0);
        //list.remove("João");


    // Loops - Itarations
        for (int i = 0; i< 2; i++){
            System.out.println(list.get(i));
        }

        // type : var that is itarated
        for(String name : list){
            System.out.println(name);
        }

        int count = 0;
        while (count < 10){
            System.out.println("While loop" + count);
            count++;
        }


    // Casting-------------------------------------------------------------------------------------------
    // Change var type

        double doubleCasting = 0.0;
        int resultIntCasting = (int)doubleCasting;

        String myString = "10";
        int intFromStr = Integer.parseInt(myString);

        String myString2 = String.valueOf(intFromStr);









    }
}