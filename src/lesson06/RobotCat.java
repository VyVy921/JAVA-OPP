package lesson06;

public class RobotCat {

    private String name;
    private String year;

//    public RobotCat() {
//    }

    public RobotCat(String name, String year) {
        this.name = name;
    }

    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void greeting(){
    System.out.println("Hello " .concat(this.name));
}


    //    public RobotCat(String name) {
//        System.out.println("Hello my name is ".concat(this.name));
//        System.out.println("Hello!!!");
//    }


    /*Constructor Overloading: public RobotCat(String name)
     * */
//    public RobotCat(String name) {
//        System.out.println("Hello my name is ".concat(name));
//    }



}
