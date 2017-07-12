import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Book {

    private String title;
    private String author;
    private Date dueDate;
    private Boolean braille;

    public Book(String title, String author, Date dueDate, Boolean braille) {
        this.title = title;
        this.author = author;
        this.dueDate = dueDate;
        this.braille = braille;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getBraille() {
        return braille;
    }

    public void setBraille(Boolean braille) {
        this.braille = braille;
    }
}
