package aula6;

public class Testeperson_student {
   
    public static void main(String[] args) {
    Student st = new Student ("Andreia Melo", 9855678,
    new Date(18, 7, 1990), new Date(1, 9, 2018));
    Scholarship_Holder bls = new Scholarship_Holder ("Igor Santos", 8976543, new Date(11, 5, 1985), 900);
    bls.setMonthlyAmount(1050);
       
    System.out.println("Student: " + st.getName());
    System.out.println(st);

       
    System.out.println("Scholarship_Holder: " + bls.getName() + ", NMec: "
    + bls.getNMec() + ", monthkyAmount: " + bls.getMonthlyAmount());
    System.out.println(bls);
    }

}
