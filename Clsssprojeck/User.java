import java.util.ArrayList;
import java.util.List;

public class User extends Login {

    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    private List<Proposal> proposals;
    private List<Report> reports;

    public User(int user_id,
                int department_id,
                String user_username,
                String user_password,
                String user_name,
                Gender user_gender,
                String user_email,
                RoleUser user_role) {

        super(user_username, user_password);

        this.user_id = user_id;
        this.department_id = department_id;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_role = user_role;

        this.proposals = new ArrayList<>();
        this.reports = new ArrayList<>();
    }

    public void userLogin() {}
    public void addProposal() {}
    public void viewProposal() {}
    public void confirmProposal() {}
    public void createReports() {}
    public void viewReports() {}
    public void updateDepartment() {}

    public void addProposalObj(Proposal p) {
        proposals.add(p);
    }

    public void addReportObj(Report r) {
        reports.add(r);
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public Gender getUser_gender() {
        return user_gender;
    }

    public RoleUser getUser_role() {
        return user_role;
    }
}
