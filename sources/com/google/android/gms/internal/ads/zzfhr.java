package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhr {
    private static zzfhr zza;
    private float zzb = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    private final zzfhk zzc;
    private final zzfhi zzd;
    private zzfhj zze;
    private zzfhl zzf;

    public zzfhr(zzfhk zzfhkVar, zzfhi zzfhiVar) {
        this.zzc = zzfhkVar;
        this.zzd = zzfhiVar;
    }

    public static zzfhr zzb() {
        if (zza == null) {
            zza = new zzfhr(new zzfhk(), new zzfhi());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfhj(new Handler(), context, new zzfhh(), this);
    }

    public final void zzd(float f10) {
        this.zzb = f10;
        if (this.zzf == null) {
            this.zzf = zzfhl.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfha) it.next()).zzg().zzh(f10);
        }
    }

    public final void zze() {
        zzfhm.zza().zzd(this);
        zzfhm.zza().zzb();
        zzfin.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfin.zzd().zzj();
        zzfhm.zza().zzc();
        this.zze.zzb();
    }
}
