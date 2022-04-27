//2016112154_정동구
//mediator 역할. 하나의 중재자만 필요할 경우 인터페이스 일 필요가 없다.
import java.util.Date;
public class ChatRoom {

    public static void showMessage(User user, String msg)
    {
        System.out.println(new Date().toString() + "[" + user.getName() +"] : " + msg);
    }
    
}
