public class flow {

  public static void main(String[] args) {

    Double num = 12;
    Double num2 = 1000;
    Boolean equivo = true;

    Double output = input(num, num2, equivo);
    System.out.println(output);
  }

  private static flowchart(Int a){
    if(a > 2000){
      System.out.println("A");
    } else if(a > 100){
      System.out.println("2");
    } 
    else {
      System.out.println("1");
    }
  }

  private static input(Double num, Double num2, Boolean equivo) {
    if(equivo){
      return (num + num2);
    } else {
      return (num * num2);
    }
  }
}
