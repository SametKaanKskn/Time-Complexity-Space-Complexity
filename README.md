# Algoritma Analizi ve Tasarım Lisans Dersi

Lisans sürecimde Sayın Doç.Dr.Müge Özçevik'den aldığım bu ders ve paralelinde götürdüğüm Anany Levitin'in "Introduction to the Design and Analysis of Algorithms" (2007) kitabından bu repoda açıklamalar bulacaksınız. Kodları bir challenge olarak görüp, olabildiğince herhangi bir araç kullanmadan pseudo code okuyarak kendim geliştirmeye ve üzerine koymayı hedefledim. Kodlara ait akış şemalarını (flow chart) ilk olarak boş bir kağıda çizip, ardından dijital ortamda oluşturmayı hedefledim.Bu repoda sadece sıralama algoritmaları,akış şemaları bulunmayacaktır.Hem derslerde hem kitapdan okurken çıkardığım hem de çeşitli videolardan da yararlanarak repoyu sorular sorarak çeşitlendirmeyi hedefliyorum.Ayrıca bu repoyu oluşturmamdaki diğer sebep ise ileride yapacağım işlerde bu soruları hatırlamak ve bilgisayar bilimlerinin en temeli olan bu bilimi unutmamakdır.

# İçindekiler

### Algoritma

- **Algoritma**: Algoritmalar,her biri açık bir anlama sahip olan ve sınırlı süre içerisinde yeterli miktarda çabayla gerçekleştirilebilen sınırlı bir talimat dizisi [Aho,Hopcroft,and Ulman]

- - Sınırlı bir süre içindeden kasıt, mesala network iletişiminde 4G'de 120 ms iken, 5G'de bu süre 4 ms'e düşmüş ve 6G'de ise 1 ms'in altında olması bekleniyor.
- - Yeterli miktarda çabadan kastı ise hafızadan (memory) bahsediyor.Bunu da verimli olarak kullanmalıyız

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



### Complexity (Karmaşıklık)

- Şayet girdi küçükse hafıza ve zaman karmaşıklıkları çok önemli değildir.Algoritmaların karşılaştırılması için algoritmaların zaman ve hafıza karmaşıklıklarındaki büyüme karşılaştırılır.

#### NOT:

Algoritmaların doğrudan 10 sayı için 20 sayı için nasıl çalıştığı değil,girdi sayısı ilerledikçe algoritmanın ne kadar hızlı değiştiği, ne kadar hızlı kötü duruma gittiğini öğrenmek önemlidir. Buna da Growth Rate diyoruz. Algoritmanın karmaşıklığındaki büyüme oranı diye ifade ediliyor.Buna Big-O da deniliyor.

### Soru 1:

Algoritma tasarımında, hız ve verimlilik açısından en büyük etkiyi hangi faktör sağlar ve neden ?

**Algoritma tasarımının hız ve verimlilik açısından en büyük etkiyi sağlayan faktör, algoritmanın temel yapısal karmaşıklığıdır.** .Diğer faktörler, örneğin _IDE'nin sağladığı hız, programlama dilinin bazı özellikleri veya işletim sistemi detayları_, algoritmanın performansını küçük nüanslarla arttırabilmektedir.

### Selection Sort (Seçerek Sıralama)

### Insertion Sort
