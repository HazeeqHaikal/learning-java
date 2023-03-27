public class AudioBook extends Book{
    private int runTime;
    
    AudioBook(String title, String author,int runTime){
        // inheritance is a way to reuse code
        super(title, author, 0);
        this.runTime = runTime;
    }
}
