package ObjectsInList;

public class Animal {
    private String name;
    private String cow;

    public Animal (String name, String cow) {
        this.name = name;
        this.cow = cow;
    }
    public String getName () {
        return name;
    }
    public String getCow() {
        return cow;
    }
    public String toString (){
        if (this.cow.equals("no")){
            return this.name + " is a cow = " +  "false";
        } else{
            return this.name + " is a cow = " +  "true";
        }
    }



}
