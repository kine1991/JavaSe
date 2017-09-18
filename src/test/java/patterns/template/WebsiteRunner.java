package patterns.template;

/**
 * Created by kine4599 on 10.07.17.
 */
public class WebsiteRunner {

    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("-------------------------");

        newsPage.showPage();
    }

}
