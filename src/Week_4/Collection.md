# ✏️ Collection Sınıfı Nedir ?

-----------------------------------------------
* Collection interface 'i Iterable interface'inden kalıtım almıştır.
* Verileri liste halinde tutmamızı sağlayana bir yapı sağlar.
* Burada array yapısından faklı olarak bir uzunluk belirtmemiz gerekmez.
* Liste tipinde veri tutacak olan her sınıf doğrudan veya dolaylı yoldan bu interface’den kalıtım almalıdır.
* Burada karşımıza  Collection'dan kalıtım alan Set, List ve  Queue  interfaceleri çıkar.
* İçerdiği bazı methodlar:
   * int size() -> liste içindeki eleman sayısını verir.
   * boolean contains(Object element) -> "element" verilen liste içinde mevcut mu kontrolü yapar.
   * boolean add(Object element) -> "element" verisini listeye ekler.
   * boolean remove(Object element) -> "element" verisini listeden siler.
   * void clear () -> Liste içindeki elemanları siler.


## 🎯Iterator

* Verilen liste içinde for döngüsü gibi  gezmemizi sağlar.
* Burada while içinde sonraki eleman var mı sorgusunu hasNext() saglar.
* Eğer eleman mevcut ise döngü içinde next() ile ilgili veriyi alırız.
```
 Iterator< T > itr= listeAdı.iterator(); 
 while(itr.hasNext()){
    System.out.println(itr.next());
 }
 ```

```
for(T veri : listeAdı ){
   System.out.println(veri);
}
 ```
***Yukarıdaki iki yapıda aynı şeyi ifade eder.***

-----------------------------------------------
## Set
 ``` 
 HashSet< T > listeAdı= new HashSet<>();
 LinkedHashSet< T > listeAdı = new LinkedHashSet<>();
 TreeSet< T > listeAdı = new TreeSet<>( ... );
 ```
* Set interface’den kalıtım alan alt sınıflar: ***HashSet, LinkedHashSet, TreeSet****
* Bir veri sadece 1 kere yazılarak mükerrer kayıt tutmamıza engel olur.
* **HashSet**  veriler için sıralama garantisi vermez.(Veriler verilen sıra ile verilmeyebilir.)
* **LinkedHashSet** verilen sıralama ile verileri alır. Linked Hash Set içinde bir elemen kendinden önceki ve sonraki elemanın yerini tutar.
* **TreeSet**  verileri istediğimiz sıralamaya göre sıralamamızı sağlar.
   *  Bir sınıfın sıralanabilir olması için “Comparable” interface’den kalıtım alıp “compareTo” metodunu doldurması gerekmektedir.

* HashSet'de arka tarafta bir mekanizma çalışıp ona göre veriyi diziyo. TreeSet' de biz kendimiz veriyoruz sıralamayı. LinkedListSet ' de böyle bir şey söz konusu değil.

 ```
TreeSet<Integer> numbers=new TreeSet<>(new Comparator<Integer>() {
@Override
public int compare(Integer o1, Integer o2) {
        return o1-o2;
        }
        });
        numbers.add(1);
        numbers.add(20);
        numbers.add(0);
        System.out.println(numbers.toString()); 
        // Karşımıza küçükten büyüğe dogru  sıralanmış bir veri seti gelir. [0, 1, 20]

  
 ```


------------------------------------------------

## List

* List interface’den kalıtım alan alt sınıflar: ArrayList, LinkedList, Vector, Stack
* Bir veriyi birden fazla kez tutmamıza olanak sağlar.
* Sıralama değişmez girilen sıra ile verilir.
* Elemanlar 0 indisiyle başlar.

 ```
 ArrayList< T > listeAdı= new ArrayList<>(); 
 LinkedList< T > listeAdı= new LinkedList<>();
 ```
 >### 🎯LinkedList ve ArrayList arasındaki fark nedir?
> Kendi içerisindeki yapılar dolayısıyla kullanımları farklılık gösterir.
> 
>Linked List kullanımı eğer bir liste içerisine çok fazla eleman ekleyip silme işlemi gerçekleşiyorsa daha uygundur.
> Bununla birlikte Array List ' de kendi içindeki arama mekanizmasından dolayı Linked List'in önüne geçer.

>**🎯Collections.sort()**<br>
> Listeler için kullanılır.<br>
> Verileri sıralaya bilmemizi sağlar.<br>
> Bu sıralamayı istersek oluşturmuş olduğumuz bir class ile yapabiliriz. Bu class Comparotor class'ından implements alıp kendi içinde compare methodu override etmeli.
------------------------------------------------

## Queue

* Queue interface’den kalıtım alan alt sınıflar: PriorityQueue, ArrayQueue
* Queue bir FIFO (first-in-first-out, ilk giren ilk çıkar) yapısıdır.
* PriorityQueue yapısı bize kuyrukta isyediğimiz koşullar çerçevesinde sıralama yapabilmemizi sağlar.


-------------------------------------------

## Map


* Map interface 'i Iterable interface'inden kalıtım almamıştır.
* Map interface'den kalıtım alan alt sınıflar: HashMap,LinkedHashMap, TreeMap
* Kendi içerisinde verileri key ve value yapılarına göre saklar.

```
HashMap<String,Integer> sample=new HashMap<>();
sample.put("Name",1111);     👉 added to list
sample.get("Name");          👉 1111
sample.remove("Name");       👉 deleted from list
```
### 🎯Verileri gezmek istersek..
```
for(String name: sample.keySet()){
        System.out.println(name);                👉 "Name" verir.
}

for(Map.Entry<String,Integer> entry:sample.entrySet()){
        System.out.println(entry.getKey());      👉 "Name"
        System.out.println(entry.getValue());    👉 1111 
        
}

```
--------------
***🎯steam()***
* Bir koleksiyonun akışını elde edebilmek için, JDK 8 ile Collection arayüzüne stream() adında yeni bir metot eklenmiştir. Bu metodun yapısı aşağıdaki gibidir:
```
 👉interface Collection<T> { 
       Stream<T> stream(); 
   }
 ```
* Bu metodu kullanarak bir koleksiyon için yeni bir akış oluşturabiliriz. Bu metot her çağrıldığında koleksiyon üzerinde yeni bir akış oluşturulur.
```
ArrayList<String> example = new ArrayList<>();
example.add("VALUE1");
example.add("VALUE2");
       ...
example.stream().forEach(name->System.out.println(name));                                     👉 "VALUE1"
                                                                                                  "VALUE2"
                                                                                                    ...
                                                                                                    
example.stream().map(name->name.toLowerCase()).forEach(value->System.out.println(value));     👉  "value1"
                                                                                                  "value2"
``` 