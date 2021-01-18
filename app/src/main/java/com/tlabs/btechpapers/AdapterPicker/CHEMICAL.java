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
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid.pdf?alt=media&token=21f69862-b165-4b01-8c09-d91e3fa44144");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2FThermo%20mid1.pdf?alt=media&token=cf85198b-5ef2-4577-96c2-e18116e26bb8");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2015-16%20mid%2B.pdf?alt=media&token=3c9345ae-183b-40ac-ba34-c437eb5173bc");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2016-17%20mid.pdf?alt=media&token=e0c8c7dc-5810-4686-8083-6279f7bc0d54");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fnmst%2017-18%20mid%2B.pdf?alt=media&token=55762bf6-db58-4145-84ea-1f21148386f7");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm3%2Fthermodynamics_18-19_mid%2B%5B1%5D.pdf?alt=media&token=c3feddce-986b-4752-a82e-2e466a83a7ba");

                break;
            }
            case "MID SEM-4":{

                break;
            }
            case "MID SEM-5":{
                buttonText.add("POM 16-17");
                buttonText.add("POM 17-18");
                buttonText.add("POM 18-19");

                targetFile.add(new File(folder,"POM mid 16-17.pdf"));
                targetFile.add(new File(folder,"POM mid 17-18.pdf"));
                targetFile.add(new File(folder,"pom 18-19 mid.pdf"));

                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2016-17.pdf?alt=media&token=bb79865e-5cfc-4e0b-af21-190c82dbb273");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2FPOM%20mid%2017-18.pdf?alt=media&token=be0f2904-3409-4c8a-b8e5-d48e69ecb2a9");
                downloadURL.add("https://firebasestorage.googleapis.com/v0/b/btech-papers.appspot.com/o/mechanical%2Fm5%2Fpom%2018-19%20mid.pdf?alt=media&token=53544fa4-d6b7-4354-ae5b-db174a675b9c");



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

                break;
            }
            case "END SEM-4":{

                break;
            }
            case "END SEM-5":{
                buttonText.add("POM 16-17");

                targetFile.add(new File(folder,"POM 16-17 end.pdf"));

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
