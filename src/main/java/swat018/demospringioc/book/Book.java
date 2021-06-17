package swat018.demospringioc.book;

import java.util.Date;

public class Book {

    private Date created;

    private BookStatus bookStatus;

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Date getCreated() {
        return created;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
}
