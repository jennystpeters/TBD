import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Adult extends Book {

    private Boolean steamy;
    private Boolean largePrint;

    public Adult(String title, String author, Boolean status, Date dueDate, Boolean braille, Boolean steamy, Boolean largePrint) {
        super(title, author, status, dueDate, braille);
        this.steamy = steamy;
        this.largePrint = largePrint;
    }

    public Boolean getSteamy() {
        return steamy;
    }

    public void setSteamy(Boolean steamy) {
        this.steamy = steamy;
    }

    public Boolean getLargePrint() {
        return largePrint;
    }

    public void setLargePrint(Boolean largePrint) {
        this.largePrint = largePrint;
    }
}
