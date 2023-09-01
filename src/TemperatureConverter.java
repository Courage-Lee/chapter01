/**
 * 1. @ClassName TemperatureConverter
 * 2. @Description TODO 小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
 * TODO 它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
 * TODO ℃ = (℉ - 32) / 1.8
 * 3. @Author lkq
 * 4. @Date 2023/8/31 20:37
 * 5. @Version 1.0
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 80;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in fahrenheit: 80°F = " + celsius + "°C");
        System.out.println("Temperature in celsius: 26.66666666666°C = " + celsiusToFahrenheit(26.66666666666) + "°F");
    }

    // todo 华式温度转化为摄氏度
    public  static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }

    // todo 摄氏度转化为华式温度
    public static  double celsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }
}
