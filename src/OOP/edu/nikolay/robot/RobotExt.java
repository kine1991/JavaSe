package OOP.edu.nikolay.robot;


import OOP.edu.nikolay.robot.Robot;

// Для того, чтобы унаследоваться нужно просто написать слово
// extends и имя класса, от которого нам надо унаследоваться
public class RobotExt extends Robot
{

    public RobotExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}
