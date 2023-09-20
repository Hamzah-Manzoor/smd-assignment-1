// 1) Missing Data Types: The code doesn't specify data types for class attributes and methods, which is a syntax error in Java.

// 2) Inheritance: Java does not support multiple inheritance directly. In your code, you are trying to inherit from both Batsman and Cricketer in the AllRounder class, which is not allowed in Java.
// Even if multiple inheritance were allowed, there could be ambiguity when calling methods or accessing attributes if both parent classes have methods or attributes with the same names. This can lead to confusion and errors in the code.
// Another issue that can occur with multiple inheritance is the diamond problem. This occurs when a class inherits from two classes that have a common ancestor. In such cases, if both parent classes have overridden methods, it can lead to ambiguity and confusion.

// 3) Method Definitions: Methods in Java must have valid method signatures with return types. Your methods in the classes are missing method signatures and return types.


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

