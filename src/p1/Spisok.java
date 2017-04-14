package p1;


import java.util.*;

public class Spisok {
    private final ArrayList<Work> ar;
    private int ind;
    public Spisok(){
        ar=new ArrayList<Work>();
        ind=1;
    }
    public int add(String mess){
        int id=ind++;
        ar.add(new Work(id,mess));
        return id;

    }
    public void del(int index){
        ar.remove(index);
    }
    List<Work> view(){
        Collections.sort(ar, new Comparator<Work>(){
            public int compare(Work w1, Work w2){
                return Integer.compare(w1.getId(), w2.getId());
//                if (w1.getId()>w2.getId()) return 1;
//                if (w1.getId()<w2.getId()) return -1;
//                return 0;
            }
        });
        return ar;
    }
    public void tOString(){
        for (int i=0; i<ar.size();i++) {
            Work w = ar.get(i);
            System.out.println(w);
        }

    }
}
