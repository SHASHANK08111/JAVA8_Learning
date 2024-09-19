package Java8;
import java.util.ArrayList;
import java.util.Collections;

class ComparableMain
	{
		public static void main(String[] args)
		{
			ArrayList<ComparableMovie> list = new ArrayList<ComparableMovie>();
			list.add(new ComparableMovie("Force Awakens", 8.3, 2015));
			list.add(new ComparableMovie("Star Wars", 8.7, 1977));
			list.add(new ComparableMovie("Empire Strikes Back", 8.8, 1980));
			list.add(new ComparableMovie("Return of the Jedi", 8.4, 1983));

			Collections.sort(list);

			System.out.println("Movies after sorting : ");
			for (ComparableMovie movie: list)
			{
				System.out.println(movie.getName() + " " +
								movie.getRating() + " " +
								movie.getYear());
			}
		}
	

}