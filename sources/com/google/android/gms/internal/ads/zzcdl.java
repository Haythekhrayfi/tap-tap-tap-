package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public abstract class zzcdl implements Releasable {
    public final Context zza;
    public final String zzb;
    public final WeakReference zzc;

    public zzcdl(zzcca zzccaVar) {
        Context context = zzccaVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzccaVar.zzn().zza);
        this.zzc = new WeakReference(zzccaVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdl zzcdlVar, String str, Map map) {
        zzcca zzccaVar = (zzcca) zzcdlVar.zzc.get();
        if (zzccaVar != null) {
            zzccaVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzbzk.zza.post(new zzcdk(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i10) {
        zzbzk.zza.post(new zzcdi(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        zzbzk.zza.post(new zzcdj(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzbzk.zza.post(new zzcdh(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        zzbzk.zza.post(new zzcdg(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public void zzp(int i10) {
    }

    public void zzq(int i10) {
    }

    public void zzr(int i10) {
    }

    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        return zzt(str);
    }
}
