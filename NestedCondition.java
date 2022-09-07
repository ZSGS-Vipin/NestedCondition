public class NestedCondition {
    public static void main(String[] args) {
    nestedWhile();
    nesteddoWhile();
    }
    static void nestedIfMethod(){
        int n1 = 10,n2=15,n3=20;
        if(n1<n2){
            if(n2<n3){
                if(n3>n1){
                    System.out.println("nested if printed");
                }
            }
        }
        else{
            System.out.println("else printed");
        }

    }
    static void IfElseStatement(){
        int age = 18;
        if(age<5){
            System.out.println("you are a child");
        }
        else if(age<10){
            System.out.println("you are not eligible");
        }
        else if(age>18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("please check properly");
        }
    }
    //nested for and while
    static void forNestedandWhile(){
     int weeks = 2;
     int days = 7;
     int i = 0;
     while(i<0){
         System.out.println("weeks = "+i);

         for(int j = 0; j <= days;j++){
             System.out.println("days = "+j);
         }
         ++i;
     }
    }
    static void nestedFor(){
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void nestedWhile(){
        int i = 1;
        while(i<=3){
            System.out.println("outer while loop");
            int j = 1;
            while(j<4){
                System.out.println("inner while loop");
                j++;
            }
        i++;
        }

    }
    static void nesteddoWhile(){
        int i =1,j=1;
        int x;
        do{
            x=4;
            do{
                System.out.print("");
                x--;
            }while(x>= i);
            j=1;
            do{
                System.out.print(j+" ");
                j++;
            }while(j<=5);
            System.out.println(" ");
            i++;
        }while (i <=5);
    }
}
