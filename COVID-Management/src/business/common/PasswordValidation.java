package business.common;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//checks valid password
public class PasswordValidation extends InputVerifier{
    
      @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
        String pattern = "^([a-zA-Z+]+[0-9+]+)$";
        
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid Password. Pattern: Character followed by Number", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}
