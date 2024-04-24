# Algoritma Analizi ve Tasarım Lisans Dersi

Lisans, yüksek lisans ve doktorası İTÜ Bilgisayar Mühendisliği olan Sayın Doç. Dr. Müge Özçevik'ten aldığım bu ders ve paralelinde götürdüğüm Anany Levitin'in "Introduction to the Design and Analysis of Algorithms" (2007) kitabından bu repoda açıklamalar bulacaksınız. Kodları bir challenge olarak görüp, olabildiğince herhangi bir araç kullanmadan pseudo code okuyarak kendim geliştirmeye ve üzerine koymayı hedefledim. Kodlara ait akış şemalarını (flow chart) ilk olarak boş bir kağıda çizip, ardından dijital ortamda oluşturmayı hedefledim.Bu repoda sadece sıralama algoritmaları,akış şemaları bulunmayacaktır.Hem derslerde hem kitapdan okurken çıkardığım hem de çeşitli videolardan da yararlanarak repoyu sorular sorarak çeşitlendirmeyi hedefliyorum.Ayrıca bu repoyu oluşturmamdaki diğer sebep ise ileride yapacağım işlerde bu soruları hatırlamak ve bilgisayar bilimlerinin en temeli olan bu bilimi unutmamakdır.Bu repoyu inceleyenler, derslerden Introduction to the Design and Analysis of Algorithms kitabından çıkardığım ve çeşitli videolardan çıkardığım sorulara mutlaka bakmalıdır.

# İçindekiler

https://www.toptal.com/developers/sorting-algorithms

### Algoritma

- **Algoritma**: Algoritmalar,her biri açık bir anlama sahip olan ve sınırlı süre içerisinde yeterli miktarda çabayla gerçekleştirilebilen sınırlı bir talimat dizisi [Aho,Hopcroft,and Ulman]

  - Sınırlı bir süre içindeden kasıt, mesala network iletişiminde 4G'de 120 ms iken, 5G'de bu süre 4 ms'e düşmüş ve 6G'de ise 1 ms'in altında olması bekleniyor.
  - Yeterli miktarda çabadan kastı ise hafızadan (memory) bahsediyor.Bunu da verimli olarak kullanmalıyız

### Algoritmanın temel özellikleri şunlardır:

- **Input (Giriş)**: Algoritmanın işlemesi için gereken başlangıç verileri veya girdilerdir.
- **Output (Çıkış)**: Algoritmanın işlemesi sonucunda üretilen çıktı veya sonuçlardır.
- **Definiteness (Kesinlik)**: Algoritmanın adımları belirli, açık ve tanımlı olmalıdır. Her adımın ne yapacağı net bir şekilde belirtilmelidir.
- **Correctness (Doğruluk)**: Algoritma, bütün geçerli girdiler için tanımlı bir çıktı üretmelidir. Yani, algoritmanın herhangi bir durumda doğru sonuçlar üretmesi gerekir.
- **Finiteness (Sonluluk)**: Algoritman, bir sonuç elde edene kadar veya belirli bir durum gerçekleşene kadar sonlu bir sayıda adım içinde tamamlanmalıdır. Sonsuz döngülere veya süreçlere yol açmamalıdır.
- **Effectiveness (Verimlilik)**: Her bir adım ve sonuca ulaşan yolun verimli olması gereklidir. Algoritma, minimum kaynak kullanımı ile en iyi sonucu elde etmek için optimize edilmelidir.
- **Generality (Genellenebilirlik)**: Algoritmanın, farklı girdi türleri veya problem boyutları için genellenebilir olması önemlidir. Yani, aynı algoritma farklı durumlar için uygulanabilir ve genel olarak geçerli olmalıdır.

## Algoritmalar ile ilgili iki temel konu bulunmaktadır:

- Algoritmalar nasıl tasarlanmalıdır ?
- Algoritmanın verimliliği nasıl analiz edilmelidir ?

  • Bunlar zaten birbirlerine input ve output veren iki önemli soru
  Nasıl tasarlamalıyız ? Verimli tasarlamalıyız. Tasarladığım şey verimli mi ? Verimli değilse tekrara dönüp tasarımımı değiştirmeliyim.Birbirini sürekli besleyen sorulardır.

  ![Algoritma Tasarımı ve Verimliliği Analizi Akış Şeması](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/fdfe4bee-2d1d-4c38-a502-d1572c38e46d)  ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/92ccb924-ff12-4d25-b86d-0648ef8d4569)

  Ek kaynak: https://vtuupdates.com/solved-model-papers/explain-the-algorithm-design-and-analysis-process/
  
- **Problem Anlayışı:**
  - Öncelikle problemi tam olarak anlamaya çalışıyoruz.

- **Hesaplama Detayları ve Yaklaşımlı Çözümler:**
  - Hesaplama detaylarını gözden geçiriyoruz ve farklı yaklaşımları değerlendiriyoruz.
  - Kullanılacak veri yapıları ve teknoloji dilleri üzerinde düşünüyoruz. Örneğin, Java'da ve C# gibi dillerde farklı ifadeler ve veri yapıları bulunabilir.
  - Hangi veri yapısının daha verimli olacağını değerlendiriyoruz. Bellek kullanımı ve hesaplama hızı açısından hangi veri yapısının daha uygun olduğunu belirlemeye çalışıyoruz.
  
 - **Veri Yapısı Seçimi:**
   - Kodlayacağımız işleme göre hangi veri yapısını kullanacağımızı belirliyoruz. Örneğin, matris yapısı mı, multi set mi, priority queue mu veya stack ve queue gibi kuyruklar mı kullanmalıyız?
   - Ekleme ve çıkarma işlemleri gibi temel operasyonlar üzerinde düşünüyoruz. Bu işlemleri sıkça yapacaksak, veri yapısını bu operasyonlara uygun olarak seçmeliyiz.
     
