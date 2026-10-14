package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzele implements zzeqy {
    private final zzeqy zza;
    private final zzfai zzb;
    private final Context zzc;
    private final zzbza zzd;

    public zzele(zzemy zzemyVar, zzfai zzfaiVar, Context context, zzbza zzbzaVar) {
        this.zza = zzemyVar;
        this.zzb = zzfaiVar;
        this.zzc = context;
        this.zzd = zzbzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return zzfwc.zzl(this.zza.zzb(), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zzc((zzerd) obj);
            }
        }, zzcae.zzf);
    }

    public final /* synthetic */ zzelf zzc(zzerd zzerdVar) {
        String str;
        boolean z10;
        String strZzm;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z13 = zzqVar2.zzi;
                if (!z13 && !z11) {
                    str = zzqVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z10 = zzqVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            float f11 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            strZzm = this.zzd.zzh().zzm();
            i11 = i13;
            f10 = f11;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = zzqVar3.zze;
                    if (i14 == -1) {
                        i14 = f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (int) (zzqVar3.zzf / f10) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = zzqVar3.zzb;
                    if (i15 == -2) {
                        i15 = f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (int) (zzqVar3.zzc / f10) : -2;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzelf(zzqVar, str, z10, sb2.toString(), f10, i11, i10, strZzm, this.zzb.zzp);
    }
}
