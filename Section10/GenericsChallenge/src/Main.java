public class Main {
    public static void main(String[] args) {
        League<Team<Football>> nfl = new League<>("National Football League");
        League<Team<Baseball>> mlb = new League<>("Major League Baseball");

        Team<Football> newEnglandPatriots = new Team<>("New England Patriots");
        Team<Football> dallasCowboys = new Team<>("Dallas Cowboys");
        Team<Football> philadelphiaEagles = new Team<>("Philadelphia Eagles");
        Team<Football> kansasCityChiefs = new Team<>("Kansas City Chiefs");

        Team<Baseball> newYorkYankees = new Team<>("New York Yankees");
        Team<Baseball> philadelphiaPhillies = new Team<>("Philadelphia Phillies");
        Team<Baseball> chicagoCubs = new Team<>("Chicago Cubs");
        Team<Baseball> losAngelesDodgers = new Team<>("Los Angeles Dodgers");

        System.out.println("Premier League:");


        System.out.println();
        System.out.println();
        System.out.println("National Football League:");


        newEnglandPatriots.matchResult(dallasCowboys, 41, 26);
        newEnglandPatriots.matchResult(philadelphiaEagles, 37, 31);
        dallasCowboys.matchResult(newEnglandPatriots, 10, 20);
        dallasCowboys.matchResult(philadelphiaEagles, 39, 35);
        philadelphiaEagles.matchResult(newEnglandPatriots, 38, 7);
        philadelphiaEagles.matchResult(dallasCowboys, 18, 24);
        System.out.println();
        nfl.showLeagueTable();
        System.out.println();
        System.out.println("Major League Baseball:");

        newYorkYankees.matchResult(philadelphiaPhillies, 8, 15);
        newYorkYankees.matchResult(chicagoCubs, 4, 4);
        newYorkYankees.matchResult(losAngelesDodgers, 3, 6);
        philadelphiaPhillies.matchResult(newYorkYankees, 4, 3);
        philadelphiaPhillies.matchResult(chicagoCubs, 9, 5);
        philadelphiaPhillies.matchResult(losAngelesDodgers, 4, 7);
        chicagoCubs.matchResult(newYorkYankees, 3, 9);
        chicagoCubs.matchResult(philadelphiaPhillies, 8, 0);
        chicagoCubs.matchResult(losAngelesDodgers, 1, 9);
        losAngelesDodgers.matchResult(newYorkYankees, 2, 5);
        losAngelesDodgers.matchResult(chicagoCubs, 3, 3);
        losAngelesDodgers.matchResult(philadelphiaPhillies, 7, 2);

        System.out.println();
        mlb.showLeagueTable();
    }
}
