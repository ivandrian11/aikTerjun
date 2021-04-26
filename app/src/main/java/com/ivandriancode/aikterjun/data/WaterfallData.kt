package com.ivandriancode.aikterjun.data

import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.model.Waterfall

object WaterfallData {
    private val waterfallNames = arrayOf(
        "Sendang Gile",
        "Tiu Teja",
        "Tiu Kelep",
        "Jeruk Manis",
        "Umar Maya",
        "Timponan",
        "Tiu Pupus",
        "Mangku Sakti",
        "Dewi Selendang",
        "Belang Kelambu"
    )

    private val waterfallDetails = arrayOf(
        "Berada di Desa Senaru yang terkenal, kamu harus berjalan menyusuri hutan dan sungai untuk bisa mencapai Sendang Gile. Tapi tenang saja, perjalanannya akan seru dan menyenangkan karena suasana sejuk pegunungan yang akan kamu nikmati. Kamu juga akan menyusuri sungai kecil yang segar, jadi dijamin tidak akan kepanasan, deh!\n\nSendang Gile sendiri adalah air terjun dua tingkat dan dua aliran. Kamu bisa melihatnya dengan jelas dari kejauhan. Jadi air terjun ini berada di sebuah tebing berundak. Bagian atas air terjun ini cukup pendek, sekitar lima meter saja. Tapi bagian bawahnya cukup tinggi, sekitar 20 meter.",
        "Teja dalam bahasa setempat berarti pelangi. Kamu bisa menemukan pelangi ini di bagian bawah air terjun saat sinar matahari bisa mencapainya. Karena itu juga air terjun ini dikenal sebagai air terjun pelangi.\n\nTiu Teja juga merupakan air terjun kembar dengan dua aliran yang jatuh berdampingan. Alirannya cukup deras, airnya jernih dan sangat dingin. Kalau kamu gerah selama di perjalanan, nyemplung saja ke kolam kecil di bawah air terjunnya. Dijamin gerahnya hilang!",
        "Ini mungkin adalah air terjun yang paling populer di seantero Lombok. Kamu juga mungkin sudah sering melihat fotonya di internet, terutama di media sosial. Soalnya Tiu Kelep memang keren abis. Air terjun ini seperti sebuah amphitheater alam yang megah, sangat unik dan tak bisa ditemukan di tempat lain. Sekali kamu melihatnya, seumur hidup kamu tak akan bisa melupakannya.\n\nJadi, pada dasarnya air terjun ini memiliki dua tingkat. Air terjun utama dengan aliran terbesar jatuh langsung dari tingkat tertinggi. Sementara itu, tingkat bawahnya adalah sederet aliran yang lebih kecil di tebing. Semuanya jatuh ke kolam yang sama. Tiu Kelep menyajikan latar belakang foto yang luar biasa. Tetapi kamu wajib hati-hati karena selain sangat lembab, partikel air juga beterbangan bebas di udara, jadi lindungi kamera kamu dengan baik.",
        "Masih di kaki Gunung Rinjani, Air Terjun Jeruk Manis berada di sisi timur lereng gunung berapi ini. Air terjun ini memang masih menjadi bagian dari Taman Nasional Gunung Rinjani. Konon, air terjun ini pertama kali ditemukan masyarakat sekitar pada pertengahan dekade 80-an. Masyarakat percaya bahwa air di sini memiliki khasiat tertentu, terutama untuk menyuburkan rambut. Layak dicoba kalau ingin punya rambut sehat!\n\nAkses ke air terjun ini sangat mudah. Dari tempat parkir kendaraan, kamu cukup berjalan 1,5 kilometer melewati hutan lebat yang sejuk. Trek jalannya sudah nyaman meski licin ketika musim hujan. Air terjunnya sendiri seperti berada di pojok sebuah tebing dengan ketinggian sekira 20 meter. Mau basah-basahan di bawah air terjun juga boleh, foto-foto juga bisa.",
        "Berbeda dengan kebanyakan air terjun lainnya di Lombok yang mengandalkan ketinggian dan kemegahannya, pesona Umar Maya justru ada pada kolamnya. Air terjunnya sendiri cukup rendah, sekitar 5 meter. Tapi yang membuat tempat ini jadi favorit wisatawan adalah kolam dan keseluruhan pemandangannya.\n\nAir terjun itu mengalir ke sebuah kolam alami yang luas. Warna airnya bervariasi, dari hijau toska hingga biru langit. Kolam ini seakan terpahat di bebatuan raksasa, membuat kamu akan ingat tentang legenda bidadari yang turun ke bumi. Kolam mini ini cukup asyik untuk berenang dan berendam. Selain itu, air terjun Umar Maya juga instagrammable banget!",
        "Air terjun ini sebenarnya relatif dekat dengan kota Mataram, ibukota Provinsi Nusa Tenggara Barat. Dengan kendaraan pribadi, kamu cuma butuh setengah jam dari Mataram untuk bisa sampai ke desa Karang Bayan, desa terdekat dengan Timponan, Selanjutnya kamu harus trekking di alam dengan jalan yang tanah selama sekitar 1,5 jam. Bagi penyuka alam, ini adalah tantangan yang sulit ditolak.\n\nAir terjun Timponan memiliki ketinggian sekitar 50 meter. Air jatuh ke kolam alami yang dingin. Di musim kemarau, alirannya tidak terlalu deras sehingga aman untuk berenang dan bahkan mandi tepat di bawah air terjun. Aliran sungai dari air terjun ini juga indah, berkelok membelah belantara dengan pemandangan yang memukau.",
        "Desa Genggelang memiliki dua air terjun yang lokasinya berdekatan. Yang pertama adalah Tiu Pupus yang lokasinya di sebelah utara. Aksesnya sangat mudah, kamu tak butuh banyak perjuangan untuk bisa menikmati air terjun fantastis ini. Dikepung tebing curam, Tiu Pupus punya kolam luas yang kemudian mengalir lagi menjadi sungai dengan panorama yang indah.\n\nDi sebelah selatan ada air terjun Kerta Gangga. Air terjun ini sangat unik karena alirannya seperti berbelok arah ketika masih di tebing. Lalu air mengalir lagi ke sebuah kolam luas yang jernih. Kolam ini populer banget bagi yang suka renang. Bahkan pengelola setempat menambahkan pijakan untuk meloncat ke kolam yang segar itu.",
        "Yang membuat Mangku Sakti menjadi sangat menarik adalah formasi batuan yang dipahat oleh aliran airnya. Ada tiga hal yang akan sangat mendominasi di sini; air, bebatuan, dan tumbuhan hijau. Suasananya tentu sangat segar. Dari tempat parkir, kamu bisa naik ojek atau jalan kaki sejauh tiga kilometer. Sampai di sini, semua akan terbayar tuntas.\n\nDebit air di air terjun ini cukup besar. Meski tidak terlalu tinggi dan kolamnya juga tidak terlalu luas, tetapi keindahan selanjutnya ada di aliran sungai setelah air terjun. Kamu bisa melihat air membelah batuan raksasa, berkelok seperti ular di antara dinding-dinding batu, air berwarna biru itu menjadi pemandangan segar sekaligus tempat foto yang keren.",
        "Air terjun ini mendapatkan namanya dari Dewi Selendang, seorang dewi yang menjadi pengikut Dewi Rinjani. Konon, Dewi Selendang dan para pengikutnya sering berendam di kolam air terjun ini. Setelah puas berbasah-basahan, mereka naik ke batu cadas di sekitarnya untuk berjemur dan mengeringkan rambut. Kisah ini sudah diceritakan secara turun-temurun di masyarakat sekitar\n\nFormasi bebatuan dan air yang mengalir menjadikan tempat ini sangat menarik untuk bersantai dan mendapatkan kesegaran. Air terjun Dewi Selendang juga sangat instagrammable, cocok untuk memenuhi feed jejaring sosialmu dengan gambar-gambar keren. Pemandangan sekitarnya juga memukau, menjadikan tempat ini spot ideal untuk bersantai.",
        "Air terjun ini memang terlihat seperti kelambu yang menutupi tebing hijau. Air mengalir dari tebing yang sudah sepenuhnya ditutupi tanaman merambat. Alirannya pun halus dan seolah menerawang, membuat ilusi seperti kain kelambu berwarna putih. Sudah begitu, alirannya juga bertingkat-tingkat, membuatnya punya banyak spot foto bagus. Kolamnya juga segar untuk berendam dan bermain air"
    )

