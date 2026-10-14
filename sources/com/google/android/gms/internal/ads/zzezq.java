package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezq {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzezp zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;

    public zzezq(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        zzezp zzezpVar = null;
        long jNextLong = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextString4;
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString5 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str2 = strNextString3;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhQ)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzezpVar = new zzezp(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzej)).booleanValue() && (strNextName == "topics_should_record_observation" || (strNextName != null && strNextName.equals("topics_should_record_observation")))) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString4 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgD)).booleanValue()) {
                            try {
                                Bundle bundleZza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                                if (bundleZza != null) {
                                    bundle = bundleZza;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziN)).booleanValue()) {
                                strNextString3 = jsonReader.nextString();
                            }
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziN)).booleanValue()) {
                                strNextString2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.skipValue();
                    }
                    strNextString3 = str2;
                }
                strNextString4 = str;
                strNextString3 = str2;
            }
            strNextString4 = str;
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzc = iNextInt;
        this.zzb = strNextString5;
        this.zzd = strNextString6;
        this.zze = iNextInt2;
        this.zzf = jNextLong;
        this.zzi = zzezpVar;
        this.zzg = zNextBoolean;
        this.zzh = strNextString;
        this.zzj = bundle;
        this.zzk = strNextString2;
        this.zzl = strNextString3;
        this.zzm = strNextString4;
    }
}
