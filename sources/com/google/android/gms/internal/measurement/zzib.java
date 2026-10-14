package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzib implements zzhj {
    private static final Map zza = new q.a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzib zza(Context context, String str, Runnable runnable) {
        zzib zzibVar;
        if (zzha.zzb()) {
            throw null;
        }
        synchronized (zzib.class) {
            zzibVar = (zzib) zza.get(null);
            if (zzibVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzibVar;
    }

    public static synchronized void zzc() {
        Map map = zza;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = ((zzib) it.next()).zzb;
            throw null;
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    public final Object zzb(String str) {
        throw null;
    }
}
