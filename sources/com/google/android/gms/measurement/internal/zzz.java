package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzny;

/* JADX INFO: loaded from: classes2.dex */
final class zzz extends zzy {
    public final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, String str, int i10, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i10);
        this.zza = zzaaVar;
        this.zzh = zzesVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzgl zzglVar, boolean z10) {
        zzem zzemVarZzk;
        String strZzf;
        String str;
        Boolean boolZzf;
        zzny.zzc();
        boolean zZzs = this.zza.zzs.zzf().zzs(this.zzb, zzeb.zzU);
        boolean zZzg = this.zzh.zzg();
        boolean zZzh = this.zzh.zzh();
        boolean zZzi = this.zzh.zzi();
        Object[] objArr = zZzg || zZzh || zZzi;
        Boolean boolZzj = null;
        boolZzj = null;
        if (z10 && objArr != true) {
            this.zza.zzs.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzelVarZzb = this.zzh.zzb();
        boolean zZzg2 = zzelVarZzb.zzg();
        if (zzglVar.zzr()) {
            if (zzelVarZzb.zzi()) {
                boolZzf = zzy.zzh(zzglVar.zzb(), zzelVarZzb.zzc());
                boolZzj = zzy.zzj(boolZzf, zZzg2);
            } else {
                zzemVarZzk = this.zza.zzs.zzay().zzk();
                strZzf = this.zza.zzs.zzj().zzf(zzglVar.zzf());
                str = "No number filter for long property. property";
                zzemVarZzk.zzb(str, strZzf);
            }
        } else if (!zzglVar.zzq()) {
            if (zzglVar.zzt()) {
                if (zzelVarZzb.zzk()) {
                    boolZzf = zzy.zzf(zzglVar.zzg(), zzelVarZzb.zzd(), this.zza.zzs.zzay());
                } else if (!zzelVarZzb.zzi()) {
                    zzemVarZzk = this.zza.zzs.zzay().zzk();
                    strZzf = this.zza.zzs.zzj().zzf(zzglVar.zzf());
                    str = "No string or number filter defined. property";
                } else if (zzlb.zzx(zzglVar.zzg())) {
                    boolZzf = zzy.zzi(zzglVar.zzg(), zzelVarZzb.zzc());
                } else {
                    this.zza.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzj().zzf(zzglVar.zzf()), zzglVar.zzg());
                }
                boolZzj = zzy.zzj(boolZzf, zZzg2);
            } else {
                zzemVarZzk = this.zza.zzs.zzay().zzk();
                strZzf = this.zza.zzs.zzj().zzf(zzglVar.zzf());
                str = "User property has no value, property";
            }
            zzemVarZzk.zzb(str, strZzf);
        } else if (zzelVarZzb.zzi()) {
            boolZzf = zzy.zzg(zzglVar.zza(), zzelVarZzb.zzc());
            boolZzj = zzy.zzj(boolZzf, zZzg2);
        } else {
            zzemVarZzk = this.zza.zzs.zzay().zzk();
            strZzf = this.zza.zzs.zzj().zzf(zzglVar.zzf());
            str = "No number filter for double property. property";
            zzemVarZzk.zzb(str, strZzf);
        }
        this.zza.zzs.zzay().zzj().zzb("Property filter result", boolZzj == null ? "null" : boolZzj);
        if (boolZzj == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzi && !boolZzj.booleanValue()) {
            return true;
        }
        if (!z10 || this.zzh.zzg()) {
            this.zze = boolZzj;
        }
        if (boolZzj.booleanValue() && objArr != false && zzglVar.zzs()) {
            long jZzc = zzglVar.zzc();
            if (l10 != null) {
                jZzc = l10.longValue();
            }
            if (zZzs && this.zzh.zzg() && !this.zzh.zzh() && l11 != null) {
                jZzc = l11.longValue();
            }
            if (this.zzh.zzh()) {
                this.zzg = Long.valueOf(jZzc);
            } else {
                this.zzf = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}
