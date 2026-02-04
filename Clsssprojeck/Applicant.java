public class Applicant {

    private int Applicant_id;
    private String Applicant_name;
    private String Applicant_job;
    private String Applicant_address;
    private Gender Applicant_gender;
    private char Applicant_tel;

    public Applicant(int Applicant_id, String Applicant_name) {
        this.Applicant_id = Applicant_id;
        this.Applicant_name = Applicant_name;
    }

    public void insertApplicant() {

    }

    public void updateApplicant() {

    }

    public void deleteApplicant() {

    }

    public String getApplicant_name() {
        return Applicant_name;
    }

    public String getApplicant_job() {
        return Applicant_job;
    }

    public int getApplicant_id() {
        return Applicant_id;
    }

    public Gender getApplicant_gender() {
        return Applicant_gender;
    }

    public String getApplicant_address() {
        return Applicant_address;
    }

    public char getApplicant_tel() {
        return Applicant_tel;
    }
}
