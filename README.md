# Algoritma Analizi ve Tasarım Lisans Dersi

Lisans, yüksek lisans ve doktorası İTÜ Bilgisayar Mühendisliği olan Sayın Doç. Dr. Müge Özçevik'ten aldığım bu ders ve paralelinde götürdüğüm Anany Levitin'in "Introduction to the Design and Analysis of Algorithms" (2007) kitabından bu repoda açıklamalar bulacaksınız. Kodları bir challenge olarak görüp, olabildiğince herhangi bir araç kullanmadan pseudo code okuyarak kendim geliştirmeye ve üzerine koymayı hedefledim. Kodlara ait akış şemalarını (flow chart) ilk olarak boş bir kağıda çizip, ardından dijital ortamda oluşturmayı hedefledim.Bu repoda sadece sıralama algoritmaları,akış şemaları bulunmayacaktır.Hem derslerde hem kitapdan okurken çıkardığım hem de çeşitli videolardan da yararlanarak repoyu sorular sorarak çeşitlendirmeyi hedefliyorum.Ayrıca bu repoyu oluşturmamdaki diğer sebep ise ileride yapacağım işlerde bu soruları hatırlamak ve bilgisayar bilimlerinin en temeli olan bu bilimi unutmamakdır.Bu repoyu inceleyenler, derslerden Introduction to the Design and Analysis of Algorithms kitabından çıkardığım ve çeşitli videolardan çıkardığım sorulara mutlaka bakmalıdır.

# İçindekiler

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

#### NOT:

Algoritmaların doğrudan 10 sayı için 20 sayı için nasıl çalıştığı değil,girdi sayısı ilerledikçe algoritmanın ne kadar hızlı değiştiği, ne kadar hızlı kötü duruma gittiğini öğrenmek önemlidir. Buna da Growth Rate diyoruz. Algoritmanın karmaşıklığındaki büyüme oranı diye ifade ediliyor.Buna Big-O da deniliyor.

### Soru 1:
Algoritma tasarımında, hız ve verimlilik açısından en büyük etkiyi hangi faktör sağlayacaktır ve neden ?

**Algoritma tasarımının hız ve verimlilik açısından en büyük etkiyi sağlayan faktör, algoritmanın temel yapısal karmaşıklığıdır.** .Diğer faktörler, örneğin _IDE'nin sağladığı hız, programlama dilinin bazı özellikleri veya işletim sistemi detayları_, algoritmanın performansını küçük nüanslarla arttırabilmektedir.

### Soru 2:
-  Bir algoritma, hem doğru sonuçları üretebiliyor hem de zamansal olarak verimli olabiliyorsa, benim için neden disk kullanımını minimize etmek önemlidir?

Ram ile disk arasındaki git-gel , git-gel  , git-gel  bilgisayarın ömrünü daha da kısaltır.Gerçekten memory'mizde işlerimizi çözebilecek bir algoritmayı diske ihtiyaç duymadan üretebiliyorsak o zaman verimli bir algoritma inşa etmişiz demektir.Burada hem doğru sonuç bulunmalı hem de zamansal olarak verimli olmalı.Bazen işlerimizi halledemediğimiz durumlar olacak. Bu durumda diske başvuracağız. O zamanda tabi ki diskimizdeki değerleri kullanacağız.Disk kullanmak ne demek ? Dosyaya yazmak,dosyadan okumak demek.Yani Disk kullanımını minimize etmek, bilgisayarın ömrünü uzatmanın yanı sıra performansı da artırır.Dosya yazma ve okuma işlemlerini en aza indirerek, algoritmanın hızını artırabilir ve bilgisayarın ömrünü uzatabiliriz.

### Algoritma Verimliliği Analizinin Temelleri

Amaçlar:
  -  Correctness
  -  Time Efficiency
  -  Space/Memory Efficiency
  -  Optimality

Yaklaşımlar:
  -  Teorik Analiz (1.adım)
  -  Deneysel Analiz (2.adım)

	• Öncelikle teorik yani matematiksel olarak hesaplayacağız ardından deneysel olarak test edeceğiz.10 defa üst üste çalıştırırken tekrarlar üst üste olmamalıdır.

 ### Algoritma Karmaşıklığı ( Complexity of Algorithm) 

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

	• Execution time for basic operation: Yani bir basit operasyonun çalışması için geçen süredir. C  (Constraint ) ile ifade edilir. Burada C(n) ifadesi, belirli bir işlemi n kez çağırmayı temsil eder. Örneğin, bir döngü içindeysek ve bu döngü n kez çalışıyorsa, bu, TIME COMPLEXITY'mizi belirleyen bir faktördür.

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/322e7ca2-5e6c-4347-b532-fcbfee7abb1a)

	1-  N elemanlı bir listenin bir elemanını aramak:   
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

	- Best-case: Yaptığım en büyük basic operation "karşılaştırma" işlemidir.İki tane key'i karşılaştırıyorumdur.Bulamadıkça döngü ilerlemeye devam ediyor.Karşılaştırma işlemini en iyi ihtimalle ne kadar sürede bitirebilrim ?İlk elemanı bulup çıkabilirim veya hiç while döngüsüne girmeden direkt bulup çıkabilirim. O(1)
	
	
	- Worst-case: Dizinin sonuna kadar gidebilirim.Elemanı hiç bulamam ya da sonuncu eleman olarak bulabilrim. O zaman N defa dönebilirim. O(n)
 	- Avarage-case: Bir dizinin ortasındaki eleman olabilirim.Dizinin ortasında bulabilirim. Dizinin ortası nedir ? N/2 'dir. Bu da T(n) olarak karşıma çıkar. O(n)

