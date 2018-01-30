package edu.cnm.deepdive;

public class Test {

  public static void main(String... args) {
    int upperLimit = (args.length >0) ? Integer.parseInt(args[0]) : 100;
    int[] sizes = {6, 9, 20};
    Composable tester = new McNugget() ;
    for (int i = 1;i <= 100; i++) {
      System.out.printf("%d\t%b%n", i, tester.test(i, sizes));
      }
    }

}
