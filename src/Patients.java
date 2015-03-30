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
    public patient getPatientWithName(String name){
        for(patient patient:records)
        {
            if(patient.getName().equals(name)){
                return patient;
            }

        }
        return null;
        }
    public void removePatientWithName(String name){
        for(int i=0;i<records.size();++i)
        {
            if(records.get(i).getName().equals(name))
            {
                records.remove(i);
                --i;
            }
        }
    }
    }