- **Algoritma Seçimi:**
  - Hangi algoritmanın kullanılacağına karar veriyoruz. Veri yapısını belirledikten sonra, bu veri yapısına uygun olarak hangi algoritmayı kullanacağımızı düşünüyoruz.
  - Algoritmanın karmaşıklığına ve performansına dikkat ediyoruz. Büyük veri setleriyle çalışacaksak, algoritmanın zaman ve bellek kullanımı açısından verimli olmasına özen gösteriyoruz.

- **Algoritma Tasarımı:**
  - Tüm bu düşünceleri göz önünde bulundurarak algoritmayı tasarlıyoruz.

- **Doğruluk Kontrolü:**
  - Tasarladığımız algoritmanın doğruluğunu kontrol ediyoruz. Algoritmanın belirli kısıtlara uyup uymadığını ve doğru sonuçlar verip vermediğini kanıtlamaya çalışıyoruz.

- **Verimlilik Analizi:**
  - Algoritmanın verimliliğini analiz ediyoruz.
  - Bellek kullanımını ve süre açısından makinelerin kabul edilebilir bir sürede sonuçları sunup sunmadığını değerlendiriyoruz.

- **Hizmete Sunma:**
  - En sonunda, istediğimiz dilde hizmete sunmak için algoritmayı hazır hale getiriyoruz.



### Algoritma Analizi - Çalışma Süresi Fonksiyonu - Karmaşıklık

- Şayet girdi küçükse hafıza ve zaman karmaşıklıkları çok önemli değildir.Algoritmaların karşılaştırılması için algoritmaların zaman ve hafıza karmaşıklıklarındaki büyüme karşılaştırılır.
- Burada Big-O terimine neden bu şekilde denildiğini de aktarmak isterim.Buradaki "Big" kelimesi, büyük giriş boyutlarına ve büyüyen veriye dair konseptleri vurgular; çünkü bu notasyon, bir algoritmanın veya fonksiyonun giriş boyutu arttıkça nasıl davrandığını göstermek için kullanılır."O" ise "Order" yani "derece" anlamına gelir. Bu notasyon, büyük ölçekli büyüme eğilimlerini yakalamaya çalışır ve dolayısıyla performans veya kaynak tüketimi açısından hangi büyüklükte değişimler beklenebileceğini belirtir.Terimin tam adı "Big-Order" gibi düşünülebilir, ancak kısaca "Big-O" olarak adlandırılır.

#### NOT:

Algoritmaların doğrudan 10 sayı için 20 sayı için nasıl çalıştığı değil,girdi sayısı ilerledikçe algoritmanın ne kadar hızlı değiştiği, ne kadar hızlı kötü duruma gittiğini öğrenmek önemlidir. Buna da Growth Rate diyoruz. Algoritmanın karmaşıklığındaki büyüme oranı diye ifade ediliyor.Buna Big-O da deniliyor.

### Soru 1:
Algoritma tasarımında, hız ve verimlilik açısından en büyük etkiyi hangi faktör sağlayacaktır ve neden ?

**Algoritma tasarımının hız ve verimlilik açısından en büyük etkiyi sağlayan faktör, algoritmanın temel yapısal karmaşıklığıdır.** .Diğer faktörler, örneğin _IDE'nin sağladığı hız, programlama dilinin bazı özellikleri veya işletim sistemi detayları_, algoritmanın performansını küçük nüanslarla arttırabilmektedir.

### Soru 2:
-  Bir algoritma, hem doğru sonuçları üretebiliyor hem de zamansal olarak verimli olabiliyorsa, benim için neden disk kullanımını minimize etmek önemlidir?

Ram ile disk arasındaki git-gel , git-gel  , git-gel  bilgisayarın ömrünü daha da kısaltır.Gerçekten memory'mizde işlerimizi çözebilecek bir algoritmayı diske ihtiyaç duymadan üretebiliyorsak o zaman verimli bir algoritma inşa etmişiz demektir.Burada hem doğru sonuç bulunmalı hem de zamansal olarak verimli olmalı.Bazen işlerimizi halledemediğimiz durumlar olacak. Bu durumda diske başvuracağız. O zamanda tabi ki diskimizdeki değerleri kullanacağız.Disk kullanmak ne demek ? Dosyaya yazmak,dosyadan okumak demek.Yani Disk kullanımını minimize etmek, bilgisayarın ömrünü uzatmanın yanı sıra performansı da artırır.Dosya yazma ve okuma işlemlerini en aza indirerek, algoritmanın hızını artırabilir ve bilgisayarın ömrünü uzatabiliriz.

## Algoritma Verimliliği Analizinin Temelleri

Amaçlar:
  -  Correctness
  -  Time Efficiency
  -  Space/Memory Efficiency
  -  Optimality

Yaklaşımlar:
  -  Teorik Analiz (1.adım)
  -  Deneysel Analiz (2.adım)

	 Öncelikle teorik yani matematiksel olarak hesaplayacağız ardından deneysel olarak test edeceğiz.10 defa üst üste çalıştırırken tekrarlar üst üste olmamalıdır.

 ## Algoritma Karmaşıklığı ( Complexity of Algorithm) 

  -  Algoritma ne kadar iyi ?
  -  Diğer algoritmalarla karşılaştırıldığında karmaşıklığı nasıl değerlendirilebilir ?
  -  Bulunabilecek en iyi algoritma bu mu ?

#### Time Complexity :
  -  Operasyon/Komut sayısına bağlıdır.Modele bağlıdır.RAM'e bağlıdır.

#### Space Complexity :
  -  Bit sayısına bağlıdır.Eleman sayısına bağlıdır.

Genellikle hem Time Complexity hem de Space Complexity O-Notation ile gösterilir.

