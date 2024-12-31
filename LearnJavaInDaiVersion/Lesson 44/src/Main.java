package lesson44;
//import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      //Mother mother = new Mother();
      //mother.familyName="Pu";
      //mother.printAge(25);
      //System.out.println(mother.familyName);

      Mother son = new Son();
      Son son1 = (Son) son;
      son1.printHouseAddress();




    }
}
