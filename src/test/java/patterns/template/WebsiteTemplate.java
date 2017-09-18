package patterns.template;

/**
 * Created by kine4599 on 10.07.17.
 */
public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
