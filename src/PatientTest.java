 class Patient{
    int patientid;
    String name;
    int age;
    String disease;
    double billAmount;

public Patient(int patientid, String name,int age,String disease,double billAmount){
this.patientid=patientid;
this.name=name;
this.age=age;
this.disease=disease;
this.billAmount=billAmount;
    }
public void addBill(double amount){
   
billAmount= billAmount+amount;
System.out.println("Total"+billAmount);
}
public int getPatientId(){
    return patientid;
}
public String getName(){
    return name;
}
public double getBillAmount(){
    return billAmount;
}
@Override
public String toString(){
    return "getPatientId "+patientid+"name "+name+"Billamount "+billAmount;
}
}

public class PatientTest{
    public static void main(String[] args) {
        
    Patient patient1=new Patient(101,"Anu",22,"fever",5000.0);
     Patient patient2=new Patient(102,"Manoj",22,"fracture",5000.0);
   System.out.println("patient 1"+patient1);
      System.out.println("patient 2"+patient2);

patient1.addBill(1500);
System.out.println("bill");


}
}