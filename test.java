
public class test {
   public static void main(String[] args) {
      GenericsKbArrayApp test = new GenericsKbArrayApp("GenericsKB.txt"); //GenericsKB.txt
      System.out.println(test.numLines("GenericsKB.txt")); //GenericsKB-additional.txt
      //test.setKB("GenericsKB.txt");
      test.setKB("GenericsKB.txt");
      
      System.out.println(test.searchTerm("criminologist"));
      System.out.println(test.searchConfidenceLvl("frat house", "A frat house is a house"));
      System.out.println(test.updateTerm("soccer player", "I am Cristiano Ronaldo  SUIIIIIIIIIIIII", "1"));
      System.out.println(test.searchTerm("soccer player"));
   }
}