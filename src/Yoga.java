class Yoga3 {
    String name;
    int age;
    double percentage;

    Yoga3(String a, int b, double c) {
        name = a;
        age = b;
        percentage = c;
    }
}

class Yoga {
    public static void main(String[] args) {
        Yoga3 s = new Yoga3("Salma", 22, 85.5);

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.percentage);
    }
}

