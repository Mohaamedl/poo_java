package learning;
import javax.swing.JOptionPane;
public class guiss {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Your name:");
        JOptionPane.showMessageDialog(null,"hello!\n"+name+".");
        int age = Integer.parseInt(JOptionPane.showInputDialog("your age:")) ;
        JOptionPane.showMessageDialog(null,"you are "+age+" years old.");
        double height = Double.parseDouble(JOptionPane.showInputDialog("your height:")) ;
        JOptionPane.showMessageDialog(null,"your are "+height+" c tall");
    }
    
}
