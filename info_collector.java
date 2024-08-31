import javax.swing.JOptionPane;

public class info_collector {
    public static void main(String[] args) {
        
        String ID_Number = JOptionPane.showInputDialog("Enter ID Number: ");

        String name = JOptionPane.showInputDialog("Enter Full Name: ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height in Centimeters: "));

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight in Kilograms: "));

        String message = String.format("Summary of your information:\nName: %s\nAge: %d\nHeight: %.2f cm\nWeight: %.2f kg", name, age, height, weight);
        JOptionPane.showMessageDialog(null, message);
    }
}
