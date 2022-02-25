import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", 18, "Chengdu");
        Gson gson = new Gson();
        System.out.println(gson.toJson(person));
    }
}