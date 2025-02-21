package ghb.informatik.models;

public class CinemaEvent {
    
    CinemaHall cinemahall;
    Movie movie;
    Seat[][] seats;
    String time;
    int id;

    /*   
        AUFGABE 2
        In der For - Schleife wird der i Wert so wie der k Wert erhöht, solange dieser kleiner ist als die Sitze, wenn die maximale Anzahl an Sitzen für einen Saal erreicht ist, bricht die Schleife ab. Es werden keine neuen Sitze erstellt, da der Status auf false gesetzt wurde.
    */
    public CinemaEvent(int id, Movie movie, CinemaHall cinemahall, String time){
        setCinemahall(cinemahall);
        setMovie(movie);
        setTime(time);
        setId(id);
        setSeats(new Seat[getCinemahall().getCols()][getCinemahall().getRows()]);

        for(int i = 0; i < getSeats().length; i++){
            for(int k = 0; k < getSeats()[i].length; k++){
                getSeats()[i][k] = new Seat(false);
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }
    public void setCinemahall(CinemaHall cinemahall) {
        this.cinemahall = cinemahall;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }
    public CinemaHall getCinemahall() {
        return cinemahall;
    }
    public Movie getMovie() {
        return movie;
    }
    public Seat[][] getSeats() {
        return seats;
    }
}
