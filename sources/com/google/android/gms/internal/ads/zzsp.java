package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsp implements zztq {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zztx zzc = new zztx();
    private final zzqo zzd = new zzqo();
    private Looper zze;
    private zzcw zzf;
    private zzoc zzg;

    @Override // com.google.android.gms.internal.ads.zztq
    public /* synthetic */ zzcw zzL() {
        return null;
    }

    public final zzoc zzb() {
        zzoc zzocVar = this.zzg;
        zzdy.zzb(zzocVar);
        return zzocVar;
    }

    public final zzqo zzc(zzto zztoVar) {
        return this.zzd.zza(0, zztoVar);
    }

    public final zzqo zzd(int i10, zzto zztoVar) {
        return this.zzd.zza(0, zztoVar);
    }

    public final zztx zze(zzto zztoVar) {
        return this.zzc.zza(0, zztoVar);
    }

    public final zztx zzf(int i10, zzto zztoVar) {
        return this.zzc.zza(0, zztoVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzg(Handler handler, zzqp zzqpVar) {
        this.zzd.zzb(handler, zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzh(Handler handler, zzty zztyVar) {
        this.zzc.zzb(handler, zztyVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzi(zztp zztpVar) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zztpVar);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk(zztp zztpVar) {
        Objects.requireNonNull(this.zze);
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.add(zztpVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzm(zztp zztpVar, zzhg zzhgVar, zzoc zzocVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        zzdy.zzd(z10);
        this.zzg = zzocVar;
        zzcw zzcwVar = this.zzf;
        this.zza.add(zztpVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zztpVar);
            zzn(zzhgVar);
        } else if (zzcwVar != null) {
            zzk(zztpVar);
            zztpVar.zza(this, zzcwVar);
        }
    }

    public abstract void zzn(zzhg zzhgVar);

    public final void zzo(zzcw zzcwVar) {
        this.zzf = zzcwVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztp) arrayList.get(i10)).zza(this, zzcwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzp(zztp zztpVar) {
        this.zza.remove(zztpVar);
        if (!this.zza.isEmpty()) {
            zzi(zztpVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzr(zzqp zzqpVar) {
        this.zzd.zzc(zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzs(zzty zztyVar) {
        this.zzc.zzh(zztyVar);
    }

    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public /* synthetic */ boolean zzu() {
        return true;
    }
}
