import java.util.Collection;
import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> telData = new HashMap<>();
        telData.put("William A Lathan",  "405-709-1865");
        telData.put("John K. Miller",  "402-247-8568");
        telData.put("Hortensia E. Foster",  "606-481-6467");
        telData.put("Amanda D. Newland",  "319-243-5613");
        telData.put("Bruke P. Askew",  "307-687-2982");

        System.out.println(telData.get("John K. Miller")+ " is John K. Miller's phone number");



        if (telData.containsValue("Chris E. Myers")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }
}
  /*  We are going to represent our contacts in a map where both the keys and values are strings.

        Create a map with the following key-value pairs:

        Name (key)	Phone number (value)
        William A. Lathan	405-709-1865
        John K. Miller	402-247-8568
        Hortensia E. Foster	606-481-6467
        Amanda D. Newland	319-243-5613
        Brooke P. Askew	307-687-2982
        Create an application which prints out the answers to the following questions:

        What is John K. Miller's phone number?
        Whose phone number is 307-687-2982?
        Do we know Chris E. Myers' phone number? (yes/no)
        The full output of your main method should be the following:

        402-247-8568
        Brooke P. Askew
        no
*/