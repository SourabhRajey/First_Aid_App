package com.example.rishabhtanwar.disasterfirstaid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    String dm = "<p>\n" +
            "Disaster Management refers to how we can protect or preserve maximum number of lives and property during a natural disaster. Disaster management plans are multi-layered and are aimed to address such issues as floods, hurricanes, fires, bombings and even mass failures of utilities or the rapid spread of disease.\n" +
            "</p>";
    String ndma = "<h1><font color =\"red\">National Disaster Management Authority (India)</font></h1>\n" +
            "<p>\n" +
            "NDMA(NATIONAL DISASTER MANAGEMENT AUTHORITY), as the apex body, is mandated to lay down the policies, plans and guidelines for Disaster Management to ensure timely and effective response to disasters. Towards this, it has the following responsibilities:-</p>\n" +
            "<p>\n" +
            "<ul>\n" +
            "    <li>Lay down policies on disaster management ;</li>\n" +
            "    <li>Approve the National Plan;</li>\n" +
            "    <li>Approve plans prepared by the Ministries or Departments of the Government of India in accordance with the National Plan;</li>\n" +
            "    <li>Lay down guidelines to be followed by the State Authorities in drawing up the State Plan;</li>\n" +
            "    <li>Lay down guidelines to be followed by the different Ministries or Departments of the Government of India for the Purpose of integrating the measures for prevention of disaster or the mitigation of its effects in their development plans and projects;</li>\n" +
            "    <li>Coordinate the enforcement and implementation of the policy and plans for disaster management;</li>\n" +
            "    <li>Recommend provision of funds for the purpose of mitigation;</li>\n" +
            "    <li>Provide such support to other countries affected by major disasters as may be determined by the Central Government;</li>\n" +
            "    <li>Take such other measures for the prevention of disaster, or the mitigation, or preparedness and capacity building for dealing with threatening disaster situations or disasters as it may consider necessary;</li>\n" +
            "    <li>Lay down broad policies and guidelines for the functioning of the National Institute of Disaster Management.</li>\n" +
            "\n" +
            "</ul>\n" +
            "</p>\n" +
            " <h3><font color =\"blue\">Postal Address: </font></h3>\n" +
            "  <p>    \n" +
            "        NDMA Bhawan,<br>\n" +
            "        A-1, Safdarjung Enclave,<br>\n" +
            "        New Delhi - 110029\n" +
            "  </p>\n" +
            "  <h3><font color =\"blue\">  Telephones: </font></h3>\n" +
            "  <p>      +91-11-26701700<br>\n" +
            "        Control Room: +91-11-26701728<br>\n" +
            "        Helpline Number: 011-1078<br>\n" +
            "        Fax: +91-11-26701729\n" +
            "   </p>\n" +
            "   <h3><font color =\"blue\"> E-mail: </font></h3>\n" +
            "    <p>controlroom@ndma.gov.in</p>";
    String ndrf = "<h1><font color =\"red\">National Disaster Response Force (NDRF)</font></h1>\n" +
            "<p>NDRF a specialist force, the force is gradually emerging as the most visible and vibrant multi-disciplinary, multi-skilled, high-tech force of the NDMA capable of dealing with all types of natural and man-made disasters.At present, National Disaster Response Force (NDRF) is about constituted of battalions from the BSF, CRPF, CISF and ITBP.The DM Act (Disaster Management Act), 2005 made the statutory provisions for the constitution of the National Disaster Response Force (NDRF) with the objective of specialized response to natural and man-made disasters.\n" +
            "</p>\n" +
            " <h3><font color =\"blue\">Postal Address: </font></h3>\n" +
            "  <p>    \n" +
            "\t\tDirectorate General ,National Disaster Response Force,<br>\n" +
            "\t\t6th Floor, NDCC-II Building, Jai Singh Road,<br>\n" +
            "\t\tNEW DELHI-110001\n" +
            "  </p>\n" +
            "  <h3><font color =\"blue\">  Telephones: </font></h3>\n" +
            "  <p>      \n" +
            "        Control Room: 011-23438091,<br>\n" +
            "\t\tHelpline no. : +91-9711077372<br>\n" +
            "        Fax: 011-23438091\n" +
            "   </p>\n" +
            "   <h3><font color =\"blue\"> E-mail: </font></h3>\n" +
            "    <p>hq.ndrf@nic.in</p>";
    String nidm = "<h1><font color =\"red\">National Institute of Disaster Management (NIDM)</font></h1>\n" +
            "<p>\n" +
            "The National Institute of Disaster Management (NIDM) was constituted under an Act of Parliament with a vision to play the role of a premier institute for capacity development in India and the region.NIDM provides Capacity Building support to various National and State level agencies in the field of Disaster Management & Disaster Risk Reduction. The Institute's vision is to create a Disaster Resilient India by building the capacity at all levels for disaster prevention and preparedness.NIDM provides technical support to the state governments through the Disaster Management Centres (DMCs) in the Administrative Training Institutes (ATIs) of the States and Union Territories.\n" +
            "\t</p>\n" +
            " <h3><font color =\"blue\">Postal Address: </font></h3>\n" +
            "  <p>    \n" +
            "        A-wing, 4th floor, NDCC-II Building,<br>\n" +
            "\t\tJai Singh Road,<br>\n" +
            "\t\tNew Delhi - 110001<br>\n" +
            "  </p>\n" +
            "  <h3><font color =\"blue\">  Telephones: </font></h3>\n" +
            "  <p>   \n" +
            "\t\tContact no.: 011-23438285<br>\n" +
            "        Fax: 011-23438286<br>\n" +
            "\t\t\n" +
            "   </p>\n" +
            "   <h3><font color =\"blue\"> E-mail: </font></h3>\n" +
            "    <p>ed.nidm@nic.in</p>";

    View view;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    private ArrayList<String> mInfo = new ArrayList<>();

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        sharedPreferences = context.getSharedPreferences("current_frame", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("frame", "2");
        editor.commit();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFill();
    }

    private void initFill(){
        mImage.add(R.mipmap.dm);
        mNames.add("What is Disaster Management");
        mInfo.add(dm);

        mImage.add(R.mipmap.ndma_logo);
        mNames.add("NDMA");
        mInfo.add(ndma);

        mImage.add(R.mipmap.ndrf_logo);
        mNames.add("NDRF");
        mInfo.add(ndrf);

        mImage.add(R.mipmap.nidm_logo);
        mNames.add("NIDM");
        mInfo.add(nidm);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_second,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.second_recycler_view);
        SecondRecyclerViewAdapter adapter = new SecondRecyclerViewAdapter(view.getContext(), mNames, mImage, mInfo);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        sharedPreferences = getContext().getSharedPreferences("current_frame", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("frame", null);
        editor.commit();
    }
}
