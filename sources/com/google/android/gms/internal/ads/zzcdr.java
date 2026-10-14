package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdr extends zzcdl implements zzhg {
    private String zzd;
    private final zzcbz zze;
    private boolean zzf;
    private final zzcdq zzg;
    private final zzccw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcdr(zzcca zzccaVar, zzcbz zzcbzVar) {
        super(zzccaVar);
        this.zze = zzcbzVar;
        this.zzg = new zzcdq();
        this.zzh = new zzccw();
        this.zzk = new Object();
        this.zzl = (String) zzfpd.zzd(zzccaVar != null ? zzccaVar.zzbl() : null).zzb("");
        this.zzm = zzccaVar != null ? zzccaVar.zzf() : 0;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbzk.zze(str)));
    }

    private final void zzv() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzs = zzcbr.zzs();
        int iZzu = zzcbr.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zzge zzgeVar, zzgj zzgjVar, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzb(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzc(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzd(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
        if (zzgeVar instanceof zzgr) {
            this.zzg.zzb((zzgr) zzgeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x014c */
    @Override // com.google.android.gms.internal.ads.zzcdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdr.zzt(java.lang.String):boolean");
    }
}
