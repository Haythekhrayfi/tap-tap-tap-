package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam {
    private final Application zza;
    private final SharedPreferences zzb;
    private final Set<String> zzc;

    public zzam(Application application) {
        this.zza = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzb = sharedPreferences;
        this.zzc = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzb.getInt("consent_status", 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r3 r4
  0x0037: PHI (r3v6 java.lang.String) = (r3v4 java.lang.String), (r3v9 java.lang.String), (r3v11 java.lang.String) binds: [B:8:0x0035, B:15:0x0062, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String), (r4v12 java.lang.String) binds: [B:8:0x0035, B:15:0x0062, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Map<String, String> zzb() {
        String strValueOf;
        String str;
        String str2;
        String string;
        Application application = this.zza;
        Set<String> stringSet = this.zzb.getStringSet("stored_info", Collections.emptySet());
        HashMap map = new HashMap();
        for (String str3 : stringSet) {
            zzby zzbyVarZza = zzca.zza(application, str3);
            if (zzbyVarZza == null) {
                strValueOf = String.valueOf(str3);
                str = "Fetching request info: failed for key: ";
                if (strValueOf.length() != 0) {
                    str2 = str.concat(strValueOf);
                } else {
                    str2 = new String("Fetching request info: failed for key: ");
                }
                Log.d("UserMessagingPlatform", str2);
            } else {
                Object obj = application.getSharedPreferences(zzbyVarZza.zza, 0).getAll().get(zzbyVarZza.zzb);
                if (obj == null) {
                    strValueOf = String.valueOf(str3);
                    str = "Stored info not exists: ";
                    if (strValueOf.length() != 0) {
                        str2 = str.concat(strValueOf);
                    } else {
                        str2 = new String("Stored info not exists: ");
                    }
                    Log.d("UserMessagingPlatform", str2);
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        strValueOf = String.valueOf(str3);
                        str = "Failed to fetch stored info: ";
                        if (strValueOf.length() != 0) {
                            str2 = str.concat(strValueOf);
                        } else {
                            str2 = new String("Failed to fetch stored info: ");
                        }
                        Log.d("UserMessagingPlatform", str2);
                    }
                    map.put(str3, string);
                }
            }
        }
        return map;
    }

    public final Set<String> zzc() {
        return this.zzc;
    }

    public final void zzd() {
        zzca.zzb(this.zza, this.zzc);
        this.zzc.clear();
        this.zzb.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.zzb.edit().putStringSet("written_values", this.zzc).apply();
    }

    public final void zzf(int i10) {
        this.zzb.edit().putInt("consent_status", i10).apply();
    }

    public final void zzg(Set<String> set) {
        this.zzb.edit().putStringSet("stored_info", set).apply();
    }
}
