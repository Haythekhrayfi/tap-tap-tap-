package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzns {
    private final zzct zza;
    private zzfsc zzb = zzfsc.zzl();
    private zzfsf zzc = zzfsf.zzd();
    private zzto zzd;
    private zzto zze;
    private zzto zzf;

    public zzns(zzct zzctVar) {
        this.zza = zzctVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzto zzj(zzcp zzcpVar, zzfsc zzfscVar, zzto zztoVar, zzct zzctVar) {
        zzcw zzcwVarZzn = zzcpVar.zzn();
        int iZze = zzcpVar.zze();
        Object objZzf = zzcwVarZzn.zzo() ? null : zzcwVarZzn.zzf(iZze);
        int iZzc = (zzcpVar.zzx() || zzcwVarZzn.zzo()) ? -1 : zzcwVarZzn.zzd(iZze, zzctVar, false).zzc(zzfj.zzo(zzcpVar.zzk()));
        for (int i10 = 0; i10 < zzfscVar.size(); i10++) {
            zzto zztoVar2 = (zzto) zzfscVar.get(i10);
            if (zzm(zztoVar2, objZzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), iZzc)) {
                return zztoVar2;
            }
        }
        if (zzfscVar.isEmpty() && zztoVar != null) {
            if (zzm(zztoVar, objZzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), iZzc)) {
                return zztoVar;
            }
        }
        return null;
    }

    private final void zzk(zzfse zzfseVar, zzto zztoVar, zzcw zzcwVar) {
        if (zztoVar == null) {
            return;
        }
        if (zzcwVar.zza(zztoVar.zza) != -1) {
            zzfseVar.zza(zztoVar, zzcwVar);
            return;
        }
        zzcw zzcwVar2 = (zzcw) this.zzc.get(zztoVar);
        if (zzcwVar2 != null) {
            zzfseVar.zza(zztoVar, zzcwVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzcw zzcwVar) {
        zzfse zzfseVar = new zzfse();
        if (this.zzb.isEmpty()) {
            zzk(zzfseVar, this.zze, zzcwVar);
            if (!zzfpc.zza(this.zzf, this.zze)) {
                zzk(zzfseVar, this.zzf, zzcwVar);
            }
            if (!zzfpc.zza(this.zzd, this.zze) && !zzfpc.zza(this.zzd, this.zzf)) {
                zzk(zzfseVar, this.zzd, zzcwVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfseVar, (zzto) this.zzb.get(i10), zzcwVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfseVar, this.zzd, zzcwVar);
            }
        }
        this.zzc = zzfseVar.zzc();
    }

    private static boolean zzm(zzto zztoVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zztoVar.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (zztoVar.zzb != i10 || zztoVar.zzc != i11) {
                return false;
            }
        } else if (zztoVar.zzb != -1 || zztoVar.zze != i12) {
            return false;
        }
        return true;
    }

    public final zzcw zza(zzto zztoVar) {
        return (zzcw) this.zzc.get(zztoVar);
    }

    public final zzto zzb() {
        return this.zzd;
    }

    public final zzto zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfsc zzfscVar = this.zzb;
        if (!(zzfscVar instanceof List)) {
            Iterator<E> it = zzfscVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfscVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfscVar.get(zzfscVar.size() - 1);
        }
        return (zzto) obj;
    }

    public final zzto zzd() {
        return this.zze;
    }

    public final zzto zze() {
        return this.zzf;
    }

    public final void zzg(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzto zztoVar, zzcp zzcpVar) {
        this.zzb = zzfsc.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zzto) list.get(0);
            Objects.requireNonNull(zztoVar);
            this.zzf = zztoVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcpVar.zzn());
    }

    public final void zzi(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        zzl(zzcpVar.zzn());
    }
}
