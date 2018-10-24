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

public class FirstFragment extends Fragment {
    String earthquake = "<h1><font color =\"red\">What to Do Before an Earthquake</font></h1>\n" +
            "    <p>\n" +
            "    <ul>   \n" +
            "    <li> Repair deep plaster cracks in ceilings and foundations. </li>\n" +
            "\t<li>Get expert advice if there are signs of structural defects.</li>\n" +
            "   <li> Anchor overhead lighting fixtures to the ceiling.</li>\n" +
            "    <li>Follow BIS codes relevant to your area for building standards</li>\n" +
            "    <li>Fasten shelves securely to walls.</li>\n" +
            "    <li>Place large or heavy objects on lower shelves.</li>\n" +
            "\t<li>Store breakable items such as bottled foods, glass, and china in low, closed cabinets with latches.</li>\n" +
            "   <li> Hang heavy items such as pictures and mirrors away from beds, settees, and anywhere that people sit.</li>\n" +
            "    <li>Brace overhead light and fan fixtures.</li>\n" +
            "     <li>Repair defective electrical wiring and leaky gas connections. These are potential fire risks.</li>\n" +
            "     <li>Secure water heaters, LPG cylinders etc., by strapping them to the walls or bolting to the floor.</li>\n" +
            "     <li>Store weed killers, pesticides, and flammable products securely in closed cabinets with latches and on bottom shelves.</li>\n" +
            "     <li>Identify safe places indoors and outdoors.\n" +
            "   <ul> <font size=\"2\">\n" +
            "    <li> Under strong dining table, bed</li>\n" +
            "     <li>Against an inside wall</li>\n" +
            "      <li>Away from where glass could shatter around windows, mirrors, pictures, or where heavy bookcases or other heavy furniture could fall over</li>\n" +
            "    <li>In the open, away from buildings, trees, telephone and electrical lines, flyovers and bridges</li>\n" +
            "\t</font> \n" +
            "     </ul>\n" +
            "\t </li>\n" +
            "<li>Know emergency telephone numbers (such as those of doctors, hospitals, the police, etc)</li>\n" +
            "<li>Educate yourself and family members</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t\n" +
            "\t<h1><font color =\"red\">Have a disaster emergency kit ready</font></h1>\n" +
            "\t<p>\n" +
            "\t<ul>\n" +
            "\t<li>Battery operated torch with extra batteries</li>\n" +
            "    <li>Battery operated radio</li>\n" +
            "    <li>First aid kit and manual</li>\n" +
            "    <li>Emergency food (dry items) and water (packed and sealed)</li>\n" +
            "    <li>Candles and matches in a waterproof container</li>\n" +
            "    <li>Knife</li>\n" +
            "    <li>Chlorine tablets or powdered water purifiers</li>\n" +
            "    <li>Can opener.</li>\n" +
            "    <li>Essential medicines</li>\n" +
            "    <li>Cash and credit cards</li>\n" +
            "    <li>Thick ropes and cords</li>\n" +
            "    <li>Sturdy shoes</li>\n" +
            "     </ul>\n" +
            "\t </p>\n" +
            "\t <h1><font color =\"red\">Develop an emergency communication plan</font></h1>\n" +
            "\t <p>\n" +
            "\t <ul>\n" +
            "\t <li>In case family members are separated from one another during an earthquake develop a plan for reuniting after the disaster.</li>\n" +
            "     <li>Ask an out-of-state relative or friend to serve as the 'family contact' after the disaster; it is often easier to call long distance. Make sure everyone in the family knows the name, address, and phone number of the contact person.</li>\n" +
            "\t </ul>\n" +
            "\t </p>\n" +
            "\t <h1><font color =\"red\">Help your community get ready</font></h1>\n" +
            "\t <p>\n" +
            "\t <ul>\n" +
            "\t <li>Publish a special section in your local newspaper with emergency information on earthquakes. Localize the information by printing the phone numbers of local emergency services offices and hospitals.</li>\n" +
            "    <li>Conduct week-long series on locating hazards in the home.</li>\n" +
            "    <li>Work with local emergency services and officials to prepare special reports for people with mobility impairment on what to do during an earthquake.</li>\n" +
            "    <li>Provide tips on conducting earthquake drills in the home.</li>\n" +
            "    <li>Interview representatives of the gas, electric, and water companies about shutting off utilities.</li>\n" +
            "    <li>Work together in your community to apply your knowledge to building codes, retrofitting programmes, hazard hunts, and neighborhood and family emergency plans.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<h1><font color =\"red\">What to Do During an Earthquake</font></h1>\n" +
            "\t<h2><font color =\"green\"> if indores </font></h2>\n" +
            "\t<p>\n" +
            "\t<ul>\n" +
            "\t<li>DROP to the ground; take COVER by getting under a sturdy table or other piece of furniture; and HOLD ON until the shaking stops. If there is no a table or desk near you, cover your face and head with your arms and crouch in an inside corner of the building.</li>\n" +
            "    <li>Protect yourself by staying under the lintel of an inner door, in the corner of a room, under a table or even under a bed.</li>\n" +
            "    <li>Stay away from glass, windows, outside doors and walls, and anything that could fall, (such as lighting fixtures or furniture).</li>\n" +
            "    <li>Stay in bed if you are there when the earthquake strikes. Hold on and protect your head with a pillow, unless you are under a heavy light fixture that could fall. In that case, move to the nearest safe place.</li>\n" +
            "    <li>Use a doorway for shelter only if it is in close proximity to you and if you know it is a strongly supported, load bearing doorway.</li>\n" +
            "    <li>Stay inside until the shaking stops and it is safe to go outside. Research has shown that most injuries occur when people inside buildings attempt to move to a different location inside the building or try to leave.</li>\n" +
            "    <li>Be aware that the electricity may go out or the sprinkler systems or fire alarms may turn on.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<h2><font color =\"green\"> if outdores </font></h2>\n" +
            "\t<p>\n" +
            "\t<ul>\n" +
            "\t<li>Do not move from where you are. However, move away from buildings, trees, streetlights, and utility wires.</li>\n" +
            "    <li>If you are in open space, stay there until the shaking stops. The greatest danger exists directly outside buildings; at exits; and alongside exterior walls. Most earthquake-related casualties result from collapsing walls, flying glass, and falling objects.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<h1><font color =\"red\">What to Do During an Earthquake</font></h1>\n" +
            "\t<p>\n" +
            "\t<ul>\n" +
            "\t<li>Stop as quickly as safety permits and stay in the vehicle. Avoid stopping near or under buildings, trees, overpasses, and utility wires.</li>\n" +
            "    <li>Proceed cautiously once the earthquake has stopped. Avoid roads, bridges, or ramps that might have been damaged by the earthquake.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "    <h1><font color =\"red\">If trapped under debris</font></h1>\n" +
            "\t<p>\n" +
            "\t<ul>\n" +
            "\t<li>Do not light a match.</li>\n" +
            "    <li>Do not move about or kick up dust.</li>\n" +
            "    <li>Cover your mouth with a handkerchief or clothing.</li>\n" +
            "    <li>Tap on a pipe or wall so rescuers can locate you. Use a whistle if one is available. Shout only as a last resort. Shouting can cause you to inhale dangerous amounts of dust.</li>\n" +
            "\t</ul>\n" +
            "    </p>";
    String landslide = "<h1><font color=\"#ff0000\"> Precautions During Land Slides </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> DO'S </font>\n" +
            "    <ul>\n" +
            "    <li>Prepare tour to hilly region according to information given by weather department or news channel.</li>\n" +
            "    <li>Move away from landslide path or downstream valleys quickly without wasting time.</li>\n" +
            "    <li>Keep drains clean</li>\n" +
            "    <li>Inspect drains for - litter, leaves, plastic bags, rubble etc.</li>\n" +
            "    <li>Keep the weep holes open.</li>\n" +
            "\t<li>Stay alert, awake and active (3A's) during the impact or probability of impact.</li>\n" +
            "\t<li>Locate and go to shelters </li>\n" +
            "\t<li>Try to stay with your family and companions.</li>\n" +
            "\t<li>Check for injured and trapped persons. </li>\n" +
            "    <li>Mark path of tracking so that you can't be lost in middle of the forest.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> DONT'S </font>\n" +
            "\t<ul>\n" +
            "\t<li>Try to avoid construction and staying in vulnerable areas.</li>\n" +
            "\t<li>Do not panic and loose energy by crying.</li>\n" +
            "\t<li>Do not touch or walk over loose material and electrical wiring or pole.</li>\n" +
            "\t<li>Do not built houses near steep slopes and near drainage path.</li>\n" +
            "\t<li>Do not drink contaminated water directly from rivers, springs, wells but rain water if collected directly without is fine.</li>\n" +
            "\t<li>Do not move an injured person without rendering first aid unless the casualty is in immediate danger.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String tornado = "<h1><font color=\"#ff0000\"> Precautions During Cyclones </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> BEFORE THE CYCLONE SEASON </font>\n" +
            "    <ul>\n" +
            "    <li>Check the house; secure loose tiles and carry out repairs of doors and windows</li>\n" +
            "\t<li>Keep some wooden boards ready so that glass windows can be boarded if needed</li>\n" +
            "\t<li>Keep a hurricane lantern filled with kerosene, battery operated torches and enough dry cells</li>\n" +
            "\t<li>Keep some extra batteries for transistors</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> WHEN CYCLONE STARTS </font>\n" +
            "\t<ul>\n" +
            "\t<li>Keep monitoring the warnings.</li>\n" +
            "\t<li>Pass the information to others.</li>\n" +
            "\t<li>Ignore rumours.Believe in the official information</li>\n" +
            "\t<li>Leave early before your way to high ground or shelter gets flooded</li>\n" +
            "\t<li>Do not delay and run the risk of being marooned</li>\n" +
            "\t<li>If your house is securely built on high ground take shelter in the safe part of the house. However, if asked to evacuate do not hesitate to leave the place.</li>\n" +
            "\t<li>Board up glass windows or put storm shutters in place.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> WHEN EVACUTION IS INSTRUCTED </font>\n" +
            "\t<ul>\n" +
            "\t<li>Pack essentials for yourself and your family to last a few days. These should include medicines, special food for babies and children or elders.</li>\n" +
            "\t<li>Head for the proper shelter or evacuation points indicated for your area.</li>\n" +
            "\t<li>Do not worry about your property</li>\n" +
            "\t<li>At the shelter follow instructions of the person in charge.</li>\n" +
            "\t<li>Remain in the shelter until you are informed to leave</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> POST CYCLONE MEASURES </font>\n" +
            "\t<ul>\n" +
            "\t<li>You should remain in the shelter until informed that you can return to your home.</li>\n" +
            "\t<li>You must get inoculated against diseases immediately.</li>\n" +
            "\t<li>Strictly avoid any loose and dangling wires from lamp posts.</li>\n" +
            "\t<li>If you have to drive, do drive carefully.</li>\n" +
            "\t<li>Clear debris from your premises immediately.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String flood = "<h1><font color=\"#ff0000\"> Safety Measurments During Floods </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> IF FLOOD IS LIKELY TO HIT YOUR AREA, YOU SHOULD </font>\n" +
            "    <ul>\n" +
            "\t<li>Elevate the furnace, water heater, and electric panel if susceptible to flooding.</li>\n" +
            "\t<li>Install \"Check Valves\" in sewer traps to prevent floodwater from backing up into the drains of your home.</li>\n" +
            "\t<li>Contact community officials to find out if they are planning to construct barriers</li>\n" +
            "\t<li>Seal the walls in your basement with waterproofing compounds to avoid seepage.</li>\n" +
            "\t<li>Listen to the radio or television for information.</li>\n" +
            "\t<li>Be aware that flash flooding can occur.</li> \n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> IF YOU MUST PREPARE TO EVACUATE, YOU SHOULD </font>\n" +
            "\t<ul>\n" +
            "\t<li>Secure your home. If you have time, bring in outdoor furniture.</li>\n" +
            "\t<li>Move essential items to an upper floor.</li>\n" +
            "\t<li>Turn off utilities at the main switches or valves if instructed to do so.</li>\n" +
            "\t<li>Disconnect electrical appliances. Do not touch electrical equipment if you are wet or standing in water</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> IF YOU HAVE TO LEAVE YOUR HOME,EVACUTION TIPS: </font>\n" +
            "\t<ul>\n" +
            "\t<li>Do not walk through moving water.</li> \n" +
            "\t<li>Six inches of moving water can make you fall.</li> \n" +
            "\t<li>If you have to walk in water, walk where the water is not moving. Use a stick to check the firmness of the ground in front of you.</li>\n" +
            "\t<li>Do not drive into flooded areas. \n" +
            "\t<li>If floodwaters rise around your car, abandon the car and move to higher ground if you can do so safely.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String tsunami = "<h1><font color=\"#ff0000\"> Safety Measurments During Tsunami </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> DO'S AND DONT'S </font>\n" +
            "    <ul>\n" +
            "\t<li>You should find out if your home, school, workplace, or other frequently visited locations are in tsunami hazard areas along sea-shore.</li>\n" +
            "\t<li>Plan evacuation routes from your home, school, workplace, or any other place you could be where tsunamis present a risk.</li>\n" +
            "\t<li>If your children's school is in an identified inundation zone, find out what the school evacuation plan is.</li>\n" +
            "\t<li>Talk to your insurance agent.Homeowners' policies may not cover flooding from a tsunami.</li>\n" +
            "\t<li>Discuss tsunamis with your family.Everyone should know what to do in a tsunReview flood safety and preparedness measures with your family</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> IF YOU ARE IN AREA OF RISK FROM TSUNAMI </font>\n" +
            "\t<ul>\n" +
            "\t<li>Practice your evacuation routes. Familiarity may save your life.</li> \n" +
            "\t<li>Be able to follow your escape route at night and during inclement weather. </li>\n" +
            "\t<li>Use a Weather Radio or stay tuned to a local radio or television station to keep informed of local watches and warnings.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> WHAT TO DO AFTER A TSUNAMI </font>\n" +
            "\t<ul>\n" +
            "\t<li>Check yourself for injuries and get first aid if necessary before helping injured or trapped persons.</li>\n" +
            "\t<li>If someone needs to be rescued, call professionals with the right equipment to help.</li>\n" +
            "\t<li>Help people who require special assistance— Infants, elderly people, those without transportation.</li> \n" +
            "\t<li>Avoid disaster areas.</li>\n" +
            "\t<li>Your presence might hamper rescue and other emergency operations and put you at further risk from the residual effects of floods.</li>\n" +
            "\t<li>Use the telephone only for emergency calls.Telephone lines are frequently overwhelmed in disaster situations. </li>\n" +
            "\t<li>Stay out of a building if water remains around it.Tsunami water, like floodwater, can undermine foundations, causing buildings to sink, floors to crack, or walls to collapse.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String nuclear = "<h1><font color=\"#ff0000\"> SAFETY MEASURES DURING NUCLEAR/RADIOLOGICAL EMERGENCIES </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> DO'S </font>\n" +
            "    <ul>\n" +
            "\t<li>Go indoors. Stay inside.</li>\n" +
            "\t<li>Switch on the radio/television and look out for public announcements from your local authority.</li>\n" +
            "\t<li>Close doors/windows.</li>\n" +
            "\t<li>Cover all food, water and consume only such covered items.</li>\n" +
            "\t<li>If in the open, cover your face and body with a wet handkerchief, towel, dhoti or sari. Return home, change/remove clothes.</li>\n" +
            "\t<li>Extend full cooperation to local authorities and obey their instructions completely -- be it for taking medication, evacuation, etc.</li>\n" +
            "\t<li>You must be aware of nuclear radiation hazard. Discuss on Nuclear radiation safety among children and family members, to reduce their fear of radiation.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> DONT'S </font>\n" +
            "\t<ul>\n" +
            "\t<li>Do not panic.</li>\n" +
            "\t<li>Do not believe in rumours passed on by word of mouth from one person to another.</li>\n" +
            "\t<li>Do not stay outside/or go outside.</li>\n" +
            "\t<li>As far as possible, AVOID water from open wells/ponds; exposed crops and vegetables; food, water or milk from outside.</li>\n" +
            "\t<li>Do not disobey any instruction of the district or civil defence authorities who would be doing their best to ensure the safety of you, your family and your property.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String chemical = "<h1><font color=\"#ff0000\"> SAFETY MEASURES DURING CHEMICAL/INDUSTRIAL ACCIDNTS </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> DO'S AND DONT'S </font>\n" +
            "    <ul>\n" +
            "\t<li>Do not panic, evacuate calmly and quickly perpendicular to wind direction through the designated escape route</li>\n" +
            "\t<li>Keep a wet handkerchief or piece of cloth/ sari on face during evacuation</li>\n" +
            "\t<li>Keep the sick, elderly, weak, handicapped and other people who are unable to evacuate inside house and close all the doors and windows tightly.</li>\n" +
            "\t<li>Do not consume the uncovered food/ water etc open to the air, drink only from bottle</li>\n" +
            "\t<li>Change into fresh clothing after reaching safe place/ shelter, and wish hands properly</li>\n" +
            "\t<li>Inform Fire & Emergency Services, Police and medical services from safe location by calling 101, 100 and 108 respectively.</li>\n" +
            "\t<li>Provide correct and accurate information to government official.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> GENERAL PRECAUTION DURING NORMAL TIMES </font>\n" +
            "\t<ul>\n" +
            "\t<li>Do not smoke, lit fire or spark in the identified hazardous area</li>\n" +
            "\t<li>Sensitize the community living near the industrial units and they should be more vigilant about the nature of industrial units and associated risks.</li>\n" +
            "\t<li>Keep the contact numbers of nearest hazardous industry, fire station, police station, control room, health services and district control room, for emergency use.</li>\n" +
            "\t<li>Avoid housing near the industries producing or processing the hazardous chemicals, if possible.</li>\n" +
            "\t<li>Participate in all the capacity building programmes organized by the government/ voluntary organizations / industrial units.</li>\n" +
            "\t<li>Take part in preparing disaster management plan for the community and identify safe shelter along with safe and easy access routes.</li>\n" +
            "\t<li>Prepare a family disaster management plan and explain it to all the family members.</li>\n" +
            "\t<li>Prepare an emergency kit of items and essentials in the house, including medicines, documents and valuables.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";
    String bio = "<h1><font color=\"#ff0000\"> SAFETY MEASURES DURING BIOLOGICAL DISASTER </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> BEFORE THE DISASTER </font>\n" +
            "    <ul>\n" +
            "\t<li>Plan for Family Biological Disaster Plan.</li>\n" +
            "\t<li>Personal cleanliness - daily bath, don’t grow long nails and wear clean clothes.</li>\n" +
            "\t<li>Hand Hygiene (Wash hands with soap and water before preparing food or eating, after passing stools, coughing or sneezing).</li>\n" +
            "\t<li>Take a First Aid and Cardio-Pulmonary Resuscitation (CPR) training.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> DIARRHOEAL GROUP OF DISEASES INCLUDING CHOLERA: DO'S/DONT'S </font>\n" +
            "\t<ul>\n" +
            "\t <li>Drink boiled potable water in an emergency that has been boiled for at least 15 minutes and consumed it the same day.</li>\n" +
            "\t<li>Promote storage of water in narrow mouthed container.</li>\n" +
            "\t<li>Cook food thoroughly especially meat, poultry, eggs and seafood until it is steaming and eat it while it is still hot.</li>\n" +
            "\t<li>Ensure cooked meat and poultry is safe and no part of the meat discoloured or foul smelling, or in the case of egg, their shells are not cracked.</li>                                                \n" +
            "\t<li>If food is not eaten immediately, reheat cooked until it is steaming hot prior to serving.</li>\n" +
            "\t<li>Do not drink water from unsafe sources.</li>\n" +
            "\t<li>Do not eat uncooked food unless it is peeled or shelled.</li> \n" +
            "\t<li>Do not leave cooked food at room temperature longer than 2 hours.</li>\n" +
            "\t<li>Do not consume cut fruits from vendors.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> RESPIRATORY GROUP OF DISEASES LIKE TUBERCULOSIS, INFLUENZA, CHICKENPOX</font>\n" +
            "\t<ul>\n" +
            "\t<li>The sick person should stay at home, and avoid going into the community, school/office, public places for at least 24 hours after symptoms have resolved.</li>\n" +
            "\t<li>Triple layer surgical Mask of standard and certified make should be worn by Suspected/ probable/confirmed cases of influenza or by the care provider in home care settings and close family contacts of such cases undergoing home care. </li>\n" +
            "\t<li>Get plenty of sleep, be physically active, manage your stress, drink plenty of fluids, and eat nutritious food.</li>\n" +
            "\t<li>Avoid smoking.</li>\n" +
            "\t<li>Cover the nose/mouth with a handkerchief/ tissue paper when coughing or sneezing which should be disposed off in dustbins</li>\n" +
            "\t</ul>\n" +
            "\t</p>\t\n" +
            "\t<p><font color=\"#ff0000\">  MOSQUITO BORNE DISEASES LIKE MALARIA, DENGUE, FILARIA, CHIKUNGUNYA: DO'S AND DONT'S</font>\n" +
            "\t<ul>\n" +
            "\t<li>Follow “sun-down sleeves-down” approach. Wear clothes that cover arms and legs.</li>\n" +
            "\t<li>Prevent water collections on ground and other places to prevent malaria breeding.</li>\n" +
            "\t<li>Empty water containers at least once a week.</li>\n" +
            "\t<li>Cover and seal any septic tanks.</li>\n" +
            "\t<li>use Mosquito Nets preferably Insecticide Treated Bed Nets (ITBN).</li>\n" +
            "\t<li>Apply insect repellants while sleeping to keep away mosquitoes.</li>\n" +
            "\t<li>Do not encourage children to wear shorts and half sleeved clothing.</li>\n" +
            "\t<li>Do not allow water to stagnate.</li>\n" +
            "\t<li>Do not allow discarded items to accumulate such as tires, tubes, empty coconut shells, household items and objects wherein water may collect.</li>\n" +
            "\t<li>Do not bathe in village ponds and allow cattle to take bath in the same pond</li>\t\n" +
            "\t</ul>\n" +
            "\t</p>";
    String heat = "<h1><font color=\"#ff0000\"> Safety Measurments During Heat Waves </font> </h1>\n" +
            "    <p><font color=\"#ff0000\"> TO MINIMISE THE IMPACTS: </font>\n" +
            "    <ul>\n" +
            "\t<li>Avoid going out in the sun, especially between 12.00 noon and 3.00 p.m.</li>\n" +
            "\t<li>Drink sufficient water and as often as possible, even if not thirsty</li>\n" +
            "\t<li>Wear lightweight, light-coloured, loose, and porous cotton clothes.</li>\n" +
            "\t<li>Use protective goggles, umbrella/hat, shoes or chappals while going out in sun.</li>\n" +
            "\t<li>Avoid strenuous activities when the outside temperature is high. Avoid working outside between 12 noon and 3 p.m.</li>\n" +
            "\t<li>While travelling, carry water with you.</li>\n" +
            "\t<li>Avoid alcohol, tea, coffee and carbonated soft drinks, which dehydrates the body.</li>\n" +
            "\t<li>Avoid high-protein food and do not eat stale food.</li>\n" +
            "\t<li>If you work outside, use a hat or an umbrella and also use a damp cloth on your head, neck, face and limbs</li>\n" +
            "\t<li>Use ORS, homemade drinks like lassi, torani (rice water), lemon water, buttermilk, etc. which helps to re-hydrate the body.</li>\n" +
            "\t</ul>\n" +
            "\t</p>\n" +
            "\t<p><font color=\"#ff0000\"> PRIMARILY TRAETMENT IN CASE OF SUNSTROKE </font>\n" +
            "\t<ul>\n" +
            "\t<li>Lay the person in a cool place, under a shade. Wipe her/him with a wet cloth/wash the body frequently.</li>\n" +
            "\t<li>Pour normal temperature water on the head. The main thing is to bring down the body temperature.</li>\n" +
            "\t<li>Give the person ORS to drink or lemon sarbat/torani or whatever is useful to rehydrate the body.</li>\n" +
            "\t<li>Take the person immediately to the nearest health centre. The patient needs immediate hospitalisation, as heat strokes could be fatal.</li>\n" +
            "\t</ul>\n" +
            "\t</p>";


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    View view;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    private ArrayList<String> mInfo = new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        sharedPreferences = context.getSharedPreferences("current_frame", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("frame", "1");
        editor.commit();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFill();
    }

