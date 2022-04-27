//2016112154 정동구
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


interface UserProxy{
    User getUser();
}

class UserProxyHandler implements UserProxy{
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
            temp = new AuthorizedUser();
        }
        else
        {
            temp = new GuestUser();
        }
        return temp;
    }
}

public class MainClass {
    public static void main(String[] args) {

        //boolean isUserLoggedIn= UserManagerService.isUserLoggedIn();
        boolean isUserLoggedIn = false;
        User user=new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }

}
