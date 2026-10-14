package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhy implements zzli, zzlk {
    private final int zzb;
    private zzll zzd;
    private int zze;
    private zzoc zzf;
    private int zzg;
    private zzvf zzh;
    private zzam[] zzi;
    private long zzj;
    private boolean zzl;
    private boolean zzm;
    private zzlj zzn;
    private final Object zza = new Object();
    private final zzkj zzc = new zzkj();
    private long zzk = Long.MIN_VALUE;

    public zzhy(int i10) {
        this.zzb = i10;
    }

    private final void zzS(long j10, boolean z10) throws zzih {
        this.zzl = false;
        this.zzk = j10;
        zzv(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzA() {
        zzdy.zzf(this.zzg == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzB(zzam[] zzamVarArr, zzvf zzvfVar, long j10, long j11) throws zzih {
        zzdy.zzf(!this.zzl);
        this.zzh = zzvfVar;
        if (this.zzk == Long.MIN_VALUE) {
            this.zzk = j10;
        }
        this.zzi = zzamVarArr;
        this.zzj = j11;
        zzz(zzamVarArr, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzC() {
        zzdy.zzf(this.zzg == 0);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzD(long j10) throws zzih {
        zzS(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzE() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzF(zzlj zzljVar) {
        synchronized (this.zza) {
            this.zzn = zzljVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public /* synthetic */ void zzG(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzH() throws zzih {
        zzdy.zzf(this.zzg == 1);
        this.zzg = 2;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzI() {
        zzdy.zzf(this.zzg == 2);
        this.zzg = 1;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zzJ() {
        return this.zzk == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zzK() {
        return this.zzl;
    }

    public final boolean zzL() {
        if (zzJ()) {
            return this.zzl;
        }
        zzvf zzvfVar = this.zzh;
        Objects.requireNonNull(zzvfVar);
        return zzvfVar.zze();
    }

    public final zzam[] zzM() {
        zzam[] zzamVarArr = this.zzi;
        Objects.requireNonNull(zzamVarArr);
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzli, com.google.android.gms.internal.ads.zzlk
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final int zzbc() {
        return this.zzg;
    }

    public final int zzbd(zzkj zzkjVar, zzhp zzhpVar, int i10) {
        zzvf zzvfVar = this.zzh;
        Objects.requireNonNull(zzvfVar);
        int iZza = zzvfVar.zza(zzkjVar, zzhpVar, i10);
        if (iZza == -4) {
            if (zzhpVar.zzg()) {
                this.zzk = Long.MIN_VALUE;
                return this.zzl ? -4 : -3;
            }
            long j10 = zzhpVar.zzd + this.zzj;
            zzhpVar.zzd = j10;
            this.zzk = Math.max(this.zzk, j10);
        } else if (iZza == -5) {
            zzam zzamVar = zzkjVar.zza;
            Objects.requireNonNull(zzamVar);
            long j11 = zzamVar.zzq;
            if (j11 != RecyclerView.FOREVER_NS) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzW(j11 + this.zzj);
                zzkjVar.zza = zzakVarZzb.zzY();
                return -5;
            }
        }
        return iZza;
    }

    public final zzih zzbe(Throwable th, zzam zzamVar, boolean z10, int i10) {
        int iZzR = 4;
        if (zzamVar != null && !this.zzm) {
            this.zzm = true;
            try {
                iZzR = zzR(zzamVar) & 7;
            } catch (zzih unused) {
            } finally {
                this.zzm = false;
            }
        }
        return zzih.zzb(th, zzN(), this.zze, zzamVar, iZzR, z10, i10);
    }

    public final int zzd(long j10) {
        zzvf zzvfVar = this.zzh;
        Objects.requireNonNull(zzvfVar);
        return zzvfVar.zzb(j10 - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public int zze() throws zzih {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final long zzf() {
        return this.zzk;
    }

    public final zzkj zzh() {
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        return zzkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public zzkl zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final zzlk zzj() {
        return this;
    }

    public final zzll zzk() {
        zzll zzllVar = this.zzd;
        Objects.requireNonNull(zzllVar);
        return zzllVar;
    }

    public final zzoc zzl() {
        zzoc zzocVar = this.zzf;
        Objects.requireNonNull(zzocVar);
        return zzocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final zzvf zzm() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzn() {
        synchronized (this.zza) {
            this.zzn = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzo() {
        zzdy.zzf(this.zzg == 1);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        this.zzg = 0;
        this.zzh = null;
        this.zzi = null;
        this.zzl = false;
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzp(zzll zzllVar, zzam[] zzamVarArr, zzvf zzvfVar, long j10, boolean z10, boolean z11, long j11, long j12) throws zzih {
        zzdy.zzf(this.zzg == 0);
        this.zzd = zzllVar;
        this.zzg = 1;
        zzu(z10, z11);
        zzB(zzamVarArr, zzvfVar, j11, j12);
        zzS(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public void zzq(int i10, Object obj) throws zzih {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzr(int i10, zzoc zzocVar) {
        this.zze = i10;
        this.zzf = zzocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzs() throws IOException {
        zzvf zzvfVar = this.zzh;
        Objects.requireNonNull(zzvfVar);
        zzvfVar.zzd();
    }

    public void zzt() {
        throw null;
    }

    public void zzu(boolean z10, boolean z11) throws zzih {
    }

    public void zzv(long j10, boolean z10) throws zzih {
        throw null;
    }

    public void zzw() {
    }

    public void zzx() throws zzih {
    }

    public void zzy() {
    }

    public void zzz(zzam[] zzamVarArr, long j10, long j11) throws zzih {
        throw null;
    }
}
