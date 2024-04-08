package good;

public class Demo {
    public static void main(String[] args) {
        WebsiteFactory blogFactory = new BlogFactory();
        Client client = new Client();
        client.createWebsite(blogFactory).printPages();
        WebsiteFactory ecommerceFactory = new ECommerceFactory();
        Client client1 = new Client();
        System.out.println("=================== ");
        client.createWebsite(ecommerceFactory).printPages();
    }
}
