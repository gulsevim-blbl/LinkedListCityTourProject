
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void islemleri_bastır(){
        System.out.println("0 - Islemleri Goruntule..");
        System.out.println("1 -  Bir sonraki seher git..");
        System.out.println("2 -  bir onceki sehre git..");
        System.out.println("3 -  Uygulamadan cik.");
        
        
    }
    public static void sehirleri_turla(LinkedList<String>sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        
        islemleri_bastır();
        
          Scanner scanner = new Scanner(System.in);
          
          
          if (iterator.hasNext()) { //linkedlist boş mu değil mi kontrol edilir
              System.out.println("Herhangi bir sehir bulunmuyor..");
        }
          boolean cikis = false;
          boolean ileri = true;
          
          
          while(!cikis){
              System.out.println("Bir islem seciniz");
              
              islem = scanner.nextInt();
              
              switch (islem) {
                  case 0:
                      islemleri_bastır();
                      break;
                  case 1:
                      if (!ileri) {
                          if (iterator.hasNext()) {
                              iterator.next();
                          }
                          ileri = true;
                      }
                      if (iterator.hasNext()) { // linked list dolu mu
                          System.out.println("Sehre Gidiliyor:" + iterator.next());
                      }
                      else{
                          System.out.println("Gidilicek Sehir Kalmadi...");
                          ileri = true;
                      }
                      break;
                  case 2:
                      if (ileri) {
                          if(iterator.hasPrevious()){
                              iterator.previous();
                              
                          }
                          ileri = false;
                          
                              
                      }
                      
                      if (iterator.hasPrevious()) { //önceden gösterdiğimiz bir obje var mı
                          System.out.println("Sehre Gidiliyor:" + iterator.previous());
                      }
                      else{
                          System.out.println("Sehir Turu Basladi...");
                      }
                      break;
                  case 3: 
                      cikis = true;
                      System.out.println("Uygulamadan Cikiliyor...");
                      break;
              }
          }
        
    }
    public static void main(String[] args) {
        
        LinkedList<String> sehirler =new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        
         sehirleri_turla(sehirler);
         
       
        
    }
    
}
