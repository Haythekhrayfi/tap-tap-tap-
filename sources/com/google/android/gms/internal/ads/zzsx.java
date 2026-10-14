package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsx extends zzsp {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhg zzc;

    public final void zzA(final Object obj, zztq zztqVar) {
        zzdy.zzd(!this.zza.containsKey(obj));
        zztp zztpVar = new zztp() { // from class: com.google.android.gms.internal.ads.zzsu
            @Override // com.google.android.gms.internal.ads.zztp
            public final void zza(zztq zztqVar2, zzcw zzcwVar) {
                this.zza.zzz(obj, zztqVar2, zzcwVar);
            }
        };
        zzsv zzsvVar = new zzsv(this, obj);
        this.zza.put(obj, new zzsw(zztqVar, zztpVar, zzsvVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zztqVar.zzh(handler, zzsvVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zztqVar.zzg(handler2, zzsvVar);
        zztqVar.zzm(zztpVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zztqVar.zzi(zztpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzj() {
        for (zzsw zzswVar : this.zza.values()) {
            zzswVar.zza.zzi(zzswVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzl() {
        for (zzsw zzswVar : this.zza.values()) {
            zzswVar.zza.zzk(zzswVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public void zzn(zzhg zzhgVar) {
        this.zzc = zzhgVar;
        this.zzb = zzfj.zzt(null);
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public void zzq() {
        for (zzsw zzswVar : this.zza.values()) {
            zzswVar.zza.zzp(zzswVar.zzb);
            zzswVar.zza.zzs(zzswVar.zzc);
            zzswVar.zza.zzr(zzswVar.zzc);
        }
        this.zza.clear();
    }

    public int zzv(Object obj, int i10) {
        return 0;
    }

    public long zzw(Object obj, long j10) {
        return j10;
    }

    public zzto zzx(Object obj, zzto zztoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public void zzy() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzsw) it.next()).zza.zzy();
        }
    }

    public abstract void zzz(Object obj, zztq zztqVar, zzcw zzcwVar);
}
