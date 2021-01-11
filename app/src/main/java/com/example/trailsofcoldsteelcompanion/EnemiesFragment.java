package com.example.trailsofcoldsteelcompanion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnemiesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnemiesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView eList;
    public EnemiesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EnemiesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EnemiesFragment newInstance(String param1, String param2) {
        EnemiesFragment fragment = new EnemiesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_enemies, container, false);

    }

    public void onViewCreated (View view,
                               Bundle savedInstanceState){
        ExpandableListView expandableListView=(ExpandableListView)getView().findViewById(R.id.expandableListView);
        HashMap<String, List<String>> item=new HashMap<>();


        //out data into array
        ArrayList<String> enemyGroups=new ArrayList<>();
        enemyGroups.add("Name: Combat Shell α\nDrop: U-Material\nDrop2: N/A");
        enemyGroups.add("Name: Combat Shell β\nDrop: U-Material\nDrop2: N/A");
        enemyGroups.add("Name: Instructor Sara\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Patrick\nDrop: EP Charge\nDrop2: N/A");
        enemyGroups.add("Name: Noble Student Br\nDrop: Teara Balm\nDrop2: N/A");
        enemyGroups.add("Name: Noble Student O\nDrop: Celestial Balm\nDrop2: N/A");
        enemyGroups.add("Name: Noble Student Bl\nDrop: Curia Balm\nDrop2: N/A");
        enemyGroups.add("Name: Laura\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Fie\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Combat Shell γ\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Eliot\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Machias\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Jusis\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Gaius\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Alisa\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Angelica\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Flying Feline\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Grass Drome\nDrop: Eye Drop\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Coin Beetle\nDrop: S-Tablet\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Dastardly Amalgam\nDrop: Coarse Rock Salt\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Pom\nDrop: Smoke Grenade\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Dissolution Slug\nDrop: Honey Syrup\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Iglute Garmr *Form 1\nDrop: Poison\nDrop2: N/A");
        enemyGroups.add("Name: Iglute Garmr *Form 2\nDrop: Poison\nDrop2: N/A");
        enemyGroups.add("Name: Minos Demon\nDrop: Soul Blur\nDrop2: N/A");
        enemyGroups.add("Name: Lantern Spider\nDrop: Antidote\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Stone Stalker\nDrop: Coarse Rock Salt\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Clay Doll\nDrop: Tear Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Cherubic Gate\nDrop: U-Material\nDrop2: Move 2");
        enemyGroups.add("Name: Hell Rabbit\nDrop: Globby Fat\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Orderbelisk\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Time Snail\nDrop: Clear Gelatin\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Pit Demon\nDrop: U-Material\nDrop2: Action 2");
        enemyGroups.add("Name: Hinomikoto\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Mad Weed\nDrop: Crisp Onion\nDrop2: Globby Fat");
        enemyGroups.add("Name: Pit Cerberus\nDrop: Globby Fat\nDrop2: U-Material");
        enemyGroups.add("Name: Seraphic Gate\nDrop: U-Material\nDrop2: EP 2");
        enemyGroups.add("Name: Ol-Gadia\nDrop: Admantine Shield\nDrop2: N/A");
        enemyGroups.add("Name: Polyjelly\nDrop: Softening Ointment\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Glaceron\nDrop: White Beast Flesh\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Frost Biter\nDrop: Clear Gelatin\nDrop2: U-Material");
        enemyGroups.add("Name: Unsurtr\nDrop: Attack 3\nDrop2: N/A");
        enemyGroups.add("Name: Purple Drome\nDrop: Clear Gelatin\nDrop2: Globby Fat");
        enemyGroups.add("Name: Ghost Soul\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Star Lambda\nDrop: EP Charge I\nDrop2: U-Material");
        enemyGroups.add("Name: Elvavria\nDrop: U-Material\nDrop2: Judgement Bolt");
        enemyGroups.add("Name: Lunar Bee\nDrop: Hearty Powder\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Minos Demon\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Surtr\nDrop: Clear Gelatin\nDrop2: U-Material");
        enemyGroups.add("Name: Obsidian Garmr\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Ramon\nDrop: Globby Fat\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Rup Kamuy\nDrop: Red Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Thunder Hydra\nDrop: White Beast Flesh\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Steel Golem\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Og-Jior\nDrop: U-Material\nDrop2: Tearal Balm");
        enemyGroups.add("Name: Judge Pillar\nDrop: U-Material\nDrop2: EP Charge III");
        enemyGroups.add("Name: Durgnessa\nDrop: U-Material\nDrop2: Celestial Balm EX");
        enemyGroups.add("Name: Ashen Fragment\nDrop: U-Material\nDrop2: EP Charge III");
        enemyGroups.add("Name: Loa Erebonius\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Crop Muncher\nDrop: Eye Drop\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Deathcargot\nDrop: Clear Gelatin\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Evil Crow\nDrop: Fresh Egg\nDrop2: Hearty Powde");
        enemyGroups.add("Name: King Dragonfly\nDrop: Antidote\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Fanged Wolf\nDrop: Tear Balm\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Ripper Squirrel\nDrop: Stimulant\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Acerbic Tomartian\nDrop: Acerbic Tomato\nDrop2: U-Material");
        enemyGroups.add("Name: Scary Dinosaur\nDrop: Shield 2\nDrop2: N/A");
        enemyGroups.add("Name: Zwordar\nDrop: Breath\nDrop2: N/A");
        enemyGroups.add("Name: Jelly Shroom\nDrop: Clear Gelatin\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Blade Horn\nDrop: Hearty Powder\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Blade Pincer\nDrop: Hearty Powder\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Sasa Panda\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Gordi Chief\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Fake Park Ranger\nDrop: \tTeara Balm\nDrop2: EP Charge I");
        enemyGroups.add("Name: Grunoja\nDrop: Attack 2\nDrop2: N/A");
        enemyGroups.add("Name: Mantrap\nDrop: Fresh Herb\nDrop2: Globby Fat");
        enemyGroups.add("Name: Egg Snake\nDrop: Clear Gelatin\nDrop2: Globby Fat");
        enemyGroups.add("Name: Venus Mantrap\nDrop: Hare\nDrop2: N/A");
        enemyGroups.add("Name: Stealth Turtle\nDrop: White Beast Flesh\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Horneater\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Anteater\nDrop: Tear Balm\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: War Mantis\nDrop: Reviving Balm\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Zwordar\nDrop: U-Material\nDrop2: Evade 1");
        enemyGroups.add("Name: Attack Dog\nDrop: Tear Bakn\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Green Raccoon\nDrop: Red Beast Flesh\nDrop2: \tU-Material");
        enemyGroups.add("Name: Fate Spinner\nDrop: Demonic Scythe\nDrop2: N/A");
        enemyGroups.add("Name: White Feline\nDrop: Red Beast Flesh\nDrop2: Reviving Balm");
        enemyGroups.add("Name: Ice Drome\nDrop: Healthy Liquor\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Jewel Rat\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Platinum Bug\nDrop: Coarse Rock Salt\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: P. Army Soldier\nDrop: Teara Balm\nDrop2: EP Charge II");
        enemyGroups.add("Name: Kazakh Doven B\nDrop: HP 2\nDrop2: N/A");
        enemyGroups.add("Name: Kazakh Doven R\nDrop: Hit 2\nDrop2: N/A");
        enemyGroups.add("Name: Winged Snake\nDrop: White Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Grass Hopper\nDrop: Assorted Grains\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Ostrich\nDrop: Red Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Brutal Buffa\nDrop: Mature Cheese\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Brutal Infant\nDrop: Fresh Milk\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Rhinocider\nDrop: U-Material\nDrop2: Defense 1");
        enemyGroups.add("Name: Thunder Loach\nDrop: White Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Thunder Quaker\nDrop: Voice Breaker\nDrop2: N/A");
        enemyGroups.add("Name: Millium\nDrop: \nDrop2: N/A");
        enemyGroups.add("Name: Stony Croaker\nDrop: White Beast Flesh\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Infant Drango\nDrop: Cooling Spray\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: White Fang\nDrop: Tear Balm\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Zaurtoise\nDrop: White Beast Flesh\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Creepy Sheep\nDrop: Mint Drop\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Hippogriff\nDrop: U-Material\nDrop2: Attack 1");
        enemyGroups.add("Name: Stone Golem\nDrop: Grand Press\nDrop2: N/A");
        enemyGroups.add("Name: Vampiric Thorn\nDrop: Starberry\nDrop2: Globby Fat");
        enemyGroups.add("Name: Diglem\nDrop: EP Charge I\nDrop2: U-Material");
        enemyGroups.add("Name: Jaegar Dropout\nDrop: Teara Balm\nDrop2: EP Charge II");
        enemyGroups.add("Name: G (Gideon)\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Ginosha Zanak\nDrop: Crescent Mirror\nDrop2: N/A");
        enemyGroups.add("Name: Zesvia\nDrop: Tear Balm\nDrop2: Curia Balm");
        enemyGroups.add("Name: Dirty Rat\nDrop: Assorted Grains\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Black Drome\nDrop: Healthy Liquor\nDrop2: Clear Gelati");
        enemyGroups.add("Name: Ball Bat\nDrop: Red Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Ghoul Frog\nDrop: Curia Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Giant Drome\nDrop: Move 3\nDrop2: N/A");
        enemyGroups.add("Name: Sharkodile\nDrop: White Beast Flesh\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Scavenger Crow\nDrop: Fresh Egg\nDrop2: Globby Fat");
        enemyGroups.add("Name: Flash Drome\nDrop: Honey Syrup\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Fate Spinner\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Great Sharkodile\nDrop: U-Material\nDrop2: Hydro Cannon");
        enemyGroups.add("Name: Divining Ananta\nDrop: Antidote\nDrop2: Globby Fat");
        enemyGroups.add("Name: Cursed Sculpture\nDrop: Tearal Balm\nDrop2: Celestial Balm EX");
        enemyGroups.add("Name: Zoro-Agruga\nDrop: Grim Butterfly\nDrop2: N/A");
        enemyGroups.add("Name: C\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Rose Shroom\nDrop: Crisp Onion\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Grass Pom\nDrop: Fresh Herb\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Gordi Schnarr\nDrop: Red Beast Flesh\nDrop2: U-Material");
        enemyGroups.add("Name: Greedy Reaper\nDrop: Flaky Potato\nDrop2: Globby Fat");
        enemyGroups.add("Name: Goldcider\nDrop: Chitinous Shell\nDrop2: U-Materia");
        enemyGroups.add("Name: Coco Panda\nDrop: U-Material\nDrop2: Groundbait");
        enemyGroups.add("Name: Crocodark\nDrop: U-Material\nDrop2: Chrono Break");
        enemyGroups.add("Name: Phalanx J9\nDrop: Cross Crusade\nDrop2: N/A");
        enemyGroups.add("Name: Butler Klaus\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Viscount Arseid\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Shadow Spirit\nDrop: Curia Balm\nDrop2: EP Charge I");
        enemyGroups.add("Name: Wandering Armor\nDrop: Tear Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Wandering Sword\nDrop: Reviving Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Dark Canine\nDrop: Antidote\nDrop2: Red Beast Flesh");
        enemyGroups.add("Name: Death Slugger\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Nosferatu\nDrop: Zeram Capsule\nDrop2: N/A");
        enemyGroups.add("Name: Tri-Attacker R2\nDrop: Teara Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Tri-Attacker HG\nDrop: EP Charge II\nDrop2: U-Material");
        enemyGroups.add("Name: Phalanx J9\nDrop: Celestial Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Zephyanthes\nDrop: U-Material\nDrop2: EP Charge III");
        enemyGroups.add("Name: Terrorist -Sword\nDrop: Teara Balm\nDrop2: EP Charge II");
        enemyGroups.add("Name: Terrorist - Gun\nDrop: Curia Balm\nDrop2: Celestial Balm");
        enemyGroups.add("Name: R-Zephyanthes\nDrop: U-Material\nDrop2: EP Charge III");
        enemyGroups.add("Name: S (Scarlet)\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Great Grouse\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Steel Ladybug\nDrop: Hearty Powder\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Greedy Wolf\nDrop: Red Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Mad Penguin\nDrop: White Beast Flesh\nDrop2: Groundbait");
        enemyGroups.add("Name: Hellish Tomartian\nDrop: Acerbic Tomato\nDrop2: U-Material");
        enemyGroups.add("Name: Rocky Croaker\nDrop: U-Material\nDrop2: N/A");
        enemyGroups.add("Name: Crimson Dragonfly\nDrop: Curia Balm\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Rock Serpent\nDrop: Clear Gelatin\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Blue Horn\nDrop: Stimulant\nDrop2: Hearty Powder");
        enemyGroups.add("Name: Hydra\nDrop: U-Material\nDrop2: Holy Breath");
        enemyGroups.add("Name: Dancing Owl\nDrop: Fresh Egg\nDrop2: Curia Balm");
        enemyGroups.add("Name: Bomb Spider\nDrop: Antidote\nDrop2: Clear Gelatin");
        enemyGroups.add("Name: Cyron Bit\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Death Sickle\nDrop: Reviving Balm\nDrop2: Chitinous Shell");
        enemyGroups.add("Name: Roc\nDrop: Hearty Powder\nDrop2: U-Material");
        enemyGroups.add("Name: Turtle Bug\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Metal Bat\nDrop: Globby Fat\nDrop2: U-Material");
        enemyGroups.add("Name: Gold Fungus\nDrop: Zeram Powder\nDrop2: N/A");
        enemyGroups.add("Name: Magma Drome\nDrop: Clear Gelatin\nDrop2: U-Material");
        enemyGroups.add("Name: Attack Dog G\nDrop: Red Beast Flesh\nDrop2: Teara Balm");
        enemyGroups.add("Name: Phalanx J9\nDrop: Celestial Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Tri-Attacker R2\nDrop: Teara Balm\nDrop2: U-Material");
        enemyGroups.add("Name: Tri-Attacker HG\nDrop: EP Charge II\nDrop2: U-Material");
        enemyGroups.add("Name: Kazakh Doven G\nDrop: Red Beast Flesh\nDrop2: \tU-Material");
        enemyGroups.add("Name: B-Zephyanthes\nDrop: EP Charge III\nDrop2: Celestial Balm EX");
        enemyGroups.add("Name: Terrorist -Sword\nDrop: Teara Balm\nDrop2: EP Charge II");
        enemyGroups.add("Name: Terrorist - Gun\nDrop: Curia Balm\nDrop2: Celestial Balm");
        enemyGroups.add("Name: V (Vulcan)\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: NT-I\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: G-Zephyanthes\nDrop: EP Charge III\nDrop2: Celestial Balm EX");
        enemyGroups.add("Name: Gespard G\nDrop: Cross Crusade\nDrop2: N/A");
        enemyGroups.add("Name: Metal Beetle\nDrop: Chitinous Shell\nDrop2: U-Material");
        enemyGroups.add("Name: Moon Mole\nDrop: \tRed Beast Flesh\nDrop2: Globby Fat");
        enemyGroups.add("Name: Drakken\nDrop:N/A \nDrop2: N/A");
        enemyGroups.add("Name: Spiegel *Warrior Type\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Spiegel *Shield Type\nDrop: N/A\nDrop2: N/A");
        enemyGroups.add("Name: Azure Knight\nDrop: N/A\nDrop2: N/A");







        item.put("Enemy",enemyGroups);
        MyExpandableListAdapter adapter=new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}