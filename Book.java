package book;

public class Book {

    private String title = "";
    private String author = "";
    private boolean borrowed;

    public Book (String title, String author, boolean status) { // constructor for book class
        setTitle(title);
        setAuthor(author);
        setBorrowed(status);
    }
    public Book (String title, String author) { // second constructor 
        setTitle(title);
        setAuthor(author);

    }
    public Book (boolean status) {
        setBorrowed(status);
    }
    public Book () {}

    // package private methods
    void setTitle (String a) {  // set title 
        this.title = a;
    }
    void setAuthor (String a) { // set author
        this.author = a;
    }
    void setBorrowed (boolean a) {  // set status
        this.borrowed = a;
    }

    //public methods

    //accessors
    public String getTitle() {  // get title
        return title;
    }
    public String getAuthor() { // get author
        return author;
    }
    public boolean isBorrowed() {   // get status
        return borrowed;
    }
    
    /* returns the title of the book if 
    it is available and sets the state of the book to borrowed. 
    Returns the empty string if the the book is not available .
    */
    public String borrow () { 
        if(!borrowed){
            borrowed = true;
            return title;
        } else {
            return "";
        }
    }

    /* returns true if the book state is borrowed
    and sets the state of the book to available. 
    Returns false if the the book was already available .
    */
    public boolean giveBack () {
        if(borrowed){
            borrowed = false;
            return true;
        } else {
            return false;
        }
    }

    /* returns a string consisting of the title of the book
       followed by a colon and a space followed by the name
       of the author.
     */
    public String toString() {
        return title+" by "+author;
    }
}