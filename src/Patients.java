import java.util.ArrayList;

public class Patients {

    ArrayList<patient> records;

    public Patients() {
        records = new ArrayList<patient>();
    }

    public int count() {
        return records.size();
    }

    public void add(patient patient) {

        records.add(patient);
    }

    public patient get(int i) {
        return records.get(i);
    }


    public boolean isEmpty() {
        return records.isEmpty();
    }
}