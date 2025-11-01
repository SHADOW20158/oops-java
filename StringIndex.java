public class StringMethodsDemo {
    public static void main(String[] args) {
        String s = "Programming";

        // Find the first occurrence of 'g'
        int firstG = s.indexOf('g');
        System.out.println("First occurrence of 'g': " + firstG);

        // Find the last occurrence of 'g'
        int lastG = s.lastIndexOf('g');
        System.out.println("Last occurrence of 'g': " + lastG);

        // Check if the string contains "gram"
        boolean containsGram = s.contains("gram");
        System.out.println("Contains 'gram': " + containsGram);
    }
}
