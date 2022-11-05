package listDemos;

import models.Speaker;

import java.util.ArrayList;

public class ArrayListModel {
    public void demoArrayList(){
        ArrayList<Speaker> arrayList=new ArrayList<>();
        Speaker speaker1=new Speaker("Stone",12,2400,"Made in China");
        Speaker speaker2=new Speaker("JBL",17,5400,"Made in America");
        Speaker speaker3=new Speaker("JBL",14,5500,"Made in America");
        Speaker speaker4=new Speaker("Bahubali Bass",786,4999,"Made in India.");

        // add data
        arrayList.add(speaker1);
        arrayList.add(speaker2);
        arrayList.add(speaker3);
        arrayList.add(speaker4);

        //remove data
        arrayList.remove(1);

        //set data
        speaker3.setBrand("Sony");
        speaker3.setPrice(8599);
        // print by for each
        for (Speaker typ_Speaker: arrayList){
            System.out.println(typ_Speaker.getBrand()+" "+typ_Speaker.getProduct_id()+" "+typ_Speaker.getPrice()+" "+typ_Speaker.getMade_in());
        }

    }
    public static void main(String[] args) {
      ArrayListModel arrayListModel=new ArrayListModel();
      arrayListModel.demoArrayList();


    }
}
