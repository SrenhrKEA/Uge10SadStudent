public class TestClass {


  public static void main(String[] args) {
    String student = "Søren";
    SadStudent ss = new SadStudent();
    ss.name = student;

    ss.ignoreTeacherInspirationalMoves();
    ss.lookLikeAZombie();
    ss.shoutLikeCrazy();
    ss.shoutLikeCrazy();
    ss.shoutLikeCrazy();
    ss.shoutLikeCrazy();

    System.out.println(ss.name);
    System.out.println(ss.ExpectedExamGrade);
    System.out.println(ss.LevelOfEngagement);
  }

}
