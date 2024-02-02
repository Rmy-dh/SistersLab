# ✏️Nesne Yönemli Programlamanın(OOP) 4 Temel İlkesi
![](image\oop.jpg)
---------------------------------------------------
>>> ***🎯Oop'ye başlamadan önce "Sınıf" ve "Nesne" Nedir?***
>* Nesne tabanlı programlamada, programdaki en temel yapı taşı nesneler-sınıflardır.
>* Sınıf(Class)
>  * Sınıflar,  içinde  sınıfa özgü nitelik ve davranışları bulunduran nesneleri oluşturmak için kullanılan klavuzlardır. 
>* Nesne(Object)
>  * Nesne, şablonlardan üretilen fiziksel yapılardır.
>
>```java
>public class Author{
>    String name;
>    String surName;
>    public Author(String name, String surName){
>        this.name=name;                                        // Sınıfa ait nitelikler
>        this.surName=surName;
>    }
>    public  void takeAward(){                                  //Sınıfa ait davranışlar
>        System.out.println(name+" "+surName+" takes award.");
>    }
>
>}
>``` 
> * Burada yazar sınıfından nesne oluşturmayı görüyoruz.
> * Sınıftan onlarca, yüzlerce nesne yaratabiliriz. Hepsi de hafıza da  başka adresleri gösterirler.
>
>```java
>
>  Author authhor1=new Author("Name1","Surname1")
>  Author authhor2=new Author("Name2","Surname2")
>  Author authhor3=new Author("Name3","Surname3")
--------------------------------------------------
>>> ### ***Oop nedir?***<br>
> ![](image\oopConcept.jpg)
> * Bir programlama yaklaşımıdır.
> * Nesne yönelimli programlamada böl parçala yönet mantığı vardır.
> * Hızlı ve uygulaması kolaydır.
> * Kendini tekrar etme(Don't Repeat Yourself) ilkesini uygular.
> * Daha az kod daha kısa geliştirme süresi sunar.
> * Yapıya daha sonra yeni özellikler ekleyerek geliştirilebilirlik sağlar.
> * Problemleri gerçek hayatttaki işlemlere göre modeller.




## 👉Nesne yönelimli programlanın bize sağladığı avatajları kullanmamızı sağlayan ilkeler.

 ***1- Encapsulation(Sarmalama) 🔓***<br>
```
▫️ Sarmalara ilkesi bir sınıfa ait değişkenlerin veya niteliklerin sadece o sınıfa ait metotlar tarafından değiştirilmesidir.
▫️ Burada karşımızı değişkenlerin (access modifiers) private olarak tanımlayıp ilgili verileri getter ve setter methodlar kullanarak çağırma çıkar.
▫️ Sınıfa ait değişkenleri veya nitelikleri private tanımlıyarak nesneler üzerinde bir koruma katmanı yapmamızı sağlar.  
▫️ Bu koruma katmanı sayesinde nesneler üzerinden anlamsız veriler almanın önüne geçmiş oluruz. 
```
![](image\encapsulation.jpg)

 ***2- Inheritance (Kalıtım)***<br>
``` 

▫️ Kalıtım yapılan sınıfa ata sınıf(super class) , kalıtım yapan sınıfa alt sınıf(sub class) denir.
▫️ Alt sınıf ata sınıfa ait tüm değişken ve metotları kullanabilir.
▫️ Ata sınıf alt sınıfa ait değişken ve methodlara ulaşamaz.
▫️ Bir sınıf sadece 1 sınıftan  kalıtım alabilir. (Extend işlemi sadece 1 class için geçerlidir. Bundan dolayı impliment işlemi yapılarak birden fazla class
kullanılabilir. Bu noktada karşımıza interface ve abstract sınıflar çıkar.)
```
<br>

>>> ***🎯Access Modifiers Nedir?***<br>
> ![](image\accessModifiers.jpg)
> * Sınıflara ait nitelik ve davranışları o sınıf içinden ve dışından erişimini belirtmek için kullanılır.
> * ***Private*** ->  İlgili nitelik veya davranışın sadece o class içinde erişimini belirtir.
> * ***Public*** -> İlgili nitelik, davranış ve class'ın her yerde erişime açık olduğunu belirtir.
> * ***Protected*** -> İlgili nitelik ve davranışın içinde bulunduğu package içinde erişime açık olduğunu belirtir.
> (Public'e göre alanı daha dar iken,  private'a göre daha geniş bir erişim alanı verir. )
> * ***Default*** -> Erişim belirleyicisi atanmadığı durumda default olarak erişim belirleyicisi atanır. İlgili nitelik ve davranış içinde bulunduğu package içinde erişime açıktır. Bu özelliği ile protected 
> ayrılan yönü ise kalıtım (inheritance) durumunda da erişim desteği verebilmesidir. 
> ```
>  private int age;
> <Accsee Modifiers> <Değişke Tipi> <Değişken ismi>;
> ```



 ***3- Polymorphism (Çok Biçimlilik)***<br>
``` 
▫️ Polymorphism olması için kalıtım olmak zorundadır.
▫️ Polymorphism ata sınıftan almış olduğu metotları geçersiz(override) kılarak alt sınıfın çok biçimli olarak davranmasını sağlar.
▫️ Bu sayede bir ata sınıftan almış olduğumuz methodu alt sınıflarda yeni özellikler katarak programa genişlik katabiliriz.
▫️ Polymorphism bize programlamada esneklik kazandırır. 
 
``` 
<br>

>>> ***🎯Method Overriding Nedir ?***<br>
> Method geçersiz kılma olarak ifade edilir.
> Ata sınıftan alınmış olan bir methodu alt sınıfta kendi
> gereksinimleri doğrultusunda düzenlemedir.
> ```
> Örnek olarak ata sınıfta tanımlanmış giriş methodu alt sınıflarda 
> özelleşerek alt class için belirli şekilde ifade edilebilir.
> Ata sınıfta çıktı olarak " A kişisi giriş yaptı " şeklinde gözüken çıktı.
> Alt sınıfta " A ve B kişisi saat 18:00' da giriş yaptılar " olarak güncellenebilir.
> ```
<br>

>>> ***🎯Interface Nedir?***<br>
> * Interfaceler, interface anahtar kelimesi ile tanımlanır.
> * Interfaceler üzerinden nesne üretilemez. 
> * Impliment edilen interface içinde tanımlanmış olan metotlar ,impliment edilen sınıf içinde @Override edilmek zorundadır.
> * Interface’ler katmanlı mimaride katmanlar arası geçiş yapılırken bağımlılığı önlemek için kullanılır. 

***4- Abstraction (Soyutlama)***<br>
```
▫️ Eğer bir sınıftan nesne üretmek anlamsız geliyorsa o sınıf soyutlana bilir.
▫️ Soyutlama bir sınıfa ait temel görevlerin tanımlanması detayaların ise tanımlanmaması demektir.
▫️ Abstract tanımlanmış bir method alt sınıflarda override edilmek zorundadır.
▫️ Bir methodun abstract olması için o sınıfında abstract olması gerekir
  
```


