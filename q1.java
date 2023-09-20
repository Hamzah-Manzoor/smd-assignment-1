class Cricketer {
    private String name;
    private int age;
    private String nationality;

    public Cricketer(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }
}

class Batsman extends Cricketer {
    private int score;
    private int batsmanRanking;

    public Batsman(String name, int age, String nationality, int score, int batsmanRanking) {
        super(name, age, nationality);
        this.score = score;
        this.batsmanRanking = batsmanRanking;
    }

    public void print() {
        super.print();
        System.out.println("Score: " + score);
        System.out.println("Batsman Ranking: " + batsmanRanking);
    }

    public int getRanking() {
        return batsmanRanking;
    }
}

class Bowler extends Cricketer {
    private int wickets;
    private int bowlerRanking;

    public Bowler(String name, int age, String nationality, int wickets, int bowlerRanking) {
        super(name, age, nationality);
        this.wickets = wickets;
        this.bowlerRanking = bowlerRanking;
    }

    public void print() {
        super.print();
        System.out.println("Wickets: " + wickets);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    public int getRanking() {
        return bowlerRanking;
    }
}

class AllRounder extends Cricketer {
    private Batsman batsman;
    private Bowler bowler;
    private int ranking;

    public AllRounder(String name, int age, String nationality, int score, int batsmanRanking, int wickets, int bowlerRanking, int ranking) {
        super(name, age, nationality);
        this.batsman = new Batsman(name, age, nationality, score, batsmanRanking);
        this.bowler = new Bowler(name, age, nationality, wickets, bowlerRanking);
        this.ranking = ranking;
    }

    public void print() {
        super.print();
        batsman.print();
        bowler.print();
        System.out.println("All-Rounder Ranking: " + ranking);
    }

    public int getRanking() {
        return ranking;
    }
}

