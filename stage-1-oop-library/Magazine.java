public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int id,String title,int isuueNumber){
        super(id, title);
        this.issueNumber = isuueNumber;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public void printInfo(){
        String status = isBorrowed() ? "Borrowed" : "Available";
        System.out.println("MAGAZINE | ID: " + getId()
            + " | TITLE: " + getTitle()
            + " | ISSUE: " + getIssueNumber()
            + " | STATUS: " + status
        );
    }


}