    private void initFill(){
        mImage.add(R.mipmap.earthquake);
        mNames.add("Earthquake");
        mInfo.add(earthquake);

        mImage.add(R.mipmap.tsunami);
        mNames.add("Tsunami");
        mInfo.add(tsunami);

        mImage.add(R.mipmap.tornado);
        mNames.add("Cyclones and Tornados");
        mInfo.add(tornado);

        mImage.add(R.mipmap.flood);
        mNames.add("Flood");
        mInfo.add(flood);

        mImage.add(R.mipmap.landslide);
        mNames.add("Landslide");
        mInfo.add(landslide);

        mImage.add(R.mipmap.forest_fire);
        mNames.add("Forest fire");
        mInfo.add(earthquake);

        mImage.add(R.mipmap.nuclear);
        mNames.add("Nuclear Disasiter");
        mInfo.add(nuclear);

        mImage.add(R.mipmap.chemical);
        mNames.add("Chemical Disasiter");
        mInfo.add(chemical);

        mImage.add(R.mipmap.bio);
        mNames.add("Biological Disasiter");
        mInfo.add(bio);

        mImage.add(R.mipmap.heat_waves);
        mNames.add("Heat Waves");
        mInfo.add(heat);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        FirstRecyclerViewAdapter adapter = new FirstRecyclerViewAdapter(view.getContext(), mNames, mImage, mInfo);
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
