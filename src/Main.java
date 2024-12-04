public class Main {
    public static void main(String[] args) {

Zoo zoo = new Zoo();

zoo.addAnimal1();
zoo.addAnimal2();
zoo.addAnimal3();
zoo.addAnimal4();

Staff staff1 = new Staff("George", "Zookeeper");
Staff staff2 = new Staff("Jack", "Aquarium keeper");
Staff staff3 = new Staff("Lila", "Specialiast");
Staff staff4 = new Staff("Mia", "Veterinarian");

staff1.assignStaff(zoo.a1.habitat);
staff2.assignStaff(zoo.a2.habitat);
staff3.assignStaff(zoo.a3.habitat);
staff4.assignStaff(zoo.a4.habitat);

zoo.eat("meat",staff1, zoo.a1);
zoo.eat("fish", staff2, zoo.a2);
zoo.eat("seeds", staff3, zoo.a3);
zoo.eat("steak",staff4, zoo.a4);

    }
}


class Animals{
    String name;
    String species;
    int age;
    Habitat habitat;


    public Animals(String name, String species, int age, Habitat habitat){
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }


}


class Habitat{
    String type;
    double size;
    double temperature;


    public Habitat(String type, double size, double temperature){
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }


}


class Zoo{
    Animals a1;
    Animals a2;
    Animals a3;
    Animals a4;


    void addAnimal1() {
        a1 = new Animals("Tobby", "Tiger", 5, new Habitat("Savannah", 20, 25));
    }


    void addAnimal2(){
        a2 = new Animals("Sally", "Shark", 7, new Habitat("Aquarium", 15, 18) );
    }


    void addAnimal3(){
        a3 = new Animals("Olly", "Owl", 3, new Habitat("Forest", 30, 20));


    }


    void addAnimal4(){
        a4 = new Animals("Lisho", "Leopard", 10, new Habitat("Jungle", 40, 28));


    }



    public void eat(String food, Staff staff, Animals animal){

        System.out.println(animal + " is being fed by" + staff);
    }


}


class Staff{


    String staffName;
    String role;
    Habitat habitat;


    public Staff(String staffName, String role){
        this.staffName = staffName;
        this.role = role;


    }


    void assignStaff(Habitat assignedHabitat){
        this.habitat = assignedHabitat;
    }


}


