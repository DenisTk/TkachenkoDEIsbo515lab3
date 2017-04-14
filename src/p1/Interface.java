package p1;


import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Spisok list=new Spisok();
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("1) add; 2) delete; 3)view; 4)exit");
            String cmd=s.nextLine();
            switch (cmd){
                case "1": String str=s.nextLine(); list.add(str); break;
                case "2": int a=s.nextInt(); list.del(a); break;
                case "3": list.view(); list.tOString(); break;
                case "4": break;

            }
        }
    }
}
