package fourteen_polymorphism;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Now implementing Abstraction -> Student
        Personable student = new Student();
        student.setPersonDetails();;
        student.displayPersonDetails();

        ((Payables)student).calculatePayment();
        student.achievementStatus();

        // Now implementing Abstraction -> Trainer
        Personable trainer = new Trainer();
        trainer.setPersonDetails();
        trainer.displayPersonDetails();
        ((Payables)trainer).calculatePayment();

    }
}