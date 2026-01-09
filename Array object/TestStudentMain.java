public class TestStudentMain {
    public static void main(String[] args) {

        // 3. สร้างอ็อบเจ็กต์ Student อย่างน้อย 2 คน และเรียกใช้ displayInfo()
        Student student1 = new Student("0001", "สมสัก", "วิทยาการคอมพิวเตอร์", 3.85);
        Student student2 = new Student("0002", "สมน้ำหน้า", "วิทยาการคอมพิวเตอร์", 3.27);

        student1.displayInfo();
        student2.displayInfo();
        
        // สร้าง Student[] students = new Student[3]; // array ของ reference
        // students[0] = new Student(...);        // สร้าง object

        Student[] students = new Student[3];

        students[0] = new Student("s0001", "สมหวัง สิ้นหวัง", "Computer Science", 3.85);
        students[1] = new Student("s0002", "สมมุติ เป็นจริง", "Computer Science", 3.25);
        students[2] = new Student("s0003", "สมชาย จริงใจ", "Computer Science", 3.50);

        // 5. แสดงข้อมูลทั้งหมดด้วย loop
        for (Student i : students) {
            i.displayInfo();
        }
    }
}
