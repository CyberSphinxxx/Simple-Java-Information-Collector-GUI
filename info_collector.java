import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class info_collector {
    public static void main(String[] args) {
        
        ImageIcon originalIcon = new ImageIcon("information_icon.png");
        Image resizedImage     = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon icon         = new ImageIcon(resizedImage);

        String ID_Number = JOptionPane.showInputDialog(null, "Enter ID Number:", "User Information", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        String name      = JOptionPane.showInputDialog(null, "Enter Full Name:", "User Information", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString();
        int age          = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Age:", "User Information", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString());
        double height    = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Height in Centimeters:", "User Information", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString());
        double weight    = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Weight in Kilograms:", "User Information", JOptionPane.PLAIN_MESSAGE, icon, null, "").toString());

        String message   = String.format("Summary of your information:\nID Number: %s\nName: %s\nAge: %d\nHeight: %.2f cm\nWeight: %.2f kg", 
                                        ID_Number, name, age, height, weight);

        JOptionPane.showMessageDialog(null, message, "Summary", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
