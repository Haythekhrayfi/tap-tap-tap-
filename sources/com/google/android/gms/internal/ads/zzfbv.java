package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzfbv implements zzfbu {
    private final ConcurrentHashMap zza;
    private final zzfcb zzb;
    private final zzfbx zzc = new zzfbx();

    public zzfbv(zzfcb zzfcbVar) {
        this.zza = new ConcurrentHashMap(zzfcbVar.zzd);
        this.zzb = zzfcbVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfcb> creator = zzfcb.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgf)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfce) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfbt) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int iZzb = ((zzfbt) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfbt) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            zzbzr.zze(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final zzfcb zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final synchronized zzfcd zzb(zzfce zzfceVar) {
        zzfcd zzfcdVarZze;
        zzfbt zzfbtVar = (zzfbt) this.zza.get(zzfceVar);
        if (zzfbtVar != null) {
            zzfcdVarZze = zzfbtVar.zze();
            if (zzfcdVarZze == null) {
                this.zzc.zze();
            }
            zzfcr zzfcrVarZzf = zzfbtVar.zzf();
            if (zzfcdVarZze != null) {
                zzaxo zzaxoVarZza = zzaxu.zza();
                zzaxm zzaxmVarZza = zzaxn.zza();
                zzaxmVarZza.zzd(2);
                zzaxq zzaxqVarZza = zzaxr.zza();
                zzaxqVarZza.zza(zzfcrVarZzf.zza);
                zzaxqVarZza.zzb(zzfcrVarZzf.zzb);
                zzaxmVarZza.zza(zzaxqVarZza);
                zzaxoVarZza.zza(zzaxmVarZza);
                zzfcdVarZze.zza.zzb().zzc().zze((zzaxu) zzaxoVarZza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfcdVarZze = null;
        }
        return zzfcdVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    @Deprecated
    public final zzfce zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfcf(zzlVar, str, new zzbui(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final synchronized boolean zzd(zzfce zzfceVar, zzfcd zzfcdVar) {
        boolean zZzh;
        ConcurrentHashMap concurrentHashMap;
        zzfbt zzfbtVar = (zzfbt) this.zza.get(zzfceVar);
        zzfcdVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfbtVar == null) {
            zzfcb zzfcbVar = this.zzb;
            zzfbtVar = new zzfbt(zzfcbVar.zzd, zzfcbVar.zze * 1000);
            int size = this.zza.size();
            zzfcb zzfcbVar2 = this.zzb;
            if (size == zzfcbVar2.zzc) {
                int i10 = zzfcbVar2.zzg;
                int i11 = i10 - 1;
                zzfce zzfceVar2 = null;
                if (i10 == 0) {
                    throw null;
                }
                long jZzc = RecyclerView.FOREVER_NS;
                if (i11 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfbt) entry.getValue()).zzc() < jZzc) {
                            jZzc = ((zzfbt) entry.getValue()).zzc();
                            zzfceVar2 = (zzfce) entry.getKey();
                        }
                    }
                    if (zzfceVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfceVar2);
                    }
                } else if (i11 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfbt) entry2.getValue()).zzd() < jZzc) {
                            jZzc = ((zzfbt) entry2.getValue()).zzd();
                            zzfceVar2 = (zzfce) entry2.getKey();
                        }
                    }
                    if (zzfceVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfceVar2);
                    }
                } else if (i11 == 2) {
                    int iZza = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfbt) entry3.getValue()).zza() < iZza) {
                            iZza = ((zzfbt) entry3.getValue()).zza();
                            zzfceVar2 = (zzfce) entry3.getKey();
                        }
                    }
                    if (zzfceVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfceVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfceVar, zzfbtVar);
            this.zzc.zzd();
        }
        zZzh = zzfbtVar.zzh(zzfcdVar);
        this.zzc.zzc();
        zzfbw zzfbwVarZza = this.zzc.zza();
        zzfcr zzfcrVarZzf = zzfbtVar.zzf();
        zzaxo zzaxoVarZza = zzaxu.zza();
        zzaxm zzaxmVarZza = zzaxn.zza();
        zzaxmVarZza.zzd(2);
        zzaxs zzaxsVarZza = zzaxt.zza();
        zzaxsVarZza.zza(zzfbwVarZza.zza);
        zzaxsVarZza.zzb(zzfbwVarZza.zzb);
        zzaxsVarZza.zzc(zzfcrVarZzf.zzb);
        zzaxmVarZza.zzc(zzaxsVarZza);
        zzaxoVarZza.zza(zzaxmVarZza);
        zzfcdVar.zza.zzb().zzc().zzf((zzaxu) zzaxoVarZza.zzal());
        zzf();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final synchronized boolean zze(zzfce zzfceVar) {
        zzfbt zzfbtVar = (zzfbt) this.zza.get(zzfceVar);
        if (zzfbtVar != null) {
            return zzfbtVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
