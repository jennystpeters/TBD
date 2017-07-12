import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Kid extends Book {
    private Boolean boardBook;

    public Kid(String title, String author, Boolean status, Date dueDate, Boolean braille, Boolean boardBook) {
        super(title, author, status, dueDate, braille);
        this.boardBook = boardBook;
    }

    public Boolean getBoardBook() {
        return boardBook;
    }

    public void setBoardBook(Boolean boardBook) {
        this.boardBook = boardBook;
    }
}
