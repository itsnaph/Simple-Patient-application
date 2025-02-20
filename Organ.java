public class Organ {
    private String name;
    private String medicalCon;

    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+this.getMedicalCon());
    }

    public Organ(String name, String medicalCon){
        this.name=name;
        this.medicalCon=medicalCon;
    }
    public String getName(){
        return name;
    }

    public String getMedicalCon(){
        return medicalCon;
    }


}
