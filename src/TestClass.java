public class TestClass {


  public static void main(String[] args) {
    String student = "Søren";
    SadStudent ss = new SadStudent();
    ss.name = student;

    ss.danceLikeCrazy();
    ss.ignoreTeacherInspirationalMoves();

    System.out.println(ss.name);
    System.out.println(ss.ExpectedExamGrade);
    System.out.println(ss.LevelOfEngagement);
  }

}
