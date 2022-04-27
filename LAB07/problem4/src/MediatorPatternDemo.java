//2016112154 정동구
//main이 존재하는 class
public class MediatorPatternDemo {

    public static void main(String[] args) throws Exception {
        User Park = new User("Park Seri");
        User Gildong = new User("Gildong");

        Park.sendMessage("Hi! Park Seri!");
        Gildong.sendMessage("Hello! Gildong!");

    }
    
}
