/*
Create a class Box that uses a parametrized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
*/

class Box{
    int height, weight, depth;
    public Box(int height, int weight, int depth){
        this.height=height;
        this.weight=weight;
        this.depth=depth;
    }
    public int volume(){
        return height*weight*depth;
    }
}
class Ques1{
    public static void main(String[] args){
		Box b1=new Box(4,5,2);
		System.out.println("Vol of Box1: " + b1.volume());
		Box b2=new Box(12,41,25);
		System.out.println("Vol of Box2: " + b2.volume());
    }
}