#### Zaman Karmaşıklığı Örneği:
Diyelim ki bir kitaplığımız var ve bir kitabı bulmanız gerekiyor. İki yöntem düşünelim:
1. Doğrusal Arama (Linear Search): Kitaplığımızı düzenlememişdir ve her kitabı teker teker kontrol ediyoruzdur. Burada, kitap sayısı arttıkça bulma sürecimiz doğrusal olarak artar. Yani 100 kitap arasından bir kitap bulmak için ortalama 50 kontrol yapmamız gerekirken, 1000 kitap arasından bulmak için ortalama 500 kontrol yapmamız gerekir. Bu, zaman karmaşıklığının O(n) olduğu bir durumdur; "n" burada kitap sayısını temsil etmektedir.
2. İkili Arama (Binary Search): Kitaplığımız alfabetik olarak düzenlenmişsek, her seferinde aradığımız aralığı yarıya indirerek çok daha hızlı arama yapabiliriz. Yani, ilk kontrolde kitapların yarısını elemiş oluruz, sonra kalan yarısının yarısını ve bu şekilde devam eder. 100 kitap için en kötü durumda 7 (2^7=128), 1000 kitap için ise en kötü durumda 10 kontrol (2^10=1024) yeterlidir. Bu durumda zaman karmaşıklığı O(log n) olacaktır.


#### Uzay/Bellek Karmaşıklığı Örneği:
Bir parti düzenlediğimizi ve her misafire özel bir hediye paketi hazırladığımızı düşünelim.
1. Sabir Bellek Kullanımı: Parti için sabit sayıda masalar, sandalyeler ve süslemeler gibi malzemeler satın alacağız ve misafir sayısı ne olursa olsun bu miktar değişmeyecektir. Burada, malzemelerin toplam bellek (ya da uzay) ihtiyacı sabittir ve misafir sayısına bağlı olarak değişmez, yani O(1) karmaşıklığı vardır.
2. Dinamik Bellek Kullanımı: Her bir misafire özel bir hediye verdiğimizi varsayalım. Misafir sayımız arttıkça, daha fazla hediye paketi hazırlamamız ve bunlar için yer bulmamız gerekir. Eğer 10 misafirimiz varsa 10 hediye paketi, 100 misafirimiz varsa 100 hediye paketi hazırlarız. Bu durumda uzay/bellek karmaşıklığımız doğrusal olarak artar, yani O(n) olur.


### Time Efficiency

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/1dfcaefd-ed63-4c68-8888-20917c6b689c)

 Execution time for basic operation: Yani bir basit operasyonun çalışması için geçen süredir. C  (Constraint ) ile ifade edilir. Burada C(n) ifadesi, belirli bir işlemi n kez çağırmayı temsil eder. Örneğin, bir döngü içindeysek ve bu döngü n kez çalışıyorsa, bu, TIME COMPLEXITY'mizi belirleyen bir faktördür.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/322e7ca2-5e6c-4347-b532-fcbfee7abb1a)

1- N elemanlı bir listenin bir elemanını aramak:   
		a. Aramak benim için iki elemanı "karşılaştırıyorum" demektir. Hangisini arıyorsam o benim için basic operation olarak geçiyor.
		b. Bunu kaç defa çağırıyorum ? Bütün diziyi gezeceği için N defa çağırıyorum. O halde (N) X (basic operation) =Time Complexity olacaktır.

2- İki matrisin çarpımı
		a. İki sayının "çarpımı" benim için basic operation 'dır. İki matrisin çarpımını nasıl yaparız ? İki boyutlu olduğu için iki tane iç içe for döngüsü ile çözebiliriz.
		b. Bunu iki tane iç içe for döngüsü ile çarpmam bunlar matris boyutları oluyor.Bu sebeple mertebe N^2 olacaktır.

3- N sayısının asal olup olmaması 
		a. "Bölüm" benim için basic operation
		b.  N 'e kadar tüm elemanları bölmeye çalıştığım için  N kadar çağırıyorum.

4- Bir graph problemi yani en kısa yol problemi TSP olabilr vs.
      Vertex 'in ziyaret edilmesi ya da bir kenarın üzerinden geçme ikisinden biri benim için basic operation 'dır.Yani bir edge'in üzerinden geçme zaman alan bir işlem veya bir vertexe gitme zaman alan bir işlemdir.İkisinden biri benim için en basit operasyonun süresini verir.

### Bazı Önemli Fonksiyonlar n ---> sonsuza giderken:
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/b978f89d-8168-433f-af11-d5a49d4605d6)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/4be0c479-cf29-4fe7-ab41-b52195f59ed5)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/2fb6f519-27db-4f6d-ae73-97570f4e7743)

- Algoritmanın Best-case: Yaptığım en büyük basic operation "karşılaştırma" işlemidir.İki tane key'i karşılaştırıyorumdur.Bulamadıkça döngü ilerlemeye devam ediyor.Karşılaştırma işlemini en iyi ihtimalle ne kadar sürede bitirebilrim ?İlk elemanı bulup çıkabilirim veya hiç while döngüsüne girmeden direkt bulup çıkabilirim. O(1)
	
- Worst-case: Dizinin sonuna kadar gidebilirim.Elemanı hiç bulamam ya da sonuncu eleman olarak bulabilrim. O zaman N defa dönebilirim. O(n)
  
- Avarage-case: Bir dizinin ortasındaki eleman olabilirim.Dizinin ortasında bulabilirim. Dizinin ortası nedir ? N/2 'dir. Bu da T(n) olarak karşıma çıkar. O(n)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/5601b8cd-a779-4c69-9600-d2988e867d67)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/fd470bd2-bc70-4ada-b5fe-5b046fdf00c5)

Bu işaret Worst-case (Big-O) işaretidir.Yani f diye bir fonksiyon var. g(n) den daha fazla büyüyemeyen bir f(n) fonksiyonu var.Yani  g(n) daha karmaşık  anlamını taşıyor. Üst sınırım demek.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/07985271-ab0b-437c-a4fc-1f1766c1c938)

Bu işaret Average-case'in (Teta) işareti.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/475fb3e8-c753-40f3-b561-fa1788d0466c)

