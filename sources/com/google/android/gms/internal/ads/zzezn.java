package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezn {
    public final String zzA;
    public final zzbwp zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfal zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbrz zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbvg zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzezs zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:222:0x05db A[PHI: r23 r75
  0x05db: PHI (r23v76 java.util.List) = 
  (r23v5 java.util.List)
  (r23v6 java.util.List)
  (r23v7 java.util.List)
  (r23v8 java.util.List)
  (r23v9 java.util.List)
  (r23v10 java.util.List)
  (r23v11 java.util.List)
  (r23v12 java.util.List)
  (r23v13 java.util.List)
  (r23v14 java.util.List)
  (r23v15 java.util.List)
  (r23v16 java.util.List)
  (r23v17 java.util.List)
  (r23v18 java.util.List)
  (r23v19 java.util.List)
  (r23v20 java.util.List)
  (r23v21 java.util.List)
  (r23v22 java.util.List)
  (r23v23 java.util.List)
  (r23v24 java.util.List)
  (r23v25 java.util.List)
  (r23v26 java.util.List)
  (r23v27 java.util.List)
  (r23v28 java.util.List)
  (r23v29 java.util.List)
  (r23v30 java.util.List)
  (r23v31 java.util.List)
  (r23v32 java.util.List)
  (r23v33 java.util.List)
  (r23v34 java.util.List)
  (r23v35 java.util.List)
  (r23v36 java.util.List)
  (r23v37 java.util.List)
  (r23v38 java.util.List)
  (r23v39 java.util.List)
  (r23v40 java.util.List)
  (r23v41 java.util.List)
  (r23v42 java.util.List)
  (r23v43 java.util.List)
  (r23v44 java.util.List)
  (r23v45 java.util.List)
  (r23v46 java.util.List)
  (r23v47 java.util.List)
  (r23v48 java.util.List)
  (r23v49 java.util.List)
  (r23v50 java.util.List)
  (r23v51 java.util.List)
  (r23v52 java.util.List)
  (r23v53 java.util.List)
  (r23v54 java.util.List)
  (r23v55 java.util.List)
  (r23v56 java.util.List)
  (r23v57 java.util.List)
  (r23v58 java.util.List)
  (r23v59 java.util.List)
  (r23v60 java.util.List)
  (r23v61 java.util.List)
  (r23v62 java.util.List)
  (r23v63 java.util.List)
  (r23v64 java.util.List)
  (r23v65 java.util.List)
  (r23v66 java.util.List)
  (r23v67 java.util.List)
  (r23v68 java.util.List)
  (r23v69 java.util.List)
  (r23v70 java.util.List)
  (r23v71 java.util.List)
  (r23v72 java.util.List)
  (r23v73 java.util.List)
  (r23v74 java.util.List)
  (r23v77 java.util.List)
 binds: [B:220:0x05d6, B:217:0x05c5, B:214:0x05b4, B:211:0x05a3, B:208:0x0592, B:205:0x0581, B:202:0x056f, B:199:0x055d, B:196:0x054b, B:193:0x0539, B:190:0x0527, B:187:0x0515, B:184:0x0503, B:181:0x04f1, B:178:0x04df, B:175:0x04cd, B:172:0x04bb, B:169:0x04a9, B:166:0x0497, B:163:0x0485, B:160:0x0473, B:157:0x0461, B:154:0x0450, B:151:0x043e, B:148:0x042c, B:145:0x041a, B:142:0x0408, B:139:0x03f6, B:136:0x03e4, B:133:0x03d2, B:130:0x03c1, B:127:0x03af, B:124:0x039e, B:121:0x038c, B:118:0x037a, B:115:0x0368, B:112:0x0356, B:109:0x0344, B:106:0x0332, B:103:0x0320, B:100:0x030e, B:97:0x02fc, B:94:0x02ea, B:91:0x02d8, B:88:0x02c6, B:85:0x02b4, B:82:0x02a2, B:79:0x0290, B:76:0x027e, B:73:0x026d, B:70:0x025b, B:67:0x0249, B:64:0x0237, B:61:0x0225, B:58:0x0214, B:55:0x0202, B:52:0x01f0, B:49:0x01de, B:46:0x01cc, B:43:0x01ba, B:40:0x01a8, B:37:0x0196, B:34:0x0185, B:31:0x0173, B:28:0x0162, B:25:0x0150, B:22:0x013e, B:19:0x012c, B:16:0x011a, B:13:0x0108, B:11:0x00f6] A[DONT_GENERATE, DONT_INLINE]
  0x05db: PHI (r75v72 java.util.List) = 
  (r75v1 java.util.List)
  (r75v2 java.util.List)
  (r75v3 java.util.List)
  (r75v4 java.util.List)
  (r75v5 java.util.List)
  (r75v6 java.util.List)
  (r75v7 java.util.List)
  (r75v8 java.util.List)
  (r75v9 java.util.List)
  (r75v10 java.util.List)
  (r75v11 java.util.List)
  (r75v12 java.util.List)
  (r75v13 java.util.List)
  (r75v14 java.util.List)
  (r75v15 java.util.List)
  (r75v16 java.util.List)
  (r75v17 java.util.List)
  (r75v18 java.util.List)
  (r75v19 java.util.List)
  (r75v20 java.util.List)
  (r75v21 java.util.List)
  (r75v22 java.util.List)
  (r75v23 java.util.List)
  (r75v24 java.util.List)
  (r75v25 java.util.List)
  (r75v26 java.util.List)
  (r75v27 java.util.List)
  (r75v28 java.util.List)
  (r75v29 java.util.List)
  (r75v30 java.util.List)
  (r75v31 java.util.List)
  (r75v32 java.util.List)
  (r75v33 java.util.List)
  (r75v34 java.util.List)
  (r75v35 java.util.List)
  (r75v36 java.util.List)
  (r75v37 java.util.List)
  (r75v38 java.util.List)
  (r75v39 java.util.List)
  (r75v40 java.util.List)
  (r75v41 java.util.List)
  (r75v42 java.util.List)
  (r75v43 java.util.List)
  (r75v44 java.util.List)
  (r75v45 java.util.List)
  (r75v46 java.util.List)
  (r75v47 java.util.List)
  (r75v48 java.util.List)
  (r75v49 java.util.List)
  (r75v50 java.util.List)
  (r75v51 java.util.List)
  (r75v52 java.util.List)
  (r75v53 java.util.List)
  (r75v54 java.util.List)
  (r75v55 java.util.List)
  (r75v56 java.util.List)
  (r75v57 java.util.List)
  (r75v58 java.util.List)
  (r75v59 java.util.List)
  (r75v60 java.util.List)
  (r75v61 java.util.List)
  (r75v62 java.util.List)
  (r75v63 java.util.List)
  (r75v64 java.util.List)
  (r75v65 java.util.List)
  (r75v66 java.util.List)
  (r75v67 java.util.List)
  (r75v68 java.util.List)
  (r75v69 java.util.List)
  (r75v70 java.util.List)
  (r75v73 java.util.List)
 binds: [B:220:0x05d6, B:217:0x05c5, B:214:0x05b4, B:211:0x05a3, B:208:0x0592, B:205:0x0581, B:202:0x056f, B:199:0x055d, B:196:0x054b, B:193:0x0539, B:190:0x0527, B:187:0x0515, B:184:0x0503, B:181:0x04f1, B:178:0x04df, B:175:0x04cd, B:172:0x04bb, B:169:0x04a9, B:166:0x0497, B:163:0x0485, B:160:0x0473, B:157:0x0461, B:154:0x0450, B:151:0x043e, B:148:0x042c, B:145:0x041a, B:142:0x0408, B:139:0x03f6, B:136:0x03e4, B:133:0x03d2, B:130:0x03c1, B:127:0x03af, B:124:0x039e, B:121:0x038c, B:118:0x037a, B:115:0x0368, B:112:0x0356, B:109:0x0344, B:106:0x0332, B:103:0x0320, B:100:0x030e, B:97:0x02fc, B:94:0x02ea, B:91:0x02d8, B:88:0x02c6, B:85:0x02b4, B:82:0x02a2, B:79:0x0290, B:76:0x027e, B:73:0x026d, B:70:0x025b, B:67:0x0249, B:64:0x0237, B:61:0x0225, B:58:0x0214, B:55:0x0202, B:52:0x01f0, B:49:0x01de, B:46:0x01cc, B:43:0x01ba, B:40:0x01a8, B:37:0x0196, B:34:0x0185, B:31:0x0173, B:28:0x0162, B:25:0x0150, B:22:0x013e, B:19:0x012c, B:16:0x011a, B:13:0x0108, B:11:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x066d  */
    public zzezn(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        byte b10;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfsc zzfscVarZzl = zzfsc.zzl();
        jsonReader.beginObject();
        JSONObject jSONObjectZzh = jSONObject2;
        JSONObject jSONObjectZzh2 = jSONObject3;
        JSONObject jSONObjectZzh3 = jSONObject4;
        JSONObject jSONObjectZzh4 = jSONObject5;
        JSONObject jSONObjectZzh5 = jSONObject6;
        List listZzd = zzfscVarZzl;
        int iZzd = -1;
        int iNextInt = -1;
        zzezs zzezsVar = null;
        zzbwp zzbwpVarZza = null;
        zzbrz zzbrzVarZza = null;
        com.google.android.gms.ads.internal.client.zzs zzsVarZza = null;
        String strNextString = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        List listZzd2 = listEmptyList11;
        List listZza = listEmptyList12;
        List listZzd3 = listEmptyList13;
        List listZza2 = listEmptyList14;
        JSONObject jSONObjectZzh6 = jSONObject;
        zzbvg zzbvgVarZza = null;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        int iZzb = 0;
        int iZzc = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_name")) {
                        b10 = -1;
                    } else {
                        b10 = 59;
                    }
                    break;
                case -1980587809:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_signals")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.FS;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("omid_settings")) {
                        b10 = -1;
                    } else {
                        b10 = 41;
                    }
                    break;
                case -1871425831:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("recursive_server_response_data")) {
                        b10 = -1;
                    } else {
                        b10 = 69;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("play_prewarm_options")) {
                        b10 = -1;
                    } else {
                        b10 = 49;
                    }
                    break;
                case -1776946669:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_name")) {
                        b10 = -1;
                    } else {
                        b10 = 57;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_interscroller")) {
                        b10 = -1;
                    } else {
                        b10 = 53;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("backend_query_id")) {
                        b10 = -1;
                    } else {
                        b10 = 47;
                    }
                    break;
                case -1550155393:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("nofill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_custom_close_blocked")) {
                        b10 = -1;
                    } else {
                        b10 = 35;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("orientation")) {
                        b10 = -1;
                    } else {
                        b10 = 37;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("enable_omid")) {
                        b10 = -1;
                    } else {
                        b10 = 39;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b10 = -1;
                    } else {
                        b10 = 67;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("showable_impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 44;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_cover")) {
                        b10 = -1;
                    } else {
                        b10 = 54;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapters")) {
                        b10 = -1;
                    } else {
                        b10 = 20;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("test_mode_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 34;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("extras")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.GS;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_event_value")) {
                        b10 = -1;
                    } else {
                        b10 = 51;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.RS;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_type")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_scroll_aware")) {
                        b10 = -1;
                    } else {
                        b10 = 43;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("fill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allocation_id")) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_complete_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("active_view")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.EM;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("valid_from_timestamp")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -972056451:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_id")) {
                        b10 = -1;
                    } else {
                        b10 = 60;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("click_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("safe_browsing")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.SUB;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("imp_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rtb_native_required_assets")) {
                        b10 = -1;
                    } else {
                        b10 = 62;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 38;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_close_time_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 45;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("content_url")) {
                        b10 = -1;
                    } else {
                        b10 = 64;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_close_button_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 50;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b10 = -1;
                    } else {
                        b10 = 65;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("watermark")) {
                        b10 = -1;
                    } else {
                        b10 = 46;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("native_required_asset_viewability")) {
                        b10 = -1;
                    } else {
                        b10 = 63;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_offline_ad")) {
                        b10 = -1;
                    } else {
                        b10 = 61;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                case 3107:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad")) {
                        b10 = -1;
                    } else {
                        b10 = 18;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(FacebookMediationAdapter.KEY_ID)) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("data")) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case 37109963:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("request_id")) {
                        b10 = -1;
                    } else {
                        b10 = 68;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_test_label")) {
                        b10 = -1;
                    } else {
                        b10 = 33;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("qdata")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.CAN;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_load_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_closable_area_disabled")) {
                        b10 = -1;
                    } else {
                        b10 = 36;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_dialog_string")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.ESC;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("container_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rewards")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1141602460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapter_response_info_key")) {
                        b10 = -1;
                    } else {
                        b10 = 56;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("cache_hit_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 66;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b10 = -1;
                    } else {
                        b10 = Ascii.US;
                    }
                    break;
                case 1437255331:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_id")) {
                        b10 = -1;
                    } else {
                        b10 = 58;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("bid_response")) {
                        b10 = -1;
                    } else {
                        b10 = 40;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_start_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_network_class_name")) {
                        b10 = -1;
                    } else {
                        b10 = 55;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_reward_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("use_third_party_container_height")) {
                        b10 = -1;
                    } else {
                        b10 = 48;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("renderers")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 42;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rule_line_external_id")) {
                        b10 = -1;
                    } else {
                        b10 = 52;
                    }
                    break;
                case 2072888499:
                    list2 = listEmptyList10;
                    list = listEmptyList9;
                    if (!str.equals("manual_tracking_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzb = zzb(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZzc = zzc(jsonReader.nextInt());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 7:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 8:
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 9:
                    strNextString19 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 10:
                    strNextString18 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 11:
                    zzbvgVarZza = zzbvg.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 12:
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 13:
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    break;
                case 14:
                    listEmptyList10 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 15:
                    listZzd2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt2 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza = zzezo.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzezsVar = new zzezs(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza2 = zzezo.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzd3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzh6 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzbwpVarZza = zzbwp.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString5 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 29:
                    jSONObjectZzh2 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 37:
                    iZzd = zzd(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 38:
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 40:
                    strNextString6 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 41:
                    jSONObjectZzh3 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 44:
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 45:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 46:
                    strNextString7 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 47:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 49:
                    zzbrzVarZza = zzbrz.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 51:
                    zzsVarZza = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 52:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 54:
                    jSONObjectZzh4 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 55:
                    strNextString10 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 56:
                    strNextString17 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 57:
                    if (((Boolean) zzbbm.zzgB.zzl()).booleanValue()) {
                        strNextString11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 58:
                    if (((Boolean) zzbbm.zzgB.zzl()).booleanValue()) {
                        strNextString12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 59:
                    if (((Boolean) zzbbm.zzgB.zzl()).booleanValue()) {
                        strNextString13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 60:
                    if (((Boolean) zzbbm.zzgB.zzl()).booleanValue()) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 61:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 62:
                    jSONObjectZzh5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 66:
                    listZzd = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 68:
                    strNextString15 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 69:
                    strNextString16 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzb;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzg = listEmptyList4;
        this.zzf = iZzc;
        this.zzh = listEmptyList5;
        this.zzi = listEmptyList6;
        this.zzj = listEmptyList7;
        this.zzk = strNextString19;
        this.zzl = strNextString18;
        this.zzm = zzbvgVarZza;
        this.zzn = listEmptyList8;
        this.zzo = listEmptyList9;
        this.zzp = listEmptyList10;
        this.zzq = listZzd2;
        this.zzr = iNextInt2;
        this.zzs = listZza;
        this.zzt = zzezsVar;
        this.zzu = listZzd3;
        this.zzv = listZza2;
        this.zzx = strNextString2;
        this.zzw = jSONObjectZzh6;
        this.zzy = strNextString3;
        this.zzz = strNextString4;
        this.zzA = string;
        this.zzB = zzbwpVarZza;
        this.zzC = strNextString5;
        this.zzD = jSONObjectZzh;
        this.zzE = jSONObjectZzh2;
        this.zzK = zNextBoolean;
        this.zzL = zNextBoolean2;
        this.zzM = zNextBoolean3;
        this.zzN = zNextBoolean4;
        this.zzO = zNextBoolean5;
        this.zzP = zNextBoolean6;
        this.zzQ = zNextBoolean7;
        this.zzR = iZzd;
        this.zzS = iNextInt3;
        this.zzU = zNextBoolean8;
        this.zzV = strNextString6;
        this.zzW = new zzfal(jSONObjectZzh3);
        this.zzX = zNextBoolean9;
        this.zzY = zNextBoolean10;
        this.zzZ = iNextInt4;
        this.zzaa = strNextString7;
        this.zzab = iNextInt;
        this.zzac = strNextString8;
        this.zzad = zNextBoolean11;
        this.zzae = zzbrzVarZza;
        this.zzaf = zzsVarZza;
        this.zzag = strNextString9;
        this.zzah = zNextBoolean12;
        this.zzai = jSONObjectZzh4;
        this.zzF = strNextString10;
        this.zzG = strNextString11;
        this.zzH = strNextString12;
        this.zzI = strNextString13;
        this.zzJ = strNextString14;
        this.zzaj = zNextBoolean13;
        this.zzak = jSONObjectZzh5;
        this.zzal = zNextBoolean14;
        this.zzam = strNextString;
        this.zzan = zNextBoolean15;
        this.zze = listZzd;
        this.zzT = zNextBoolean16;
        this.zzao = strNextString15;
        this.zzap = strNextString16;
        this.zzaq = strNextString17;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (PluginErrorDetails.Platform.NATIVE.equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i10) {
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
