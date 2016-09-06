package HelloWorld;

public class HelloWorld {
    String name;

    public HelloWorld(String n) {
        name = n;
    }

    public HelloWorld() {name = "God"; }

    public String say(String n) {
        if (n == "")
            return "Hello " + name + " ! This is your world!";
        else
            return "Hello " + n + " ! This is your world!";
    }
}
