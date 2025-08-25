package JarLabel;

public class JarLabel {
//     19  JarLabel
//    • Fields: String name; int count
//    • Methods: String label() e.g., "Gumdrops: 12"; void rename(String n)
//    • Main: rename and print label.
    String name;
    int count;

    public String label(){
        return name + ": " + count;
    }

    public void rename(String n){
        name = n;
        System.out.println("New name is " + name);
    }

}
