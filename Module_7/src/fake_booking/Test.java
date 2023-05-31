package fake_booking;

public class Test {

    public static void main(String[] args) {


        User alessio = new User("alessio", "apruzzi", "via random1", "mail1");
        User marco = new User("marco", "lala", "via random2", "mail2");
        User andrea = new User("andrea", "lala", "via random3", "mail3");
        Host aleHost = new Host("alessio", "ale", "via random4", "mail4");
        Host andreHost = new Host("andrea", "and", "via random5", "mail5");

        FakeBooking fakeBooking = new FakeBooking();


    }
}
