//2016112154 정동구
//colleague 역할
public class User {

    private String name;
    public User(String name)
    {
        this.name = name;
    }
    public String getName(){return name;}
    public void setName(String name){ this.name = name; }
    public void sendMessage(String msg)
    {
        ChatRoom.showMessage(this, msg);
    }

}