![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/5601b8cd-a779-4c69-9600-d2988e867d67)

	1- ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/fd470bd2-bc70-4ada-b5fe-5b046fdf00c5)

Bu işaret Worst-case (Big-O) işaretidir.Yani f diye bir fonksiyon var. g(n) den daha fazla büyüyemeyen bir f(n) fonksiyonu var.Yani  g(n) daha karmaşık  anlamını taşıyor. Üst sınırım demek.

	2- ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/07985271-ab0b-437c-a4fc-1f1766c1c938)

Bu işaret Average-case'in (Teta) işareti.

	3- ![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/475fb3e8-c753-40f3-b561-fa1788d0466c)

Bu işaret Best-case'in (omega) işaretidir. g(n) den daha hızlı olamıyorum anlamını taşıyor. f(n) öyle bir fonksiyon ki öyle bir algoritma ki  g(n) den daha hızlı olamıyor.  g(n) , f(n) 'den  daha hızlı olabilir ama  en kötü f(n) kadar olabilir. f(n) en iyi g(n) kadar olabilir. Buradaki best-case işaretinin içerisindeki g(n) alt sınırım demek.İlkinde ise üst sınırım demek.



![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/33907996-9e1e-43ea-8b8f-52bd909a639a)

	- algoritmaları, girdi boyutu büyüdükçe çalışma sürelerinin veya alan gereksinimlerinin nasıl arttığına göre sınıflandırmak için kullanılan matematiksel bir gösterim olan Big O gösterimini açıklamaktadır.

	- Dikey eksen çalışma süresini, yatay eksen ise girdi boyutunu(n) temsil etmektedir. Grafik üzerinde iki eğri vardır:

	1. g(n): Bu eğri, karşılaştırma için bir referans fonksiyonu olan g(n) fonksiyonunu temsil eder.

	2- t(n): Bu eğri f(n) algoritmasının gerçek çalışma süresini temsil eder.

ÖNEMLİ : 	Burada en kötü cg(n) kadar sürede çalışabilirimi ifade ediyor.Dikeyde aşağı dogru hareket ise en iyi çalışabilecek süreleri belirtecektir.

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

	- Average-case de ise   c1g(n)  en kötü   c2g(n) ise en iyi bu olabiliyorum demektir. Bunlar arasında olduğumuzda g(n) kadar çalışabiliyorum demektir. En iyi de de en kötü de de.
 
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/662bcb21-1308-4825-b892-5feacba8d38d)

	- 3n+2=(1)  demek yanlış çünkü Omega(1)'den büyük ya da O(n^2) den küçük diye bir şey diyebiliriz. 1'dir demek yanlış. 
![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/61c75ed6-19e5-4c1f-b88e-21f5912e0b8c)



![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/53915024-d523-45b8-8216-ea04ea85a525)


#### NOT: 
	- Asimptotik gösterimdeki  üst sınır ne kadar sıkıdır yani bana ne kadar yakındır ?
	-   n^2  ve 2^n    n 'ye göre en yakın  n^2 en yakın  2^n ise en uzaktır.Hangisini o zaman tercih etmeliyim ?  Her zaman bana en yakını olanı üst sınır olarak tercih etmeliyim.


![image](https://github.com/SametKaanKskn/Time-Complexity-Space-Complexity/assets/111184050/28f18007-ffb7-403a-9211-60488c4b26f2)

	- Kırmızının üstü bizim için algoritmalar için kabul edilebilir bir süre olarak geçmektedir."Kabul edilebilir verimlilik "olarak geçmektedir.Biz verimli bir algoritma inşa etmek için hep kırmızının üstünde kalmaya çalışmalıyız.
	- Kırmızının altı ise np hard dediğimiz polynomial zamanda çözüme ulaşılamayacak süredir, kabul edilebilir süre olmayan problemler olarak geçiyor. Bu problemleri biz  kırmızı uca indirgemeye çalışacağız.Burada genellikle evrimsel algoritmalardan bahsedeceğiz.Genetik algoritmalardan bahsedecegiz.Paralel ve random çalışabildiğimiz hızlı ve kabul edilebilir makul cevaplar veren ama bazen en iyi cevabı veremeyen algoritmalar ama olabildiğince hızlı ve makul cevap veren günümüzde kullandığımız güzel algoritmaları kullanıyoruz. Complexity si kabul edilebilir olmayan problemleri kırmızı çizgisinin üstüne çekmeye çalıştığımız güzel algoritma çeşitleridir.Örneğin bin tane IoT cihazda paralel olarak küçük parçaları çalıştırarak  belirli zamana kadar indirgeyebilmeyi amaçlayacağız.Network dünyasında bu şekilde.


	- Bir framework icat ediliyor ve onu neden herkes kullanmaya başlıyor ?
    İşte bazı veri yapılarını cache leyip veya düzgün bir şekilde memoryde tutup bizim erişimimizi kırmızı çizginin üzerine çıkarabiliyor.

#### NOT : Non-Recursive  ve Recursive Konularına Girilmemiştir. ( Kendime bir hatırlatma olarak : Repoyu okuduğunda notlarına yeniden dön bak , uzun ama güzel işler var )

























### Selection Sort (Seçerek Sıralama)

### Insertion Sort
