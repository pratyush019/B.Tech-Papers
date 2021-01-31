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

public class ELECTRICAL {
    private ELECTRICAL(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".ELECTRICAL"+"/"+sem;
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        switch (sem){
            case "MID SEM-3":{
                buttonText.add("BEE 16-17");
                buttonText.add("EMMI 16-17");
                buttonText.add("EMMI 18-19");
                buttonText.add("Network System 14-15");
                buttonText.add("Principal of Electronics 18-19");

                targetFile.add(new File(folder,"bee 16-17 mid.pdf"));
                targetFile.add(new File(folder,"electrical measurement 16-17 mid.pdf"));
                targetFile.add(new File(folder,"electrical measurements 18-19 mid.pdf"));
                targetFile.add(new File(folder,"network system 14-15 mid.pdf"));
                targetFile.add(new File(folder,"pe 18-19 mud.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm3%2Fbee%2016-17%20mid.pdf?alt=media&token=ba003512-c4de-4659-8540-84868a57d691");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm3%2Felectrical%20measurement%2016-17%20mid.pdf?alt=media&token=29411caa-aeb1-4f78-8741-9f4137ec9b5b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm3%2Felectrical%20measurements%2018-19%20mid.pdf?alt=media&token=80d09dda-14f8-494b-88fa-f5ba436d8481");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm3%2Fnetwork%20system%2014-15%20mid.pdf?alt=media&token=58a24a3a-9bcf-41b8-81ef-047fcfddc188");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm3%2Fpe%2018-19%20mud.pdf?alt=media&token=fb5b9c78-ab63-44c2-80a6-7034021ac212");

                break;
            }
            case "MID SEM-4":{
                buttonText.add("Digital Electronics 14-15");
                buttonText.add("Digital Electronics 15-16");
                buttonText.add("Digital Electronics 16-17");
                buttonText.add("Basic Control 14-15");
                buttonText.add("Basic Control 15-16");
                buttonText.add("Basic Control 16-17");
                buttonText.add("Electrical Machines 16-17");
                buttonText.add("EMT 16-17");

                targetFile.add(new File(folder,"digital e 14-15 mid.pdf"));
                targetFile.add(new File(folder,"digital e 15-16 mid.pdf"));
                targetFile.add(new File(folder,"digital e 16-17 mid.pdf"));
                targetFile.add(new File(folder,"basic control 14-15 mid.pdf"));
                targetFile.add(new File(folder,"basic control 15-16 mid.pdf"));
                targetFile.add(new File(folder,"basic control 16-17 mid.pdf"));
                targetFile.add(new File(folder,"electrical machines 16-17 mid.pdf"));
                targetFile.add(new File(folder,"emt 16-17 mid 4.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2014-15%20mid.pdf?alt=media&token=aae248d4-95aa-461a-97ff-b58db857400f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2015-16%20mid.pdf?alt=media&token=9bb521d8-b009-469e-807d-adf6a5f94a22");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2016-17%20mid.pdf?alt=media&token=bc94753a-3709-49d1-a58d-3d3c3d95389a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm4%2Fbasic%20control%2014-15%20mid.pdf?alt=media&token=b592e288-b275-4fb9-8a6a-fa28d373f265");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm4%2Fbasic%20control%2015-16%20mid.pdf?alt=media&token=28fa9ad9-a612-4d0e-8d64-0cacf4397c49");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm4%2Fbasic%20control%2016-17%20mid.pdf?alt=media&token=24247f9a-1e1d-4a24-82c2-d6ea4ab2e1b3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm4%2Felectrical%20machines%2016-17%20mid.pdf?alt=media&token=c0d8e411-b067-4920-b05e-05ea3679f7a3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm4%2Femt%2016-17%20mid%204.pdf?alt=media&token=706ce05c-fd1f-41a7-aae7-8f167e66c67a");

                break;
            }
            case "MID SEM-5":{
                buttonText.add("AC Machine 14-15");
                buttonText.add("AC Machine 15-16");
                buttonText.add("AC Machine 16-17");
                buttonText.add("AC Machine 17-18");
                buttonText.add("Control System 14-15");
                buttonText.add("Control System 15-16");
                buttonText.add("Control System 17-18");
                buttonText.add("Communication 15-16");
                buttonText.add("Communication 17-18");
                buttonText.add("POM 15-16");
                buttonText.add("POM 16-17");
                buttonText.add("POM 17-18");
                buttonText.add("Power System 14-15");
                buttonText.add("Power System 17-18");

                targetFile.add(new File(folder,"acm 14-15 mid.pdf"));
                targetFile.add(new File(folder,"acm 15-16 mid.pdf"));
                targetFile.add(new File(folder,"acm 16-17 mid.pdf"));
                targetFile.add(new File(folder,"acm 17-18 mid.pdf"));
                targetFile.add(new File(folder,"acs 14-15 mid.pdf"));
                targetFile.add(new File(folder,"acs 15-16 mid.pdf"));
                targetFile.add(new File(folder,"acs 17-18 mid.pdf"));
                targetFile.add(new File(folder,"communication 15-16 mid.pdf"));
                targetFile.add(new File(folder,"communication 17-18 mid.pdf"));
                targetFile.add(new File(folder,"pom 15-16 mid.pdf"));
                targetFile.add(new File(folder,"pom 16-17 mid.pdf"));
                targetFile.add(new File(folder,"pom 17-18 mid.pdf"));
                targetFile.add(new File(folder,"power system 2 14-15 mid.pdf"));
                targetFile.add(new File(folder,"power system 2 17-18 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facm%2014-15%20mid.pdf?alt=media&token=77c50f9e-2e68-4eec-a7af-1525d5e25970");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facm%2015-16%20mid.pdf?alt=media&token=f9e7cc22-0754-4008-8d50-234efe1c2d5e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facm%2016-17%20mid.pdf?alt=media&token=7c1f00fc-0a98-43c5-8017-c694fa7e8770");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facm%2017-18%20mid.pdf?alt=media&token=75f99c16-8fc0-4d1f-b691-f7195467bca0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facs%2014-15%20mid.pdf?alt=media&token=d54ac437-da68-499e-8ca8-71aea38cf14b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facs%2015-16%20mid.pdf?alt=media&token=e0869f93-aecd-4d20-b68c-0b772cdf1a90");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Facs%2017-18%20mid.pdf?alt=media&token=6dd9bf97-843f-4e4f-b0e3-ceb761d354c9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fcommunication%2015-16%20mid.pdf?alt=media&token=1fc1b8ac-b3e2-4872-b191-bdcf7584dd13");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fcommunication%2017-18%20mid.pdf?alt=media&token=d47e89c8-e213-4475-b7a6-644e89c67ae3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fpom%2015-16%20mid.pdf?alt=media&token=a03067a2-64a5-49ba-83e8-018574db6094");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fpom%2016-17%20mid.pdf?alt=media&token=4dc584c4-0e07-4b7d-a508-63e8041c0c92");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fpom%2017-18%20mid.pdf?alt=media&token=69c8115b-0e20-4290-b2f6-b2fbfe77f029");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fpower%20system%202%2014-15%20mid.pdf?alt=media&token=b951912d-020b-4c02-89e6-1cd553179fd2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm5%2Fpower%20system%202%2017-18%20mid.pdf?alt=media&token=2b6741b2-c8e3-452b-b2e3-84eb6b400e0d");

                break;
            }
            case "MID SEM-6":{
                buttonText.add("Instrumentation 17-18");
                buttonText.add("Microcontroller 16-17");
                buttonText.add("Microcontroller 17-18");
                buttonText.add("Microprocessor 14-15");
                buttonText.add("Electrical Machines 14-15");
                buttonText.add("Electrical Machines 17-18");
                buttonText.add("Electrical Machines 18-19");
                buttonText.add("Power Electronics 15-16");
                buttonText.add("Power Electronics 17-18");
                buttonText.add("Power Electronics 18-19");
                buttonText.add("PowerPlant 15-16");
                buttonText.add("PowerPlant 17-18");

                targetFile.add(new File(folder,"instrumentation 17-18 mid.pdf"));
                targetFile.add(new File(folder,"microcontroller 16-17 mid.pdf"));
                targetFile.add(new File(folder,"microcontroller 17-18 mid.pdf"));
                targetFile.add(new File(folder,"microprocessors 14-15 mid.pdf"));
                targetFile.add(new File(folder,"mid electrical machines 14-15 mid.pdf"));
                targetFile.add(new File(folder,"mod electrical machines 17-18 mid.pdf"));
                targetFile.add(new File(folder,"mod electrical machines mid.pdf"));
                targetFile.add(new File(folder,"power electronics 15-16 mid.pdf"));
                targetFile.add(new File(folder,"power electronics 17-18 mid.pdf"));
                targetFile.add(new File(folder,"power electronics 18-19 mid.pdf"));
                targetFile.add(new File(folder,"power plant 15-16 mid.pdf"));
                targetFile.add(new File(folder,"power plant 17-18 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Finstrumentation%2017-18%20mid.pdf?alt=media&token=66c0be89-cfab-4c7d-9228-ecae9a93aa65");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmicrocontroller%2016-17%20mid.pdf?alt=media&token=830c5cf3-e895-4bd4-afce-363ac651f045");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmicrocontroller%2017-18%20mid.pdf?alt=media&token=db6ef50a-8adc-439c-839f-6c92076b7904");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmicroprocessors%2014-15%20mid.pdf?alt=media&token=7b1cca1b-e65b-4b51-b025-30fbf77734cc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmid%20electrical%20machines%2014-15%20mid.pdf?alt=media&token=3df6822a-064c-45a6-9847-d12ee5320528");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmod%20electrical%20machines%2017-18%20mid.pdf?alt=media&token=04c9782c-e6a5-4575-99b7-852a2992dbf2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fmod%20electrical%20machines%20mid.pdf?alt=media&token=07d57fd4-0a0d-4f08-b9d4-f9321029a34e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fpower%20electronics%2015-16%20mid.pdf?alt=media&token=45de8fde-d214-40f9-95be-6c4260ac324d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fpower%20electronics%2017-18%20mid.pdf?alt=media&token=a693611a-5894-4b95-a921-024ae962edf7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fpower%20electronics%2018-19%20mid.pdf?alt=media&token=7b1333bc-74a2-4712-b487-b8d35888e795");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fpower%20plant%2015-16%20mid.pdf?alt=media&token=b682dfbf-768e-4511-84c8-e3a69d63709f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm6%2Fpower%20plant%2017-18%20mid.pdf?alt=media&token=ea4f156e-fa9a-41b5-a8d5-ae7db0c1402d");

