/*
Write an interface called Playable, with a method
void play();
Let this interface be placed in a package called music.

Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string

Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind

Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()
*/

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Ques1{
    public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps;
        pv = new Veena();
        ps = new Saxophone();
        
        v.play();
        s.play();
        
        pv.play();
        ps.play();
    }
}