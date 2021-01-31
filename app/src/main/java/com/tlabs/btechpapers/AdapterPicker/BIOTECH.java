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

public class BIOTECH {
    private BIOTECH(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".BIOTECH"+"/"+sem;
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        switch (sem){
            case "MID SEM-3":{

                buttonText.add("Biochemistry 16-17");
                buttonText.add("Biochemistry 17-18");
                buttonText.add("Biochemistry 8-19");
                buttonText.add("bmse 16-17");
                buttonText.add("bmse 17-18");
                buttonText.add("bmse 18-19");
                buttonText.add("csb 16-17");
                buttonText.add("csb 17-18");
                buttonText.add("genetics 16-17");
                buttonText.add("genetics 17-18");
                buttonText.add("genetics 18-19");
                buttonText.add("microbiology 18-19");
                buttonText.add("microbiology");
                buttonText.add("tbs 16-17");
                buttonText.add("tbs 17-18");
                buttonText.add("tbs 18-19");


                targetFile.add(new File(folder, "biochemistry mid 16-17.pdf"));
                targetFile.add(new File(folder, "biochemistry mid 17-18.pdf"));
                targetFile.add(new File(folder, "biochemistry mid 18-19.pdf"));
                targetFile.add(new File(folder, "bmse mid 16-17.pdf"));
                targetFile.add(new File(folder, "bmse mid 17-18.pdf"));
                targetFile.add(new File(folder, "bmse mid 18-19.pdf"));
                targetFile.add(new File(folder, "csb mid 16-17.pdf"));
                targetFile.add(new File(folder, "csb mid 17-18.pdf"));
                targetFile.add(new File(folder, "genetics mid 16-17.pdf"));
                targetFile.add(new File(folder, "genetics mid 17-18.pdf"));
                targetFile.add(new File(folder, "genetics mid 18-19.pdf"));
                targetFile.add(new File(folder, "microbiology mid 18-19.pdf"));
                targetFile.add(new File(folder, "microbiology mid.pdf"));
                targetFile.add(new File(folder, "tbs mid 16-17.pdf"));
                targetFile.add(new File(folder, "tbs mid 17-18.pdf"));
                targetFile.add(new File(folder, "tbs mid 18-19.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbiochemistry%20mid%2016-17.pdf?alt=media&token=b5af5c6f-3c72-48b6-bf17-c2fa43d3c645");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbiochemistry%20mid%2017-18.pdf?alt=media&token=19e5b90f-453e-4c08-b9b7-0ca719078291");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbiochemistry%20mid%2018-19.pdf?alt=media&token=59c048e2-ec22-49e4-b6a4-dd379140bded");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbmse%20mid%2016-17.pdf?alt=media&token=fa6b34f8-bf73-41a4-9766-3b32c06ba820");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbmse%20mid%2017-18.pdf?alt=media&token=a2dd992a-3aff-4262-b5fa-2f719982c0be");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fbmse%20mid%2018-19.pdf?alt=media&token=fbbf34ac-0b50-47bc-bea5-bd525d4d7157");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fcsb%20mid%2016-17.pdf?alt=media&token=7db6a14e-5b16-4ecd-a1b8-d4b0fc6b11a6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fcsb%20mid%2017-18.pdf?alt=media&token=52ff9281-d4b1-4bd5-ba60-fa19324e4970");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fgenetics%20mid%2016-17.pdf?alt=media&token=18a8574b-da3f-4bd8-8ad9-f4ac83673975");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fgenetics%20mid%2017-18.pdf?alt=media&token=595a7908-e0ad-4dcf-834d-6197c6c3265a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fgenetics%20mid%2018-19.pdf?alt=media&token=e15a7a53-d513-40d5-9014-cccc5a72ba6e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fmicrobiology%20mid%2018-19.pdf?alt=media&token=f51a596e-39be-4a4e-89cc-3a85c6285914");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Fmicrobiology%20mid.pdf?alt=media&token=b4083268-a9fb-4911-aef1-d1082382d31c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Ftbs%20mid%2016-17.pdf?alt=media&token=ea8af873-7b59-477e-8c68-39814ddedc54");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Ftbs%20mid%2017-18.pdf?alt=media&token=248bacca-db0b-451c-82a0-c33cd7523f20");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm3%2Ftbs%20mid%2018-18.pdf?alt=media&token=e94e4fd0-21ee-49cb-b213-a8658e499dc7");


                break;
            }
            case "MID SEM-4":{

                break;
            }
            case "MID SEM-5":{
                buttonText.add("Genetic Eng. 17-18");
                buttonText.add("Genetic Eng. 18-19");
                buttonText.add("Immunology 18-19");
                buttonText.add("Microbial Biotechnology 17-18");
                buttonText.add("Microbial Biotechnology");
                buttonText.add("Biostatstics 17-18");
                buttonText.add("Biostatstics 18-19");
                buttonText.add("MCD 18-19");
                buttonText.add("MCD");
                buttonText.add("MCD");
                buttonText.add("POM 18-19");

                targetFile.add(new File(folder,"Genetic engineering 17-18 mid.pdf"));
                targetFile.add(new File(folder,"Genetic engineering 18-19 mid.pdf"));
                targetFile.add(new File(folder,"Immunology 18-19 mid.pdf"));
                targetFile.add(new File(folder,"Microbial Biotech 17-18 mid.pdf"));
                targetFile.add(new File(folder,"Microbial Biotech mid.pdf"));
                targetFile.add(new File(folder,"biostatistics 17-18 mid.pdf"));
                targetFile.add(new File(folder,"biostatistics 18-19 mid.pdf"));
                targetFile.add(new File(folder,"mcd 18-19 mid.pdf"));
                targetFile.add(new File(folder,"mcd mid 1.pdf"));
                targetFile.add(new File(folder,"mcd mid.pdf"));
                targetFile.add(new File(folder,"pom 18-19 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2FGenetic%20engineering%2017-18%20mid.pdf?alt=media&token=2196a2a3-8dd2-429b-9967-f760a824119b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2FGenetic%20engineering%2018-19%20mid.pdf?alt=media&token=2995929c-7551-475a-8506-44816b2f03a5");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2FImmunology%2018-19%20mid.pdf?alt=media&token=89b7ad0a-0363-4956-9de5-ca79845731e7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2FMicrobial%20Biotech%2017-18%20mid.pdf?alt=media&token=e61258b9-2ac1-40eb-a044-8d1c19b7f94c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2FMicrobial%20Biotech%20mid.pdf?alt=media&token=46542443-84bc-4d40-9e36-be67f8f050f9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fbiostatistics%2017-18%20mid.pdf?alt=media&token=8bc70a56-c17f-45eb-83a5-a4e2a57eb819");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fbiostatistics%2018-19%20mid.pdf?alt=media&token=83aa5a51-2e8f-425d-b541-5e0dbcb65ce2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fmcd%2018-19%20mid.pdf?alt=media&token=9e3aa35c-a519-485a-9c3b-7515a3d070e4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fmcd%20mid%201.pdf?alt=media&token=fee3d27b-8892-4493-b4c7-82af93125f95");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fmcd%20mid.pdf?alt=media&token=b976f5e1-9c58-472b-b48e-f0d84e9e45df");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fm5%2Fpom%2018-19%20mid.pdf?alt=media&token=1e8a90d2-acb2-4825-bd34-580ed70b6d9a");



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


                buttonText.add("biochemistry 16-17");
                buttonText.add("biochemistry 17-18");
                buttonText.add("bmse 16-17");
                buttonText.add("bmse 17-18");
                buttonText.add("bmse 18-19");
                buttonText.add("csb 17-18");
                buttonText.add("csb 18-19");
                buttonText.add("csb");
                buttonText.add("genetics 17-18");
                buttonText.add("microbiology 17-18");
                buttonText.add("tbs 17-18");
                buttonText.add("tbs 18-19");


                targetFile.add(new File(folder, "biochemistry end 16-17.pdf"));
                targetFile.add(new File(folder, "biochemistry end 17-18.pdf"));
                targetFile.add(new File(folder, "bmse end 16-17.pdf"));
                targetFile.add(new File(folder, "bmse end 17-18.pdf"));
                targetFile.add(new File(folder, "bmse end 18-19.pdf"));
                targetFile.add(new File(folder, "csb end 17-18.pdf"));
                targetFile.add(new File(folder, "csb end 18-19.pdf"));
                targetFile.add(new File(folder, "csb end.pdf"));
                targetFile.add(new File(folder, "genetics end 17-18.pdf"));
                targetFile.add(new File(folder, "microbiology  end 17-18.pdf"));
                targetFile.add(new File(folder, "tbs end 17-18.pdf"));
                targetFile.add(new File(folder, "tbs end 18-19.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fbiochemistry%20end%2016-17.pdf?alt=media&token=109ad66c-c4df-4c97-ba60-d5026262c061");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fbiochemistry%20end%2017-18.pdf?alt=media&token=b0f5f4ad-5d70-4673-b506-eef3c62ac077");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fbmse%20end%2016-17.pdf?alt=media&token=055e9bf0-71d4-4ff1-86dd-2f2e5c0a4583");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fbmse%20end%2017-18.pdf?alt=media&token=de4c74e4-c55c-4a50-9a50-d20ae9b04f79");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fbmse%20end%2018-19.pdf?alt=media&token=a52e4e5c-6dc5-4d66-8184-6f83c8275a36");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fcsb%20end%2017-18.pdf?alt=media&token=0c90d7dc-f191-4f46-9ecb-0ae50242b23f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fcsb%20end%2018-19.pdf?alt=media&token=2fc78825-b2f8-4b73-bb4e-3bca4ed8b24c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fcsb%20end.pdf?alt=media&token=bcb432c8-6702-401c-89ee-a919d7cc41de");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fgenetics%20end%2017-18.pdf?alt=media&token=c3a3e903-0d1c-4cfa-9edf-2ab32bd073f1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Fmicrobiology%20%20end%2017-18.pdf?alt=media&token=b0f46143-3884-43f0-9647-d7ab956ed4cb");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Ftbs%20end%2017-18.pdf?alt=media&token=c74fc939-edb8-46bc-b40f-654cd127ed59");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe3%2Ftbs%20end%2018-19.pdf?alt=media&token=5d66222f-8f1d-44de-8b30-f0b89025a66a");


                break;
            }
            case "END SEM-4":{

                break;
            }
            case "END SEM-5":{
                buttonText.add("Genetic engineering 15-16");
                buttonText.add("Genetic engineering 17-18");
                buttonText.add("Genetic engineering 18-19");
                buttonText.add("Immunology 17-18 ");
                buttonText.add("Immunology 18-19");
                buttonText.add("Microbial Biotechnology 15-16");
                buttonText.add("Microbial Biotechnology 17-18");
                buttonText.add("Biostatistics 15-16");
                buttonText.add("Biostatistics 17-18");
                buttonText.add("Biostatistics 18-19");
                buttonText.add("MCD 18-19");
                buttonText.add("POM 17-18");
                buttonText.add("POM 18-19");

                targetFile.add(new File(folder,"Genetic engineering 15-16 end.pdf"));
                targetFile.add(new File(folder,"Genetic engineering 17-18 end.pdf"));
                targetFile.add(new File(folder,"Genetic engineering 18-19 end.pdf"));
                targetFile.add(new File(folder,"Immunology 17-18 end.pdf"));
                targetFile.add(new File(folder,"Immunology 18-19 end.pdf"));
                targetFile.add(new File(folder,"Microbial Biotech 15-16 end.pdf"));
                targetFile.add(new File(folder,"Microbial Biotech 17-18 end.pdf"));
                targetFile.add(new File(folder,"biostatistics 15-16 end.pdf"));
                targetFile.add(new File(folder,"biostatistics 17-18 end.pdf"));
                targetFile.add(new File(folder,"biostatistics 18-19 end.pdf"));
                targetFile.add(new File(folder,"mcd 18-19 end.pdf"));
                targetFile.add(new File(folder,"pom 17-18 end.pdf"));
                targetFile.add(new File(folder,"pom 18-19 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FGenetic%20engineering%2015-16%20end.pdf?alt=media&token=b11c7d7e-bf54-4387-a128-828c4cc5d1fb");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FGenetic%20engineering%2017-18%20end.pdf?alt=media&token=eefc60f3-f291-4332-8597-97aa0405a021");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FGenetic%20engineering%2018-19%20end.pdf?alt=media&token=ec057c34-044e-46e4-9b72-2245b6cee2d5");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FImmunology%2017-18%20end.pdf?alt=media&token=82cdac74-3530-4ead-bd4b-c1f581641d60");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FImmunology%2018-19%20end.pdf?alt=media&token=1df986d9-4377-4dd4-92e8-74f8d27f9c7e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FMicrobial%20Biotech%2015-16%20end.pdf?alt=media&token=30f507c2-146d-4b1a-be98-1b711184e84e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2FMicrobial%20Biotech%2017-18%20end.pdf?alt=media&token=d518b272-d488-43ef-bd1d-6222421b3ba2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fbiostatistics%2015-16%20end.pdf?alt=media&token=85217982-42de-4404-a908-d7dc98adf5b8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fbiostatistics%2017-18%20end.pdf?alt=media&token=033cc261-e2fb-43b0-8df8-4de99ae6f878");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fbiostatistics%2018-19%20end.pdf?alt=media&token=5cf41628-56ba-4133-a2f4-e2d4286bf1de");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fmcd%2018-19%20end.pdf?alt=media&token=2fb301cb-33fd-4a65-9dde-3ba9129d0d08");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fpom%2017-18%20end.pdf?alt=media&token=a690ca81-9bf5-4b7c-9be5-8d9593b754f1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/biotech%2Fe5%2Fpom%2018-19%20end.pdf?alt=media&token=46641a3b-6988-461f-b4b8-90d2ba5c060f");


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
