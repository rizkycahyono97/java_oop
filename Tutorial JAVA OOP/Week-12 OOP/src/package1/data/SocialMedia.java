package package1.data;

public class SocialMedia {

    String name;
}

final class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {
    void login(String username, String password) {
        
    }
}