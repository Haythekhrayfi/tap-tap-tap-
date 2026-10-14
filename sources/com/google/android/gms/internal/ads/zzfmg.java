package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmg {
    private static zzfmg zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfmg(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfmg zzb(Context context) {
        if (zza == null) {
            zza = new zzfmg(context);
        }
        return zza;
    }

    public final long zza(String str, long j10) {
        return this.zzc.getLong(str, -1L);
    }

    @Nullable
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final void zzd(String str, Object obj) throws IOException {
        SharedPreferences.Editor editorPutBoolean;
        if (obj instanceof String) {
            editorPutBoolean = this.zzc.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorPutBoolean = this.zzc.edit().putLong(str, ((Long) obj).longValue());
        } else {
            if (!(obj instanceof Boolean)) {
                String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb;
                Log.e("PaidLifecycleSPHandler", str2);
                throw new IllegalArgumentException(str2);
            }
            editorPutBoolean = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (editorPutBoolean.commit()) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    public final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    public final boolean zzf(String str, boolean z10) {
        return this.zzc.getBoolean(str, true);
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
