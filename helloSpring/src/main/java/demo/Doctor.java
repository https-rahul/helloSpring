package demo;

public class Doctor implements Staff{
    public Doctor(String qualification) {
        Qualification = qualification;
    }

    private String Qualification;

    public void assist() {

        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
