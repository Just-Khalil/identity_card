package Khalils;

import jdk.swing.interop.LightweightFrameWrapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    protected JLabel surname;
    protected JTextField surnameF;

    protected JLabel name;
    protected JTextField nameF;

    protected JLabel father_name;
    protected JTextField father_nameF;

    protected JRadioButton male;
    protected JRadioButton female;

    protected JLabel nationality;
    protected JTextField nationalityF;

    protected JLabel age;
    protected JTextField ageF;

    protected JLabel card_number;
    protected JTextField card_numberF;

    protected JLabel personal_number;
    protected JTextField personal_numberF;

    protected JCheckBox agreement;
    protected JButton send_button;

    public ContactForm() {
        super("Контактная Информация");
        super.setBounds(300, 300, 600, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container box = super.getContentPane();
        box.setLayout(new GridLayout(9, 2, 5, 5));

        surname = new JLabel("Enter surname: ");
        surnameF = new JTextField("", 1);

        name = new JLabel("Enter name: ");
        nameF = new JTextField("", 1);

        father_name = new JLabel("Enter father's name: ");
        father_nameF = new JTextField("", 1);

        male = new JRadioButton("Male", true);
        female = new JRadioButton("Female");

        nationality = new JLabel("Enter your nationality: ");
        nationalityF = new JTextField("", 1);

        age = new JLabel("Enter your age: ");
        ageF = new JTextField(" y.o.", 1);

        card_number = new JLabel("Enter card number:");
        card_numberF = new JTextField("AA", 1);

        personal_number = new JLabel("Enter personal number: ");
        personal_numberF = new JTextField("", 1);

        agreement = new JCheckBox("I accept rules");
        send_button = new JButton("SEND");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        box.add(surname);
        box.add(surnameF);

        box.add(name);
        box.add(nameF);

        box.add(father_name);
        box.add(father_nameF);

        box.add(male);
        box.add(female);

        box.add(nationality);
        box.add(nationalityF);

        box.add(age);
        box.add(ageF);

        box.add(card_number);
        box.add(card_numberF);

        box.add(personal_number);
        box.add(personal_numberF);

        box.add(agreement);
        box.add(send_button);

        send_button.addActionListener(new ButtonManager());
    }

    class ButtonManager implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String surname = surnameF.getText();
            String name = nameF.getText();
            String father_name = father_nameF.getText();

            String isMale = "Male";
            if (!male.isSelected()) isMale = "Female";

            String nationality = nationalityF.getText();
            String age = ageF.getText();
            String cardNO = card_numberF.getText();
            String personalNO = personal_numberF.getText();

            String isAgree;
            if (!agreement.isSelected()) isAgree = "The rules were rejected❌";
            else isAgree = "The rules were accepted✅";



            JOptionPane.showMessageDialog(null,  "Surname: " + surname
                    + "\n" + "Name: " + name
                    + "\n" + "Father: " + father_name
                    + "\n" + "Sex: " + isMale
                    + "\n" + "Nationality: " + nationality
                    + "\n" + "Age: " + age
                    + "\n" + "Card №: " + cardNO
                    + "\n" + "Personal №: " + personalNO
                    + "\n" + "Agreement: " + isAgree, "Your identification card", JOptionPane.PLAIN_MESSAGE);
        }
    }

}