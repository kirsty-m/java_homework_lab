public class Planet {
    private String name;
    private int size;

    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public String hasExploded(){
//        return "Booooom " + this.name + " has exploded";
        return String.format("Boooooom! %s has exploded.", this.name);
    }

}
