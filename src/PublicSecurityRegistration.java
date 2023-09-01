/**
 * 1. @ClassName PublicSecurityRegistration
 * 2. @Description TODO 要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
 * 3. @Author lkq
 * 4. @Date 2023/9/1 9:34
 * 5. @Version 1.0
 */
public class PublicSecurityRegistration {
    public static void main(String[] args){
        String name = "张三";
        int age = 18;
        String sex = "男";
        double weight = 60.5;
        boolean isMarried = true;
        String contact = "12345678901";

        System.out.println("姓名:"+name+"\n"+"年龄:"+age+"\n"+"性别:"+sex+"\n"+"体重:"+weight+"\n"+"婚姻状况:"+isMarried+"\n"+"联系方式:"+contact);
    }
}
