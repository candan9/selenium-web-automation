# selenium-web-automation

![1 f7lT9HSzT2RcVxktn_SeGA](https://user-images.githubusercontent.com/49526501/174499258-8ff63b1a-570a-4f3f-9af5-7e6896e65304.png)

# Projede kullanılan araçlar ve kütüphaneler

Selenium,cucumber,sparkReport,log4j,testng.

# Projenin kapsamı aşağıdaki senaryodur.  

● www.gittigidiyor.com sitesi açılır.   
● Arama kutucuğuna bilgisayar kelimesi girilir.    
● Arama sonuçları sayfasından 2.sayfa açılır.    
● 2.sayfanın açıldığı kontrol edilir.   
● Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.   
● Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır.   
● Seçilen ürün sepete eklenir.   
● Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.   
● Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.   
● Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.   

# Test Koşması

Testler "resources/testSuites/Chrome.xml" dosyasını çalıştırarak tetiklenir.  
Testler "resources/testSuites/Parallel.xml" dosyasını çalıştırarak tetiklenir.  
Ayrıca ayrı ayrı feature dosyalarından ve test runner üzerinden de çalıştırılabilir.  


Proje paralel koşumu desteklemektedir(Chrome,Firefox).

# Raporlama

Projede Cucumber ve spark report bulunmaktadır.

Raporlar, /Reports/CucumberReport ve /Report/SparkReport klasörleri altında html ve pdf olarak oluşmaktadır.

