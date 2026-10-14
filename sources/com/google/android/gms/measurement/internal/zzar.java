package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.k;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzau zzf;

    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfyVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeo.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfyVar.zzay().zzd().zza("Param name can't be null");
                } else {
                    Object objZzA = zzfyVar.zzv().zzA(next, bundle2.get(next));
                    if (objZzA == null) {
                        zzfyVar.zzay().zzk().zzb("Param value can't be null", zzfyVar.zzj().zze(next));
                    } else {
                        zzfyVar.zzv().zzO(bundle2, next, objZzA);
                    }
                }
                it.remove();
            }
            zzauVar = new zzau(bundle2);
        }
        this.zzf = zzauVar;
    }

    private zzar(zzfy zzfyVar, String str, String str2, String str3, long j10, long j11, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfyVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeo.zzn(str2), zzeo.zzn(str3));
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return k.a(q2.a.a("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzar zza(zzfy zzfyVar, long j10) {
        return new zzar(zzfyVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }
}
