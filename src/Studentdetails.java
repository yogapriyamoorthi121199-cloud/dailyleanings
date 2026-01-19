class Studentdetails6 {
    String name;
    int age;
    double percentage;
    Studentdetails6(String r,int t,double g)
    {
        name=r;
        age=t;
        percentage=g;
    }
}
class Studentdetails{
  public static void main(String[] args) {
      Studentdetails6 f1 = new Studentdetails6("Salma",22,85.5);
    System.out.println(f1.name + "-" + f1.age + "-" +f1.percentage );

   }

  }
