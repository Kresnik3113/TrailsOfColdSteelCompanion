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
 * Use the {@link EquipmentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EquipmentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EquipmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EquipmentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EquipmentFragment newInstance(String param1, String param2) {
        EquipmentFragment fragment = new EquipmentFragment();
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

        return inflater.inflate(R.layout.fragment_equipment, container, false);

    }

    public void onViewCreated(View view,
                             Bundle savedInstanceState) {


        ExpandableListView expandableListView=(ExpandableListView)getView().findViewById(R.id.expandableListView);
        HashMap<String, List<String>> item=new HashMap<>();



        ArrayList<String> equipmentGroups=new ArrayList<>();
        equipmentGroups.add("Name: Kazekiri\nLocation: Rean's default weapon.\nValue: 200");
        equipmentGroups.add("Name: Kazekiri +1\nLocation: Recipe Location: Initial recipe.\nValue: 100");
        equipmentGroups.add("Name: Uzuki\nLocation: Store: Oddvin's Arms & Orbal Factory\nValue: 800");
        equipmentGroups.add("Name: Kisaragi\nLocation: Recipe Location: Oddvin's Arms & Orbal Factory\nValue: 200");
        equipmentGroups.add("Name: Kogitsunemaru\nLocation: Store: Club Lexington (Upstairs of Christie's Galleria)\nValue: 2000");
        equipmentGroups.add("Name: Rougatou\nLocation: Recipe Location: Davos' Factory\nValue: 300");
        equipmentGroups.add("Name: Nowaki no Tachi\nLocation: Store: Kilte's Store\nValue: 3000");
        equipmentGroups.add("Name: Fuujin no Tachi\t\nLocation: Recipe Location: Orbment Maintenance Device\n" +
                "(Nord Settlement)\nValue: 400");
        equipmentGroups.add("Name: Sasameyuki\nLocation: Store: Watson & Weapons & Armor\nValue: 4000");
        equipmentGroups.add("Name: Akayukitou\nLocation: Recipe Location: Lumiere Orbal Factory\nValue: 500");
        equipmentGroups.add("Name: Hakuu\nLocation: Store: Watteau's Store\nValue: 5500");
        equipmentGroups.add("Name: Shigure\nLocation: Recipe Location: Watteau's Store\nValue: 600");
        equipmentGroups.add("Name: Fuji Ichimonji\nLocation: Store: RF Arms\nValue: 7000");
        equipmentGroups.add("Name: Kage Ichimonji\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Yakou\nLocation: Store: Campus Store (October 23, Evening)\nValue: 9000");
        equipmentGroups.add("Name: Byakuya\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Prima Bow\nLocation: Alisa's default weapon.\nValue: 200");
        equipmentGroups.add("Name: Light Bow\t\nLocation: Store: Oddvin's Arms & Orbal Factory\nValue: 640");
        equipmentGroups.add("Name: Rapid Bow\nLocation: Recipe Location: Oddvin's Arms & Orbal Factory\nValue: 200");
        equipmentGroups.add("Name: Prima Bow +1\nLocation: Alisa's default weapon on Chapter 3.\nValue: N/A");
        equipmentGroups.add("Name: Windlass\nLocation: Store: Kilte's Store\nValue: 2700");
        equipmentGroups.add("Name: Wind Arc\nLocation: Recipe Location: Orbment Maintenance Device\n" +
                "(Nord Settlement)\nValue: 400");
        equipmentGroups.add("Name: Prima Bow +2\nLocation: Alisa's default weapon on Chapter 5.\nValue: N/A");
        equipmentGroups.add("Name: Prima Bow +3\nLocation: Alisa's default weapon on Chapter 6.\nValue: N/A");
        equipmentGroups.add("Name: White Bow\nLocation: Store: RF Arms\nValue: 6400");
        equipmentGroups.add("Name: Platinum Bow\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Siren's Song\nLocation: Store: Campus Store (October 23, Evening)\nValue: 8240");
        equipmentGroups.add("Name: Golden Archer\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Lambda Rod Eliot\nLocation: Eliot's default weapon.\n" +
                "Store: Campus Store\nValue: 220");
        equipmentGroups.add("Name: Lambda Rod Eliot+1\nLocation: Recipe Location: Initial recipe\nValue: 100");
        equipmentGroups.add("Name: Scalar Cane\nLocation: Store: Oddvin's Arms & Orbal Factory\nValue: 940");
        equipmentGroups.add("Name: Variable cane\nLocation: Recipe Location: Oddvin's Arms & Orbal Factory\nValue: 200");
        equipmentGroups.add("Name: Lambda Rod Eliot+2\nLocation: Eliot's default weapon on Chapter 3.\nValue: N/A");
        equipmentGroups.add("Name: Lambda Rod Eliot+3\nLocation: Eliot's default weapon on Chapter 4.\nValue: N/A");
        equipmentGroups.add("Name: Lambda Rod Eliot+4\nLocation: Eliot's default weapon on Chapter 6\nValue: N/A");
        equipmentGroups.add("Name: Belta Rod Emma\nLocation: Emma's default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Synchrotron\nLocation: Store: Club Lexington (Upstairs of Christie's Galleria)\nValue: 2140");
        equipmentGroups.add("Name: Aerial Wand\nLocation: Recipe Location: Davos' Factory\nValue: 300");
        equipmentGroups.add("Name: Libra Staff\nLocation: Store: Kilte's Store\nValue: 3300");
        equipmentGroups.add("Name: Stella Oak\nLocation: Recipe Location: Orbment Maintenance Device\n" +
                "(Nord Settlement)\nValue: 400");
        equipmentGroups.add("Name: Ruby Wand\nLocation: Store: Watson & Weapons & Armor\nValue: 4300");
        equipmentGroups.add("Name: Ruby Force\nLocation: Recipe Location: Lumiere Orbal Factory\nValue: 500");
        equipmentGroups.add("Name: Belta Rod +1 Emma\nLocation: Emma's default weapon on Chapter 5.\nValue: N/A");
        equipmentGroups.add("Name: Vector Staff\nLocation: Store: Watteau's Store\nValue: 5940");
        equipmentGroups.add("Name: Glare Wand\nLocation: Recipe Location: Watteau's Store\nValue: 600");
        equipmentGroups.add("Name: Closed-Delta\nLocation: Store: RF Arms\nValue: 7600");
        equipmentGroups.add("Name: Open-Delta\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Faith Rod\nLocation: Store: Campus Store (October 23, Evening)\nValue: 9740");
        equipmentGroups.add("Name: Blue Rhapsody Eliot\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Lunar Witch Emma\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Braver\nLocation: Laura's default weapon.\nValue: 200");
        equipmentGroups.add("Name: Broad Edge\nLocation: Store: Oddvin's Arms & Orbal Factory\nValue: 1040");
        equipmentGroups.add("Name: Heavy Edge\nLocation: Recipe Location: Oddvin's Arms & Orbal Factory\nValue: 200");
        equipmentGroups.add("Name: Braver +1\nLocation: Laura's default weapon on Chapter 3.\nValue: N/A");
        equipmentGroups.add("Name: Braver +2\nLocation: Laura's default weapon on Chapter 4\nValue: N/A");
        equipmentGroups.add("Name: Bastard Sword\nLocation: Store: Watson & Weapons & Armor\nValue: 4500");
        equipmentGroups.add("Name: Zweihaender\nLocation: Recipe Location: Lumiere Orbal Factory\nValue: 500");
        equipmentGroups.add("Name: Titania\nLocation: Store: Watteau's Store\nValue: 6240");
        equipmentGroups.add("Name: Durga\nLocation: Recipe Location: Watteau's Store\nValue: 600");
        equipmentGroups.add("Name: Braver +3\nLocation: Laura's default weapon on the Final Chapter\nValue: N/A");
        equipmentGroups.add("Name: Grambringer\nLocation: Store: Campus Store (October 23, Evening)\nValue: 10240");
        equipmentGroups.add("Name: Valkyria\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Knight Sword\nLocation: Jusis' default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Knight Sword +1\nLocation: Jusis' default weapon on Chapter 2.\nValue: N/A");
        equipmentGroups.add("Name: Saber\nLocation: Store: Club Lexington (Upstairs of Christie's Galleria)\nValue: 2000");
        equipmentGroups.add("Name: Sinclair\nLocation: Recipe Location: Davos' Factory\nValue: 300");
        equipmentGroups.add("Name: Backsword\nLocation: Store: Kilte's Store\nValue: 3000");
        equipmentGroups.add("Name: Walloon Sword\nLocation: Recipe Location: Orbment Maintenance Device\n" +
                "(Nord Settlement)\nValue: 400");
        equipmentGroups.add("Name: Knight Sword +2\nLocation: Jusis' default weapon on Chapter 5.\nValue: N/A");
        equipmentGroups.add("Name: Lombardia\nLocation: Store: Watteau's Store\nValue: 5500");
        equipmentGroups.add("Name: Katzbalger\nLocation: Recipe Location: Watteau's Store\nValue: 600");
        equipmentGroups.add("Name: Knight Sword +3\nLocation: Jusis' default weapon on the Final Chapter.\nValue: N/A");
        equipmentGroups.add("Name: Edel Saber\nLocation: Store: Campus Store (October 23, Evening)\nValue: 9000");
        equipmentGroups.add("Name: Holy Order\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Buster Shot\nLocation: Machias' default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Buster Shot +1\nLocation: Machias' default weapon on Chapter 2.\nValue: N/A");
        equipmentGroups.add("Name: Needler SG50\nLocation: Store: Club Lexington (Upstairs of Christie's Galleria)\nValue: 2100");
        equipmentGroups.add("Name: Gray Needler\nLocation: Recipe Location: Davos' Factory\nValue: 300");
        equipmentGroups.add("Name: Buster Shot +2\nLocation: Machias' default weapon on Chapter 4.\nValue: N/A");
        equipmentGroups.add("Name: Stinger SG30\nLocation: Store: Watson & Weapons & Armor\nValue: 4200");
        equipmentGroups.add("Name: Bear Stinger\nLocation: Recipe Location: Lumiere Orbal Factory\nValue: 500");
        equipmentGroups.add("Name: Buster Shot +3\nLocation: Machias' default weapon on Chapter 6.\nValue: N/A");
        equipmentGroups.add("Name: Inferno Blazer\nLocation: Store: RF Arms\nValue: 7400");
        equipmentGroups.add("Name: Flare Cyclone\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Phantom SG Zero\nLocation: During the \"Shots Fired\" Quest on Chapter 6\nValue: N/A");
        equipmentGroups.add("Name: Blitz Blaster\nLocation: Store: Campus Store (October 23, Evening)\nValue: 9500");
        equipmentGroups.add("Name: Subjugation Blaster\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Dual Edge\nLocation: Fie's default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Karambit\nLocation: Store: Club Lexington (Upstairs of Christie's Galleria)\nValue: 2100");
        equipmentGroups.add("Name: Double Skinner\nLocation: Recipe Location: Davos' Factory\nValue: 300");
        equipmentGroups.add("Name: Dual Edge +1\nLocation: Fie's default weapon on Chapter 4.\nValue: N/A");
        equipmentGroups.add("Name: Gemini Star\nLocation: Store: Watson & Weapons & Armor\nValue: 3800");
        equipmentGroups.add("Name: Odd Eye\nLocation: Recipe Location: Lumiere Orbal Factory\nValue: 500");
        equipmentGroups.add("Name: Dual Edge +2\nLocation: Fie's default weapon on Chapter 6.\nValue: N/A");
        equipmentGroups.add("Name: Strider\nLocation: Store: RF Arms\nValue: 6600");
        equipmentGroups.add("Name: Avenger\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Black Raid\nLocation: During the Shots Fired Quest on Chapter 6.\nValue: N/A");
        equipmentGroups.add("Name: Sword Breaker\nLocation: Store: Campus Store (October 23, Evening)\nValue: 8500");
        equipmentGroups.add("Name: Vert Venti\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Cross Spear\nLocation: Gaius' default weapon.\nValue: 200");
        equipmentGroups.add("Name: Cross Spear +1\nLocation: Recipe Location: Initial recipe\nValue: 100");
        equipmentGroups.add("Name: Cross Spear +2\nLocation: Gaius' default weapon on Chapter 2\nValue: N/A");
        equipmentGroups.add("Name: Cross Spear +3\nLocation: Gaius' default weapon on Chapter 3.\nValue: N/A");
        equipmentGroups.add("Name: Long Pike\nLocation: Store: Kilte's Store\nValue: 3400");
        equipmentGroups.add("Name: Gladiator Spea\nLocation: Recipe Location: Orbment Maintenance Device\n" +
                "(Nord Settlement)\nValue: 400");
        equipmentGroups.add("Name: Cross Spear +4\nLocation: Gaius' default weapon on Chapter 5.\nValue: N/A");
        equipmentGroups.add("Name: Partisan\nLocation: Store: Watteau's Store\nValue: 6100");
        equipmentGroups.add("Name: Corsesca\nLocation: Recipe Location: Watteau's Store\nValue: 600");
        equipmentGroups.add("Name: Cross Spear +5\nLocation: Gaius' default weapon on the final chapter.\nValue: N/A");
        equipmentGroups.add("Name: Dragoon Lance\nLocation: Store: Campus Store (October 23, Evening)\nValue: 10000");
        equipmentGroups.add("Name: Astra Hawk\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Breaker Arm\nLocation: Millium's default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Breaker Arm +1\nLocation: Millium's default weapon on Chapter 5\nValue: N/A");
        equipmentGroups.add("Name: Chrome Claw\nLocation: Store: Watteau's Store\nValue: 6400");
        equipmentGroups.add("Name: Wild Claw\nLocation: Recipe Location: Watteau's Stor\nValue: 600");
        equipmentGroups.add("Name: Breaker Arm +2\nLocation: Millium's default weapon on the Final Chapter.\nValue: N/A");
        equipmentGroups.add("Name: Mighty Arm\nLocation: Store: Campus Store (October 23, Evening)\nValue: 10500");
        equipmentGroups.add("Name: Divine Gear\nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");
        equipmentGroups.add("Name: Trickster\nLocation: Crow's default weapon.\nValue: N/A");
        equipmentGroups.add("Name: Trickster +1\nLocation: Crow's default weapon in Chapter 6\nValue: N/A");
        equipmentGroups.add("Name: Colt & Pony\nLocation: Store: RF Arms\nValue: 7400");
        equipmentGroups.add("Name: Double Mustang\nLocation: Recipe Location: RF Store\nValue: 700");
        equipmentGroups.add("Name: Fire & Ice\\nLocation: During the Shots Fired Quest on Chapter 6.\nValue: N/A");
        equipmentGroups.add("Name: Shadow Jack\nLocation: Store: Campus Store (October 23, Evening)\nValue: 9500");
        equipmentGroups.add("Name: \nLocation: Recipe Location: Engineering Building (October 23, Evening)\nValue: 1000");


        item.put("Equipment",equipmentGroups);
        MyExpandableListAdapter adapter=new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);

    }
}