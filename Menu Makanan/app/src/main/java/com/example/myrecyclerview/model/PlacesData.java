package com.example.myrecyclerview.model;

import com.example.myrecyclerview.R;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesName = {
            "Pecel Lele",
            "Nasi Goreng Mercon",
            "Ayam Geprek Keju",
            "Kari Ayam",
            "Tahu Bulat",
            "Salad Buah",
    };

    private static String[] placesDetail = {
            "Harga: 15.000\n\nPecel lele atau pecek lele di Indonesia adalah nama sebuah makanan khas Jawa yang terdiri dari ikan lele dan sambal tomat. Biasanya yang dimaksud adalah ikan lele yang digoreng kering dengan minyak lalu disajikan dengan sambal tomat dan lalapan. Lalapan biasa terdiri dari kemangi, kubis, mentimun, dan kacang panjang.",
            "Harga: 14.500\n\nNasi goreng mercon adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam cabai, minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
            "Harga: 20.000\n\nAyam geprek keju adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak dan ditaburi keju di atasnya. Sebagian besar sumber menyebut bahwa ayam geprek berasal dari Kota Yogyakarta. Kini, ayam geprek telah menjadi hidangan populer yang dapat ditemukan di hampir semua kota besar di Indonesia.",
            "Harga: 17.500\n\nKari Ayam adalah kari ala Indonesia yang terbuat dari ayam dimasak dengan kaldu kental dari perpaduan bumbu rempah seperti kunyit, jinten dan lengkuas.",
            "Harga: 500\n\nTahu bulat adalah sebuah jajanan kaki lima berupa olahan kacang kedelai yang dibuat menjadi sebuah tahu berbentuk bulat dengan isi kopong. Biasanya, tahu bulat dijual di sebuah mobil bak terbuka dan kebanyakan dihargai Rp 500 an dan hangat-hangat.",
            "Harga: 12.000\n\nSalad buah adalah makanan segar yang terbuat dari berbagai macam buah enak dan segar yang dicampur dengan bahan lain seperti yogurt, mayones dan keju. Umumnya makanan ini dijadikan sebagai hidangan penutup yang lezat, atau cocok untuk dijadikan camilan sore.",
    };

    private static int[] placesPhoto = {
            R.drawable.pecel_lele,
            R.drawable.nasgor_mercon,
            R.drawable.geprek_keju,
            R.drawable.kari,
            R.drawable.tahu,
            R.drawable.salad,
    };

    public static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int i = 0; i < placesName.length; i++) {
            Place place = new Place();
            place.setName(placesName[i]);
            place.setDetail(placesDetail[i]);
            place.setPhoto(placesPhoto[i]);
            list.add(place);
        }
        return list;
    }

    public Place getData(int id) {
        Place place = new Place();
        place.setName(placesName[id]);
        place.setDetail(placesDetail[id]);
        place.setPhoto(placesPhoto[id]);
        return place;
    }
}
