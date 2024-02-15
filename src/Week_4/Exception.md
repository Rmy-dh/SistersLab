# ✏️ Exception Handling (Hata Yakalama)

-----------------------------------------------
* Programın akışını beklenmedik şekilde kesen istisnai durumlara exception denir.
* Exceptionlar birer sınıftır ve Throwable sınıfından türerler.***(Burada Error ve Exception classları Throwable sınıfından extend alırlar )***

>> ### 🎯Error?
> * Error ler genellikle programcının kontrolü dışındadır. Throwable sınıfından exten alır.
>   (JVM kaynalı olan hatalar bellek tükenmesi, bellek sızıntıları,yığın taşması hataları, kitaplık uyumsuzluğu, sonsuz özyineleme vb.)
>  * Stack Over Flow Error
>  * Virtual Machine Error
>  * Out of Memory Error
* Hatalar kendi içinde checked  ve unchecked olmak üzere 2' ye ayrılır.


* ***Unchecked Exceptions*** : Programın derlenmesi sırasında bilinemeyen ancak program çalıştığı esnada ortaya çıkan hata tipleridir. Çalışma zamanında ortaya çıktıklarından yeniden oluşturulmaları ve tespit edilmeleri daha zordur.
    * NullPointerException
    * Arithmetic Exception
    * NumberFormat Exception
    * Inde out of Bounds Exception

* ***Checked Exceptions*** : Derleme aşamasında tespit edilen hatalardır.
    * ```
      boolean falseExample= 12;
      // Burada görüldüğü üzere boolean veri tipi olan bir parametreye integer bir değer verilirse gözlenen hata bir checked hata örneğidir. 
      
      System.out.println("Checked error occurs")
      //Burada da ";" koyulmamasından kaynaklı bir hata görürüz.
      ```
      
* Hata yönetimi hatayı çözmek değildir. O hataya rağmen programın çalışmasını devam ettirmektir.
(Exceptionları yakalayıp bunu yönetebiliriz. Bunu yaparken kendi exception classlarımızı da oluşturabiliriz.)

## Try-Catch-Final
  * ```java
     try{
    
      // Hata olması muhtemel kod
    
    }catch(Exception e){
    
      //Herhangi bir hata durumunda buraya düşer
    
    }final{
      // Hata olsada olmasada bu scope çalışır. 
    }
   
    ```
    
* Try catch yapısı program içinde hatayı yakalamamızı ve kontrol altında tutmamızı sağlar.
* Java içinde hata yakalanmadığı sürece bir üst methoda aktarılmaya devam eder. Eger program içinde hatayı yakalamadıysak, hata Java çalışma ortamına aktarılır. Java çalışma ortamı bize varsayılan bir hata yakalama mekanizması sunar. Bu mekanizma hata meydana geldiğinde programı sonlandırır. 

## Throw (Hata Fırlatma)

* Program içinde biz hatanın meydana geldigi yerde program akışını kesmek isteyebiliriz bunu throw anahtar kelimesi ile yapabilir.

>throw new IllegalStateException(" Hata mesajı. ");

* Program içinde o alanda hata fırlatılacağını belirtmek için ***throws*** ile programcıya  bilgi verebiliriz. 
>>🎯Özel Exception Sınıfları Oluşturma
> * Programcı program içinde ihtiyaç halinde kendi özel exception sınıflarını oluşturabilir. 
> * Yeni oluşturulan class Exception sınıfından extend edilmelidir.

```
public class AgeCheckException extens Exception{
   public AgeCheckException(String message){
     super(message);
   }
}
```



