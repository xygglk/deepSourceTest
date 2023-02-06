public class Exam {
  public static void main(String[] args) {
    Outter outter = new Outter();
    outter.new Inner().print();
    outter.new Inner().testIf(false);
  }
}

class Outter {
  private int a = 1;

  class Inner {
    private int a = 2;

    public void print() {
      int a = 3;
      System.out.println("局部变量:" + a); // 3
      System.out.println("内部类变量:" + this.a); // 2
      System.out.println("外部类变量: " + Outter.this.a); // 1
    }

    public void testIf(boolean bool) {
      System.out.println("222222222222222222222222222222222");
      System.out.println(a); // 这个地方是类变量不是下一行的变量  2
      String a = "A";
      String c;
      if (bool) {
        String b = "B";
        c = "C";
        System.out.println("++++++++++++++++++true++++++++++++++");
        System.out.println(a); // A
        System.out.println(b); // B
      } else {
        String b = "BB";
        c = "CC";
        System.out.println("==================false================");
        System.out.println(a); // A
        System.out.println(b); // BB
      }
      //            System.out.println(b);//b是if括号里面定义的变量 外面取不到
      System.out.println(c); // c是定义在括号外面 这里也是括号外面也能取到值
    }
  }
}
