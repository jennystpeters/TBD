import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Teen extends Book {

    private Boolean comingOfAge;

    public Teen(String title, String author, Boolean status, Date dueDate, Boolean braille, Boolean comingOfAge) {
        super(title, author, status, dueDate, braille);
        this.comingOfAge = comingOfAge;
    }

    public Boolean getComingOfAge() {
        return comingOfAge;
    }

    public void setComingOfAge(Boolean comingOfAge) {
        this.comingOfAge = comingOfAge;
    }
}
