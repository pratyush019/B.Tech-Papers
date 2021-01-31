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

public class CHEMICAL {
    private CHEMICAL(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".CHEMICAL"+"/"+sem;
        File  folder = new File(Objects.requireNonNull(context).getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        buttonText =new ArrayList<>();
        targetFile=new ArrayList<>();
        downloadURL=new ArrayList<>();
        switch (sem){
            case "MID SEM-3":{


                buttonText.add("Basic Electrical 15-16");
                buttonText.add("Basic Electrical 18-19");
                buttonText.add("Basic Electrical 17-18");
                buttonText.add("Material Science 15-16");
                buttonText.add("Material Science 17-18");
                buttonText.add("Material Science 18-19");
                buttonText.add("Material Science 16-17");
                buttonText.add("Thermodynamics");
                buttonText.add("Thermodynamics");
                buttonText.add("NMST 15-16");
                buttonText.add("NMST 16-17");
                buttonText.add("NMST 17-18");
                buttonText.add("Thermodynamics 18-19");
                buttonText.add("ffohm 16-17");
                buttonText.add("ffohm 17-18");
                buttonText.add("fpmmo 16-17");



                targetFile.add(new File(folder, "BEE 15-16 mid.pdf"));
                targetFile.add(new File(folder, "BEE 18-19 mid+.pdf"));
                targetFile.add(new File(folder, "Bee_17-18_mid+[1].pdf"));
                targetFile.add(new File(folder, "MSE 15-16 mid.pdf"));
                targetFile.add(new File(folder, "MSE 17-18 mid+.pdf"));
                targetFile.add(new File(folder, "MSE 18-19 mid+.pdf"));
                targetFile.add(new File(folder, "MSE mid 16-17.pdf"));
                targetFile.add(new File(folder, "SOM_18-19_mid+[1].pdf"));
                targetFile.add(new File(folder, "Som 15-16 mid.pdf"));
                targetFile.add(new File(folder, "Thermo mid.pdf"));
                targetFile.add(new File(folder, "Thermo mid1.pdf"));
                targetFile.add(new File(folder, "nmst 15-16 mid+.pdf"));
                targetFile.add(new File(folder, "nmst 16-17 mid.pdf"));
                targetFile.add(new File(folder, "nmst 17-18 mid+.pdf"));
                targetFile.add(new File(folder, "thermodynamics_18-19_mid+[1].pdf"));
                targetFile.add(new File(folder, "ffohm 16-17mid 3.pdf"));
                targetFile.add(new File(folder, "ffohm 17-18 mid 3.pdf"));
                targetFile.add(new File(folder, "fpmmo 16-17-18 mid 3.pdf"));



                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBEE%2015-16%20mid.pdf?alt=media&token=e69c1047-bca4-4b87-8717-fa66a7f6347d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBEE%2018-19%20mid%2B.pdf?alt=media&token=fddb5406-79e0-4461-8697-b215b220464a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBee_17-18_mid%2B%5B1%5D.pdf?alt=media&token=c004dab7-0056-4877-b409-423f9c631e9e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2015-16%20mid.pdf?alt=media&token=de79a111-52c7-4d99-ac0f-715046cb7947");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2017-18%20mid%2B.pdf?alt=media&token=7c1c0c6f-7751-482b-ae3e-6e6304622547");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2018-19%20mid%2B.pdf?alt=media&token=595444c6-bdd6-4bd3-aa6b-180f3939aea9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%20mid%2016-17.pdf?alt=media&token=2e3cf13b-7e59-4ed2-95a4-674a87a56485");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid.pdf?alt=media&token=21f69862-b165-4b01-8c09-d91e3fa44144");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid1.pdf?alt=media&token=cf85198b-5ef2-4577-96c2-e18116e26bb8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2015-16%20mid%2B.pdf?alt=media&token=3c9345ae-183b-40ac-ba34-c437eb5173bc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2016-17%20mid.pdf?alt=media&token=e0c8c7dc-5810-4686-8083-6279f7bc0d54");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2017-18%20mid%2B.pdf?alt=media&token=55762bf6-db58-4145-84ea-1f21148386f7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fthermodynamics_18-19_mid%2B%5B1%5D.pdf?alt=media&token=c3feddce-986b-4752-a82e-2e466a83a7ba");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm3%2Fffohm%2016-17mid%203.pdf?alt=media&token=07e878a8-b4ef-493a-bc20-0491e8aee2b9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm3%2Fffohm%2017-18%20mid%203.pdf?alt=media&token=123ccb33-7732-4146-ae44-8689e6312f4a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm3%2Ffpmmo%2016-17-18%20mid%203.pdf?alt=media&token=e4e90ff1-91bf-4c97-bc67-a14c6707d45c");

                break;
            }
            case "MID SEM-4":{
                buttonText.add("chemical technology 16-17");
                buttonText.add("cpp 16-17");
                buttonText.add("heat transfer 16-17");
                buttonText.add("mass transfer 16-17");
                buttonText.add("opec 16-17");
                buttonText.add("ped 18-19ped 18-19");


                targetFile.add(new File(folder, "chemical technology 16-17 mid 4.pdf"));
                targetFile.add(new File(folder, "cpp 16-17 mid 4.pdf"));
                targetFile.add(new File(folder, "heat transfer 16-17 mid 4.pdf"));
                targetFile.add(new File(folder, "mass transfer 16-17 mid 4.pdf"));
                targetFile.add(new File(folder, "opec 16-17 mid 4.pdf"));
                targetFile.add(new File(folder, "ped 18-19 mid 4.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fchemical%20technology%2016-17%20mid%204.pdf?alt=media&token=856017e8-8631-4966-960c-7b68b30f263c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fcpp%2016-17%20mid%204.pdf?alt=media&token=26c8c689-0b07-4290-aa6d-ee7fcd6f82f2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fheat%20transfer%2016-17%20mid%204.pdf?alt=media&token=26b02a64-f107-4cd8-b1c7-fdbc1c4c3d29");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fmass%20transfer%2016-17%20mid%204.pdf?alt=media&token=951283b3-8883-44d7-aec6-8a0190982dd2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fopec%2016-17%20mid%204.pdf?alt=media&token=8e0ba8b8-b51e-4595-9bf5-577537f972b8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm4%2Fped%2018-19%20mid%204.pdf?alt=media&token=12f5f660-260d-496a-a498-5db60e6324cd");

                break;
            }
            case "MID SEM-5":{

                buttonText.add("POM 16-17");
                buttonText.add("POM 17-18");
                buttonText.add("POM 18-19");
                buttonText.add("Thermodynamics 18-19");
                buttonText.add("chemical technology 18-19");
                buttonText.add("pdc 18-19");

                targetFile.add(new File(folder,"POM mid 16-17.pdf"));
                targetFile.add(new File(folder,"POM mid 17-18.pdf"));
                targetFile.add(new File(folder,"pom 18-19 mid.pdf"));
                targetFile.add(new File(folder, "Thermodynamics 18-19 mid.pdf"));
                targetFile.add(new File(folder, "chemical technology 18-18 mid 5.pdf"));
                targetFile.add(new File(folder, "pdc 18-19 mid 5.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2016-17.pdf?alt=media&token=bb79865e-5cfc-4e0b-af21-190c82dbb273");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2017-18.pdf?alt=media&token=be0f2904-3409-4c8a-b8e5-d48e69ecb2a9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fpom%2018-19%20mid.pdf?alt=media&token=53544fa4-d6b7-4354-ae5b-db174a675b9c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm5%2FThermodynamics%2018-19%20mid.pdf?alt=media&token=80611593-6115-4526-89d6-1fd8f502b16b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm5%2Fchemical%20technology%2018-18%20mid%205.pdf?alt=media&token=3b71d97c-0ec1-4e3a-b5d9-b727a1b9eac4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm5%2Fpdc%2018-19%20mid%205.pdf?alt=media&token=e4cbef86-6c54-4776-8f7b-caa48bb1afb1");



                break;
            }
            case "MID SEM-6":{
                buttonText.add("chemical technology");
                buttonText.add("epmc 18-19");


                targetFile.add(new File(folder, "chemical technology mid 6.pdf"));
                targetFile.add(new File(folder, "epmc 18-19 mid 6.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm6%2Fchemical%20technology%20mid%206.pdf?alt=media&token=a21f32ef-701e-4c3b-b3b3-e17ee2f27cf3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm6%2Fepmc%2018-19%20mid%206.pdf?alt=media&token=d9bcd6fb-8718-4f2d-9023-30164b062623");

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
                buttonText.add("advanced separation 18-19");

                targetFile.add(new File(folder,"lidar 17-18 mid.pdf"));
                targetFile.add(new File(folder,"lidar 18-19 mid.pdf"));
                targetFile.add(new File(folder,"advanced separation process mid 18-19 8.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2017-18%20mid.pdf?alt=media&token=49adbf28-c908-4540-86a7-126534a4deac");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm8%2Flidar%2018-19%20mid.pdf?alt=media&token=0320f3ca-b536-4fb5-943f-635317d36ef0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fm8%2Fadvanced%20separation%20process%20mid%2018-19%208.pdf?alt=media&token=8560f65e-3b3c-4881-9644-e36bd54a63ec");

                break;
            }
            case "END SEM-3":{
                buttonText.add("Basic Electrical 15-16");
                buttonText.add("Material Science 15-16");
                buttonText.add("Material Science 16-17");
                buttonText.add("Material Science 17-18");
                buttonText.add("Material Science 18-19");
                buttonText.add("NMST 15-16");
                buttonText.add("NMST 16-17");
                buttonText.add("Thermodynamics 15-16");
                buttonText.add("Thermodynamics");
                buttonText.add("Thermodynamics");
                buttonText.add("NMST 17-18");
                buttonText.add("NMST 17-18");
                buttonText.add("NMST 18-19");
                buttonText.add("Chemical Process 18-19");
                buttonText.add("Fluid Flow 18-19");
                buttonText.add("Process Instrumentation");
                buttonText.add("bee 20-21");
                buttonText.add("cpp 20-21");
                buttonText.add("fluid flow 20-21");
                buttonText.add("mse 20-21");
                buttonText.add("nmst 20-21");
                buttonText.add("process instrumentation 20-21");




                targetFile.add(new File(folder,"BEE 15-16 end.pdf"));
                targetFile.add(new File(folder,"MSE 15-16 end+.pdf"));
                targetFile.add(new File(folder,"MSE 16-17 end!.pdf"));
                targetFile.add(new File(folder,"MSE 17-18 end+.pdf"));
                targetFile.add(new File(folder,"MSE 18-19end+.pdf"));
                targetFile.add(new File(folder,"NMST 15-16 end.pdf"));
                targetFile.add(new File(folder,"MNST 16-17 end.pdf"));
                targetFile.add(new File(folder,"Thermo 15-16 end.pdf"));
                targetFile.add(new File(folder,"Thermo end.pdf"));
                targetFile.add(new File(folder,"Thermo end1.pdf"));
                targetFile.add(new File(folder,"nmst 17&18 end.pdf"));
                targetFile.add(new File(folder,"nmst 17-18 end+.pdf"));
                targetFile.add(new File(folder,"nmst 18-19 end+.pdf"));
                targetFile.add(new File(folder,"chemical process 18-19 end ch.pdf"));
                targetFile.add(new File(folder,"fluid flow 18-19 end ch.pdf"));
                targetFile.add(new File(folder,"process instrumation 18-19 end ch.pdf"));
                targetFile.add(new File(folder,"bee end 20-21.pdf"));
                targetFile.add(new File(folder,"cpp end 20-21.pdf"));
                targetFile.add(new File(folder,"fluid flow end 20-21.pdf"));
                targetFile.add(new File(folder,"mse end 20-21.pdf"));
                targetFile.add(new File(folder,"nmst end 20-21.pdf"));
                targetFile.add(new File(folder,"process instrumentation end 20-21.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FBEE%2015-16%20end.pdf?alt=media&token=2a9c30fb-67ad-4a4e-9004-423804b143c6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2015-16%20end%2B.pdf?alt=media&token=ca15b438-6d35-4e2a-92a8-fbde4a00131a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2016-17%20end!.pdf?alt=media&token=5f55125b-df1e-4409-96ad-5385a6626df3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2017-18%20end%2B.pdf?alt=media&token=bedf3fd8-2526-4a41-9821-94c5c48232e1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2018-19end%2B.pdf?alt=media&token=7a0515c4-990e-4e91-8c8f-ef5fe7a038a6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FNMST%2015-16%20end.pdf?alt=media&token=0d7723b0-4b2f-4d0f-99ed-a7b264c0c45a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMNST%2016-17%20end.pdf?alt=media&token=ce9e84fa-bea9-4f76-b7c5-b38f756f6ce6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%2015-16%20end.pdf?alt=media&token=4ec50ef9-52ba-47ed-ae86-4858b477abc3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%20end.pdf?alt=media&token=ba2447b1-3adb-4016-b7d7-081e12e274c8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%20end1.pdf?alt=media&token=307a135a-833d-4f50-9bda-efc0919f0d06");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2Fnmst%2017%2618%20end.pdf?alt=media&token=f444c71c-367c-4df5-9e15-3f1ed9644751");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2Fnmst%2017-18%20end%2B.pdf?alt=media&token=1a60de7d-d6fe-4c04-adca-e856b13c8fad");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fnmst%2018-19%20end%20ch.pdf?alt=media&token=7f00778e-5075-4dc5-803e-ba2fe8a8a22e");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fchemical%20process%2018-19%20end%20ch.pdf?alt=media&token=023626bb-2983-4c68-9f1f-c61882bb1474");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Ffluid%20flow%2018-19%20end%20ch.pdf?alt=media&token=52138337-8bd1-4967-a65a-93fd511ab84f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fprocess%20instrumation%2018-19%20end%20ch.pdf?alt=media&token=c3ac1c6f-c1e0-46f5-a5e9-252389c0e024");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fbee%20end%2020-21.pdf?alt=media&token=797df247-e975-4ba4-9b7c-97817f135c40");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fcpp%20end%2020-21.pdf?alt=media&token=cb70207c-2f40-4182-a3de-309a06f36c52");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Ffluid%20flow%20end%2020-21.pdf?alt=media&token=8c5190e3-1aa5-4982-9067-7cc714dbfc9f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fmse%20end%2020-21.pdf?alt=media&token=d2d4d174-a8d4-4de1-a7b3-b32fa30c61c8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fnmst%20end%2020-21.pdf?alt=media&token=e984aaee-cffe-4344-9369-8d6126ca4625");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe3%2Fprocess%20instrumentation%20end%2020-21.pdf?alt=media&token=054ad31c-5e5e-4cea-a297-c6e673626e29");
                break;
            }
            case "END SEM-4":{

                buttonText.add("chemical technology 17-18");
                buttonText.add("cpp 17-18");
                buttonText.add("ped 17-18");

                targetFile.add(new File(folder,"chemical technology 17-28 end 4.pdf"));
                targetFile.add(new File(folder,"cpp 17-18 end 4.pdf"));
                targetFile.add(new File(folder,"ped 17-18 end 4.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe4%2Fchemical%20technology%2017-28%20end%204.pdf?alt=media&token=ea5d7c4a-79ca-4c3f-b4c4-541bb587398f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe4%2Fcpp%2017-18%20end%204.pdf?alt=media&token=500a17b5-ebab-418c-b628-2f1535560c77");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe4%2Fped%2017-18%20end%204.pdf?alt=media&token=7b28f1c4-0d2a-4581-9f8f-49b03af63c7c");


                break;
            }
            case "END SEM-5":{

                buttonText.add("chemical technology 18-19");
                buttonText.add("cre 20-21");
                buttonText.add("mass transfer 18-19");
                buttonText.add("mass transfer 20-21");
                buttonText.add("pdc 18-19");
                buttonText.add("pdc 20-21");
                buttonText.add("pom 20-21");
                buttonText.add("thermodynamics 20-21");
                buttonText.add("POM 16-17");

                targetFile.add(new File(folder, "chemical technology 18-29 end 5.pdf"));
                targetFile.add(new File(folder, "cre end 20-21.pdf"));
                targetFile.add(new File(folder, "mass transfer 18-19 end 5.pdf"));
                targetFile.add(new File(folder, "mass transfer end 20-21.pdf"));
                targetFile.add(new File(folder, "pdc 18-19 end 5.pdf"));
                targetFile.add(new File(folder, "pdc end 20-21.pdf"));
                targetFile.add(new File(folder, "pom end 20-21.pdf"));
                targetFile.add(new File(folder, "thermodynamics end 20-21.pdf"));
                targetFile.add(new File(folder,"POM 16-17 end.pdf"));


                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fchemical%20technology%2018-29%20end%205.pdf?alt=media&token=7a554443-3567-455d-8643-f7213161df53");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fcre%20end%2020-21.pdf?alt=media&token=476f98cd-096b-4497-81f2-6f432bc52f96");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fmass%20transfer%2018-19%20end%205.pdf?alt=media&token=f529089c-33c3-4502-9909-36f1f1655b4c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fmass%20transfer%20end%2020-21.pdf?alt=media&token=29148021-33f0-4d5a-b6a2-bbbde7dd5391");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fpdc%2018-19%20end%205.pdf?alt=media&token=8d56597c-aa9d-4a31-bdfb-8f3a2d9bca17");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fpdc%20end%2020-21.pdf?alt=media&token=af44b175-b085-41f2-a6b1-e732f5ebb3aa");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fpom%20end%2020-21.pdf?alt=media&token=e658671a-d5d6-42c5-81ca-d79e40e226d1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe5%2Fthermodynamics%20end%2020-21.pdf?alt=media&token=93929e2e-221b-460f-a88e-f71e5882db3a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FPOM%2016-17%20end.pdf?alt=media&token=4a1eab26-49f2-4876-b2db-3c2fc0c6feb5");


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
                buttonText.add("Advanced seperation 18-19");

                targetFile.add(new File(folder,"lidar 17-18 end.pdf"));
                targetFile.add(new File(folder,"lidar 18-19 end.pdf"));
                targetFile.add(new File(folder,"advanced separation process 18-18 end 8.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2017-18%20end.pdf?alt=media&token=af8146b1-6593-426a-9168-fa6ae2a161e4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe8%2Flidar%2018-19%20end.pdf?alt=media&token=30f7f208-0b34-472a-b456-3185460a11f8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/chemical%2Fe8%2Fadvanced%20separation%20process%2018-18%20end%208.pdf?alt=media&token=da7af1fc-36d1-4289-82d8-f27fe8e14dd2");
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
