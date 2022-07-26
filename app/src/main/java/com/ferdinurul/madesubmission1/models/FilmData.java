package com.ferdinurul.madesubmission1.models;

import android.os.Parcel;

import com.ferdinurul.madesubmission1.R;

import java.util.ArrayList;

public class FilmData {
    private static String[] dataJudul = {
            "JOKER",
            "Terminator: Dark Fate",
            "The Lion King",
            "Maleficent: Mistress of Evil",
            "Frozen 2",
            "One Piece: Stampede",
            "Spider-Man: Far from Home",
            "Dora the Lost City of Gold",
            "Aladdin",
            "Dark Phoenix"
    };

    private static String[] dataTahun = {
            "2019",
            "2019",
            "2019",
            "2019",
            "2019",
            "2019",
            "2019",
            "2019",
            "2019",
            "2019"
    };

    private static String[] dataDeskripsiSingkat = {
            "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and...",
            "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and...",
            "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the...",
            "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are...",
            "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an...",
            "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the...",
            "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will...",
            "Dora, a girl who has spent most of her life exploring the jungle with her parents, now must navigate her most dangerous...",
            "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases...",
            "The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of..."
    };

    private static String[] dataDeskripsi = {
            "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
            "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
            "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.",
            "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are pulled in different directions by impending nuptials, unexpected allies, and dark new forces at play.",
            "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an ancient mystery of their kingdom.",
            "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the One Piece TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew.",
            "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
            "Dora, a girl who has spent most of her life exploring the jungle with her parents, now must navigate her most dangerous adventure yet: high school. Always the explorer, Dora quickly finds herself leading Boots (her best friend, a monkey), Diego, and a rag tag group of teens on an adventure to save her parents and solve the impossible mystery behind a lost Inca civilization.",
            "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
            "The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of control. During a rescue mission in outer space, Jean is nearly killed when she's hit by a mysterious cosmic force. Once she returns home, this force not only makes her infinitely more powerful, but far more unstable. The X-Men must now band together to save her soul and battle aliens that want to use Grey's new abilities to rule the galaxy."
    };

    private static int[] dataPoster = {
            R.drawable.poster_joker,
            R.drawable.poster_terminator,
            R.drawable.poster_lion_king,
            R.drawable.poster_maleficent,
            R.drawable.poster_frozen,
            R.drawable.poster_one_piece,
            R.drawable.poster_spiderman,
            R.drawable.poster_dora,
            R.drawable.poster_aladdin,
            R.drawable.poster_dark_phoenix
    };

    public static ArrayList<FilmModel> getDataList() {
        ArrayList<FilmModel> mArrayList = new ArrayList<>();
        for (int position = 0; position < dataJudul.length; position++) {
            FilmModel modelData = new FilmModel(Parcel.obtain());
            modelData.setJudul_film(dataJudul[position]);
            modelData.setTahun(dataTahun[position]);
            modelData.setDeskripsi(dataDeskripsi[position]);
            modelData.setDeskripsi_singkat(dataDeskripsiSingkat[position]);
            modelData.setPoster(dataPoster[position]);
            mArrayList.add(modelData);
        }
        return mArrayList;
    }
}
