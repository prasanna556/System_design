package good;

public class ECommerceFactory implements  WebsiteFactory{
    @Override
    public Website createWebsite() {
        ECommerce ecommerce = new ECommerce();
        ecommerce.addPage(new CartPage());
        ecommerce.addPage(new AboutPage());
        return ecommerce;
    }
}
