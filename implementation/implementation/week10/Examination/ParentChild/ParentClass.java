package implementation.week10.Examination.ParentChild;

class ParentClass {
    int i;
    int getMultipliedNumber(int x) {
        this.i = x;
        return (int) (i*1.75);
    }

    ParentClass getMultipliedNumber(int x, int y) {
        this.i = x * y;
        return this;
    }
}

class ChildClass extends ParentClass {
    int getMultipliedNumber(int x) {
        this.i = x;
        return i * 50;
    }

    ChildClass getMultipliedNumber(int x, int y) {
        this.i = x * y * 25;
        return this;
    }
}

class CodeChef {
    public static void main(String args[]) {
        ParentClass pOb = new ParentClass();
        int result = pOb.getMultipliedNumber(10);
        pOb = new ChildClass();
        result = pOb.getMultipliedNumber(10);
  ;  }
}