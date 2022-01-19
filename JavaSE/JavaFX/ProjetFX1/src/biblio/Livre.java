package biblio;

public class Livre {

	private int id;
	private String title;
	private String Author;
	private int year;
	private int pages;
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livre(int id, String title, String author, int year, int pages) {
		super();
		this.id = id;
		this.title = title;
		Author = author;
		this.year = year;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	
}