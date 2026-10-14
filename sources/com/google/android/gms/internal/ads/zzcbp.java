package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbp {
    private final Context zza;
    private final zzcca zzb;
    private final ViewGroup zzc;
    private zzcbo zzd;

    public zzcbp(Context context, ViewGroup viewGroup, zzcez zzcezVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcezVar;
        this.zzd = null;
    }

    public final zzcbo zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcbo zzcboVar = this.zzd;
        if (zzcboVar != null) {
            return zzcboVar.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbo zzcboVar = this.zzd;
        if (zzcboVar != null) {
            zzcboVar.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcbz zzcbzVar) {
        if (this.zzd != null) {
            return;
        }
        zzbbw.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcca zzccaVar = this.zzb;
        zzcbo zzcboVar = new zzcbo(context, zzccaVar, i14, z10, zzccaVar.zzm().zza(), zzcbzVar);
        this.zzd = zzcboVar;
        this.zzc.addView(zzcboVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i10, i11, i12, i13);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbo zzcboVar = this.zzd;
        if (zzcboVar != null) {
            zzcboVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbo zzcboVar = this.zzd;
        if (zzcboVar != null) {
            zzcboVar.zzu();
        }
    }

    public final void zzg(int i10) {
        zzcbo zzcboVar = this.zzd;
        if (zzcboVar != null) {
            zzcboVar.zzC(i10);
        }
    }
}
