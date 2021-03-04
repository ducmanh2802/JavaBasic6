import java.util.*;

public class Student extends Person {

  int iD;
  float CPA;
  String email;
  Scanner sc = new Scanner(System.in);

  public Student(
    int name,
    String gender,
    String address,
    String DOB,
    int iD,
    float CPA,
    String email
  ) {
    super(name, gender, address, DOB);
    this.iD = iD;
    this.CPA = CPA;
    this.email = email;
  }

  public Student() {}

  public int getiD() {
    return iD;
  }

  public void setiD(int iD) {
    this.iD = iD;
  }

  public float getAvgMark() {
    return CPA;
  }

  public void setAvgMark(float avgMark) {
    this.CPA = avgMark;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Mã sinh viên: " + iD);
    System.out.println("điểm trung bình: " + CPA);
    System.out.println("Email: " + email);
  }

  @Override
  public void input() {
    super.input();
    System.out.println("Nhập mã sv: ");
    int iD = Integer.parseInt(sc.nextLine());
    System.out.println("Nhập điểm trung bình :");
    float CPA = sc.nextFloat();
    System.out.println("Nhập email: ");
    String email = sc.nextLine();
  }
}
