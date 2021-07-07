class Main {
    int x;
    int y;
    int z;

    public Main(int a, int b, int c) {
      x = a;
      y = b;
      z = c;
    }
    public void addAll() {
      System.out.println(x + y + z);
    }

    public void subAll() {
      System.out.println(x - y - z);
    }
    public static void main(String[] args) {
        Main Obj = new Main(14, 72, 84);
        Obj.addAll();
        Obj.subAll();
    }
}