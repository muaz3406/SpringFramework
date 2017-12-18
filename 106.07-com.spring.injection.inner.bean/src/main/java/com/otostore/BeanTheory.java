package com.otostore;

public class BeanTheory {
	/*Bean Tanımlamaları
	 * Bunlar <bean></bean> arasında kullanılcak tanımlamaların genel anlamlarıdır.
	 * Injection için kullanılacak nesneler veya özellikler tanımlanır.
	 * 
	 * Class
	 * Nesnesi kullanılan sınıfı tanımlar
	 * 
	 * Id 
	 * Oluşturulan Spring nesnesinin unique değerine işaret eden ismidir.
	 * 
	 * Name
	 * Spring nesnesine id haricinde isim vermek için kullanılır. 
	 * 
	 * Property
	 * Inject edilecek sınıf değişkenini tanımlar. Setter Injection diye bilinir. 
	 * 
	 * Constructor-Arg
	 * Constructor injection diye bilinir. 
	 * Bağımlılıklar yapılandırıcı metodlar yardımıyla inject edilmektedir.
	 * 
	 * Parent
	 * Kullanılacak nenelerin üst, parent bir yapıya sahip olmaları durumunda kullanılır.
	 * 
	 * Abstract
	 * Nesne tanımlamasını soyutlaştırır. 
	 * Soyut olarak bilinen beanlerden nesne oluşturulmaz. 
	 * Bildiğimiz abstract sınıf mantığı.
	 * 
	 * Scope
	 * Spring nesne yaratım yöntemini belirler.
	 * 
	 * 1-Spring default scope "singleton" yani tekil scope'dur.
	 * 
	 * Tanımlama yapılmasına gerek yoktur.
	 * Ve her yeni nesne istediğinde aynı nesneyi döner.
	 * 
	 * 
	 * 2- Bean "prototype"	scope olarak belirlendiğinde bu bean her kullanımda yeni 
	 * nesne üretir.
	 * İlk nesneyi dönmez.
	 * 
	 * Init-Method
	 * Nesneler inject edildikten sonra çalışacak metodu ifade eder. 
	 * Bu metodun parametresiz olması gerekmektedir.
	 * 
	 * Destroy Method
	 * Spring nesne döngüsü son bulduğunda çalışacak metod tanımlanır.
	 * Bu metodun parametresiz olması gerekmektedir.
	 * 
	 * Factory Bean
	 * Bu nesneyi oluşturacak fabrika sınıfını (Factory Bean) tanımlar.
	 * Factory-Bean kullanıldığında setter injection yapılmamalıdır.
	 * 
	 * Factory-Method
	 * Bu nesneyi oluşturmak için kullanılacak fabrika metodunu tanımlar.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
