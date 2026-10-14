package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxg {
    private zzxf zza;
    private zzxo zzb;

    public zzlj zzc() {
        throw null;
    }

    public void zzi() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzj(zzk zzkVar) {
        throw null;
    }

    public boolean zzm() {
        throw null;
    }

    public abstract zzxh zzo(zzlk[] zzlkVarArr, zzvn zzvnVar, zzto zztoVar, zzcw zzcwVar) throws zzih;

    public abstract void zzp(Object obj);

    public final zzxo zzq() {
        zzxo zzxoVar = this.zzb;
        zzdy.zzb(zzxoVar);
        return zzxoVar;
    }

    public final void zzr(zzxf zzxfVar, zzxo zzxoVar) {
        this.zza = zzxfVar;
        this.zzb = zzxoVar;
    }

    public final void zzs() {
        zzxf zzxfVar = this.zza;
        if (zzxfVar != null) {
            zzxfVar.zzj();
        }
    }
}
