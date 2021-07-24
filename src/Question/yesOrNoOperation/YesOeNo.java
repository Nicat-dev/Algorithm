package Question.yesOrNoOperation;

//Elimizde reqemlerden ibaret bir liste olsun ve
// istediğimiz reqemleri içinde axtaraq.
// Eğer var ise ekrana “VAR” eger axtardiqimiz reqem listede yok ise “YOK” yazaq.

import java.util.ArrayList;
import java.util.List;

public class YesOeNo {
    public static void main(String[] args) {
        List<Integer> listQuestion = new ArrayList<>();
        listQuestion.add(11);
        listQuestion.add(4);
        listQuestion.add(13);
        listQuestion.add(43);
        listQuestion.add(24);
        listQuestion.add(54);
        listQuestion.add(47);
        search(listQuestion,100);
    }

    static void search(List<Integer> list, int value){
        boolean flag = false;
        for (int i = 0; i <list.size(); i++) {
            //burada listin deyerlerini cağırıb uyğunlaşdırıq uyğundursa flag truya bərabər olur və proses bitir
            //əks təqdirdə flag false bərabər olur
            if (list.get(i) == value){
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("VAR");
        }else if (flag == false){
            System.out.println("YOX");
        }
    }
}