Bu işaret Best-case'in (omega) işaretidir. g(n) den daha hızlı olamıyorum anlamını taşıyor. f(n) öyle bir fonksiyon ki öyle bir algoritma ki  g(n) den daha hızlı olamıyor.  g(n) , f(n) 'den  daha hızlı olabilir ama  en kötü f(n) kadar olabilir. f(n) en iyi g(n) kadar olabilir. Buradaki best-case işaretinin içerisindeki g(n) alt sınırım demek.İlkinde ise üst sınırım demek.



![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/33907996-9e1e-43ea-8b8f-52bd909a639a)

algoritmaları, girdi boyutu büyüdükçe çalışma sürelerinin veya alan gereksinimlerinin nasıl arttığına göre sınıflandırmak için kullanılan matematiksel bir gösterim olan Big O gösterimini açıklamaktadır.

Dikey eksen çalışma süresini, yatay eksen ise girdi boyutunu(n) temsil etmektedir. Grafik üzerinde iki eğri vardır:

1. g(n): Bu eğri, karşılaştırma için bir referans fonksiyonu olan g(n) fonksiyonunu temsil eder.

2. t(n): Bu eğri f(n) algoritmasının gerçek çalışma süresini temsil eder.

ÖNEMLİ : Burada en kötü cg(n) kadar sürede çalışabilirimi ifade ediyor.Dikeyde aşağı dogru hareket ise en iyi çalışabilecek süreleri belirtecektir.

#### Üst Sınır
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/dbdb92e0-7b83-4260-b72c-4ade81fdbf37)


İşaretli olana dikkat et.Bu da olabilir.Çünkü "7n + 5 = O(n²)" ifadesi, "n'nin değeri büyüdükçe, 7n + 5 ifadesinin büyüme hızı, en fazla n²'nin büyüme hızına eşit ya da daha küçük olur" anlamına gelir. Matematiksel olarak, eğer bir c > 0 ve n₀ > 0 olmak üzere her n > n₀ için, 7n + 5 ≤ c * n² eşitsizliğini sağlayan c ve n₀ değerleri bulunabiliyorsa, "7n + 5 = O(n²)" ifadesi doğrudur.

Bu durumda, "7n + 5" ifadesi, n²'den daha düşük bir büyüme hızına sahip olduğu için, n²'nin büyüme hızını bir üst sınır olarak kabul etmek doğrudur. Ancak, büyük-O notasyonu en sıkı üst sınırı ifade etmeyebilir; daha çok bir fonksiyonun büyüme hızının bir üst sınırını belirler. Yani "7n + 5" ifadesi için "O(n)" daha kesin bir sınır olurken, "O(n²)" da teknik olarak doğru bir sınıflandırmadır çünkü n², 7n + 5'ten daha hızlı büyür ve bu yüzden bir üst sınır olarak kabul edilebilir.

Sonuç olarak, işaretli ifade doğru olsa da, en sıkı ya da en uygun sınıflandırma olmayabilir. "7n + 5" ifadesinin doğru asimptotik gösterimi "O(n)" olurdu, çünkü bu ifade, n'nin lineer büyümesini ifade eder ve n² terimine göre daha dar bir sınıflandırma sağlar. 

#### Alt Sınır

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/7b4df548-4a7e-4e08-a785-0f4e3cc3310a)

- Ben en hızlı cg(n) kadar olabilirim. Cg(n) den daha hızlı olamam anlamı taşıyor.Bundan daha az bir sürede çalışamam.En iyi çalışabileceğim süre  cg(n) dir. Ve dikeyde yukarı çıktıkça  cg(n) daha kötü sürelerde çalışacagımı belirtir bu grafik.Burada cg(n) alt sınır belirlemiştir.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/c042bdb7-26b3-4d5a-aa1a-a73d7ede5d82)

- 3n+2 'ye best-case de omega(n) diyebiliyorum.
- Bir şey üzeri n her zaman daha büyüktür.
- 3n-1  omega(1)  demek yanlış değil çünkü   3n-1 'in alt sınırı omega(n)  dir.


# Asimptotik Gösterim Sıralaması

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/7d44afa5-125d-469c-8c49-79978abbc981)



![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/3a516750-4179-488d-a351-aaef6dc41590)

-  Average-case de ise   c1g(n)  en kötü   c2g(n) ise en iyi bu olabiliyorum demektir. Bunlar arasında olduğumuzda g(n) kadar çalışabiliyorum demektir. En iyi de de en kötü de de.

-  3n+2=(1)  demek yanlış çünkü Omega(1)'den büyük ya da O(n^2) den küçük diye bir şey diyebiliriz. 1'dir demek yanlış. 

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/53915024-d523-45b8-8216-ea04ea85a525)


#### NOT: 
-	Asimptotik gösterimdeki  üst sınır ne kadar sıkıdır yani bana ne kadar yakındır ?
-	n^2  ve 2^n    n 'ye göre en yakın  n^2 en yakın  2^n ise en uzaktır.Hangisini o zaman tercih etmeliyim ?  Her zaman bana en yakını olanı üst sınır olarak tercih etmeliyim.


![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/28f18007-ffb7-403a-9211-60488c4b26f2)

-	Kırmızının üstü bizim için algoritmalar için kabul edilebilir bir süre olarak geçmektedir."Kabul edilebilir verimlilik "olarak geçmektedir.Biz verimli bir algoritma inşa etmek için hep kırmızının üstünde kalmaya çalışmalıyız.
-	Kırmızının altı ise np hard dediğimiz polynomial zamanda çözüme ulaşılamayacak süredir, kabul edilebilir süre olmayan problemler olarak geçiyor. Bu problemleri biz  kırmızı uca indirgemeye çalışacağız.Burada genellikle evrimsel algoritmalardan bahsedeceğiz.Genetik algoritmalardan bahsedecegiz.Paralel ve random çalışabildiğimiz hızlı ve kabul edilebilir makul cevaplar veren ama bazen en iyi cevabı veremeyen algoritmalar ama olabildiğince hızlı ve makul cevap veren günümüzde kullandığımız güzel algoritmaları kullanıyoruz. Complexity si kabul edilebilir olmayan problemleri kırmızı çizgisinin üstüne çekmeye çalıştığımız güzel algoritma çeşitleridir.Örneğin bin tane IoT cihazda paralel olarak küçük parçaları çalıştırarak  belirli zamana kadar indirgeyebilmeyi amaçlayacağız.Network dünyasında bu şekilde.


	- Bir framework icat ediliyor ve onu neden herkes kullanmaya başlıyor ?
    İşte bazı veri yapılarını cache leyip veya düzgün bir şekilde memoryde tutup bizim erişimimizi kırmızı çizginin üzerine çıkarabiliyor.

