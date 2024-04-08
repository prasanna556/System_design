package good;

public class Client {
    public Website createWebsite(WebsiteFactory factory){
        return factory.createWebsite();
    }
}
