import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        System.out.println("BMI Manager");

        Patients patients = new Patients();
        running:
        while (true) {
            System.out.println("Please select from the " +
                    "following menu options:\n" +
                    "\t1. Add new patient\n" +
                    "\t2. View patient\n" +
                    "\t3. update patient"+
                    "\t4. Exit\n");

            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {

                        patients.add(createpatient(scanner));
                        break;

                }
                case 2: {
                    if (patients.isEmpty() == true) {
                        System.out.println("database is empty");
                    } else {
                        viewpatients(patients);
                    }

                    break;
                }
                case 3:{
                    updatepatient( patients, scanner);
                    break;
                }
                case 4:{
                    removePatient( patients, scanner);
                    break;
                }
                case 5: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }
    }

    private static void viewpatients(Patients patients) {
        for (int i = 0; i < patients.count(); i++) {
            patient pat = patients.get(i);

            String message = String.format("Name: %s Age: %d BMI: %.2f",
                    pat.getName(), pat.getAge(), pat.getBMI());
            System.out.println(message);
        }
    }

    private static void removePatient(Patients patients,Scanner scanner) {

        System.out.println("enter name");
        String name=scanner.nextLine();
        patients.removePatientWithName(name);
    }
    private static patient createpatient( Scanner scanner) {
        System.out.print("Enter name: ");
        String name=scanner.nextLine();

        System.out.print("Enter age: ");
        int age=scanner.nextInt();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        return new patient(name,age,height,weight);
    }
private static void updatepatient(Patients patients,Scanner scanner){
    System.out.println("enter name");
    String name=scanner.nextLine();

    patient patient=patients.getPatientWithName(name);
    if (patient != null){


        System.out.print("Enter new age: ");
        int age=scanner.nextInt();

        System.out.print("Enter new height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter new weight: ");
        double weight = scanner.nextDouble();

        patient.setAge(age);
        patient.setheight(height);
        patient.setweight(weight);


    }

    else {
        System.out.println("no patient exist with this name" + name);
    }


            }
        }

