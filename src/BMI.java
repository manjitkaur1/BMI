

import java.util.Scanner;

public class BMI {
    public static void main(String args[]) {
        patient patient1=new patient();


        running:while (true)

        System.out.println("BMI manager");
        System.out.println("please select from the" + "following menu options \n" + "\t1. add new patient\n" + "\t2. view patient \n " + "\t3. exit");
        System.out.println("enter choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:{
                break;

            }
            case 2:{
                System.out.println("enter patient deatils:");
                String name=scanner.toString();
                int age=scanner.nextInt();
                int height=scanner.nextInt();
                int wieight=scanner.nextInt();
                patient1.setAge(age);
                patient1.setName(name);
            }
                break;
            }
            case 3: {
                System.out.println("good bye");
                break running;
            }

            private static void addPatient(patient patient1,Scanner scanner){
        System.out.println("enter patient age");

        int age=scanner.nextInt();
        patient1.setAge(age);

        System.out.println("enter patient name");

        String name=scanner.next();
        patient1.setName(name);

        System.out.println("enter patient height");
        double height=scanner.nextDouble();

        System.out.println("enter patient weight");
        double weight=scanner.nextDouble();
        patient1.setDetails(height,weight)


        }


    }
    }

