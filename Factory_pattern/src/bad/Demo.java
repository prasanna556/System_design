package bad;

public class Demo {
    public static void main(String[] args) {
        Client client = new Client();
        Website blog = client.createWebsite("blog");
        blog.printPages();
    }
}
