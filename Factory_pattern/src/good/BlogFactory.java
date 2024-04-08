package good;

public class BlogFactory implements WebsiteFactory{
    @Override
    public Website createWebsite() {
        Blog blog = new Blog();
        blog.addPage(new CommentPage());
        blog.addPage(new AboutPage());
        return blog;
    }
}
