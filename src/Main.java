public class Main {

  public static void main(String[] args) {

    //Test1
    System.out.println("Test1");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    //Test2
    System.out.println("Test2");
    for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    }
    //Test3
    System.out.println("Test3");
    for (int i = 0; i <= 17; i=i+2 ) {
      System.out.println(i);
    }
        //Test4
    System.out.println("Test4");
    for (int i = 10; i >= -10; i--) {
      System.out.println(i);
    }
    //Test5
    System.out.println("Test5");
    for (int i = 1904; i <= 2096; i = i+4) {
      System.out.println(i);
    }
//Test6
    System.out.println("Test6");
for (int i = 7; i <=98; i = i+7) {
  System.out.println(i);
}
//Test7
    System.out.println("Test7");
    for (int i = 1; i <= 512; i = i*2) {
      System.out.println(i);
    }
//Test8
    int nakoplenie = 0;
    int otcislenie = 29000;
    System.out.println("Test8");
    for (int i = 1; i <=12; i++ ) {
      nakoplenie = nakoplenie + otcislenie ;
      System.out.println("месяц: " + i + " сумма накоплений равна " + nakoplenie + " рублей");
    }
//Test9
    System.out.println("Test9");
    int nakoplenie1 = 0;
    int otcislenie1 = 29000;
     for (int i = 1; i <=12; i++ ) {
      nakoplenie1 = nakoplenie1 + nakoplenie1 / 100;
      nakoplenie1 = nakoplenie1 + otcislenie1;
      System.out.println("месяц: " + i + " сумма накоплений равна " + nakoplenie1 + " рублей");
    }
//Test10
    System.out.println("Test10");
     for (int i = 1; i <= 10; i++) {
       int ravno = 2 * i;
       System.out.println("2 * " + i + " = " + ravno);
     }



  }
}