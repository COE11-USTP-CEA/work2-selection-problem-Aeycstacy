import java.util.List;
import java.util.ArrayList;
	
class inventory{
	public static void main (String[] args) {
        System.out.println("Sari-Sari Store");
        item t1 = new item("Palmolive","Shampoo",6.00f);        
        item t2 = new item("Dove","Soap",25.00f);
        item t3 = new item("Century Tuna","Canned Goods",30.00f);
        item t4 = new item("Colgate","Toothpaste",7.00f);
        item t5 = new item("Ariel","Detergent",12.00f);
        item t6 = new item("Cloud 9","Chocolate",7.00f);
        item t7 = new item("Dolfenal","Medicine",28.00f);
        item t8 = new item("Breeze","Detergent",14.00f);
        item t9 = new item("Whisper with wings","Napkin",6.00f);
        item t10 = new item("Fruity Pop","Lollipop",1.00f);
	
        List<item> listofitems = new ArrayList();
        listofitems.add(t1);
        listofitems.add(t2);
        listofitems.add(t3);
        listofitems.add(t4);
        listofitems.add(t5);
        listofitems.add(t6);
        listofitems.add(t7);
        listofitems.add(t8);
        listofitems.add(t9);
        listofitems.add(t10);
    
        for(item x: listofitems){
            
            if(x.Getname() == "555"){
                System.out.println("Item Found!");
                System.out.print(" " + x.Getcname());
                System.out.print(" " + x.Getprice() + "\n");
                break;
            }else{
                System.out.println("Item Not Found!");
            }
        }
    }
}