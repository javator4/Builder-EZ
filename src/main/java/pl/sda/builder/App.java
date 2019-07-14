package pl.sda.builder;

public class App
{
    public static void main( String[] args ){
        User user = new User.Builder()
                .name("TEST")
                .lastName("Test2")
                .city("Wrocław")
                . password("noewh").build();
        System.out.println(user);
    }
}
