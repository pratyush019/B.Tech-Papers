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

package com.tlabs.btechpapers.HelperClasses;

import android.content.Context;

import com.tlabs.btechpapers.AdapterPicker.BIOTECH;
import com.tlabs.btechpapers.AdapterPicker.CHEMICAL;
import com.tlabs.btechpapers.AdapterPicker.CIVIL;
import com.tlabs.btechpapers.AdapterPicker.CSE;
import com.tlabs.btechpapers.AdapterPicker.ECE;
import com.tlabs.btechpapers.AdapterPicker.ELECTRICAL;
import com.tlabs.btechpapers.AdapterPicker.IT;
import com.tlabs.btechpapers.AdapterPicker.MECHANICAL;
import com.tlabs.btechpapers.AdapterPicker.PIE;
import com.tlabs.btechpapers.Adapters.PaperAdapter;

public class RouteProvider {
    private RouteProvider(){}

    public static PaperAdapter getCurrentAdapter(String branch, String sem, Context context){
        PaperAdapter adapter=null;
        switch (branch){
            case "BIOTECH":{
                adapter=BIOTECH.finalAdapter(context,sem);
                break;
            }
            case "MECHANICAL": {
                adapter= MECHANICAL.finalAdapter(context, sem);
                break;
            }
            case "CSE":{
                adapter= CSE.finalAdapter(context, sem);
                break;
            }
            case "ECE":{
               adapter= ECE.finalAdapter(context, sem);
                break;
            }
            case "ELECTRICAL":{
               adapter=ELECTRICAL.finalAdapter(context, sem);
                break;
            }
            case "PIE":{
                adapter=PIE.finalAdapter(context, sem);
                break;
            }
            case "CHEMICAL":{
                adapter=CHEMICAL.finalAdapter(context, sem);
                break;
            }
            case "IT":{
                adapter=IT.finalAdapter(context, sem);
                break;
            }
            case "CIVIL":{
                adapter=CIVIL.finalAdapter(context, sem);
                break;
            }
        }
        return adapter;
    }
}
