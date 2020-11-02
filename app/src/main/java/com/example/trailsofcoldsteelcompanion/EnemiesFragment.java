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

        ArrayList<String> enemyGroups=new ArrayList<>();
        enemyGroups.add("Slime");
        enemyGroups.add("Demon");
        enemyGroups.add("Soldier");
        enemyGroups.add("Elite Soldier");
        enemyGroups.add("General");
        enemyGroups.add("Demon");
        enemyGroups.add("Corrupted");
        enemyGroups.add("Wolf");
        enemyGroups.add("Legion");

        item.put("Enemy",enemyGroups);
        MyExpandableListAdapter adapter=new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}