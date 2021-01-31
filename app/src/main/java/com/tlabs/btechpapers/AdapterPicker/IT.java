/*
 * Copyright 2020 Pratyush Tiwari
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by Pratyush Tiwari on 31/1/21 7:35 PM
 *  Last modified 31/1/21 7:21 PM
 *
 *
 */

package com.tlabs.btechpapers.AdapterPicker;

import android.content.Context;

import com.tlabs.btechpapers.Adapters.PaperAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class IT {
    private IT(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".IT"+"/"+sem;
        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();
        switch (sem){
            case "MID SEM-3":{
                buttonText.add("Analog and Digital Electronics 15-16");
                buttonText.add("Analog and Digital Electronics 16-17");
                buttonText.add("Analog and Digital Electronics 18-19");
                buttonText.add("DS 16-17");
                buttonText.add("DS 18-19");
                buttonText.add("Logical Thoughts 18-19");
                buttonText.add("Logical Thoughts 16-17");
                buttonText.add("OOP 18-19");
                buttonText.add("Technical Writing 16-17");
                buttonText.add("IT Management 16-17");
                buttonText.add("IT Management 17-18");
                buttonText.add("IT Management 18-19");

                targetFile.add(new File(folder,"ade 15-16 end.pdf"));
                targetFile.add(new File(folder,"ade 16-17 end.pdf"));
                targetFile.add(new File(folder,"ade 18-19 end.pdf"));
                targetFile.add(new File(folder,"ds 16-17 end.pdf"));
                targetFile.add(new File(folder,"ds 18-19 end.pdf"));
                targetFile.add(new File(folder,"flt 18-19 enf.pdf"));
                targetFile.add(new File(folder,"logical thought 16-17 end.pdf"));
                targetFile.add(new File(folder,"oop 18-19 end.pdf"));
                targetFile.add(new File(folder,"technical writing 16-17 end.pdf"));
                targetFile.add(new File(folder,"it management 16-17 mid.pdf"));
                targetFile.add(new File(folder,"it management 17-18 mid.pdf"));
                targetFile.add(new File(folder,"it management 18-19 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2015-16%20end.pdf?alt=media&token=045b7679-02ff-4943-9caf-79cfb99a562b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2016-17%20end.pdf?alt=media&token=e3cc53a5-631d-4224-8cd1-94b4c1da5c88");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2018-19%20end.pdf?alt=media&token=e1e864e8-d68f-4356-9e1c-cdf09da4d9a3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fds%2016-17%20end.pdf?alt=media&token=00ffea04-9566-47fe-85b1-f1e3125947ea");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fds%2018-19%20end.pdf?alt=media&token=008875cc-6ccb-4f43-ba0e-ebb244704f78");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fflt%2018-19%20enf.pdf?alt=media&token=6ca92d24-8825-4a06-85a8-e256a0d67c45");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Flogicap%20thought%2016-17%20end.pdf?alt=media&token=8ebd2fe8-8dec-4b34-aa7c-ff2c101d2e4b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Foop%2018-19%20end.pdf?alt=media&token=b7dcde3f-119a-4cb8-9b5f-dfa802bb400b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Ftechnical%20writing%2016-17%20end.pdf?alt=media&token=dbe36db5-3f74-4212-9824-6d434f9097ba");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/it%2Fm3%2Fit%20management%2016-17%20mid.pdf?alt=media&token=c44b509e-222c-455d-afbe-eefbb953b4ac");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/it%2Fm3%2Fit%20management%2017-18%20mid.pdf?alt=media&token=6344862d-40dd-4c98-b210-e4c6d1d8b5fe");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/it%2Fm3%2Fit%20management%2018-19%20mid.pdf?alt=media&token=c0367e94-6a6c-4553-ba81-6e4658ff94fd");

                break;
            }
            case "MID SEM-4":{
                buttonText.add("Automata Theory 16-17");
                buttonText.add("Analysis of Algorithm 16-17");
                buttonText.add("Automata Theory 17-18");
                buttonText.add("Communication 16-17");
                buttonText.add("Communication 17-18");
                buttonText.add("Graph Theory 16-17");

                targetFile.add(new File(folder,"Automata theory 16-17 mid.pdf"));
                targetFile.add(new File(folder,"analysis algorithm 16-17 mid.pdf"));
                targetFile.add(new File(folder,"automata 17-18 mid.pdf"));
                targetFile.add(new File(folder,"communication foundation 16-17 mid.pdf"));
                targetFile.add(new File(folder,"communication foundation 17-18 mid.pdf"));
                targetFile.add(new File(folder,"graph theory 16-17 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2FAutomata%20theory%2016-17%20mid.pdf?alt=media&token=13738b05-371b-4bfb-bd4a-b220df3f0be7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2Fanalysis%20algorithm%2016-17%20mid.pdf?alt=media&token=31a51dd0-c5ae-4715-9c9f-788726b66b60");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2Fautomata%2017-18%20mid.pdf?alt=media&token=c28e16e6-9242-4bef-bdda-889f72041b9e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2Fcommunication%20foundation%2016-17%20mid.pdf?alt=media&token=0203f51e-ef7d-4f79-8272-52d4ac81bf5d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2Fcommunication%20foundation%2017-18%20mid.pdf?alt=media&token=4ce3c827-e523-4f0c-aff5-e3a4e35a32fd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm4%2Fgraph%20theory%2016-17%20mid.pdf?alt=media&token=937d7556-cab9-4015-8bb3-689d95929dbe");


                break;
            }
            case "MID SEM-5":{
                buttonText.add("Operating System 17-18");
                buttonText.add("Networking");
                buttonText.add("Operating System 16-17");

                targetFile.add(new File(folder,"OS 17-18 mid.pdf"));
                targetFile.add(new File(folder,"networking mid.pdf"));
                targetFile.add(new File(folder,"os mid 16-17.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm5%2FOS%2017-18%20mid.pdf?alt=media&token=e725de85-4656-4255-b4e2-c253cd3527f9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm5%2Fnetworking%20mid.pdf?alt=media&token=8ae2c8e9-6c33-4f1d-8700-b7547fc38bf7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fm5%2Fos%20mid%2016-17.pdf?alt=media&token=ce9cd44c-f04f-43c9-930b-9fcb225c7a15");


                break;
            }
            case "MID SEM-6":{

                break;
            }
            case "MID SEM-7": {
                buttonText.add("Remote Sensing 17-18");
                buttonText.add("Remote Sensing 18-19");

                targetFile.add(new File(folder, "remote 17-18 mid.pdf"));
                targetFile.add(new File(folder, "remote 18-19 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm7%2Fremote%2017-18%20mid.pdf?alt=media&token=041ef38a-f8bb-4c54-acb3-49c21d4598d4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm7%2Fremote%2018-19%20mid.pdf?alt=media&token=ce24b402-57c5-4d9a-bcb9-a670b46619de");

                break;
            }
                case "MID SEM-8":{
                    buttonText.add("LIDAR 17-18");
                    buttonText.add("LIDAR 18-19");

                    targetFile.add(new File(folder,"lidar 17-18 mid.pdf"));
                    targetFile.add(new File(folder,"lidar 18-19 mid.pdf"));

                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2017-18%20mid.pdf?alt=media&token=49adbf28-c908-4540-86a7-126534a4deac");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2018-19%20mid.pdf?alt=media&token=0320f3ca-b536-4fb5-943f-635317d36ef0");

                break;
            }
            case "END SEM-3":{
                buttonText.add("Analog and Digital Electronics 15-16");
                buttonText.add("Analog and Digital Electronics 16-17");
                buttonText.add("Analog and Digital Electronics 18-19");
                buttonText.add("DS 16-17");
                buttonText.add("DS 18-19");
                buttonText.add("Logical Thoughts 18-19");
                buttonText.add("Logical Thoughts 16-17");
                buttonText.add("OOP 18-19");
                buttonText.add("Technical Writing 16-17");
                buttonText.add("IT Management 16-17 ");
                buttonText.add("IT Management 17-18");

                targetFile.add(new File(folder,"ade 15-16 end.pdf"));
                targetFile.add(new File(folder,"ade 16-17 end.pdf"));
                targetFile.add(new File(folder,"ade 18-19 end.pdf"));
                targetFile.add(new File(folder,"ds 16-17 end.pdf"));
                targetFile.add(new File(folder,"ds 18-19 end.pdf"));
                targetFile.add(new File(folder,"flt 18-19 enf.pdf"));
                targetFile.add(new File(folder,"logical thought 16-17 end.pdf"));
                targetFile.add(new File(folder,"oop 18-19 end.pdf"));
                targetFile.add(new File(folder,"technical writing 16-17 end.pdf"));
                targetFile.add(new File(folder,"it management 16-17 end.pdf"));
                targetFile.add(new File(folder,"it management 17-18 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2015-16%20end.pdf?alt=media&token=045b7679-02ff-4943-9caf-79cfb99a562b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2016-17%20end.pdf?alt=media&token=e3cc53a5-631d-4224-8cd1-94b4c1da5c88");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fade%2018-19%20end.pdf?alt=media&token=e1e864e8-d68f-4356-9e1c-cdf09da4d9a3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fds%2016-17%20end.pdf?alt=media&token=00ffea04-9566-47fe-85b1-f1e3125947ea");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fds%2018-19%20end.pdf?alt=media&token=008875cc-6ccb-4f43-ba0e-ebb244704f78");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Fflt%2018-19%20enf.pdf?alt=media&token=6ca92d24-8825-4a06-85a8-e256a0d67c45");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Flogicap%20thought%2016-17%20end.pdf?alt=media&token=8ebd2fe8-8dec-4b34-aa7c-ff2c101d2e4b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Foop%2018-19%20end.pdf?alt=media&token=b7dcde3f-119a-4cb8-9b5f-dfa802bb400b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe3%2Ftechnical%20writing%2016-17%20end.pdf?alt=media&token=dbe36db5-3f74-4212-9824-6d434f9097ba");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/it%2Fe3%2Fit%20management%2016-17%20end.pdf?alt=media&token=ae452094-f241-40d9-8adf-aeef467d3ccf");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/it%2Fe3%2Fit%20management%2017-18%20end.pdf?alt=media&token=f514e23c-c889-400a-b10d-a2ca26d54338");


                break;
            }
            case "END SEM-4":{
                buttonText.add("Analysis of Algorithm 16-17");
                buttonText.add("Automata Theory 17-18");
                buttonText.add("Automata Theory 16-17");
                buttonText.add("Communication 16-17");
                buttonText.add("Communication 17-18");
                buttonText.add("Computer Organisation 17-18");
                buttonText.add("Contemporary issues 16-17");
                buttonText.add("Graph Theory 16-17");

                targetFile.add(new File(folder,"analysis algorithm 16-17 end.pdf"));
                targetFile.add(new File(folder,"automat theory 17-18 end.pdf"));
                targetFile.add(new File(folder,"automata theory 16-17 end.pdf"));
                targetFile.add(new File(folder,"communication foundation 16-17 end.pdf"));
                targetFile.add(new File(folder,"communication foundation 17-18 end.pdf"));
                targetFile.add(new File(folder,"computer organisation 16-17 end.pdf"));
                targetFile.add(new File(folder,"contemporary issue 16-17 end.pdf"));
                targetFile.add(new File(folder,"graph theory 16-17 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fanalysis%20algorithm%2016-17%20end.pdf?alt=media&token=41478c9f-7b67-461a-9c63-198b0e6f3e76");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fautomat%20theory%2017-18%20end.pdf?alt=media&token=788ec6ee-33ce-46e0-a968-1105e3c41bd0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fautomata%20theory%2016-17%20end.pdf?alt=media&token=a024608f-ceec-40de-8499-823f40d3c604");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fcommunication%20foundation%2016-17%20end.pdf?alt=media&token=5e23d3b3-5a89-4d59-9d6b-b3d24e131d49");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fcommunication%20foundation%2017-18%20end.pdf?alt=media&token=7fbf1f5f-a6b5-49ea-9b8a-56f1a5ee85cd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fcomputer%20organisation%2016-17%20end.pdf?alt=media&token=3f9125ca-252a-4829-b24a-af346a89e3f4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fcontemporary%20issue%2016-17%20end.pdf?alt=media&token=c306d1f2-10bf-4419-8a07-fec2e8ea6a3d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe4%2Fgraph%20theory%2016-17%20end.pdf?alt=media&token=a9d02974-9f67-42be-8ba5-7adfd42cc72d");


                break;
            }
            case "END SEM-5":{
                buttonText.add("Cryptography 17-18");
                buttonText.add("Networks 17-18");
                buttonText.add("Networks");
                buttonText.add("OOM 17-18");
                buttonText.add("OS 17-18");

                targetFile.add(new File(folder,"cryptography 17-18 enf.pdf"));
                targetFile.add(new File(folder,"network 17-18 end.pdf"));
                targetFile.add(new File(folder,"networking end.pdf"));
                targetFile.add(new File(folder,"oom 17-18 end.pdf"));
                targetFile.add(new File(folder,"os17-18 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe5%2Fcryptography%2017-18%20enf.pdf?alt=media&token=f8dcf082-baa9-42af-9ad2-668390335149");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe5%2Fnetwork%2017-18%20end.pdf?alt=media&token=61e4cc1b-8883-4d71-a43a-449fe0a6ec97");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe5%2Fnetworking%20end.pdf?alt=media&token=cb35e12e-be20-436b-8f82-392127fce558");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe5%2Foom%2017-18%20end.pdf?alt=media&token=9f853d05-6601-47aa-810e-30392f9e1a14");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/cse%2Fe5%2Fos17-18%20end.pdf?alt=media&token=06c39256-34fb-497a-bc1b-440908f257f5");


                break;
            }
            case "END SEM-6":{

                break;
            }
            case "END SEM-7": {
                buttonText.add("Remote Sensing 18-19");

                targetFile.add(new File(folder, "remote 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe7%2Fremote%2018-19%20end.pdf?alt=media&token=7796eb5f-2f2e-4efc-9378-36343077c7ac");


                break;
            }
                case "END SEM-8":
                    buttonText.add("LIDAR 17-18");
                    buttonText.add("LIDAR 18-19");

                    targetFile.add(new File(folder,"lidar 17-18 end.pdf"));
                    targetFile.add(new File(folder,"lidar 18-19 end.pdf"));

                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2017-18%20end.pdf?alt=media&token=af8146b1-6593-426a-9168-fa6ae2a161e4");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2018-19%20end.pdf?alt=media&token=30f7f208-0b34-472a-b456-3185460a11f8");

                break;
            }
        adapter=new PaperAdapter(context,buttonText,targetFile,downloadURL);
        return adapter;
    }
}