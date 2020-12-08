//IShape class
package tetris.shapes;

import java.awt.Color;

public class IShape extends Shape
{
    public IShape(int startX, int startY)
    {
        super(startX, startY);
        bricks[1] = new Brick(startX+1, startY);
        bricks[2] = new Brick(startX+2, startY);
        bricks[3] = new Brick(startX+3, startY);
        c1 = colors[1];
    }

    //  |_|
    //  |_|
    //  |_|
    //  |_|

}
