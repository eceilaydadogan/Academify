package com.example.my.tabs.hocalar




data class HocaInfo(
    val instructorName: String,
    val instructorInfo: String,
    val instructorEmail: String,
    val lessonDetails: String,

    )

object HocaDataProvider {
    fun getHocaInfoForTeachers(teacher: String): HocaInfo {
        return when (teacher) {
            "Ali Cihan Keleş" -> HocaInfo(
                "Ali Cihan Keleş",
                "Ali Cihan Keleş\n" +
                        "Dr. Öğr. Üyesi",
                "cihan.keles@yeditepe.edu.tr",
                "Agresif bir yaklaşımıyla tanınmasına rağmen, öğrencilere karşı herhangi bir problemde veya ihtiyaç durumunda yardım etmekten kacmaz. " +
                        "Öğrencilerin gelecek adımlarını atmasına ve iş hayatına geçiş sürecine elinden gelenin en iyisini yaparak destek olur. Derslerini yoğun bir şekilde işlediği için dersleri kaçırmamaya özen göstermelisiniz." +
                        " Kendi hazırladığı sınavlar ve konuların anlaşılmasına yönelik kapsamlı dokümantasyon paylaşımı yapar.",
            )

            "Avodis Simon Hacınlıyan" -> HocaInfo(
                "Avodis Simon Hacınlıyan",
                "Avodis Simon Hacınlıyan\n" +
                        "Prof. Dr.",
                "ahacinliyan@yeditepe.edu.tr",
                "Kendisi Türkiye'nin önde gelen fizikçilerinden biridir. Ders anlatırken genellikle asistanlarına laboratuvar derslerini anlatma fırsatı verir. " +
                        "Derslerine zamanında gelinmesi kesin bir kuraldır. " +
                        "Sınavlarında orta zorluk seviyesi tercih edilir ve genellikle geçmiş sınavlardaki sorulara benzer sorular sorar.",
            )

            "Engin Kandıran" -> HocaInfo(
                "Engin Kandıran",
                "Engin Kandıran\n" +
                        "Dr. Öğr. Üyesi",
                "engin.kandiran@yeditepe.edu.tr",
                "Derslerini dokümantasyonlar aracılığıyla öğrencilere sunar ve sıklıkla proje odaklı bir yöntem benimser. " +
                        "Öğrencilerle sürekli iletişim halinde olan bir akademisyen olarak, öğrencilerin ihtiyaç duydukları her an ulaşabilecekleri bir destek sağlar. " +
                        "Ayrıca, sınavlarını genellikle açık kaynak temelli olarak düzenler.",
            )

            "Hacı Ahmet Yıldırım" -> HocaInfo(
                "Hacı Ahmet Yıldırım",
                "Hacı Ahmet Yıldırım\n" +
                        "Dr. Öğr. Üyesi",
                "ahmety@sakarya.edu.tr",
                "w3schools",
            )

            "Gül Bakan" -> HocaInfo(
                "Gül Bakan",
                "Gül Bakan \n" +
                        "Dr. Öğr. Üyesi",
                "gbakan@yeditepe.edu.tr",
                "Derslerinde slaytları kullanarak bilgileri öğrencilere aktarır, ana konuları belirler, detaylı açıklamalar yapar, görsel destek sağlar ve önemli noktaları vurgular.",
            )

            "Merve Çaşkurlu" -> HocaInfo(
                "Merve Çaşkurlu",
                "Merve Çaşkurlu\n" +
                        "Dr. Öğr. Üyesi",
                "merve.belgesay@yeditepe.edu.tr",
                "Ders anlatma sürecinde öğrencileriyle bireysel olarak ilgilenerek interaktif bir öğrenme ortamı oluşturur.",
            )

            "Neda Üçer" -> HocaInfo(
                "Neda Üçer",
                "Neda Üçer\n" +
                        "Prof. Dr.",
                "nsaracer@yeditepe.edu.tr",
                "Derslerinde konuları anlaşılır kılmak için sunumlar ve detaylı örnekleri kullanarak öğrencilere etkileşimli bir öğrenme deneyimi sunar",
            )

            "İrem Tekin Yücesoy" -> HocaInfo(
                "İrem Tekin Yücesoy",
                "İrem Tekin Yücesoy\n" +
                        " Dr. Öğr. Üyesi",
                "irem.tekin@yeditepe.edu.tr",
                "Derslerinde konuları anlaşır kılmak için sunumlar ve detaylı örnekler kullanır ardından öğrencileriyle bireysel olarak ilgilenerek interaktif bir öğrenim deneyimi sunar.",
            )
            else -> HocaInfo(
                "Hoca Adı",
                "Hoca Bilgi",
                "Hoca eposta",
                "Ders içeriği...",

                )

        }
    }
}