#### NOT : Non-Recursive  ve Recursive Konularına Girilmemiştir. ( Kendime bir hatırlatma olarak : Repoyu okuduğunda notlarına yeniden dön bak , uzun ama güzel işler var )

## Selection Sort (Seçerek Sıralama)

Verinin hafızada sıralı tutulması için geliştirilen sıralama algoritmalarından (sorting algorithms) bir tanesidir. Basitçe her adımda dizideki en küçük sayının nerede olduğu bulunur. Bu sayı ile dizinin başındaki sayı yer değiştirilerek en küçük sayılar seçilerek başa atılmış olur.Yani bu algoritma, tekrar tekrar en küçük veya en büyük elemanı seçerek işlem yapmaya yarayacaktır. Aşağıda, küçükten büyüğe sıralama yapmak için kullanılan adımlar sıralanmıştır:

Tarama (Scan): Liste baştan sona taranır ve en küçük eleman bulunur.
Değiştirme (Swap): Bulunan en küçük eleman ile listenin ilk elemanı yer değiştirilir. Bu işlem, en küçük elemanın doğru sıraya yerleştirilmesini sağlayacaktır.
Kalan Listeyi Tara: İlk eleman hariç kalan liste (n-1 eleman) tekrar taranır ve bu yeni alt kümeye göre en küçük eleman bulunur.
Swap Yapma: Bulunan yeni en küçük eleman, listenin ikinci elemanı ile yer değiştirilir.
Tekrarla: Her adımda, zaten sıralanmış olan elemanlar dışında kalan daha küçük bir alt küme üzerinde işlem yapılır. Bu, listenin her bir elemanı doğru pozisyona yerleştirilene kadar devam eder.

--->  i. Adımda, listenin kalan n-i  adet elemanın en küçüğü bulunur ve en küçük eleman  A[i]  ile yer değiştirilir.
---> n-1 adet döngü sonrasında, algoritma sonlanır

Yani sürekli dizide en küçüğü bulup  (n- i). Eleman yerine yerleştiriyorsun.Swap ediyorsun.Sonra geriye kalan listeyi tarıyorsun en küçüğü buluyorsun final position'a yerleştiriyorsun.Swap ediyorsun.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/74b53ce9-aa24-4275-ae1a-42ce76b38fad)
Elimde bu şekilde bir dizi var.Bütün diziyi taradım.En küçüğü 17. Bunu 1.pozisyondaki elemanla swap ediyorum.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/23c73d12-8fd7-45c8-85ba-bf3698b22fcb)
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/f7bd2eb0-b41a-430e-9fb4-7d7d9a887558)
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/253835a0-6ad0-453b-a376-1bec8c9fe0e5)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/2d1ccf48-7b80-4123-83cd-19d439bc177d)

Pseudo code'ları incelerken dikkat etmemiz gereken nokta  küçükten büyüğe mi yoksa büyükten küçüge mi sıralanmış bakılmalıdır.

Buradaki Basic operation:  Swap işlemi ya da karşılaştırma işlemi olarak düşünebiliriz.Genellikle iç içe döngü olduğu için karşılaştırma işlemi en basit operasyon alarız.Ve buna göre karmaşıklık analizi yaparız.

![Ekran görüntüsü 2024-04-20 015038](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/90b80998-e386-469d-a29c-c56cc7ffe865)

Sorting için  n^2 mertebe çok da olumlu değildir.Fakat insertion sort bu şekilde çalışıyor.

Karmaşıklık Analizi:
- n adet yer değiştirme operasyonu  yani Basit Operation: Swap ----> O(n)
- n-1 adet bu işlemin tekrarı vardır yani Basit Operation: Karşılaştırma ----> O(n^2)

Best case:   O(n^2)
Worst case:  O(n^2)
Average case:  O(n^2) dir.   

Best case ve worst case'in farkı sıralı olma ya da olmama durumudur.Bu algoritmanın karmaşıklığı O(n2) ‘dir çünkü her adımda n sayı işlenmekte ve bu işlem n kere tekrar edilmektedir.

![Selection Sort](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/72442c80-229c-4183-aaec-0f26843097b3)

Yazdığım kodda ve buradan da anlaşılacağı üzere ;
- Dizide iki tane işaretçi belirledim.Amacım bu iki işaretçinin gösterdiği değerleri kıyaslamak
- En içteki döngü en dıştaki döngüden daha hızlı ilerleyeceği için en dış döngümde ilk olarak 1.işaretçim ile dizinin ilk elemanının değerini min değişkenine atıyorum
- En iç döngümde ise  j diye sürekli dizinin üzerinde gezecek farklı bir işaretçim olacak.
- Birinci işaretçim(min) 'deki değer > 2. işaretçim(j) 'deki değerden büyükse  j değerimi (dikkat et işaretçimi değil değerini) min'e atıyorum (min=j)
- Böylelikle  dizideki minimum değer bir değişkende(min)  tutulacaktır.
- İkinci işaretçim bu şekilde sabit kalan 1.işaretçim (min) deki değerle dizinin sonuna kadar giderek karşılaştırılır ve dizideki en küçük elemanı bulmayı amaçlar
- Böylelikle dizide bulunan en küçük eleman ile ilgili indekdeki elemanlar swap edilir.
- Tüm süreç gerçekleştikten sonra elimdeki veri listem küçükten büyüğe sıralanmış bir şekilde olacaktır.
     


