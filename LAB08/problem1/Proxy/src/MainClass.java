//2016112154 정동구
//proxy 패턴으로 회원에 따라 다른 결과 출력.
interface User {
    void checkOut();
}

class AuthorizedUser implements User {
    @Override
    public void checkOut() {
        System.out.print("checking out...");
    }
}

class GuestUser implements User {
    @Override
    public void checkOut() {
        System.out.print("Showing Registration Page");
    }
}


interface UserProxy{ //Proxy interface
    User getUser();
}

class UserProxyHandler implements UserProxy{ //객체에 대한 엑세스를 제어
    private boolean isUserLoggedIn;

    public UserProxyHandler(boolean isUserLoggendIn)
    {
        this.isUserLoggedIn = isUserLoggendIn;
    }

    @Override
    public User getUser(){
        User temp;
        if(isUserLoggedIn)
        {
            temp = new AuthorizedUser();//회원
        }
        else
        {
            temp = new GuestUser();//비회원
        }
        return temp;
    }
}

public class MainClass {
    public static void main(String[] args) {

        //boolean isUserLoggedIn= UserManagerService.isUserLoggedIn();
        boolean isUserLoggedIn = true;
        User user=new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }

}
