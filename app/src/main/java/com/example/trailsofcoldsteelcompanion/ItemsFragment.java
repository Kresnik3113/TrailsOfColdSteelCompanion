package com.example.trailsofcoldsteelcompanion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ItemsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ItemsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ItemsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ItemsFragment newInstance(String param1, String param2) {
        ItemsFragment fragment = new ItemsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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

        return inflater.inflate(R.layout.fragment_items, container, false);

    }

    public void onViewCreated(View view,
                              Bundle savedInstanceState) {


        ExpandableListView expandableListView=(ExpandableListView)getView().findViewById(R.id.expandableListView);
        HashMap<String, List<String>> item=new HashMap<>();



        ArrayList<String> itemGroups=new ArrayList<>();
        itemGroups.add("Name: Tear Balm\nEffect: Restores 800 HP.\nPrice: 200");
        itemGroups.add("Name: EP Charge I\nEffect: Restores 100 EP.\nPrice: 500");
        itemGroups.add("Name: EP Charge II\nEffect: Restores 300 EP.\nPrice: 1500");
        itemGroups.add("Name: Antidote\nEffect: Cures Poison.\nPrice: 40");
        itemGroups.add("Name: Relaxant\nEffect: Cures Seal.\nPrice: 40");
        itemGroups.add("Name: Insulating Tape\nEffect: Cures Mute.\nPrice: 40");
        itemGroups.add("Name: Mint Drop\nEffect: Cures Sleep / Nightmare.\nPrice: 40");
        itemGroups.add("Name: Cooling Spray\nEffect: Cures Burn.\nPrice: 40");
        itemGroups.add("Name: Warmer\nEffect: Cures Freeze.\nPrice: 40");
        itemGroups.add("Name: Softening Ointment\nEffect: Cures Petrify.\nPrice: 40");
        itemGroups.add("Name: Stimulant\nEffect: Cures Faint.\nPrice: 40");
        itemGroups.add("Name: Sedative\nEffect: Cures Confuse.\nPrice: 40");
        itemGroups.add("Name: Reviving Balm\nEffect: Cures K.O. / Restore 1000 HP.\nPrice: 500");
        itemGroups.add("Name: S-Tablet\nEffect: Cure Stat Down.\nPrice: 100");
        itemGroups.add("Name: Smoke Grenade\nEffect: 100% success fleeing battle.\nPrice: 100");
        itemGroups.add("Name: Battle Scope\nEffect: Analyzes an enemy's key data.\nPrice: 100");
        itemGroups.add("Name: Whole Juice\nEffect: Restore 1000 HP / Cures Faint.\nPrice: 280");
        itemGroups.add("Name: Tomato Sandwich\nEffect: Restore 1500 HP / Restores 10 CP.\nPrice: 500");
        itemGroups.add("Name: Roasted Coffee\nEffect: Restore 1600 HP / Cures Sleep / Nightmare.\nPrice: 440");
        itemGroups.add("Name: Crispy Pizza\nEffect: Restore 1200 HP / Restores 15 CP.\nPrice: 560");
        itemGroups.add("Name: Sweet Cookie\nEffect: Restore 700 HP / Cures Poison.\nPrice: 240");
        itemGroups.add("Name: Jewel Potage\nEffect: Restore 2400 HP / Cures Freeze.\nPrice: 640");
        itemGroups.add("Name: Creamy Chowder\nEffect: Restore 1400 HP / Cures Freeze.\nPrice: 380");
        itemGroups.add("Name: Aromatic Tea\nEffect: Restore 2000 HP / Cures Seal / Mute.\nPrice: 640");
        itemGroups.add("Name: Savory Herb Tea\nEffect: Restore 1200 HP / Cures Seal\nPrice: 380\t");
        itemGroups.add("Name: Simple Omelet\nEffect: Restore 600 HP.\nPrice: 160\t");
        itemGroups.add("Name: Berry Tart\nEffect: Restore 1800 HP / Cures Petrify.\nPrice: 540");
        itemGroups.add("Name: Elegant Sandwich\nEffect: \tRestore 1800 HP / Restore 20 CP\nPrice: 680");
        itemGroups.add("Name: Golden Juice\nEffect: Restore 1200 HP / Cures K.O\nPrice: 540");
        itemGroups.add("Name: Special Pizza\nEffect: Restores 2000 HP / Restores 25 CP / Cures Stat Down\nPrice: 960");
        itemGroups.add("Name: Premium Coffee\nEffect: Restores 3000 HP / Cures Sleep / Nightmare\nPrice: 800");
        itemGroups.add("Name: Mixed Gelato\nEffect: Restores 2000 HP / Restores 100 EP / Cures K.O\nPrice: 1000");
        itemGroups.add("Name: Vanilla Gelato\nEffect: Restores 2800 HP / Cures Burn\nPrice: 800");
        itemGroups.add("Name: Lemon Gelato\nEffect: Restores 1000 HP / Restores 150 EP\nPrice: 800");
        itemGroups.add("Name: Elegant Fried Fish\nEffect: Recovers 4000 HP / SPD +25% (5 Turns)\nPrice: 960");
        itemGroups.add("Name: Fried Fish\nEffect: Recovers 3000 HP / SPD +25% (3 Turns)\nPrice: 720");
        itemGroups.add("Name: Hashed Beef Rice\nEffect: Recovers 3000 HP / Restores 10 CP / SPD +25% (3 turns)\nPrice: 1100");
        itemGroups.add("Name: Rich Strawberry Crepe\nEffect: Recovers 6000 HP\nPrice: 1500");
        itemGroups.add("Name: Fresh Egg\nEffect: Cooking ingredient.\nPrice: 40");
        itemGroups.add("Name: Fresh Milk\nEffect: Cooking ingredient.\nPrice: 40");
        itemGroups.add("Name: Mature Cheese\nEffect: Cooking ingredient\nPrice: 40");
        itemGroups.add("Name: Fresh Herb\nEffect: Cooking ingredient\nPrice: 40");
        itemGroups.add("Name: Crisp Onion\nEffect: Cooking ingredient\nPrice: 40");
        itemGroups.add("Name: Flaky Potato\nEffect: Cooking ingredient\nPrice: 40");
        itemGroups.add("Name: Starberry\nEffect: Cooking ingredient\nPrice: 80");
        itemGroups.add("Name: Acerbic Tomato\nEffect: Cooking ingredient\nPrice: 200");
        itemGroups.add("Name: Honey Syrup\nEffect: Cooking ingredient\nPrice: 20");
        itemGroups.add("Name: Coarse Rock Salt\t\nEffect: Cooking ingredient\nPrice: 20");
        itemGroups.add("Name: Assorted Grains\nEffect: Cooking ingredient\nPrice: 100");
        itemGroups.add("Name: Healthy Liquor\nEffect: Cooking ingredient\nPrice: 100");
        itemGroups.add("Name: Soft & Fluffy Omelet\nEffect: Restore 100 HP / Cures K.O.\nPrice: 280");
        itemGroups.add("Name: Sweet Cookie\nEffect: Restore 700 HP / Cures Poison\nPrice: 240");
        itemGroups.add("Name: Whole Juice\nEffect: Restore 1000 HP / Cures Faint\nPrice: 280");


        item.put("Items",itemGroups);
        MyExpandableListAdapter adapter=new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);

    }
}