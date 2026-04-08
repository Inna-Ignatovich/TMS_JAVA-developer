package Clinic;

/**
 * @author Inna Ignatovich
 * @Date 31.03.2026
 */
public class Therapist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Терапевт назначает лечение и выписывает лекарства");
    }

    public void assignDoctor(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Stomatologist());
                break;
            default:
                patient.setDoctor(this);
                break;
        }
    }

    @Override
    public String toString() {
        return "Терапевт";
    }
}
