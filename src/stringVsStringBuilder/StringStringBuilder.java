package stringVsStringBuilder;

public class StringStringBuilder {
    public static void main(String[] args) {
        String string = "Hello";
        string.concat(" World");
        System.out.println("string====>>> " + string);

        /** object is not modified.*/
        string = string.concat(" World");
        System.out.println("string====>>> " + string);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append("World");
        System.out.println("stringBuilder====>>> " + stringBuilder);
    }
}
