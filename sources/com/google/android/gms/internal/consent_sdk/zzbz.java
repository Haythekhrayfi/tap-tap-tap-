package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbz {
    private final Context zza;
    private final Map<String, SharedPreferences.Editor> zzb = new HashMap();

    public zzbz(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor zzd(String str) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, this.zza.getSharedPreferences(str, 0).edit());
        }
        return this.zzb.get(str);
    }

    public final void zzb() {
        Iterator<SharedPreferences.Editor> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
    }

    public final boolean zzc(String str, Object obj) {
        String str2;
        float fFloatValue;
        zzby zzbyVarZza = zzca.zza(this.zza, str);
        if (zzbyVarZza == null) {
            return false;
        }
        SharedPreferences.Editor editorZzd = zzd(zzbyVarZza.zza);
        if (obj instanceof Integer) {
            editorZzd.putInt(zzbyVarZza.zzb, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorZzd.putLong(zzbyVarZza.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            str2 = zzbyVarZza.zzb;
            fFloatValue = ((Double) obj).floatValue();
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Boolean) {
                    editorZzd.putBoolean(zzbyVarZza.zzb, ((Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                editorZzd.putString(zzbyVarZza.zzb, (String) obj);
                return true;
            }
            str2 = zzbyVarZza.zzb;
            fFloatValue = ((Float) obj).floatValue();
        }
        editorZzd.putFloat(str2, fFloatValue);
        return true;
    }
}
