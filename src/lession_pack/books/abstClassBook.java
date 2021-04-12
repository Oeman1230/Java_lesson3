package lession_pack.books;

public abstract class abstClassBook {
    protected String bookCode;
    protected String bookAuthor;
    protected String bookName;
    protected Integer bookYear;
    protected String bookPublisher;
    public void setBookCode (String code)
    {
        bookCode = code;
    }
    public void setBookAuthor(String author)
    {
        bookAuthor = author;
    }
    public void setBookName(String name)
    {
        bookName = name;
    }
    public void setBookYear(Integer year)
    {
        bookYear = year;
    }
    public void setBookPublisher(String Publisher) {
        bookPublisher = Publisher;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getBookYear() {
        return bookYear;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    @Override
    public String toString() {
        return
                "bookCode='" + bookCode + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookYear=" + bookYear +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
