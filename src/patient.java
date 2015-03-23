

public class patient {
   private String name;
    private int age;
    private double height, weight;

    public patient(String name,int age,double height,double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDetails(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        return weight / Math.pow(height, 2);
    }


}