## Insertion Sort 

Eklemeli sıralama veya araya yerleştirilerek sıralama, programlaması oldukça basit ancak performansı merge sort (bölerek sıralama), Quick (Hızlı sıralama) gibi sıralamalara göre nispeten yavaş bir sıralama algoritmasıdır.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/c4728799-28c7-41e9-a92c-99670ef85074)

- Algoritma ilk geçişte yani ilk elemana kadar olan sayıları sıralı olarak kabul ediliyor.Elinde bir sayı varsa sıralı halde kendisi olacaktır.
- Buradaki çizgi: Belirtilen yere kadarki elemanların sıralandığını belirtir.
- Sonra ikinci sayıya bakıyor ve bir önceki ile ikinci sayıyı karşılaştırıyor.Eğer ki sıralı ise herhangi bir işlem yapmayacaktır.
- Üçüncü geçişte  3. elemanı bulacak, solundaki elemandan küçük mü ? Evet.  O zaman bir sola daha gidiyor. Bu sayıdan küçük mü  ? Evet. Bir sola daha gidiyor şeklinde en küçüğü bulana kadar devam edecektir.Kendisinde büyük eleman görünce duracaktır.
- Bu şekilde aralara ilgili sayılar yerleştirilerek diziyi sıralanacaktır

Kısacası her adımda tek sayı sokabiliriz yani insert edebiliriz.Birden fazla sayıyı aynı anda kaydırmak gibi işlemler,bu sıralama algoritmasının hızlandırılması için kullanılan  iyileştirmelerdir.Bu uygulanabilir ancak klasik halinde böyle bir uygulama yoktur.

### NOT:
Dizinin üzerinde her seferinde swapping işlemi yapılıyor.Bir önceki ile bir sonrakinin yer değiştirilmesi şeklinde devam ediyor.Bütün sayılarının yerinin oynatılması gerekiyor,böyle bir problem var.En başa gidelecekse de bütün dizinin geçilmesi gibi bir problem var.


#### Worst case:  
Dizi bize tam ters sıralı bir şekilde verildiğini düşünelim.Yani biz küçükten büyüğe sıralamak istiyoruz ama  Büyükten küçüğe sıralı bir dizi verildi. O zaman her sayı için en küçük sayı en başa  getirilene kadar yani ilk sayı alınacak sonra ikinci sayı alınacak sonra üçüncü sayı  şeklinde  n'e kadar giden sayıların toplamı kadar üzerinden geçilecek. Dolayısıyla n.(n+1)/2 dir. Genel olarak sıralama algoritmalarında görmeye alışık olduğumuz bir durumdur.Comlexity'si (N^2 )olacaktır.

#### Best case:
Sıralı  bir dizi verilmiş olabilir. Küçükten büyüğe sıralamak istiyoruzdur ve  küçükten büyüğe sıralı bir dizi verilmiş olabilir. O zaman tek yapacağımız şey sıralılar çubuğunu kaydırmak. Bu durumda da  n tane sayının üzerinden birer kere geçeceği için Complexity'si  (N )olacaktır

#### Average case:
N^2 ile N nin ortalaması  da N^2 cinsinden bir şey çıkacaktır.

### NOT : Bu  algoritma bir önceki Selection Sort 'a göre  Best case ve Average case 'de avantajlı fakat worst case'de yine aynıdır.Kodlamasına gelince ise genellikle dizi üzerinden kodlanıyor.

### Space Complexity

 Hafıza karmaşıklığı  N 'dir çünkü N 'lik bir dizinin içerisinde çalışabiliyor " ilave bir hafızaya ihtiyaç duymuyor ".


 ### NOT : Şöyle bir genel yanılgı vardır.Levitin'in kitaplarında Average case: (best case + worst case)/2   bunun doğru olmayacağı belirtilse de ve genellikle belirli kabuller ve olasılıklar alınarak average case bulunulduğu belirtilse de bunun yanlış olabileceğini kanıtlayan çıkarımlar mevcut.Okuduğum kitaba ve yaptığım araştırmaya göre Levitin'in kitabında "random dağılımlar" için bu kabul ediliyor. Notasyon olarak  n^2/2 zaten sabit değerle çarpma/bölme  işlemi olduğu için  n^2 'ye yakınsar.Yaptığım araştırmaya göre internet üzerinden bunun zamanını ölçen birkaç bulguya rastladım.

 ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/bf24f1e8-92fc-43a9-806c-3f6652ffec38)

Görüldüğü üzere  ortalama değer zamanını (max+min)/2 değerine yakın veriyor.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/84ee7fef-581e-45f2-9ea7-5b2caf9b10de)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/e6bc639f-5f97-4e26-8a68-0cc84f441d5d)

### Karmaşıklık Analizi

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/e67ed756-24c9-40ad-9dfa-e51c50c496b9)

- Burada best case iç loop'a hiç girmeyebilir demiş.Eğer sıralı bir dizi gelirse iç loop'a hiç girmesse benim için tek loop'da bitiyor.Insertion  sort'un select sorta göre en büyük avantajı budur.Eğer dizi sıralı ise bir tane loop dönüp O(n) 'de bitiveriyor.Zaten sıralı olduğu için tekrrar tekrar swap işlemi yapmasına gerek kalmiyor.Insertion sort'da base casede sıralı olsa dahi döngüyü dolaşacaktır.Çünkü sıralı olsa dahi minimumu bulacaktır.
- Aynı şekilde while döngüsünden kaynakla n^2 mertebesine çıkıyor diyoruz.
- Mentalite yine aynı bir şeyin en küçüğünü bulmaktır.Ya dıştan yani arkadan,en sonuncudan aşağı inmek ya da başlangıçtan yukarı çıkmak.İki temel fark budur.Bakarsak ikisi de aynı mertebede çalışıyor. N^2 mertebesinde çalışıyor. 

