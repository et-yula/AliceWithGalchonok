package Classes;

public class AppleTree extends Tree {
    private Apple apple;
    public AppleTree(String sort){
        super(sort);
    }
    public void growApple(Apple apple){
        this.apple=apple;
        System.out.println("На "+this.sort.substring(0,this.sort.length()-2)+"ой яблоне созрело "+apple.toString());
    }
    @Override
    public String toString(){
        return this.sort+" яблоня";
    }
}