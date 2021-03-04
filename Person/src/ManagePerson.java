public class ManagePerson {

  public static void main(String[] args) throws Exception {
    System.out.println("Nhập vào thông tin của sinh viên");
    Student std = new Student();
    std.input();
    std.display();
  }
}
