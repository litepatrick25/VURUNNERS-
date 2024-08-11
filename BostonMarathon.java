public class BostonMarathon {
    public static void main(String[] args) {
    Runner[] runners = {
    new Runner("Elina", 341),
    new Runner("Thomas", 345),
    new Runner("Hamilton", 234),
    new Runner("Suzie", 234),
    new Runner("Phil", 234),
    new Runner("Matt", 234),
    new Runner("Alex", 234),
    new Runner("Emma", 234),  
    new Runner("John", 234),
    new Runner("James", 234),
    new Runner("Jane", 234),
    new Runner("Emily", 234),
    new Runner("Daniel", 234),
    new Runner("Neda", 234),
    new Runner("Aron", 234),
    new Runner("Kate", 354)
    };
    // Find the fastest runner
    Runner fastest = runners[0];
    for (Runner runner : runners) {
    if (runner.time < fastest.time) {
    fastest = runner;
    }
    }
    System.out.println("Fastest runner: " + fastest.name + ", Time: " + fastest.time + " minutes");
    // Find the second fastest runner
    Runner secondFastest = runners[0];
    for (Runner runner : runners) {
    if (runner != fastest && runner.time < secondFastest.time) {
    secondFastest = runner;
    }
    }
    System.out.println("Second fastest runner: " + secondFastest.name + ", Time: " +
   secondFastest.time + " minutes");
    }
   }
   class Runner {
    String name;
    int time;
    public Runner(String name, int time) {
    this.name = name;
    this.time = time;
    }
   } 