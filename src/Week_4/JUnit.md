# ✏️ JUnit Nedir ?

-----------------------------------------------
* Unit test (birim testi) iş akışı içerisindeki her bir akışın ayrı ayrı test edilmesi demektir. 
* Aynı zamanda daha temiz ve anlaşılır kodlar yazmamızı sağlar. 
* Bu testler aracılığıyla uygulama gereksinimleri karşılıyor mu kontrolü saglamış oluruz.
* Test classları  test package altında yer alır .
```
  src 
      -> main
      -> test    👈
 ```
* Test yazmaya başalamadan önce testi yazılıcak olan class için bağımlılıklar inject edilir. Burada obje private olarak tanımlanır.
* Inject etmek istediğimiz alanlarda bazen kullanılan servislere gerçekte gitmesini istemediğimiz durumlarda bu alanlar mocklanarak devam edilir.
 ```
  @InjectMock
  private CompanyService companyService;  // Testi yazılan class inject edilir.

  @Mock
  private UserService userService;        // Testi yazılan class içinde kullanılan servis.

 ```
* Test methodu yazımında aşağıda belirtildiği şeklinde bir isimlendirme yapılabilir.
  >  👉methodAdı_<b>when</b>HangiDurumlarAltındaBuMethoduDeniyorum_<b>should</b>VerdiğimSenoryaSonucundaDönecekOlanYapı
 ```
@Test
void addUser_whenUserNotExistInCompany_shouldAddUserToCompany(){
    ...
}
 ```
### 🎯Test Senorya Yapısı
  ```
    @Test
    void addUser_whenUserNotExistInCompany_shouldAddUserToCompany(){
    //Given
        User user=new User();    
        ....
    //When 
        when(userRepository.findById(user.getId())).thenReturn(user);
        ....
    //Then
         assertEguals(response.getName(),user.getName());
    }
    
 Given  -> Method için gerekli verilerin oluşturulması.
 When   -> Sağlanıcak koşulların oluşturulması.
 Then   -> Beklenen caselerin kontrol edilmesi.
```
* Unit test yazılırken senaryo bazlı hareket edilir. Örnek verilmek gerekirse şu durum karşısında bu davranış mı sergilendi gibi.
* Bir unit test senaryosu içinde sadece 1 tane methodun test senaryosu  kontrolü olmalı. Eğer birden fazla senaryo mevcut ise birinin hata vermesi durumunda hatalı durum altındaki senaryoların çalışması kesilir.
* Testi yazılan methodun normalde beklediğimiz çalışma senaryosunu gözlemlediğimiz test senaryosu <b>"Happy Path Senaryo"</b> olarak isimlendirilir.
(Burada  mesela kullanıcı kaydını yapan methodun happy path senaryo durumu için verilen kullanıcı methoda yönlendirilince dönen veri beklediğim veri ile eşleşiyo mu kontrolü.)
* Test yazılırken bütün case ler açısından senaryolar oluşturulmalı. Bu şekilde projeye sonradan dahil olan biri içinde o methodun hangi durumlarda nasıl davrandığını gözlemleyerek  projeye uyumu kolaylaşır.  
Aynı zamanda methoda yapılan eklemelerde hatalı veya istenmeyen bir süreç mevcut ise proje ayağa kalkarken mevcut unit test bu koşulda hatalı çalışır. Buna bağlı olarak yazılımcı hatayı erken fark edebilir.
* Mock işleminin nerede ve nasıl kullanıldığından bahsedicek olursak.
(Burada kullanıcı kaydı yapılırken email göndermesi için farklı bir servis çağırımı olsun. Kullanıcı kaydını yapan method test edilirken email servisine gitmesi istenmez.
Çünkü  method bazlı mevcut kullanıcı kayıt ediliyor mu kontrolü yapmak isteriz. Bu durumda email servisi mocklanır. )
 ```
@Mock
private EmailService emailSrvice;                                        -> servis mocklandı
@Test
void addUser_whenUserNotExistInCompany_shouldAddUserToCompany(){
    User user=new User();
    user.setName("TestName);
    ..
    when(userRepository.findById(user.getId())).thenReturn(null);       -> Bu çağırım olduğu yerde verilen bilgiyi dön.
    when(emailService.sendEmail(user)).thenReturn(true);
    
    UserResponse response=userService.addUser(user);
    assertEgual(response.getName(),user.getName());
}
 ```


* Eğer proje içinde Utility class(Static method barındıran classlar) kullanımı mevcut ise. Bunların mocklanma senaryosu bizaz farklılık gösterir.
* Bu durumda @Mock yaparak kullanmanız söz konusu değildir.
* Bunun yerine <b>MockStatic\<AdressConvertor\> addressConvertor = Mockito.mockStatic(AdressConvertor.class);</b> kullanılır.
Bu yapıyı kullanım alanı bittikten sonra kapatmayı unutmamalıyız. Aksi takdirde thread ler bu koşullarda mevcut tread kaptılmadı hatası verebilir . 
Bu durumdada testimiz başarısızlıkla sonuçlanır.
Bunu önlemek için <b>addressConvertor.closeOnDemand()</b>;  yapısını unutmamamız gerekir.

> #### 🎯Assert 
> ✔ Verilen bilgiler doğrultusunda dönen verilerin kontrolünü gerçekleştirir.<br>
> assertEquals(expected,actual)<br>
> assertNull(given obje)<br>
> assertNotNull(given obje)<br>
> ....

```
  var exp = assertThrows(Exception.class,()->UserSercice.addUser(null);                     
  assertEquals(exp.getMessage(),"Hata mesajı");
  
  📌Verilen bu iki yapıda hata fırlatılmış mı, verilen hata mesajı bu mu kontrolü sağlar.
  
  org.assertj.core.api.Assertions.assertThatThrownBy(()->UserSercice.addUser(null))
                .isInstanceOf(Exception.class)
                .hasMessage("Hata mesajı");
```




















