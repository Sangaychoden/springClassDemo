
package bt.edu.gcit;

public class Alien {

    private int age;
    private Laptop lap;
    private int salary;
    private Computer comp;
    

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        System.out.println("set alien called");
        this.age = age;
    }

    // public Alien(int age, Laptop lap, int salary){
    //     System.out.println("Alien Obj created");
    //     // System.out.println(salary);

    //     this.age= age;
    //     this.lap = lap;
    //     this.salary = salary;

    // }

    public Alien(){
 System.out.println("Alien object craeted");
    }
     // public Laptop getLap(){
    //     return lap;
    // }

    // public void setLap(Laptop lap){
    //     System.out.println("from setlap");
    //     this.lap = lap;
    // }
    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Computer getComp(){
        return comp;
    }
    public void code(){
        System.out.println("I am coding");
        // lap.compile();
        comp.compile();

    }
}