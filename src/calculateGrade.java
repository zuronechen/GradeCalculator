import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Created by zurone on 6/13/17.
 */
public class calculateGrade extends JFrame {
    double homeworkWeight;
    double homeworkGrade;

    double quizzesWeight;
    double quizzesGrade;

    double midtermOneWeight;
    double midtermOneGrade;

    double midtermTwoWeight;
    double midtermTwoGrade;

    double finalExamWeight;
    double finalExamGrade;

    Scanner input = new Scanner(System.in);

    JTextField homeworkWeightTextfield;
    JTextField homeworkActualTextfield;

    JTextField quizzesWeightTextfield;
    JTextField quizzesActualTextfield;

    JTextField midtermOneWeightTextfield;
    JTextField midtermOneActualTextfield;

    JTextField midtermTwoWeightTextfield;
    JTextField midtermTwoActualTextfield;

    JTextField finalExamWeightTextfield;
    JTextField finalExamActualTextfield;


    JButton calcButton;

    calculateGrade() {
        super("Calculate Grade");
        setLayout(new GridLayout(0, 2));

        createButtons();

    }

    private void createButtons() {
        homeworkWeightTextfield = new JTextField(3);
        add(homeworkWeightTextfield);

        homeworkActualTextfield = new JTextField(3);
        add(homeworkActualTextfield);

        quizzesWeightTextfield = new JTextField(3);
        add(quizzesWeightTextfield);

        quizzesActualTextfield = new JTextField(3);
        add(quizzesActualTextfield);

        midtermOneWeightTextfield = new JTextField(3);
        add(midtermOneWeightTextfield);

        midtermOneActualTextfield = new JTextField(3);
        add(midtermOneActualTextfield);

        midtermTwoWeightTextfield = new JTextField(3);
        add(midtermTwoWeightTextfield);

        midtermTwoActualTextfield = new JTextField(3);
        add(midtermTwoActualTextfield);

        finalExamWeightTextfield = new JTextField(3);
        add(finalExamWeightTextfield);

        add(finalExamActualTextfield = new JTextField(3));


        calcButton = new JButton("Calculate final grade");
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double finalgrade = getFinalGrade();
                JOptionPane.showMessageDialog(null,"Your final grade is: " + finalgrade);
            }
        });

        add(calcButton);

    }

    public double getFinalGrade() {
        return (gethomeworkGrade() + getquizzesGrade() + getmidtermOneGrade() + getmidtermTwoGrade() + getfinalExamGrade());
    }

    public double gethomeworkGrade() {

        homeworkWeight = Double.parseDouble(homeworkWeightTextfield.getText());
        homeworkGrade = Double.parseDouble(homeworkActualTextfield.getText());

        return (homeworkGrade * homeworkWeight);
    }

    public double getquizzesGrade() {

        quizzesWeight = Double.parseDouble(quizzesWeightTextfield.getText());
        quizzesGrade = Double.parseDouble(quizzesActualTextfield.getText());

        return (quizzesGrade * quizzesWeight);
    }

    public double getmidtermOneGrade() {

        midtermOneWeight = Double.parseDouble(midtermOneWeightTextfield.getText());
        midtermOneGrade = Double.parseDouble(midtermOneActualTextfield.getText());

        return (midtermOneGrade * midtermOneWeight);
    }

    public double getmidtermTwoGrade() {

        midtermTwoWeight = Double.parseDouble(midtermTwoWeightTextfield.getText());
        midtermTwoGrade = Double.parseDouble(midtermTwoActualTextfield.getText());

        return (midtermTwoGrade * midtermTwoWeight);
    }

    public double getfinalExamGrade() {

        finalExamWeight = Double.parseDouble(finalExamWeightTextfield.getText());
        finalExamGrade = Double.parseDouble(finalExamActualTextfield.getText());

        return (finalExamGrade * finalExamWeight);
    }

//    public class eventhandler implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            String string = "";
//
//            if (event.actionPerformed(actionEvent) == calcButton) {
//                getFinalGrade();
//            }
//        }
//    }
}