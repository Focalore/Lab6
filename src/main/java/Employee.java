public class Employee {
    public int age;
    public int ID;
    public String position;

    public Employee (int newAge, int newID, String newPosition){
    age = newAge;
    ID = newID;
    position = newPosition;

    }
    public String toString(){
        return "ID: " + ID + "\n age: " + age + "\n Position: " + position + ".";
    }
    public void birthday(){
        age ++;
    }
    public void gotFired(){
        position = "n/a";
        ID = 0;
    }
    public String work() {
        if (position.equals("n/a")) {
            throw new IllegalWorkerException();
        } else {
            return "The " + position + " worked.";
        }
     }

}
