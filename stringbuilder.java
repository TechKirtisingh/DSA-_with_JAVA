////4. String builder : is a mutable sequence of characters. (can be changed)
///   append(): add text at the end
/// insert(): add text at given index :: example: sb.insert(4,"Java") : add "Java" at index 4
///  replace(): replace text from start index to end index with given text
///  delete(): remove text from start index to end index
///  reverse(): reverse the sequence of characters ::=> sb.reverse()

public class stringbuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        //1.append
        sb.append(" World");
        System.out.println("after append: " + sb); // after append: Hello World

        //2.insert
        sb.insert(5, " Java");
        System.out.println("after insert: " + sb); // after insert: Hello Java World

        //3. delete
        sb.delete(1, 4);
        System.out.println("after delete: " + sb); // after delete: H Java World

        //4.reverse
        sb.reverse();
        System.out.println("after reverse: " + sb); // after reverse: dlroW avaJ H
    }
    
}