    private val waterfallLocations = arrayOf(
        "Desa Senaru, Kecamatan Bayan, Kabupaten Lombok Utara.",
        "Desa Santong, Kecamatan Kayangan, Kabupaten Lombok Utara.",
        "Desa Senaru, Kecamatan Bayan, Kabupaten Lombok Utara.",
        "Desa Kembang Kuning, Kecamatan Sikur, Kabupaten Lombok Timur.",
        "Desa Bilok Petung, Kecamatan Sembalun, Kabupaten Lombok Timur.",
        "Desa Karang Bayan, Kecamatan Lingsar, Kabupaten Lombok Barat.",
        "Desa Genggelang, Kecamatan Gangga, Kabupaten Lombok Utara",
        "Desa Sajang, Kecamatan Sembalun, Kabupaten Lombok Timur",
        "Desa Bilok Petung, Kecamatan Sembalun, Kabupaten Lombok Timur.",
        "Desa Aik Berik, Kecamatan Batukliang Utara, Kabupaten Lombok Tengah"
    )

    private val waterfallImages = intArrayOf(
        R.drawable.aik1,
        R.drawable.aik2,
        R.drawable.aik3,
        R.drawable.aik4,
        R.drawable.aik5,
        R.drawable.aik6,
        R.drawable.aik7,
        R.drawable.aik8,
        R.drawable.aik9,
        R.drawable.aik10
    )

    val listData: ArrayList<Waterfall>
        get() {
            val list = arrayListOf<Waterfall>()
            for (index in waterfallNames.indices) {
                val waterfall = Waterfall()
                waterfall.nama = waterfallNames[index]
                waterfall.detail = waterfallDetails[index]
                waterfall.lokasi = waterfallLocations[index]
                waterfall.foto = waterfallImages[index]
                list.add(waterfall)
            }
            return list
        }
}