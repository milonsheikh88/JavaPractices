package stringVsStringBuilder;

public class StringStringBuilder {
    public static void main(String[] args) {

        /** object is not modified.*/
        String string = "Hello";
        string.concat(" World");
        System.out.println("string====>>> " + string);

        /** object is modified by allocated to new memory */
        string = string.concat(" World");
        System.out.println("string====>>> " + string);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append("World");
        System.out.println("stringBuilder====>>> " + stringBuilder);
    }
}
