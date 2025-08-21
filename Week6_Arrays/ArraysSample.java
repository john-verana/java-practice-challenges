public class ArraysSample {

    public static void main(String[] args) {
        
        String[] movies = {"Batman", "Superman", "The flash", "Joker", "Spiderman"}; 
        
        System.out.print("First Movie: " + movies[0]); 
        System.out.println();
        
        for (int i = 0; i < movies.length; i++) { 
            System.out.println(movies[i]); 
        }
        
        for (String movie : movies) {
            System.out.println(movie);
        }

    }

}
