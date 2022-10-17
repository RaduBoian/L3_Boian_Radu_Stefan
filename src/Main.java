import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> nichtAusreichnd(ArrayList<Integer> noten){
        ArrayList<Integer> noteMici=new ArrayList<>();
        for(int note: noten){
            if(note<40) {
                noteMici.add(note);
            }
        }
        return noteMici;
    }

    public static double durchschnitt(ArrayList<Integer> noten){
        double s=0;
        for(int note:noten){
            s+=note;
        }
        return s/noten.size();
    }

    public static int abrunden(int nr){
        if(nr>=38){
            if(nr%10<5) {
                if (5 - nr % 10 < 3) {
                    nr+= 5 - nr % 10;
                }
            }
            else{
                if (10 - nr % 10 < 3) {
                    nr += 10 - nr % 10;
                }
            }
        }
        return nr;
    }

    public static ArrayList<Integer> abrundenList(ArrayList<Integer> noten){
        for(int i=0;i<noten.size();i++){
            noten.set(i,abrunden(noten.get(i)));
        }
        return noten;
    }

    public static int maxNote(ArrayList<Integer> noten){
        noten=abrundenList(noten);
        int maxim=0;
        for(int note: noten){
            if (note>maxim){
                maxim=note;
            }
        }
        return abrunden(maxim);
    }

    public static void main(String[] args) {
        ArrayList<Integer> noten=new ArrayList<>();
        noten.add(23);
        noten.add(39);
        noten.add(54);
        noten.add(43);
        System.out.println(nichtAusreichnd(noten));
        System.out.println(durchschnitt(noten));
        System.out.println(abrundenList(noten));
        System.out.println(maxNote(noten));
    }
}