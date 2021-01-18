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
