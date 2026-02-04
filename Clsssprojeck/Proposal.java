import java.util.Date;

public class Proposal {

    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal Proposal_status = StatusProposal.Waiting;

    private Applicant applicant;
    private User owner;

    public Proposal(String proposal_code, User owner, Applicant applicant) {
        this.proposal_code = proposal_code;
        this.owner = owner;
        this.applicant = applicant;
        this.proposal_date = new Date();
    }

    public void viewProposal() {}
    public void viewStatus() {}
    public void updateProposal() {}
    public void deleteProposal() {}
    public void archiveProposal() {}
    public void viewApplicant() {}

    public StatusProposal getProposal_status() {
        return Proposal_status;
    }

    public void setProposal_status(StatusProposal status) {
        this.Proposal_status = status;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public User getOwner() {
        return owner;
    }

    public String getProposal_code() {
        return proposal_code;
    }

    public Date getProposal_date() {
        return proposal_date;
    }

    public String getProposal_title() {
        return proposal_title;
    }

    public void setProposal_title(String proposal_title) {
        this.proposal_title = proposal_title;
    }

    public String getProposal_text() {
        return proposal_text;
    }

    public void setProposal_text(String proposal_text) {
        this.proposal_text = proposal_text;
    }
}
