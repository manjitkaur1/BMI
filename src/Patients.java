
public class Patients {

    patient[] records;
    int current;

    public Patients(int maxSize) {
        records = new patient[maxSize];

    }
    public int count(){
        return current;
    }





    public void add(patient patient) {

        records[current++]=patient;
    }

    public patient get(int i){
        return records[i];
    }

    public boolean isFull() {
        return (current==records.length);
    }
    public boolean isEmpty() {
        return (current==0);
    }
}
