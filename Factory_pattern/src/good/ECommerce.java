package good;

import java.util.ArrayList;
import java.util.List;

public class ECommerce extends Website{
    private List<Page> pages = new ArrayList<>();
    public void print(){
        System.out.println("inside Ecommerce");
    }

    public void addPage(Page page){
        this.pages.add(page);
    }

    @Override
    public void printPages() {
        pages.forEach(System.out::println);
    }
}
