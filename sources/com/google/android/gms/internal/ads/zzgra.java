package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgra implements zzgrp {
    private final zzgqw zza;
    private final zzgsg zzb;
    private final boolean zzc;
    private final zzgoz zzd;

    private zzgra(zzgsg zzgsgVar, zzgoz zzgozVar, zzgqw zzgqwVar) {
        this.zzb = zzgsgVar;
        this.zzc = zzgozVar.zzh(zzgqwVar);
        this.zzd = zzgozVar;
        this.zza = zzgqwVar;
    }

    public static zzgra zzc(zzgsg zzgsgVar, zzgoz zzgozVar, zzgqw zzgqwVar) {
        return new zzgra(zzgsgVar, zzgozVar, zzgqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zza(Object obj) {
        zzgsg zzgsgVar = this.zzb;
        int iZzb = zzgsgVar.zzb(zzgsgVar.zzd(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final Object zze() {
        zzgqw zzgqwVar = this.zza;
        return zzgqwVar instanceof zzgpm ? ((zzgpm) zzgqwVar).zzaD() : zzgqwVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzg(Object obj, Object obj2) {
        zzgrr.zzC(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzh(Object obj, zzgrh zzgrhVar, zzgoy zzgoyVar) throws IOException {
        boolean zZzO;
        zzgsg zzgsgVar = this.zzb;
        zzgoz zzgozVar = this.zzd;
        Object objZzc = zzgsgVar.zzc(obj);
        zzgpd zzgpdVarZzb = zzgozVar.zzb(obj);
        while (zzgrhVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzgrhVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzc2 = zzgozVar.zzc(zzgoyVar, this.zza, iZzd >>> 3);
                        if (objZzc2 != null) {
                            zzgozVar.zzf(zzgrhVar, objZzc2, zzgoyVar, zzgpdVarZzb);
                        } else {
                            zZzO = zzgsgVar.zzp(objZzc, zzgrhVar);
                        }
                    } else {
                        zZzO = zzgrhVar.zzO();
                    }
                    if (!zZzO) {
                        zzgsgVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    int iZzj = 0;
                    Object objZzc3 = null;
                    zzgoe zzgoeVarZzp = null;
                    while (zzgrhVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzgrhVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzgrhVar.zzj();
                            objZzc3 = zzgozVar.zzc(zzgoyVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzc3 != null) {
                                zzgozVar.zzf(zzgrhVar, objZzc3, zzgoyVar, zzgpdVarZzb);
                            } else {
                                zzgoeVarZzp = zzgrhVar.zzp();
                            }
                        } else if (!zzgrhVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgrhVar.zzd() != 12) {
                        throw zzgpy.zzb();
                    }
                    if (zzgoeVarZzp != null) {
                        if (objZzc3 != null) {
                            zzgozVar.zzg(zzgoeVarZzp, objZzc3, zzgoyVar, zzgpdVarZzb);
                        } else {
                            zzgsgVar.zzk(objZzc, iZzj, zzgoeVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzgsgVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzgsgVar.zzn(obj, objZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgnq zzgnqVar) throws IOException {
        zzgpm zzgpmVar = (zzgpm) obj;
        if (zzgpmVar.zzc == zzgsh.zzc()) {
            zzgpmVar.zzc = zzgsh.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzm(Object obj, zzgou zzgouVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
