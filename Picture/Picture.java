
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall1;
    private Square wall2;
    private Square parapet1;
    private Square parapet2;
    private Square parapet3;
    private Square parapet4;
    private Square window;
    private Square treeTrunk;
    private Square treeTrunk2;
    private Square door;
    private Triangle roof;
    private Triangle treeBottom;
    private Triangle treeMiddle;
    private Triangle treeTop;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall1 = new Square();
        wall1.moveVertical(150);
        wall1.changeSize(175);
        wall1.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(150);
        wall2.changeSize(175);
        wall2.makeVisible();
        wall2.moveHorizontal(175);
        
        parapet1 = new Square();
        parapet1.changeSize(50);
        parapet1.makeVisible();
        parapet1.moveVertical(125);
        
        parapet2 = new Square();
        parapet2.changeSize(50);
        parapet2.makeVisible();
        parapet2.moveVertical(125);
        parapet2.moveHorizontal(100);
        
        parapet3 = new Square();
        parapet3.changeSize(50);
        parapet3.makeVisible();
        parapet3.moveVertical(125);
        parapet3.moveHorizontal(200);

        parapet4 = new Square();
        parapet4.changeSize(50);
        parapet4.makeVisible();
        parapet4.moveVertical(125);
        parapet4.moveHorizontal(300);
        
        door = new Square();
        door.changeColor("black");
        door.changeSize(100);
        door.makeVisible();
        door.moveHorizontal(125);
        door.moveVertical(225);
        
        treeTrunk = new Square();
        treeTrunk.changeColor("black");
        treeTrunk.changeSize(50);
        treeTrunk.moveHorizontal(400);
        treeTrunk.moveVertical(275);
        treeTrunk.makeVisible();
        
        treeTrunk2 = new Square();
        treeTrunk2.changeColor("black");
        treeTrunk2.changeSize(50);
        treeTrunk2.moveHorizontal(400);
        treeTrunk2.moveVertical(225);
        treeTrunk2.makeVisible();    
        
        treeBottom = new Triangle();
        treeBottom.changeColor("green");
        treeBottom.changeSize(50,100);
        treeBottom.moveHorizontal(425);
        treeBottom.moveVertical(275);
        treeBottom.makeVisible();
        
        treeMiddle = new Triangle();
        treeMiddle.changeColor("green");
        treeMiddle.changeSize(50,75);
        treeMiddle.moveHorizontal(425);
        treeMiddle.moveVertical(250);
        treeMiddle.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeColor("green");
        treeTop.changeSize(50,75);
        treeTop.moveHorizontal(425);
        treeTop.moveVertical(225);
        treeTop.makeVisible();
        
        
       

        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
       

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(500);
        sun.moveVertical(100);
        sun.changeSize(600);
        sun.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
