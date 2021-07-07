class Main {
    public void add() {
        System.out.println(0);
    }
    public void add(int a) {
        System.out.println(++a);
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b, int c) {
       System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        Main Obj = new Main();
        Obj.add();
        Obj.add(1);
        Obj.add(1, 2);
        Obj.add(23, 45, 77);
    }
}