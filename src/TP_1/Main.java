package TP_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StorageGenerique<String> ele_1 = new StorageGenerique<>();
        StorageGenerique<Double> ele_2 = new StorageGenerique<>();

        ele_1.addElement("zakaria");
        ele_1.addElement("Yahya");
        ele_1.addElement("Adil");
        ele_2.addElement(12.1);
        ele_2.addElement(10.0);
        ele_2.addElement(19.5);

        System.out.println(ele_1.getElements());
        System.out.println(ele_1.getSize());
        System.out.println(ele_1.getElement(1));
        System.out.println(ele_1.removeElement(1));
        System.out.println(ele_1.getElements());
        System.out.println("______________________");
        System.out.println(ele_2.getElements());
        System.out.println(ele_2.getSize());
        System.out.println(ele_2.getElement(1));
        System.out.println(ele_2.addElement(11.9));
        System.out.println(ele_2.getElements());
    }
}