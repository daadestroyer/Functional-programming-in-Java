import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Movie{
	
	String name;
	String hero;
	String heroine;
	
	public Movie(String name,String hero,String heroine) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	
	
}
public class App02_DisplayMovieInformation {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Brahmastra", "Ranbeer", "Alida"),
				new Movie("3Idiots", "Amir","Kareena"),
				new Movie("Krrish","Hritik","Priyanka")
				);
		
		
		Consumer<Movie> c1 = m->{
			System.out.println(m.name+":"+m.hero+":"+m.heroine);
		};
		
		for (Movie movie : movies) {
			c1.accept(movie);
		}
	}
}
