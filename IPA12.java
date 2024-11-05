


// // Create class Movie with below attributes: 

// // movieName - String 
// // company - String 
// // genre - String 
// // budget - int

// // Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
// // take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
// // objects where the searchGenre String matches with the original array of Movie object's genre attribute 
// // (case insensitive search).

// // Write necessary getters and setters.

// // Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
// // attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
// // logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
// // print "Low Budget Movie".

// // Input
// // ---------
// // aaa
// // Marvel
// // Action
// // 250000000
// // bbb
// // Marvel
// // Comedy
// // 25000000
// // ccc
// // Marvel
// // Comedy
// // 2000000
// // ddd
// // Marvel
// // Action
// // 300000000
// // Action

// // Output
// // -------------------
// // High Budget Movie
// // High Budget Movie
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// class Movie {
//     private String movieName;
//     private String company;
//     private String genre;
//     private int budget;

//     // Constructor
//     public Movie(String movieName, String company, String genre, int budget) {
//         this.movieName = movieName;
//         this.company = company;
//         this.genre = genre;
//         this.budget = budget;
//     }

//     // Getters
//     public String getMovieName() {
//         return movieName;
//     }

//     public String getCompany() {
//         return company;
//     }

//     public String getGenre() {
//         return genre;
//     }

//     public int getBudget() {
//         return budget;
//     }

//     // Setters
//     public void setMovieName(String movieName) {
//         this.movieName = movieName;
//     }

//     public void setCompany(String company) {
//         this.company = company;
//     }

//     public void setGenre(String genre) {
//         this.genre = genre;
//     }

//     public void setBudget(int budget) {
//         this.budget = budget;
//     }
// }

// class Solution {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Movie[] movies = new Movie[4];

//         // Reading 4 Movie objects
//         for (int i = 0; i < 4; i++) {
//             System.out.println("Enter details for Movie " + (i + 1) + ":");
//             String movieName = scanner.nextLine();
//             String company = scanner.nextLine();
//             String genre = scanner.nextLine();
//             int budget = Integer.parseInt(scanner.nextLine());

//             movies[i] = new Movie(movieName, company, genre, budget);
//         }

//         // Reading search genre
//         System.out.println("Enter search genre:");
//         String searchGenre = scanner.nextLine();

//         // Get movies by genre
//         List<Movie> filteredMovies = getMovieByGenre(movies, searchGenre);

//         // Print budget status for filtered movies
//         for (Movie movie : filteredMovies) {
//             if (movie.getBudget() > 80000000) {
//                 System.out.println("High Budget Movie");
//             } else {
//                 System.out.println("Low Budget Movie");
//             }
//         }

//         scanner.close();
//     }

//     public static List<Movie> getMovieByGenre(Movie[] movies, String searchGenre) {
//         List<Movie> matchingMovies = new ArrayList<>();

//         for (Movie movie : movies) {
//             if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
//                 matchingMovies.add(movie);
//             }
//         }

//         return matchingMovies;
//     }
// }

 

    