### Önemli

- Selection sort garanti best case  n^2 de çalışıyor ama insertion sortda best case'in avantajı vardır.Sıralı olduğu zaman while döngüsüne girmiyor.Bu sebeple while döngüsü seçilmiştir zaten.Neden iç içie for loop veya  neden bir for  bir while tercih ediyim ki  sorusunu bügüne kadar düşündük mü ?  İşte farkı bu iki tane sorting algoritması eğer sıralı bir dizi geliyorsa tek  n loop'unda bitiriyor. O(n) ile bitirip çıkıyor.While loop'una girmiyor

- Selection sort, best case senaryosunda bile O(n^2) zaman karmaşıklığına sahipken, Insertion sort'ta best case O(n) avantajı  vardır. İkinci durumda, dizi zaten sıralı olduğunda, while döngüsüne girmediği için ek işleme gerek kalmaz. Bu nedenle, Insertion sort'un iç mekanizması, veri zaten sıralıysa optimal bir şekilde çalışır.Yani sıralı olduğu zaman while döngüsüne girmiyor.Zaten bu sebeple while döngüsü seçilmiştir.Neden " iç içe  for loop" veya  neden " bir for  bir while " tercih ediyim ki  sorusunu bügüne kadar düşündük mü ?  İşte farkı bu iki tane sorting algoritması eğer sıralı bir dizi geliyorsa " tek  n loop'unda "  bitiriyor. O(n) ile bitirip çıkıyor.While loop'una girmiyor.Bu nedenle, insertion sort, sıralı veya neredeyse sıralı diziler için tercih edilen bir algoritmadır. Bu durum, algoritmanın sıralı bir dizi ile karşılaştığında, sadece tek bir geçişle 
O(n) zaman karmaşıklığı ile çalışmasına olanak sağlar. While döngüsüne girmediği için zaman kazanır, bu da Insertion sort'un temel avantajlarından biridir.

Ancak en kötü durum için, for döngüsü 𝑛 kere çalışacak, while döngüsü de 𝑛 kere çalışacak ve swap işlemleri yapılacaktır. Bu durum, Selection sort algoritmasına göre daha fazla swap işlemi yapılmasına neden olur, ki bu da işlem süresini (processing time) artırır. En kötü durumda, Selection Sort'un karmaşıklığı O(n^2) olmasına rağmen, deneysel analizler, Insertion sort'un bu durumda daha uzun sürebileceğini gösterir.Insertion sort'un en kötü senaryosu, sıralama işlemini küçükten büyüğe yaparken, giriş verisinin büyükten küçüğe sıralı olması durumudur. Bu durumda, en kötü vakayı yaşayacağızdır.

Selection sort, iki iç içe geçmiş for döngüsü kullanılarak inşa edilir ve her döngüde sadece bir swap işlemi yapılır. Öte yandan, Insertion sort'ta daha fazla swap işlemi olabilir.

- Selection sort ---> Basic Operation : Karşılaştırma iken
- Insertion sort ---> Basic Operation : Swap işlemidir.

Bu iki algoritmanın karmaşıklık analizleri her ne kadar O(n^2) olarak görünse de, implementasyon sürecinde aralarında belirgin bir fark vardır. Insertion sort, karşılaştırmalı olarak daha fazla swap işlemi gerektirir, bu da onu Selection sort'a göre daha yavaş ve daha az verimli kılar.

İkisinin arasındaki fark, karmaşık giriş kümeleriyle çalışıldığında daha da belirginleşir. Insertion sort'ta, her döngüde bir swap işlemi gerçekleşebilir. Bu, döngü sayısı arttıkça işlem süresinin de artmasına yol açar. Selection sort'ta ise her döngüde sadece bir swap işlemi vardır. Sonuç olarak, implementasyon sırasında, Selection sort genellikle daha verimliyken, Insertion sort daha fazla swap işlemi nedeniyle daha yavaş çalışabilir.

Insertion Sort:
- Best case: O(N)
- Average case: O(N^2)  
- Worst case: O(N^2)


#### Insertion Sort Daha İyi Anlamak İçin Oluşturduğum Akış:

![Insertion Sort](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/7bd2a413-0872-4914-b0a0-bb31b35787ad)

#### Yani bakıyor, karşılaştırıyor eğer küçükse küçük olanı karşılaştıra karşılaştıra , kaydıra kaydıra aşagı indiriyor.

## Bubble Sort ( Kabarcık Sıralaması)

- Baloncuk sıralama algoritması (bubble sort), verilerin hafızada sıralı şekilde tutulmasını sağlayan basit bir algoritmadır. Bu algoritma, ardışık iki hafıza bloğunu karşılaştırarak ve gerekli olduğu durumlarda değiştirerek çalışır. Ardışık iki blok üzerinde yapılan bu kontrol ve değişim işlemi, algoritmanın bir baloncuğun yüzeye çıkması gibi veriler üzerinde yukarıya doğru hareket etmesi nedeniyle "baloncuk" ismini almıştır.

- Baloncuk sıralama algoritması, bu kontrol ve değişim işlemini sürekli tekrarlayarak verileri sıralar. Sıralama tamamlanana kadar her döngüde ardışık bloklar üzerinde kıyaslama yapılır ve gerektiğinde değişiklikler uygulanır. Basitliği ve netliği nedeniyle eğitim amaçlı sıklıkla kullanılan bu algoritma, küçük veriler için uygundur ancak büyük verilerde daha verimli algoritmalar tercih edilir.

- ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/5bf7a805-acba-43a5-8349-9c10b8d45eae)

Başlangıç: Bu dizi üzerinde işlem yapmaya başladığımızı varsayalım. Öncelikle ilk iki elemana bakarak küçükten büyüğe sıralama yapıyoruz. Örneğin, 5 ve 7'ye bakarak hangisinin daha küçük olduğunu belirliyoruz. Eğer küçük olan zaten öncedeyse, yerlerini değiştirmiyoruz. Bu durumda, 5 zaten 7'den küçük olduğu için hiçbir değişiklik yapılmayacaktır.

