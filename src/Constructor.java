class Constructor {
    String name;
    int age;
}

class Main {
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        Constructor s2 = new Constructor();
        Constructor s3 = new Constructor();

        // Setting values separately - tedious!
        s1.name = "Neeraja";
        s1.age = 22;

        s2.name = "Priya";
        s2.age = 21;

        s3.name = "Rahul";
        s3.age = 23;

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
        System.out.println(s3.name + " - " + s3.age);
    }
}
