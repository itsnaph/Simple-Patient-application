public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCon, boolean isEmpty) {
        super(name, medicalCon);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Stomach is full");
        }
    }

    public void Digest(){
        System.out.println("Digesting begin");
    }

    public boolean isEmpty() {
        return isEmpty;
    }


}
