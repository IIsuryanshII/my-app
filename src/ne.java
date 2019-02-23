import java.util.*;
class hi {

     int fact(int n) {
        if (n >= 1){
             n=n/2;
             fact(n - 1);
             fact(n*n);

        }

    }

    public static void main(String args[]) {
        hi ob=new hi();
        System.out.println(ob.fact(3));

    }
}




