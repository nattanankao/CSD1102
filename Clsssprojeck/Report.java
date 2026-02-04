import java.util.Date;

public class Report {

    private int Report_code;
    private Date Report_date;

    private Proposal proposal;
    private User creator;

    public Report(int Report_code, Proposal proposal, User creator) {
        this.Report_code = Report_code;
        this.proposal = proposal;
        this.creator = creator;
        this.Report_date = new Date();
    }

    public void viewReports() {}
    public void createReports() {}

    public User getCreator() {
        return creator;
    }

    public void show() {
        System.out.println("Report Code: " + Report_code);
        System.out.println("Report Date: " + Report_date);
        System.out.println("Proposal Code: " + proposal.getProposal_code());
        System.out.println("Status: " + proposal.getProposal_status());
        System.out.println("Creator: " + creator);
    }
}
