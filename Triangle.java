public class Triangle {
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;

public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
     this.x1 = x1;
     this.x2 = x2;
     this.x3 = x3;
     this.y1 = y1;
     this.y2 = y2;
     this.y3 = y3;
}

public boolean equals(Triangle other) {
     boolean equals = false;
     if ((other.x1 == x1 && other.x2 == x2 && other.x3 == x3) && (other.y1 == y1 && other.y2 == y2 && other.y3 == y3)) {
        equals = true;
     }
     return equals;
}

public String toString(){
    String info = "";
    info = info + "Triangle 1:" + "(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")";
    return info;
}

public boolean rightTriangle(){
   boolean right = false;
   double l1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
   double l2 = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
   double l3 = Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
   l1=Math.round(l1);
   l2=Math.round(l2);
   l3=Math.round(l3);
   if(l1>l2 && l1>l3){
      if(((l2*l2)+(l3*l3)) ==l1*l1){
         right = true;
      }
   }
   if(l2>l1 && l2>l3){
      if(((l1*l1)+(l3*l3))==l2*l2){
         right = true;
      }
   }
   if(l3>l2 && l3>l1){
      if(((l2*l2) + (l1*l1))==l3*l3){
         right = true;
      }
   }
   return right;
}


public double perimeter() {
    double per = 0.0;
    double l1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    double l2 = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
    double l3 = Math.sqrt(((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3)));
    per = Math.round(l1 + l2 + l3);
    return per;
}

public boolean equilateral() {
    boolean equilateral =  false;
    double l1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    double l2 = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
    double l3 = Math.sqrt(((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3)));
    if(l1 == l2 && l2 == l3 && l3 == l1) {
        equilateral = true;
    }
    return equilateral;
}

}