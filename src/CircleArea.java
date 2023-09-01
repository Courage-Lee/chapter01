/**
 * 1. @ClassName circleArea
 * 2. @Description TODO 定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2、2.5、6，求它们的面积。
 * 3. @Author lkq
 * 4. @Date 2023/8/31 20:27
 * 5. @Version 1.0
 */
public class CircleArea {
    public static void main(String[] args) {
        double pi = 3.14;
        float r1 = 1.2f;
        float r2 = 2.5f;
        float r3 = 6;

        System.out.println("Area of Circle 1: " + pi * r1 * r1);
        System.out.println("Area of Circle 2: " + pi * r2 * r2);
        System.out.println("Area of Circle 3: " + pi * r3 * r3);

    }
}