İlerleme: Daha sonra, bir adım kayarak sonraki iki elemana bakıyoruz. Örneğin, 7 ve 2'yi karşılaştırarak hangisinin küçük olduğunu belirliyoruz. Eğer 2 küçükse, 2'yi başa alarak 7'yi sonraya kaydırıyoruz. Bu şekilde, daha küçük sayılar öne doğru kaydırılmış olacaktır.

İlk Dizi Üzerinden Geçiş: Dizinin tamamı üzerinden bir kez geçildiğinde, "en büyük sayı sona doğru kaydırılmış " olur. Birinci geçiş tamamlandığında, "dizideki en büyük sayı sona yerleşmiş olacaktır".

Tekrar: Algoritma, her seferinde bir adım daha azalarak dizinin üzerinden tekrar geçer. İkinci geçişte, en büyük iki sayı sona yerleşmiş olur. Üçüncü geçişte, en büyük üç sayı sona atılır ve bu şekilde devam eder.

Tamamlanma: Bu algoritma, dizi içerisindeki N elemanı N kere tekrar ederek sıralar. Her adımda, dizideki en büyük eleman sona doğru kaydırılır ve sonuçta dizi küçükten büyüğe doğru sıralanmış olur.
Bu süreç adım adım takip edilerek , sıralama işlemi başarıyla tamamlanır. Bu süreç, n elemanlı bir dizi için n-1 geçiş gerektirir, ancak bazı iyileştirmelerle bu sayıyı azaltmak mümkündür.


#### Algoritmanın çalışması şu şekilde olacaktır

1. ilk iki sayıyı al
2. aldığın iki sayıyı karşılaştır
3. küçük olanı yaz diğerini aklında tut
4. dizinin sonuna geldiysen aklındaki sayıyı diziye yazarak bitir
5. dizinin sonu değilse yeni bir sayı al.
6. 2. adıma geri git.


#### İyileştirme Olarak

- Zaten sıralı dizi: Eğer dizi zaten sıralıysa, ilk geçişten sonra daha fazla geçişe gerek yoktur.
- Tersten sıralı dizi: Dizi tersten sıralıysa, en fazla sayıda geçiş gerektirir. 

#### İyileştirme Yaklaşımları

- Sıralı diziyi erken tespit etme: Eğer bir geçiş sırasında hiç değişim olmazsa, dizinin zaten sıralı olduğu anlamına gelir. Bu durumda, daha fazla geçiş yapmak gereksizdir.
  
- Geçiş sınırlarını daraltma: Her geçişte en büyük eleman sona taşındığı için, sonraki geçişlerde son elemanı kontrol etmek gereksizdir. Bu nedenle, sonraki her geçişte kontrol edilen eleman sayısı azalır. Örneğin, ilk geçişten sonra son elemanı kontrol etmeye gerek yoktur. İkinci geçişte son iki elemanı, üçüncü geçişte son üç elemanı kontrol etmek gereksizdir.

#### Bubble Sort Time and Space Complexity

- Worst-case time complexity: O(n²)
- Average time complexity: O(n²)
- Best-case time complexity: O(n) (dizi zaten sıralanmış ise)

#### NOT :  Hafızadaki ihtiyacına bakıldığında ise mevcut veri kadar yer tutması yeterlidir. Bu durumda hafıza karmaşıklığı O(n) olarak hesaplanabilir.

Worst case için N elemanlı bir dizi için  N kadar adım olacak ve her adımda da 1 azalarak gidecek.Dolayısıyla  1 'den N 'e kadar olan sayıların toplamı şeklinde adım  gerekecektir. Bu da n.(n+1)/2 dir. Yani O(N^2) olacaktır.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/2d5249f6-ebe5-4e62-a821-01a87a08bbdb)

#### Complexity Analysis

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/a4136ed0-f884-483c-9d40-a62cfe2abfd9)


#### NOT: Insertion sortdaki fark karşılaştırıp kaydıra kaydıra başa kadar iniyorduk.Burada ise komşu komşu kaydırıyoruz.Sırasısz ise yer değiştiriyoruz.

- Selection Sort :  Tüm diziyi tarıyordu başa koyuyordu, tüm diziyi tarıyordu başa koyuyordu.

- Insertion Sort:  Bakıyordu, karşılaştırıyordu eğer küçükse küçük olanı karşılaştıra karşılaştıra , kaydıra kaydıra aşagı indiriyordu.
  
- Bubble Sort: 	- Bubble sortdaki fark büyüğü alıp en sona oturtuyor.Diğerlerindeki fark ise kaydıra kaydıra küçükleri başa çekiyor. N^2 mertebesinde bir algoritmadır.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/ef75e5fb-572b-43c3-8a5a-7ecb4e7caaa8)

Burada sıralı dizinin gelmesi swap operasyonunu azaltır fakat bu iki döngü kesinlikle dönecektir. Bu durum için (iyileştirmeden yapılmamış hali) 

- Best case: N^2 
- Average case: N^2
- Worst case: N^2


#### NOT: Eklenilen kodda  her geçişte bütün diziye bakılmasına gerek yoktur. Çünkü dizinin sonundaki elemanlar zaten yer değiştirmeyecektir.

#### NOT: En kötü durumda (worst case analysis) n^2 olur.Çünkü  her geçişte geçiş sayısı kadar elemana bakılması gerekecektir. Örneğin eleman sayısı n olan bir dizi için k. geçişte n-k elemana bakılacak. Dolayısıyla 0. geçişte n elemana 1. geçişte n-1 elemana son geçişte ise n-n yani 0 elemana bakılır. Bu durumda toplam sayı 1’den n’ya kadar olan sayılrın toplamıdır ve n x (n+1) / 2 elemana bakılması gerekir. Bu durumda O(n2) değeri bulunur (upper bound olduğu için)