                break;
            }
            case "MID SEM-7":{
                buttonText.add("Remote Sensing 17-18");
                buttonText.add("Remote Sensing 18-19");
                buttonText.add("Electrical Drives 16-17");
                buttonText.add("Electrical Drives 17-18");
                buttonText.add("Electrical Drives 18-19");
                buttonText.add("Network Synthesis");
                buttonText.add("Renewable Energy 17-18");
                buttonText.add("Renewable Energy 18-19");

                targetFile.add(new File(folder,"remote 17-18 mid.pdf"));
                targetFile.add(new File(folder,"remote 18-19 mid.pdf"));
                targetFile.add(new File(folder,"electrical drives 16-17 mid 7.pdf"));
                targetFile.add(new File(folder,"electrical drives 17-18 mid.pdf"));
                targetFile.add(new File(folder,"electrical drives mid.pdf"));
                targetFile.add(new File(folder,"network synthesis mid.pdf"));
                targetFile.add(new File(folder,"renewable energy 17-18 mid.pdf"));
                targetFile.add(new File(folder,"renewable energy 18-19 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm7%2Fremote%2017-18%20mid.pdf?alt=media&token=041ef38a-f8bb-4c54-acb3-49c21d4598d4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm7%2Fremote%2018-19%20mid.pdf?alt=media&token=ce24b402-57c5-4d9a-bcb9-a670b46619de");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Felectrical%20drives%2016-17%20mid%207.pdf?alt=media&token=e07e8871-f5e6-460c-99f3-012d069e16be");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Felectrical%20drives%2017-18%20mid.pdf?alt=media&token=71ea3451-22bf-4acb-9e9a-5b3d96d2a518");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Felectrical%20drives%20mid.pdf?alt=media&token=9a4a9864-56d3-4fac-b534-7089919f4380");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Fnetwork%20synthesis%20mid.pdf?alt=media&token=90655a2e-966a-493d-b63c-895c037a4efe");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Frenewable%20energy%2017-18%20mid.pdf?alt=media&token=709d2e63-e49f-4bf5-a8f9-21cb13382914");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm7%2Frenewable%20energy%2018-19%20mid.pdf?alt=media&token=7f9a4017-2b39-4ab7-a40f-9fecbc8fdc67");


                break;
            }
            case "MID SEM-8":{
                buttonText.add("LIDAR 17-18");
                buttonText.add("LIDAR 18-19");
                buttonText.add("Advance Power Electronics 18-19");
                buttonText.add("Power System 18-19");
                buttonText.add("Process Control 18-19");


                targetFile.add(new File(folder,"lidar 17-18 mid.pdf"));
                targetFile.add(new File(folder,"lidar 18-19 mid.pdf"));
                targetFile.add(new File(folder,"advance power 18-19 mid 8.pdf"));
                targetFile.add(new File(folder,"power sys operation 18-19 mid.pdf"));
                targetFile.add(new File(folder,"process control 18-19 mid.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2017-18%20mid.pdf?alt=media&token=49adbf28-c908-4540-86a7-126534a4deac");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2018-19%20mid.pdf?alt=media&token=0320f3ca-b536-4fb5-943f-635317d36ef0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm8%2Fadvance%20power%2018-19%20mid%208.pdf?alt=media&token=be86488a-e290-4048-85c3-dac86707b798");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm8%2Fpower%20sys%20operation%2018-19%20mid.pdf?alt=media&token=d62a9c76-29ba-4884-96c5-641eff3dc13c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fm8%2Fprocess%20control%2018-19%20mid.pdf?alt=media&token=055099b6-4080-4c93-8788-0fe8a853fe87");



                break;
            }
            case "END SEM-3":{
                buttonText.add("BEE 16-17");
                buttonText.add("EMMI 16-17");
                buttonText.add("EMMI");
                buttonText.add("Network System 14-15");
                buttonText.add("Network System 15-16");
                buttonText.add("Network System");
                buttonText.add("Principal of Electronics 14-15");
                buttonText.add("Principal of Electronics 15-16");
                buttonText.add("Principal of Electronics 16-17");
                buttonText.add("Electronic Eng. 16-17");

                targetFile.add(new File(folder,"bee 16-17 end.pdf"));
                targetFile.add(new File(folder,"electrical measurements 16-17 end.pdf"));
                targetFile.add(new File(folder,"electrical measurements end.pdf"));
                targetFile.add(new File(folder,"network system 14-15 end.pdf"));
                targetFile.add(new File(folder,"network system 15-16 end.pdf"));
                targetFile.add(new File(folder,"network system end.pdf"));
                targetFile.add(new File(folder,"pe 14-15 end.pdf"));
                targetFile.add(new File(folder,"pe 15-16 end.pdf"));
                targetFile.add(new File(folder,"pe 16-17 end.pdf"));
                targetFile.add(new File(folder,"pee 16-17 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fbee%2016-17%20end.pdf?alt=media&token=ca0b6f69-7b40-4279-983b-f455ca81ae4b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Felectrical%20measurements%2016-17%20end.pdf?alt=media&token=1b389f31-41a6-4afd-abfe-9a765f8953d7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Felectrical%20measurements%20end.pdf?alt=media&token=6d416055-bcbb-4d4c-bd7c-43a085f66875");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fnetwork%20system%2014-15%20end.pdf?alt=media&token=b515161a-2cbd-4d6e-a205-4247f700a060");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fnetwork%20system%2015-16%20end.pdf?alt=media&token=2e7577f5-bfc6-4aac-99e0-e572a33955fe");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fnetwork%20system%20end.pdf?alt=media&token=0c12236f-2862-4499-a239-66aee8966877");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fpe%2014-15%20end.pdf?alt=media&token=c3a11163-e3b5-4c71-b06d-03630da2c79c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fpe%2015-16%20end.pdf?alt=media&token=d38bee49-8e6e-4803-94c8-b52564182ebc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fpe%2016-17%20end.pdf?alt=media&token=6b52c9f8-eaed-4f1e-b732-e2c4bf228de8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe3%2Fpee%2016-17%20end.pdf?alt=media&token=0803f92c-3016-4d97-8352-bac00fba3b73");

                break;
            }
            case "END SEM-4":{
                buttonText.add("Digital Electronics 14-15");
                buttonText.add("Digital Electronics 15-16");
                buttonText.add("Digital Electronics 16-17");
                buttonText.add("Basic Control 14-15");
                buttonText.add("Basic Control 15-16");
                buttonText.add("Basic Control 16-17");
                buttonText.add("Electrical Machines 15-16");
                buttonText.add("Electrical Machines 16-17");
                buttonText.add("EMT 16-17");
                buttonText.add("Power System 16-17");

                targetFile.add(new File(folder,"digital e 14-15 end.pdf"));
                targetFile.add(new File(folder,"digital e 15-16 end.pdf"));
                targetFile.add(new File(folder,"digital e 16-17 end.pdf"));
                targetFile.add(new File(folder,"basic control 14-15 end.pdf"));
                targetFile.add(new File(folder,"basic control 15-16 end.pdf"));
                targetFile.add(new File(folder,"basic control end.pdf"));
                targetFile.add(new File(folder,"electrical machine 15-16 end 4.pdf"));
                targetFile.add(new File(folder,"electrical machines 16-17 end.pdf"));
                targetFile.add(new File(folder,"emt 16-17 end.pdf"));
                targetFile.add(new File(folder,"power system-1 16-17 end 4.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2014-15%20end.pdf?alt=media&token=86055d20-8daa-4370-ae1d-65ae6e091f45");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2015-16%20end.pdf?alt=media&token=97cf0aa8-cff9-4e15-9b60-11f69b9047d3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2016-17%20end.pdf?alt=media&token=f6e817a4-1715-4ae1-b688-fcc9b332f025");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Fbasic%20control%2014-15%20end.pdf?alt=media&token=73cb7295-0a10-4d9b-afde-ae1c62670b5e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Fbasic%20control%2015-16%20end.pdf?alt=media&token=47c3b0e9-9a2c-4ff6-bb3e-f21b6497fa02");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Fbasic%20control%20end.pdf?alt=media&token=b5e76172-4c01-4ecf-b9af-c9ea1940c79e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Felectrical%20machine%2015-16%20end%204.pdf?alt=media&token=a502fc79-34cf-4f5a-a28c-5c4f7d40e201");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Felectrical%20machines%2016-17%20end.pdf?alt=media&token=647bb86c-2421-43b5-9a43-b7a76540afb7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Femt%2016-17%20end.pdf?alt=media&token=c904110c-ffdc-4e5a-8d5d-b2585b877e52");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe4%2Fpower%20system-1%2016-17%20end%204.pdf?alt=media&token=d245e99d-2314-49a5-a0ae-d0a18d636612");


                break;
            }
            case "END SEM-5":{
                buttonText.add("AC Machines 14-15");
                buttonText.add("AC Machines 16-17");
                buttonText.add("AC Machines 17-18");
                buttonText.add("Control System 14-15");
                buttonText.add("Control System 15-16");
                buttonText.add("Control System 17-18");
                buttonText.add("Communication 14-15");
                buttonText.add("Communication 17-18");
                buttonText.add("POM 15-16");
                buttonText.add("POM 17-18");
                buttonText.add("POM");
                buttonText.add("Power System 14-15");
                buttonText.add("Power System 17-18");
                buttonText.add("Power System");

                targetFile.add(new File(folder,"acm 14-15 end.pdf"));
                targetFile.add(new File(folder,"acm 16-17 end.pdf"));
                targetFile.add(new File(folder,"acm 17-18 end.pdf"));
                targetFile.add(new File(folder,"acs 14-15 end.pdf"));
                targetFile.add(new File(folder,"acs 15-16 end.pdf"));
                targetFile.add(new File(folder,"acs 17-18 end.pdf"));
                targetFile.add(new File(folder,"communication 14-15 end.pdf"));
                targetFile.add(new File(folder,"communication 17-18 end.pdf"));
                targetFile.add(new File(folder,"pom 15-16 end.pdf"));
                targetFile.add(new File(folder,"pom 17-18 end.pdf"));
                targetFile.add(new File(folder,"pom end.pdf"));
                targetFile.add(new File(folder,"power system 2 14-15 end.pdf"));
                targetFile.add(new File(folder,"power system 2 17-18 end.pdf"));
                targetFile.add(new File(folder,"power system 2 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facm%2014-15%20end.pdf?alt=media&token=91bf3e1e-e32a-4fe6-a2a1-224de2d87d19");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facm%2016-17%20end.pdf?alt=media&token=f8d5918b-7723-40e1-85ce-af1297b6cf35");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facm%2017-18%20end.pdf?alt=media&token=e5bb6d07-0795-488e-8e21-916f73892074");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facs%2014-15%20end.pdf?alt=media&token=71726075-7d32-430c-a8c8-20ad2f618aa6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facs%2015-16%20end.pdf?alt=media&token=3ee6949a-fb17-46d3-976d-22f1a0aac2f8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Facs%2017-18%20end.pdf?alt=media&token=7006e39e-f0ef-4aa1-beb8-063123be88fc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fcommunication%2014-15%20end.pdf?alt=media&token=f291a5ec-d693-425a-bd37-d1b1090cba45");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fcommunication%2017-18%20end.pdf?alt=media&token=84d6132d-8a3e-4bfa-971c-bfefe827ca5d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpom%2015-16%20end.pdf?alt=media&token=bbcd8e9f-dec0-403e-ad59-3f869862e2e2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpom%2017-18%20end.pdf?alt=media&token=05f81d0b-0db7-4344-8128-4e9244d072dd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpom%20end.pdf?alt=media&token=f5460511-439f-4c20-ab23-09de58c57e8a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpower%20system%202%2014-15%20end.pdf?alt=media&token=260d6577-0e96-4411-94a1-64fd387dffd0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpower%20system%202%2017-18%20end.pdf?alt=media&token=bdb870fe-6b41-4657-9a10-a5d3aa63a76c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe5%2Fpower%20system%202%20end.pdf?alt=media&token=9a02ca03-6e87-4e5c-b1ec-78f04e05b97a");


                break;
            }
            case "END SEM-6":{
                buttonText.add("Instrumentation 17-18");
                buttonText.add("Microcontroller 14-15");
                buttonText.add("Microcontroller 15-16");
                buttonText.add("Microcontroller 17-18");
                buttonText.add("Electrical Machines 18-19");
                buttonText.add("Power Electronics 16-17");
                buttonText.add("Power Electronics 15-16");
                buttonText.add("Power Electronics 14-15");
                buttonText.add("Power Electronics 17-18");
                buttonText.add("Powerplant 14-15");
                buttonText.add("Powerplant 16-17");
                buttonText.add("Powerplant 17-18");

                targetFile.add(new File(folder,"instrumentation 17-18 end 6.pdf"));
                targetFile.add(new File(folder,"microcontroller 14-15 end.pdf"));
                targetFile.add(new File(folder,"microcontroller 15-16 end.pdf"));
                targetFile.add(new File(folder,"microcontroller 17-18 end 6.pdf"));
                targetFile.add(new File(folder,"mod electrical machines 18-19.pdf"));
                targetFile.add(new File(folder,"powe electronics 16-17 end 6 .pdf"));
                targetFile.add(new File(folder,"powee electronics 15-16 end.pdf"));
                targetFile.add(new File(folder,"power electronics 15-16 end.pdf"));
                targetFile.add(new File(folder,"power electronics 17-18 end.pdf"));
                targetFile.add(new File(folder,"power plant 14-15 end.pdf"));
                targetFile.add(new File(folder,"power plant 16-17 end 6.pdf"));
                targetFile.add(new File(folder,"power plant 17-18 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Finstrumentation%2017-18%20end%206.pdf?alt=media&token=af1096cf-8fb1-40f6-a408-81550ca8eeb3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fmicrocontroller%2014-15%20end.pdf?alt=media&token=83ecb2ba-012b-4c99-8386-c22ebccb6bf2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fmicrocontroller%2015-16%20end.pdf?alt=media&token=c0c3811a-5c7c-47dd-8f4b-2f7127219ad1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fmicrocontroller%2017-18%20end%206.pdf?alt=media&token=b8711999-f1d5-4780-976c-1467c77f82bd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fmod%20electrical%20machines%2018-19.pdf?alt=media&token=1e68d57d-21a9-46c4-a92d-a00e016127a0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpowe%20electronics%2016-17%20end%206%20.pdf?alt=media&token=14023931-5d91-41ce-86f0-614f82088eea");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpowee%20electronics%2015-16%20end.pdf?alt=media&token=d13de133-2b6f-46ac-9a58-052cb23882c9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpower%20electronics%2015-16%20end.pdf?alt=media&token=bedfe7e2-7d8c-44bd-b5de-8ad9c7e00f65");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpower%20electronics%2017-18%20end.pdf?alt=media&token=ecfd0851-d65a-4667-9c41-1277842a5d0f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpower%20plant%2014-15%20end.pdf?alt=media&token=8696560d-ac5a-4c19-b524-840f55191023");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpower%20plant%2016-17%20end%206.pdf?alt=media&token=39cc39e6-0fd5-41de-932d-5d716faee1a2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe6%2Fpower%20plant%2017-18%20end.pdf?alt=media&token=c3815b45-32a5-4e0f-bdf1-13c3ca215be3");


                break;
            }
            case "END SEM-7":{
                buttonText.add("Remote Sensing 18-19");
                buttonText.add("Electrical Drives 17-18");
                buttonText.add("Network Synthesis");
                buttonText.add("Renewable Energy 17-18");
                buttonText.add("Renewable Energy 1");

                targetFile.add(new File(folder,"remote 18-19 end.pdf"));
                targetFile.add(new File(folder,"electrical drives 17-18 end.pdf"));
                targetFile.add(new File(folder,"network synthesis end.pdf"));
                targetFile.add(new File(folder,"renewable energy 17-18 end.pdf"));
                targetFile.add(new File(folder,"renewable energy 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe7%2Fremote%2018-19%20end.pdf?alt=media&token=7796eb5f-2f2e-4efc-9378-36343077c7ac");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe7%2Felectrical%20drives%2017-18%20end.pdf?alt=media&token=7598eea8-a693-4bb6-b6f2-0f76c7e97f31");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe7%2Fnetwork%20synthesis%20end.pdf?alt=media&token=f2c8610c-5bc7-4584-a173-042a86f86556");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe7%2Frenewable%20energy%2017-18%20end.pdf?alt=media&token=b4add556-f8f4-4812-aec4-2f2090e450a6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe7%2Frenewable%20energy%2018-19%20end.pdf?alt=media&token=0a0f5059-8859-487e-9f32-1823b4506469");


                break;
            }
            case "END SEM-8":{
                buttonText.add("LIDAR 17-18");
                buttonText.add("LIDAR 18-19");
                buttonText.add("Advance Power Electronics 18-19");
                buttonText.add("Power System 18-19");
                buttonText.add("Process Control 18-19");

                targetFile.add(new File(folder,"lidar 17-18 end.pdf"));
                targetFile.add(new File(folder,"lidar 18-19 end.pdf"));
                targetFile.add(new File(folder,"advance power 18-19 end.pdf"));
                targetFile.add(new File(folder,"power sys op 18-19 end 8.pdf"));
                targetFile.add(new File(folder,"process control 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2017-18%20end.pdf?alt=media&token=af8146b1-6593-426a-9168-fa6ae2a161e4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2018-19%20end.pdf?alt=media&token=30f7f208-0b34-472a-b456-3185460a11f8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe8%2Fadvance%20power%2018-19%20end.pdf?alt=media&token=72fd109e-8d24-4d69-96f7-4d5f53724e16");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe8%2Fpower%20sys%20op%2018-19%20end%208.pdf?alt=media&token=963058f9-2ab5-44a7-a3b4-232acb8bd25a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ee%2Fe8%2Fprocess%20control%2018-19%20end.pdf?alt=media&token=d76a5ca0-193f-4807-ba70-d553642f2b65");

                break;
            }
            default:{
                break;
            }
        }
        adapter=new PaperAdapter(context,buttonText,targetFile,downloadURL);
        return adapter;
    }
}