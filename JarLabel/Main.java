package JarLabel;

public class Main {
    //      19  JarLabel
//    • Fields: String name; int count
//    • Methods: String label() e.g., "Gumdrops: 12"; void rename(String n)
//    • Main: rename and print label.
    public static void main(String[] args) {

        JarLabel jl = new JarLabel();
        jl.name = "sour";
        jl.count = 3;
        System.out.println(jl.label());
        jl.rename("Candy");
        System.out.println(jl.label());

    }
}
