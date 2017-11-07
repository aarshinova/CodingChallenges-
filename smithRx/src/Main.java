import java.util.HashMap;

public class Main {

    public void parseJson(){
        Person person = new Person();
        HashMap<String, String> names = new HashMap<>();
        Object[] data=parseJson();

        for (int i=0; i<data.length;i++){
            if (data.firstName!=null){
                if (names.containsKey(firstName))
                {
                    person.firstName = names.get(firstName);
                }
                else {
                    person.firstName = getRandomName();
                }
            }
            if (date.quantity!=null){
                person.setQuantity(date.quantity);
            }
        }



    }

}
