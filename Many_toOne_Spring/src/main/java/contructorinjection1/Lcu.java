package contructorinjection1;

public class Lcu {
private String hero;
private String heroine;
private String villain;
private String director;


 Lcu(String hero, String heroine, String villain, String director) {
	this.hero = hero;
	this.heroine = heroine;
	this.villain = villain;
	this.director = director;
}


@Override
public String toString() {
	return "Lcu [hero=" + hero + ", heroine=" + heroine + ", villain=" + villain + ", director=" + director + "]";
}




}
