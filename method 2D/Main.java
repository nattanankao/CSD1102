public class Main {// ประกาศคลาส Main

    public static void main(String[] args) {// เมธอดหลักของโปรแกรม

        //1.   ประกาศตัวแปร int[][] ที่มีขนาด 10× 10 เพื่อใช้เก็บข้อมูลตัวเลขจำนวนเต็ม
        int[][] array1 = new int[10][10];

        //2.   เขียน method สำหรับ สุ่มค่าตัวเลขจำนวนเต็มระหว่าง 50 – 59 แล้วนำไปเก็บลงในทุกตำแหน่งของ 2D Array
        randomArray(array1);// เรียกเมธอดสุ่มค่า 50–59 ใส่ใน array1

        //3.   เขียน method สำหรับแสดงค่าข้อมูลทั้งหมดใน 2DArray โดยแสดงผลเป็นลักษณะตาราง
        System.out.println("Array 1:");// แสดงข้อความหัวข้อ Array 1
        displayArray(array1);// แสดงค่าของ array1 เป็นตาราง

        //4.   ให้ประกาศ 2D Array ขนาด 10 × 10 อีก 1 ตัว 
        // จากนั้นเขียน method เพื่อ บวกค่าของ array ทั้งสองตัวในตำแหน่งเดียวกัน และเก็บผลลัพธ์ลงใน array ใหม่
        int[][] array2 = new int[10][10];
        randomArray(array2);// สุ่มค่า 50–59 ใส่ใน array2
        System.out.println("Array 2:");// แสดงข้อความหัวข้อ Array 2
        displayArray(array2);// แสดงค่าของ array2 เป็นตาราง
        addArray(array1, array2);
        int[][] result = addArray(array1, array2);// เรียกเมธอดบวกค่า array1 และ array2 แล้วเก็บผลลัพธ์ไว้ใน result
        System.out.println("result :");
        displayArray(result);// แสดงค่าของอาร์เรย์ผลลัพธ์
    }

    // 1. method สุ่มค่า 50–59
    public static void randomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {// วนลูปแถว    
            for (int j = 0; j < arr[i].length; j++) {// วนลูปคอลัมน์
                arr[i][j] = (int) (Math.random() * 10) + 50;// สุ่มค่า 50–59
            }
        }
    }

    // 2. method แสดงผล 2D Array
    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {// วนลูปแถว
            for (int j = 0; j < arr[i].length; j++) {// วนลูปคอลัมน์
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3. method บวกค่า 2D Array
    public static int[][] addArray(int[][] arr1, int[][] arr2) {
        int[][] result = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {// วนลูปแถว
            for (int j = 0; j < arr1[i].length; j++) {// วนลูปคอลัมน์
                result[i][j] = arr1[i][j] + arr2[i][j];// บวกค่าตำแหน่งเดียวกัน
            }
        }

        return result;// ส่งค่าอาร์เรย์ผลลัพธ์กลับ
    }
}