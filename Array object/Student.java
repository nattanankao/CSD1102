// คลาส Student
// ที่มีข้อมูลดังนี้
// studentId(รหัสนักศึกษา)
// name (ชื่อ)
// major(สาขาวิชา)
// gpa (เกรดเฉลี่ย)
public class Student {
    public String studentId;
    public String name;
    public String major;
    public double gpa;

    // สร้าง constructor เพื่อกำหนดค่าข้อมูลทั้งหมด
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    // สร้างเมธอด displayInfo() เพื่อแสดงข้อมูลนักศึกษา
    public void displayInfo() {
        System.out.println("หัสนักศึกษา : " + studentId);
        System.out.println("ชื่อ : " + name);
        System.out.println("สาขาวิชา : " + major);
        System.out.println("เกรดเฉลี่ย : " + gpa);
        System.out.println(" ");
    }
}
