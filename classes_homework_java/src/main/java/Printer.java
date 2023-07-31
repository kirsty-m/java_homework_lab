public class Printer {

    private int sheetsOfPaperLeft;
    private int pages;
    private int copies;


    public Printer (int sheetsOfPaperLeft, int pages, int copies){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.pages = pages;
        this.copies = copies;

    }


    public boolean print(){
        if (pages * copies <= sheetsOfPaperLeft) {
            return true;
        }
        else {
            return false;
        }
}}
