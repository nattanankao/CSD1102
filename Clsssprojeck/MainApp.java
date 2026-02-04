import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Department dept = new Department(1, "IT");

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Full Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Gender (Male/Female): ");
        Gender gender = Gender.valueOf(sc.nextLine());

        System.out.print("Role (PublicRelation/Division/Manager): ");
        RoleUser role = RoleUser.valueOf(sc.nextLine());

        User user = new User(
                userId,
                dept.getDepartment_id(),
                username,
                password,
                userName,
                gender,
                email,
                role
        );

        System.out.print("Enter Applicant ID: ");
        int appId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Applicant Name: ");
        String appName = sc.nextLine();

        Applicant applicant = new Applicant(appId, appName);

        System.out.print("Enter Proposal Code: ");
        String proposalCode = sc.nextLine();

        Proposal proposal = new Proposal(proposalCode, user, applicant);
        user.addProposalObj(proposal);

        proposal.setProposal_status(StatusProposal.Waiting);

        Report report = new Report(1001, proposal, user);
        user.addReportObj(report);

        System.out.println("RESULT");
        report.show();
        System.out.println("Applicant: " + proposal.getApplicant().getApplicant_name());
        System.out.println("User: " + user.getUser_name());

        sc.close();
    }
}
