package genericandreflection.generic;

public class Generic<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.setContent("Vu Hoang Anh");
        System.out.println(stringGeneric.getContent());

        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setContent(22);
        System.out.println(integerGeneric.getContent());
    }
}
