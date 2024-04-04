package string;

public class StringBuilderBuffer {
    public static void main(String[] args) {
//        //Hashcode
//        String str = "java";
//        System.out.println(str.hashCode());
//        str += "string in java";
//        System.out.println(str.hashCode());
//        StringBuilder strBuild = new StringBuilder("Java");
//        System.out.println(strBuild.hashCode());
//        strBuild.append("string in java");
//        System.out.println(strBuild.hashCode());
//        //Speed: String Builder > String Buffer > String
//        //String is immutable and String Builder, String Buffer is mutable
//        StringBuilder sb = new StringBuilder();
//        sb.append("Append this to sb");
//        sb.insert(0, "Insert");
//        sb.delete(6,12);
//        sb.reverse();
//        System.out.println(sb.capacity());
//        System.out.println(sb);
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("Hello Lily");
//        stringBuffer.replace(1, 3, "Java");
//        stringBuffer.reverse();
//        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer);

        //String Buffer in multi-thread
        //Use StringBuilder in multi-thread => Unexpected result
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = sb.toString();
        System.out.println("Final result length: " + result.length());
        System.out.println("Final result: " + result);
    }
}
