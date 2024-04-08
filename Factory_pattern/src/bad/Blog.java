package bad;

import good.Page;

import java.util.ArrayList;
import java.util.List;

public class Blog extends Website {
    private List<Page> pages = new ArrayList<>();
    public void print(){
        System.out.println("inside Blog");
    }

    public void addPage(Page page){
        this.pages.add(page);
    }

    public void printPages(){
        pages.forEach(System.out::println);
    }
}
