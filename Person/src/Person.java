import java.util.*;

public class Person {

  /*
    Tạo một lớp Person lưu trữ các thông tin sau đây ( Tên, giới tính, địa chỉ,ngay sinh)
    Tạo một lớp Student kế thừa từ lớp Person lưu trữ các thông tin như dưới đây:
    Mã sinh viên, điểm trung bình, email
    Viết một phương thức nhập thông tin của student
    Viết một phương thức hiện thị thông tin của student
    */
  int name;
  String gender;
  String address;
  String DOB;
  Scanner sc = new Scanner(System.in);

  public Person(int name, String gender, String address, String DOB) {
    this.name = name;
    this.gender = gender;
    this.address = address;
    this.DOB = DOB;
  }

  public Person() {}

  public int getName() {
    return name;
  }

  public void setName(int name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDOB() {
    return DOB;
  }

  public void setDOB(String dOB) {
    DOB = dOB;
  }

  public void input() {
    System.out.println("Nhập tên:");
    String name = sc.nextLine();
    System.out.println("Nhập giới tính:");
    String gender = sc.nextLine();
    System.out.println("Nhập địa chỉ:");
    String address = sc.nextLine();
    System.out.println("Nhập ngày sinh:");
    String DOB = sc.nextLine();
  }

  public void display() {
    System.out.println("Tên: " + name);
    System.out.println("Giới tính: " + gender);
    System.out.println("Địa chỉ: " + address);
    System.out.println("Ngày sinh: " + DOB);
  }
}
