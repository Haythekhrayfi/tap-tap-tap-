package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List<String> zzd = Collections.emptyList();
    public List<zzbv> zze = Collections.emptyList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    public static zzbw zza(JsonReader jsonReader) throws IOException {
        byte b10;
        byte b11;
        byte b12;
        int i10;
        zzbw zzbwVar = new zzbw();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            byte b13 = 0;
            int i11 = 5;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    b10 = 0;
                    break;
                case "error_message":
                    b10 = 3;
                    break;
                case "consent_form_base_url":
                    b10 = 2;
                    break;
                case "actions":
                    b10 = 5;
                    break;
                case "request_info_keys":
                    b10 = 4;
                    break;
                case "consent_form_payload":
                    b10 = 1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                String strNextString = jsonReader.nextString();
                switch (strNextString.hashCode()) {
                    case -2058725357:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT") ? (byte) -1 : (byte) 4;
                        break;
                    case -1969035850:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_ERROR") ? (byte) -1 : (byte) 6;
                        break;
                    case -1263695752:
                        if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                            b13 = -1;
                        }
                        break;
                    case -954325659:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") ? (byte) -1 : (byte) 2;
                        break;
                    case -918677260:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION") ? (byte) -1 : (byte) 7;
                        break;
                    case 429411856:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_SUFFICIENT") ? (byte) -1 : (byte) 3;
                        break;
                    case 467888915:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") ? (byte) -1 : (byte) 1;
                        break;
                    case 1725474845:
                        b13 = !strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED") ? (byte) -1 : (byte) 5;
                        break;
                    default:
                        b13 = -1;
                        break;
                }
                switch (b13) {
                    case 0:
                        i11 = 1;
                        zzbwVar.zzf = i11;
                        break;
                    case 1:
                        i11 = 2;
                        zzbwVar.zzf = i11;
                        break;
                    case 2:
                        i11 = 3;
                        zzbwVar.zzf = i11;
                        break;
                    case 3:
                        i11 = 4;
                        zzbwVar.zzf = i11;
                        break;
                    case 4:
                        zzbwVar.zzf = i11;
                        break;
                    case 5:
                        i11 = 6;
                        zzbwVar.zzf = i11;
                        break;
                    case 6:
                        i11 = 7;
                        zzbwVar.zzf = i11;
                        break;
                    case 7:
                        i11 = 8;
                        zzbwVar.zzf = i11;
                        break;
                    default:
                        throw new IOException(strNextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
                }
            } else if (b10 == 1) {
                zzbwVar.zza = jsonReader.nextString();
            } else if (b10 == 2) {
                zzbwVar.zzb = jsonReader.nextString();
            } else if (b10 != 3) {
                if (b10 == 4) {
                    zzbwVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbwVar.zzd.add(jsonReader.nextString());
                    }
                } else if (b10 != 5) {
                    jsonReader.skipValue();
                } else {
                    zzbwVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbv zzbvVar = new zzbv();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                    b11 = 0;
                                } else {
                                    b11 = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b11 = 1;
                            } else {
                                b11 = -1;
                            }
                            if (b11 == 0) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b12 = 0;
                                        } else {
                                            b12 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b12 = 1;
                                    } else {
                                        b12 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b12 = 2;
                                } else {
                                    b12 = -1;
                                }
                                if (b12 == 0) {
                                    i10 = 1;
                                } else if (b12 == 1) {
                                    i10 = 2;
                                } else {
                                    if (b12 != 2) {
                                        throw new IOException(strNextString2.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
                                    }
                                    i10 = 3;
                                }
                                zzbvVar.zzb = i10;
                            } else if (b11 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzbvVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzbwVar.zze.add(zzbvVar);
                    }
                }
                jsonReader.endArray();
            } else {
                zzbwVar.zzc = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        return zzbwVar;
    }
}
