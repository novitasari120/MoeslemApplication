package com.novit.moeslemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class DoaAdapter extends AppCompatActivity {

    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData () {
        String doa = getIntent().getExtras().getString("MyName");
        switch (doa) {
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar.");
                Getarti.setText("Artinya: Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("َلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin.");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
                break;

            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتُ");
                Getbaca.setText("Bismikallaahuma ahyaa wa bismika amuutu.");
                Getarti.setText("Artinya: Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut nama-Mu aku mati");
                break;

            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ");
                Getbaca.setText("Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru.");
                Getarti.setText("Artinya : Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan");
                break;

            case "Doa Turun Hujan":
                Getdoa.setText("Doa Turun Hujan");
                Getarab.setText("ِنَّ النَّبِىَّ -صلى الله عليه وسلم- كَانَ إِذَا رَأَى الْمَطَرَ قَالَ اللَّهُمَّ صَيِّباً نَافِعاً");
                Getbaca.setText("Allahumma shoyyiban nafi’an.");
                Getarti.setText("Artinya: Ya Allah turunkanlah pada kami hujan yang bermanfaat");
                break;

            case "Doa Sebelum Belajar":
                Getdoa.setText("Doa Sebelum Belajar");
                Getarab.setText("َارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًاَ");
                Getbaca.setText("Yaa robbi zidnii 'ilman warzuqnii fahmaa.");
                Getarti.setText("Artinya Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman");
                break;

            case "Doa Sesudah Belajar":
                Getdoa.setText("Doa Sesudah Belajarَ");
                Getarab.setText("اَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ");
                Getbaca.setText("Allaahumma innii astaudi'uka maa 'allamtaniihi fardud-hu ilayya 'inda haajatii wa laa tansaniihi yaa robbal 'alamiin.");
                Getarti.setText("Artinya : Ya Allah, sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam");
                break;

            case "Doa Ketika Bercermin":
                Getdoa.setText("Doa Ketika Bercermin");
                Getarab.setText("اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ");
                Getbaca.setText("Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii.");
                Getarti.setText("Artinya: Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku");
                break;
        }
    }
}



