import javax.swing.*;

public class App {
    public static void main(String[] args){
        EmployeeAddForm empAddForm = new EmployeeAddForm();
        JFrame frame = new JFrame("EmploeeFormTest");
        frame.setContentPane(empAddForm.getEmployeeAddPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
