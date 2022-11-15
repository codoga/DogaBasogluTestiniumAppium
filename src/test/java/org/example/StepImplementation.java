package bases;

import com.thoughtworks.gauge.Step;
import methods.Methods;
import pages.Book;
import pages.Flying;
import pages.Login;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest{
    Login loginPage = new Login();
    Methods methods = new Methods();
    Book Book = new Book();
    Flying Flying = new Flying();


    @Step("Uygulamayı aç ve açıldığını kontrol edilir")
    public void appControl(){
        methods.waitBySeconds(8);
        login.isAppOpen("Enable location services to fully personalise your experience");
    }

    @Step("Karsilama ekranı “Skip” seçeneği ile geçilir")
    public void skipScreen() {
        methods.waitBySeconds(5);
        login.clickSkip();
    }
    @Step("Alt menüden “Book” tabına geçiş yapılır.")
    public void switchBookTab(){
        methods.waitBySeconds(8);
        login.switchBookTab();
    }

    @Step("Seyehat tipi olarak “One Way” seçilir.")
    public void selectOneWay(){
        methods.waitBySeconds(5);
        Book.selectTrip();
    }

    @Step("Kalkış havaalanı olarak Berlin seçilir.")
    public void selectDeparture(){
        methods.waitBySeconds(5);
        Book.selectDeparture();
    }

    @Step("Varış havaalanı olarak Istanbul seçilir.")
    public void selectDestination(){
        methods.waitBySeconds(5);
        Book.selectDestination();
    }
    @Step("Bugünün Tarihinde +7 gün olarak bir gidiş tarihi seçilir")
    public void selectFlyDay(){
        methods.waitBySeconds(4);
        Book.selectFlyDay();
    }
    @Step("Arama butonuna tıklanır")
    public void selectFlySearch(){
        methods.waitBySeconds(3);
        Book.clickFlySearchButton();
    }