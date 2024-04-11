package genericandreflection.flection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    private String string;

    public Reflection() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString(){
        return "This string is: " + string;
    }

    public static void main(String[] args) throws Exception {
        //Get attribute
//        Reflection reflection = new Reflection();
//        reflection.setString("Vũ Hoàng Anh");
//
//        //Get field "string" (cannot find => NoSuchFieldException)
//        Field field = reflection.getClass().getDeclaredField("string");
//        //Allow to access string attribute
//        field.setAccessible(true);
//
//        field.set(reflection, "Reflection");
//        System.out.println(reflection);

        //Get method
        Class<Reflection> reflectionClass = Reflection.class;

        Method method = reflectionClass.getMethod("setString", String.class);

        Reflection reflection = new Reflection();

        method.invoke(reflection, "Vũ Hoàng Anh");
        System.out.println(reflection);

    }
}
