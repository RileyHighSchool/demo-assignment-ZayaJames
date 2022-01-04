public class Concatenator {
    public static void main(String[] args) 
    {
    // Declares the literal strings
    String space = "Astronaut";
    String engineer = "Engineer";
    
    // Declares the substrings of the string space
    String spacePart1 = space.substring(0,5);
    String spacePart2 = space.substring(5,9);  

    // Declares the substrings of the string engineer
    String engineerPart1 = engineer.substring(0,5);
    String engineerPart2 = engineer.substring(4,8);

    // Concatenates the first substring of space and the last substring of engineer
    System.out.println(spacePart1 + engineerPart2);
    
    // space
    System.out.println(" ");

    // Concatenates the first substring of engineer and last substring of space
    System.out.println(engineerPart1 + spacePart2);
    
    }
}
