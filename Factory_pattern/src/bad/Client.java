package bad;




public class Client {
    public Website createWebsite(String type){
        if(type.equals("blog")){
            Blog blog = new Blog();
            blog.addPage(new CommentPage());
            blog.addPage(new AboutPage());
            return blog;
        }else if (type.equals("ECommerce")){
            ECommerce ecommerce = new ECommerce();
            ecommerce.addPage(new CartPage());
            ecommerce.addPage(new good.AboutPage());
            return ecommerce;
        }else {
            return  null;
        }
    }
}
