import java.util.List;

public class Person extends User {
	
	private String biography;
	private String birthPlace;
	private List<Movie> movieFilmography;
	private List<Series> seriesFilmography;
	private List<String> photos;

	public Person() {
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<Movie> getMovieFilmography() {
		return movieFilmography;
	}

	public void setMovieFilmography(List<Movie> movieFilmography) {
		this.movieFilmography = movieFilmography;
	}

	public List<Series> getSeriesFilmography() {
		return seriesFilmography;
	}

	public void setSeriesFilmography(List<Series> seriesFilmography) {
		this.seriesFilmography = seriesFilmography;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

}
