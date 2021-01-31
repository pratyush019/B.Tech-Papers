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
 *  Last modified 31/1/21 7:35 PM
 *
 *
 */

package com.tlabs.btechpapers.AdapterPicker;

import android.content.Context;

import com.tlabs.btechpapers.Adapters.PaperAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class ECE {
    private ECE(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".ECE"+"/"+sem;
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        switch (sem){
            case "MID SEM-3":{
                buttonText.add("NMST 17-18");
                buttonText.add("Maths 16-17");
                buttonText.add("Maths 17-18");
                buttonText.add("Signal and System 16-17");
                buttonText.add("Signal and System 17-18");


                targetFile.add(new File(folder,"Nmst mid 17-18.pdf"));
                targetFile.add(new File(folder,"maths 16-17 mid.pdf"));
                targetFile.add(new File(folder,"maths 17-18 mid.pdf"));
                targetFile.add(new File(folder,"signal system 16-17 mid.pdf"));
                targetFile.add(new File(folder,"signal system 17-18 mid.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm3%2FNmst%20mid%2017-18.pdf?alt=media&token=f5a020a9-2041-4be2-bfa3-814488533613");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm3%2Fmaths%2016-17%20mid.pdf?alt=media&token=ecac50bd-77ff-4ab7-827b-2bff5f56a7f9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm3%2Fmaths%2017-18%20mid.pdf?alt=media&token=3214c5b9-fa83-4949-8c69-0397a46ee229");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm3%2Fsignal%20system%2016-17%20mid.pdf?alt=media&token=40a00013-18be-418d-ada3-289463416d57");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm3%2Fsignal%20system%2017-18%20mid.pdf?alt=media&token=54735a6c-a658-4120-b1e6-f1e1607d9b07");

                break;
            }
            case "MID SEM-4":{
                buttonText.add("Digital Electronics 14-15");
                buttonText.add("Digital Electronics 15-16");
                buttonText.add("Digital Electronics 16-17");

                targetFile.add(new File(folder,"digital e 14-15 mid.pdf"));
                targetFile.add(new File(folder,"digital e 15-16 mid.pdf"));
                targetFile.add(new File(folder,"digital e 16-17 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2014-15%20mid.pdf?alt=media&token=aae248d4-95aa-461a-97ff-b58db857400f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2015-16%20mid.pdf?alt=media&token=9bb521d8-b009-469e-807d-adf6a5f94a22");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm4%2Fdigital%20e%2016-17%20mid.pdf?alt=media&token=bc94753a-3709-49d1-a58d-3d3c3d95389a");

                break;
            }
            case "MID SEM-5":{
                buttonText.add("VLSI 15-16");
                buttonText.add("Automatic Control 15-16");
                buttonText.add("Automatic Control 16-17");
                buttonText.add("Antenna 15-16");
                buttonText.add("Digital Communication 15-16");
                buttonText.add("Digital Communication 16-17");
                buttonText.add("Circuit Design 16-17");
                buttonText.add("Microprocessor 16-17");
                buttonText.add("Electrical eng. and Measurement 16-17");
                buttonText.add("Electrical eng. and Measurement 17-18");
                buttonText.add("Electronic Eng. 16-17");
                buttonText.add("Electronic Eng. 17-18");
                buttonText.add("VLSI 15-16");

                targetFile.add(new File(folder,"VLSI 15-16 mid.pdf"));
                targetFile.add(new File(folder,"ac 15-16 mid.pdf"));
                targetFile.add(new File(folder,"ac 16-17 mid.pdf"));
                targetFile.add(new File(folder,"anteena 15-16 mid.pdf"));
                targetFile.add(new File(folder,"dc 15-16 mid.pdf"));
                targetFile.add(new File(folder,"dc 16-17 mid.pdf"));
                targetFile.add(new File(folder,"ecd 16-17 mid.pdf"));
                targetFile.add(new File(folder,"microprocessor 16-17 mid.pdf"));
                targetFile.add(new File(folder,"principal of electrical 16-17 mid.pdf"));
                targetFile.add(new File(folder,"principal of electrical 17-18 mid.pdf"));
                targetFile.add(new File(folder,"principal of electronic 16-17 mid.pdf"));
                targetFile.add(new File(folder,"principal of electronic s 17-18 mid.pdf"));
                targetFile.add(new File(folder,"vlsi mid 15-16.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2FVLSI%2015-16%20mid.pdf?alt=media&token=3a5da869-d71e-4fa5-8e5f-09ce0fa10f89");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fac%2015-16%20mid.pdf?alt=media&token=c1a0f5fc-a1b9-4f0d-93dc-97504cd32e40");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fac%2016-17%20mid.pdf?alt=media&token=2973aaee-e6a7-46a9-b352-06bdf1cd41c8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fanteena%2015-16%20mid.pdf?alt=media&token=d2b68c2e-0290-4f82-93a8-9192639cd0df");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fdc%2015-16%20mid.pdf?alt=media&token=44309f93-644d-4181-aed2-830e889335ae");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fdc%2016-17%20mid.pdf?alt=media&token=1d1265ff-325a-4ee6-af3d-8901fa3bffe9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fecd%2016-17%20mid.pdf?alt=media&token=2931d8bb-3bf1-44d6-884f-6dd3d0634b5a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fmicroprocessor%2016-17%20mid.pdf?alt=media&token=370e96cf-92b3-4fc3-8aee-ea2e06957564");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fprincipal%20of%20electrical%2016-17%20mid.pdf?alt=media&token=d1202a65-ebcb-4e63-986c-3c9e9888802a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fprincipal%20of%20electrical%2017-18%20mid.pdf?alt=media&token=cbba0d09-5a16-4ef3-9a35-2a59be0ae8ae");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fprincipal%20of%20electronic%2016-17%20mid.pdf?alt=media&token=02119de4-7596-47b2-991b-a798c781731b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fprincipal%20of%20electronic%20s%2017-18%20mid.pdf?alt=media&token=3a394bbf-a20b-4af2-b5fb-3ca24d05daf1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fm5%2Fvlsi%20mid%2015-16.pdf?alt=media&token=ec9fced9-b80b-4809-9711-4c2217c204ba");

                break;
            }
            case "MID SEM-6":{

                break;
            }
            case "MID SEM-7":{
                buttonText.add("Remote Sensing 17-18");
                buttonText.add("Remote Sensing 18-19");

                targetFile.add(new File(folder,"remote 17-18 mid.pdf"));
                targetFile.add(new File(folder,"remote 18-19 mid.pdf"));

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
                buttonText.add("Maths 16-17");
                buttonText.add("Maths 17-18");
                buttonText.add("NMST 18-19");

                targetFile.add(new File(folder,"maths 16-17 end.pdf"));
                targetFile.add(new File(folder,"maths 17-18 end.pdf"));
                targetFile.add(new File(folder,"nmst 18-19 end ece+.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe3%2Fmaths%2016-17%20end.pdf?alt=media&token=e401c77f-6fa9-4902-bb2b-8fea7fbc53da");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe3%2Fmaths%2017-18%20end.pdf?alt=media&token=2247739c-691e-49c9-9b2e-13d165bbce26");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe3%2Fnmst%2018-19%20end%20ece%2B.pdf?alt=media&token=25c651f8-38d1-4155-8292-46230fbb6ddb");

                break;
            }
            case "END SEM-4":{
                buttonText.add("Digital Electronics 14-15");
                buttonText.add("Digital Electronics 15-16");
                buttonText.add("Digital Electronics 16-17");

                targetFile.add(new File(folder,"digital e 14-15 end.pdf"));
                targetFile.add(new File(folder,"digital e 15-16 end.pdf"));
                targetFile.add(new File(folder,"digital e 16-17 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2014-15%20end.pdf?alt=media&token=86055d20-8daa-4370-ae1d-65ae6e091f45");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2015-16%20end.pdf?alt=media&token=97cf0aa8-cff9-4e15-9b60-11f69b9047d3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe4%2Fdigital%20e%2016-17%20end.pdf?alt=media&token=f6e817a4-1715-4ae1-b688-fcc9b332f025");

                break;
            }
            case "END SEM-5":{
                buttonText.add("Automatic Control 15-16");
                buttonText.add("Automatic Control 16-17");
                buttonText.add("Antenna 16-17");
                buttonText.add("Circuit Design 16-17");
                buttonText.add("Microprocessor 16-17");
                buttonText.add("VLSI 15-16");

                targetFile.add(new File(folder,"ac 15-16 end.pdf"));
                targetFile.add(new File(folder,"ac 16-17 end.pdf"));
                targetFile.add(new File(folder,"anteena 16-17 end.pdf"));
                targetFile.add(new File(folder,"ecd 16-17 end.pdf"));
                targetFile.add(new File(folder,"microprocessor 16-17 end.pdf"));
                targetFile.add(new File(folder,"vlsi 15-16 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fac%2015-16%20end.pdf?alt=media&token=17a3877d-a6d6-4d75-bbbf-5af691ee4ac2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fac%2016-17%20end.pdf?alt=media&token=238a5d49-383b-4422-9ac8-0ff96a73b79d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fanteena%2016-17%20end.pdf?alt=media&token=3cd3b394-79c7-4b9b-b6d4-fc5810c1692e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fecd%2016-17%20end.pdf?alt=media&token=b768f937-ff98-4f11-9473-2819e26a100c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fmicroprocessor%2016-17%20end.pdf?alt=media&token=f420adcb-f2c0-4a75-9188-86fe1dbd0ab9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/ece%2Fe5%2Fvlsi%2015-16%20end.pdf?alt=media&token=d39508b4-6154-4c74-80bb-38f5231a58f3");


                break;
            }
            case "END SEM-6":{

                break;
            }
            case "END SEM-7":{
                buttonText.add("Remote Sensing 18-19");

                targetFile.add(new File(folder,"remote 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe7%2Fremote%2018-19%20end.pdf?alt=media&token=7796eb5f-2f2e-4efc-9378-36343077c7ac");


                break;
            }
            case "END SEM-8":{
                buttonText.add("LIDAR 17-18");
                buttonText.add("LIDAR 18-19");

                targetFile.add(new File(folder,"lidar 17-18 end.pdf"));
                targetFile.add(new File(folder,"lidar 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2017-18%20end.pdf?alt=media&token=af8146b1-6593-426a-9168-fa6ae2a161e4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2018-19%20end.pdf?alt=media&token=30f7f208-0b34-472a-b456-3185460a11f8");

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

