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

public class PIE {
    private PIE(){}
    public static PaperAdapter finalAdapter(Context context, String sem){
        PaperAdapter adapter;
        ArrayList<String> buttonText,downloadURL;
        ArrayList<File> targetFile;
        String destination=".PIE"+"/"+sem;
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
                    buttonText.add("SOM 18-19");
                    buttonText.add("SOM 15-16");
                    buttonText.add("Thermodynamics");
                    buttonText.add("Thermodynamics");
                    buttonText.add("NMST 15-16");
                    buttonText.add("NMST 16-17");
                    buttonText.add("NMST 17-18");
                    buttonText.add("Thermodynamics 18-19");


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


                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBEE%2015-16%20mid.pdf?alt=media&token=e69c1047-bca4-4b87-8717-fa66a7f6347d");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBEE%2018-19%20mid%2B.pdf?alt=media&token=fddb5406-79e0-4461-8697-b215b220464a");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FBee_17-18_mid%2B%5B1%5D.pdf?alt=media&token=c004dab7-0056-4877-b409-423f9c631e9e");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2015-16%20mid.pdf?alt=media&token=de79a111-52c7-4d99-ac0f-715046cb7947");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2017-18%20mid%2B.pdf?alt=media&token=7c1c0c6f-7751-482b-ae3e-6e6304622547");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%2018-19%20mid%2B.pdf?alt=media&token=595444c6-bdd6-4bd3-aa6b-180f3939aea9");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FMSE%20mid%2016-17.pdf?alt=media&token=2e3cf13b-7e59-4ed2-95a4-674a87a56485");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FSOM_18-19_mid%2B%5B1%5D.pdf?alt=media&token=5a2ff5b9-2bb0-4ae8-a8f3-71005b0ab303");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FSom%2015-16%20mid.pdf?alt=media&token=8609673e-4414-401c-ae7b-601b1da9eedc");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid.pdf?alt=media&token=21f69862-b165-4b01-8c09-d91e3fa44144");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid1.pdf?alt=media&token=cf85198b-5ef2-4577-96c2-e18116e26bb8");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2015-16%20mid%2B.pdf?alt=media&token=3c9345ae-183b-40ac-ba34-c437eb5173bc");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2016-17%20mid.pdf?alt=media&token=e0c8c7dc-5810-4686-8083-6279f7bc0d54");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2017-18%20mid%2B.pdf?alt=media&token=55762bf6-db58-4145-84ea-1f21148386f7");
                    downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fthermodynamics_18-19_mid%2B%5B1%5D.pdf?alt=media&token=c3feddce-986b-4752-a82e-2e466a83a7ba");

                    break;
            }
            case "MID SEM-4":{
                buttonText.add("Automatic Control 15-16");
                buttonText.add("Fluid Mechanics 15-16");
                buttonText.add("Industrial 16-17");
                buttonText.add("Industrial");
                buttonText.add("Measurement");
                buttonText.add("Measurement");
                buttonText.add("Thermal");
                buttonText.add("Thermal");



                targetFile.add(new File(folder,"AC mid 15-16.pdf"));
                targetFile.add(new File(folder,"Fluid 15-16 mid.pdf"));
                targetFile.add(new File(folder,"IE 16-17 mid.pdf"));
                targetFile.add(new File(folder,"IE mid.pdf"));
                targetFile.add(new File(folder,"MM 15-16 mid.pdf"));
                targetFile.add(new File(folder,"MM 16-17 mid.pdf"));
                targetFile.add(new File(folder,"Thermal mid.pdf"));
                targetFile.add(new File(folder,"Thermal mid1.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FAC%20mid%2015-16.pdf?alt=media&token=b644cc7c-6c33-4c49-b89b-e1beceaab29a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FFluid%2015-16%20mid.pdf?alt=media&token=f619110a-e6f9-46df-8cb1-5023787373d8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FIE%2016-17%20mid.pdf?alt=media&token=25aa51a5-88de-4c92-a58e-58f29d380ed1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FIE%20mid.pdf?alt=media&token=d6138395-9f72-4416-aa98-c48f223dd1c4");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FMM%2015-16%20mid.pdf?alt=media&token=a0d40096-b9b2-43a9-b2b6-701f8693546f");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm4%2FMM%2016-17%20mid.pdf?alt=media&token=ea111ef5-5d08-4634-98dd-d0be17d1609b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm4%2FThermal%20mid.pdf?alt=media&token=621cde4e-db32-4483-a898-58dedff9756b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm4%2FThermal%20mid1.pdf?alt=media&token=8ed2824d-de29-44ac-976e-aff1f254364b");


                break;
            }
            case "MID SEM-5":{
                buttonText.add("CAD 16-17");
                buttonText.add("CAD 17-18");
                buttonText.add("MD 18-19");
                buttonText.add("MD 17-18");
                buttonText.add("MST 17-18");
                buttonText.add("POM 16-17");
                buttonText.add("POM 17-18");
                buttonText.add("POM 18-19");
                buttonText.add("OR 16-17");
                buttonText.add("OR 17-18");
                buttonText.add("MD 19-20");
                buttonText.add("CAD 19-20");
                buttonText.add("MST 19-20");
                buttonText.add("POM 19-20");

                targetFile.add(new File(folder,"CAD mid 16-17.pdf"));
                targetFile.add(new File(folder,"CAD mid 17-18.pdf"));
                targetFile.add(new File(folder,"MD 18-19 mid.pdf"));
                targetFile.add(new File(folder,"MD mid 17-18.pdf"));
                targetFile.add(new File(folder,"MST 17-18 mid.pdf"));
                targetFile.add(new File(folder,"POM mid 16-17.pdf"));
                targetFile.add(new File(folder,"POM mid 17-18.pdf"));
                targetFile.add(new File(folder,"pom 18-19 mid.pdf"));
                targetFile.add(new File(folder,"OR 16-17 mid.pdf"));
                targetFile.add(new File(folder,"OR 17-18 mid.pdf"));
                targetFile.add(new File(folder,"MD 1 mid 19-20.pdf"));
                targetFile.add(new File(folder,"cad mid 19-20.pdf"));
                targetFile.add(new File(folder,"mst 1 mid 19-20.pdf"));
                targetFile.add(new File(folder,"pom mid 19-20.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FCAD%20mid%2016-17.pdf?alt=media&token=f678ec9d-2940-4488-a0df-c9d369ab0033");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FCAD%20mid%2017-18.pdf?alt=media&token=6a3f79bb-fa1e-4472-86e3-2473aa1f70cd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FMD%2018-19%20mid.pdf?alt=media&token=246c0bad-5c8a-4ba2-af79-4b5b70f93fe2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FMD%20mid%2017-18.pdf?alt=media&token=cb046966-ea2a-47a2-a24a-27164e8de526");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FMST%2017-18%20mid.pdf?alt=media&token=8d7f2ed3-fdd4-4492-8f90-2a359c23acd1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2016-17.pdf?alt=media&token=bb79865e-5cfc-4e0b-af21-190c82dbb273");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2017-18.pdf?alt=media&token=be0f2904-3409-4c8a-b8e5-d48e69ecb2a9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fpom%2018-19%20mid.pdf?alt=media&token=53544fa4-d6b7-4354-ae5b-db174a675b9c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm5%2FOR%2016-17%20mid.pdf?alt=media&token=5cbba2fc-5c08-4a94-bd1e-c79b4e0cdd4d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm5%2FOR%2017-18%20mid.pdf?alt=media&token=449c1642-6877-40de-83f7-c042e9d6e180");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FMD%201%20mid%2019-20.pdf?alt=media&token=3452e4ba-41fc-4db7-8b7a-461e27565784");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fcad%20mid%2019-20.pdf?alt=media&token=8de5205d-4250-4a21-bd68-4ccff34ea4da");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fmst%201%20mid%2019-20.pdf?alt=media&token=a7120f3d-7770-4d50-99eb-59d240cf5a65");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fpom%20mid%2019-20.pdf?alt=media&token=1afce04c-175f-4937-9dc8-569e822efc81");

                break;
            }
            case "MID SEM-6":{
                buttonText.add("CAM 16-17");
                buttonText.add("MD 17-18");
                buttonText.add("MST 17-18");
                buttonText.add("POM 17-18");
                buttonText.add("Tool Engineering 16-17");
                buttonText.add("MD 19-20");
                buttonText.add("CAM 19-20");
                buttonText.add("MST 19-20");

                targetFile.add(new File(folder,"CAM mid 16-17.pdf"));
                targetFile.add(new File(folder,"MD II mid 17-18.pdf"));
                targetFile.add(new File(folder,"MST mid 17-18.pdf"));
                targetFile.add(new File(folder,"POM pie mid 17-18.pdf"));
                targetFile.add(new File(folder,"Tool pie mid 16-17.pdf"));
                targetFile.add(new File(folder,"MD II 19-20 mid.pdf"));
                targetFile.add(new File(folder,"cam mid 19-20.pdf"));
                targetFile.add(new File(folder,"mst II mid 19-20.pdf"));



                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2FCAM%20mid%2016-17.pdf?alt=media&token=c0dfaf91-c331-4c0f-98a0-22a4a272337b");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2FMD%20II%20mid%2017-18.pdf?alt=media&token=fc396f05-7018-4f9f-805e-8a55de5ae020");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2FMST%20mid%2017-18.pdf?alt=media&token=f2affd4d-0f76-4b0d-a3ad-410eb417ce37");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm6%2FPOM%20pie%20mid%2017-18.pdf?alt=media&token=836bd410-52d0-48b8-ae5c-05f8e83372ab");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fm6%2FTool%20pie%20mid%2016-17.pdf?alt=media&token=aeebad2c-dc67-48bc-9824-eabdecd924b0");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2FMD%20II%2019-20%20mid.pdf?alt=media&token=51e668bd-2f69-4c4b-86eb-c3c124f716cf");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2Fcam%20mid%2019-20.pdf?alt=media&token=e92dc303-698b-4105-b618-eb7a1b5ecc5a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm6%2Fmst%20II%20mid%2019-20.pdf?alt=media&token=4cedd698-65a6-4b60-b9a0-4335459ac574");


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
                buttonText.add("Basic Electrical 15-16");
                buttonText.add("Material Science 15-16");
                buttonText.add("Material Science 16-17");
                buttonText.add("Material Science 17-18");
                buttonText.add("Material Science 18-19");
                buttonText.add("NMST 15-16");
                buttonText.add("NMST 16-17");
                buttonText.add("SOM 15-16");
                buttonText.add("Thermodynamics 15-16");
                buttonText.add("Thermodynamics");
                buttonText.add("Thermodynamics");
                buttonText.add("NMST 17-18");
                buttonText.add("NMST 17-18");
                buttonText.add("NMST 18-19");
                buttonText.add("Quality 15-16");

                targetFile.add(new File(folder,"BEE 15-16 end.pdf"));
                targetFile.add(new File(folder,"MSE 15-16 end+.pdf"));
                targetFile.add(new File(folder,"MSE 16-17 end!.pdf"));
                targetFile.add(new File(folder,"MSE 17-18 end+.pdf"));
                targetFile.add(new File(folder,"MSE 18-19end+.pdf"));
                targetFile.add(new File(folder,"NMST 15-16 end.pdf"));
                targetFile.add(new File(folder,"MNST 16-17 end.pdf"));
                targetFile.add(new File(folder,"Som 15-16 end.pdf"));
                targetFile.add(new File(folder,"Thermo 15-16 end.pdf"));
                targetFile.add(new File(folder,"Thermo end.pdf"));
                targetFile.add(new File(folder,"Thermo end1.pdf"));
                targetFile.add(new File(folder,"nmst 17&18 end.pdf"));
                targetFile.add(new File(folder,"nmst 17-18 end+.pdf"));
                targetFile.add(new File(folder,"nmst 18-19 end+.pdf"));
                targetFile.add(new File(folder,"Quality 15-16 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FBEE%2015-16%20end.pdf?alt=media&token=2a9c30fb-67ad-4a4e-9004-423804b143c6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2015-16%20end%2B.pdf?alt=media&token=ca15b438-6d35-4e2a-92a8-fbde4a00131a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2016-17%20end!.pdf?alt=media&token=5f55125b-df1e-4409-96ad-5385a6626df3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2017-18%20end%2B.pdf?alt=media&token=bedf3fd8-2526-4a41-9821-94c5c48232e1");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMSE%2018-19end%2B.pdf?alt=media&token=7a0515c4-990e-4e91-8c8f-ef5fe7a038a6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FNMST%2015-16%20end.pdf?alt=media&token=0d7723b0-4b2f-4d0f-99ed-a7b264c0c45a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FMNST%2016-17%20end.pdf?alt=media&token=ce9e84fa-bea9-4f76-b7c5-b38f756f6ce6");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FSom%2015-16%20end.pdf?alt=media&token=26f193ca-d107-433e-88b0-840fc91de09a");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%2015-16%20end.pdf?alt=media&token=4ec50ef9-52ba-47ed-ae86-4858b477abc3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%20end.pdf?alt=media&token=ba2447b1-3adb-4016-b7d7-081e12e274c8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2FThermo%20end1.pdf?alt=media&token=307a135a-833d-4f50-9bda-efc0919f0d06");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2Fnmst%2017%2618%20end.pdf?alt=media&token=f444c71c-367c-4df5-9e15-3f1ed9644751");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2Fnmst%2017-18%20end%2B.pdf?alt=media&token=1a60de7d-d6fe-4c04-adca-e856b13c8fad");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe3%2Fnmst%2018-19%20end%2B.pdf?alt=media&token=8e08e030-aeff-432f-b46d-07a739283607");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fe3%2FQuality%2015-16%20end.pdf?alt=media&token=68c7af06-89df-48cd-9dec-01158e51d022");


                break;
            }
            case "END SEM-4":{
                buttonText.add("Automatic Control 15-16");
                buttonText.add("Fluid Mechanics 15-16");
                buttonText.add("Fluid Mechanics 16-17");
                buttonText.add("Industrial 15-16");
                buttonText.add("Industrial 16-17");
                buttonText.add("Measurement 15-16");
                buttonText.add("Measurement 16-17");

                targetFile.add(new File(folder,"AC 15-16 end.pdf"));
                targetFile.add(new File(folder,"Fluid 15-16 end.pdf"));
                targetFile.add(new File(folder,"Fluid 16-17 end.pdf"));
                targetFile.add(new File(folder,"IE 15-16 end.pdf"));
                targetFile.add(new File(folder,"IE 16-17 end.pdf"));
                targetFile.add(new File(folder,"MM 15-16 end.pdf"));
                targetFile.add(new File(folder,"MM 16-17 end.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FAC%2015-16%20end.pdf?alt=media&token=06c3a453-e4d1-43d3-b841-38f5b090f6cc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FFluid%2015-16%20end.pdf?alt=media&token=b189f436-1ae3-498b-9a0b-040661b601fb");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FFluid%2016-17%20end.pdf?alt=media&token=b6ad8135-aade-497e-b16d-441dce722b84");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FIE%2015-16%20end.pdf?alt=media&token=da18c49b-b69b-4f71-85e3-40320ba0a857");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FIE%2016-17%20end.pdf?alt=media&token=a4750f1d-232e-471e-baac-8c68bfcc9927");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FMM%2015-16%20end.pdf?alt=media&token=14565f8b-af4b-4deb-ab7f-1a58ca642f12");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe4%2FMM%2016-17%20end.pdf?alt=media&token=ab5ef1ed-afc3-456e-a488-82f7f44f1038");


                break;
            }
            case "END SEM-5":{
                buttonText.add("CAD 16-17");
                buttonText.add("MD 16-17");
                buttonText.add("MST 16-17");
                buttonText.add("POM 16-17");
                buttonText.add("OR 16-17");
                buttonText.add("MD 19-20");
                buttonText.add("CAD 19-20");
                buttonText.add("MST 19-20");
                buttonText.add("POM 19-20");

                targetFile.add(new File(folder,"CAD 16-17 end.pdf"));
                targetFile.add(new File(folder,"MD 16-17 end.pdf"));
                targetFile.add(new File(folder,"MST 16-17 end.pdf"));
                targetFile.add(new File(folder,"POM 16-17 end.pdf"));
                targetFile.add(new File(folder,"OR 16-17 end.pdf"));
                targetFile.add(new File(folder,"MD 1 end 19-20.pdf"));
                targetFile.add(new File(folder,"cad end 19-20.pdf"));
                targetFile.add(new File(folder,"mst 1 end 19-20.pdf"));
                targetFile.add(new File(folder,"pom end 19-20.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FCAD%2016-17%20end.pdf?alt=media&token=c404332a-fd27-4248-8b8e-36f9ad04169d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FMD%2016-17%20end.pdf?alt=media&token=426a7203-4eac-4521-98a6-fc4b44d765ac");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FMST%2016-17%20end.pdf?alt=media&token=4537f7d9-c218-48fd-9781-f6492dc56bfa");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FPOM%2016-17%20end.pdf?alt=media&token=4a1eab26-49f2-4876-b2db-3c2fc0c6feb5");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fe5%2FOR%2016-17%20end.pdf?alt=media&token=841e97fe-5e2d-4bef-b271-fec04b677ce7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2FMD%201%20end%2019-20.pdf?alt=media&token=b5a162fa-9e12-4d34-ba11-284335b74bb2");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2Fcad%20end%2019-20.pdf?alt=media&token=25de51f4-4718-41ac-9d33-7e5b583b2a75");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2Fmst%201%20end%2019-20.pdf?alt=media&token=ea8db3f6-d2f9-450a-89ec-2adc05d9ab8d");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe5%2Fpom%20end%2019-20.pdf?alt=media&token=b989cc04-8255-49eb-898e-5977983bc643");


                break;
            }
            case "END SEM-6":{
                buttonText.add("CAM 16-17");
                buttonText.add("MD 17-18");
                buttonText.add("MD 16-17");
                buttonText.add("POM 17-18");
                buttonText.add("POM 16-17");

                targetFile.add(new File(folder,"CAM end 16-17.pdf"));
                targetFile.add(new File(folder,"MD II end 17-18.pdf"));
                targetFile.add(new File(folder,"MD end 16-17.pdf"));
                targetFile.add(new File(folder,"POM 17-18 end pie.pdf"));
                targetFile.add(new File(folder,"POM pie end 16-17.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe6%2FCAM%20end%2016-17.pdf?alt=media&token=41c2411c-8995-4155-a8b0-5982c79cb4bd");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe6%2FMD%20II%20end%2017-18.pdf?alt=media&token=a9a6e97c-f581-4c5c-89e8-ab9332333ec3");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fe6%2FMD%20end%2016-17.pdf?alt=media&token=84c18947-56ae-4274-a829-0937394c500c");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fe6%2FPOM%2017-18%20end%20pie.pdf?alt=media&token=64504fb9-8274-4620-85ef-17caadfdec84");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/pie%2Fe6%2FPOM%20pie%20end%2016-17.pdf?alt=media&token=361e783a-da75-4c67-8712-74bc20df92a4");


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