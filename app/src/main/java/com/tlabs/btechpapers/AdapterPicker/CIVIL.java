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

public class CIVIL {
    private CIVIL(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".CIVIL"+"/"+sem;
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        switch (sem){
            case "MID SEM-3":{

                break;
            }
            case "MID SEM-4":{

                break;
            }
            case "MID SEM-5":{

                buttonText.add("Concrete Structure 17-18");
                buttonText.add("Environmental 14-15");
                buttonText.add("Environmental 15-16");
                buttonText.add("Environmental 16-17");
                buttonText.add("Geotechnical 17-18");
                buttonText.add("Structural Analysis 14-15");
                buttonText.add("Structural Analysis 16-17");
                buttonText.add("Survey 17-18");
                buttonText.add("Transportation 17-18");


                targetFile.add(new File(folder, "Concrete 17-18 mid.pdf"));
                targetFile.add(new File(folder, "Environmental mid 14-15.pdf"));
                targetFile.add(new File(folder, "Environmental mid 15-16.pdf"));
                targetFile.add(new File(folder, "Environmental mid 16-17.pdf"));
                targetFile.add(new File(folder, "Geotechnical 17-18 mid.pdf"));
                targetFile.add(new File(folder, "Structural 14-15 mid.pdf"));
                targetFile.add(new File(folder, "Structural 16-17 mid.pdf"));
                targetFile.add(new File(folder, "Survey 17-18 mid.pdf"));
                targetFile.add(new File(folder, "Transportation 17-18 mid.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FConcrete%2017-18%20mid.pdf?alt=media&token=c8074596-adb4-4cb0-8f6c-7c35686f98dc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FEnvironmental%20mid%2014-15.pdf?alt=media&token=aef8228f-60ad-432d-a42b-c03a5990e6b2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FEnvironmental%20mid%2015-16.pdf?alt=media&token=f0bc0e45-06a1-4ac0-b4cd-95a85db9a49e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FEnvironmental%20mid%2016-17.pdf?alt=media&token=685d9ff3-919b-495a-a92c-c2194d9b1366");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FGeotechnical%2017-18%20mid.pdf?alt=media&token=a8456d36-98b0-4b1b-b040-3643a3e44da0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FStructural%2014-15%20mid.pdf?alt=media&token=60b82b40-3fe4-48b5-9b51-519da610e3ca");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FStructural%2016-17%20mid.pdf?alt=media&token=5f44313c-e6c1-4ce0-8c33-773b728999d6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FSurvey%2017-18%20mid.pdf?alt=media&token=7fd44cfb-1e03-44f4-9322-ef55f69ecea7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fm5%2FTransportation%2017-18%20mid.pdf?alt=media&token=9d004095-1cdb-4408-8b26-193c1a013ff7");


                break;
            }
            case "MID SEM-6":{

                break;
            }
            case "MID SEM-7":{

                break;
            }
            case "MID SEM-8":{

                break;
            }
            case "END SEM-3":{

                break;
            }
            case "END SEM-4":{

                break;
            }
            case "END SEM-5":{
                buttonText.add("Environmental 14-15");
                buttonText.add("Environmental 15-16");
                buttonText.add("Structural Analysis 13-14");
                buttonText.add("Structural Analysis 14-15");
                buttonText.add("Structural Analysis 16-17");
                buttonText.add("Structural Analysis 17-18");
                buttonText.add("Survey 17-18");


                targetFile.add(new File(folder, "Environmental end 14-15.pdf"));
                targetFile.add(new File(folder, "Environmental end 15-16.pdf"));
                targetFile.add(new File(folder, "Structural 13-14 end.pdf"));
                targetFile.add(new File(folder, "Structural 14-15 end.pdf"));
                targetFile.add(new File(folder, "Structural 16-17 end.pdf"));
                targetFile.add(new File(folder, "Structural 17-18 end.pdf"));
                targetFile.add(new File(folder, "Survey 17-18 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FEnvironmental%20end%2014-15.pdf?alt=media&token=e7f32b93-c927-4130-b3d5-2e8ce9d438c7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FEnvironmental%20end%2015-16.pdf?alt=media&token=0fa12a65-2bf7-4bad-b9f9-62667f92041b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FStructural%2013-14%20end.pdf?alt=media&token=eaf3e4d9-2a7a-4aad-a120-05850e8b0875");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FStructural%2014-15%20end.pdf?alt=media&token=a6f84ca1-2293-4712-99b5-001b7aa3f8fc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FStructural%2016-17%20end.pdf?alt=media&token=02028e99-1872-4c01-be84-d5be5f08104e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FStructural%2017-18%20end.pdf?alt=media&token=5916ebf7-661a-4887-a4d4-e4dc17a8733d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/civil%2Fe5%2FSurvey%2017-18%20end.pdf?alt=media&token=c6d4b912-36d2-49b5-b32a-e902396773cc");


                break;
            }
            case "END SEM-6":{

                break;
            }
            case "END SEM-7":{

                break;
            }
            case "END SEM-8":{

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


