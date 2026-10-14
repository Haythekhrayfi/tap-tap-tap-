package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdou implements zzcyb, zzcwu, zzcvj, zzcwa, com.google.android.gms.ads.internal.client.zza, zzdan {
    private final zzawz zza;
    private boolean zzb = false;

    public zzdou(zzawz zzawzVar, @Nullable zzexi zzexiVar) {
        this.zza = zzawzVar;
        zzawzVar.zzc(2);
        if (zzexiVar != null) {
            zzawzVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzawz zzawzVar;
        int i10;
        switch (zzeVar.zza) {
            case 1:
                zzawzVar = this.zza;
                i10 = 101;
                break;
            case 2:
                zzawzVar = this.zza;
                i10 = 102;
                break;
            case 3:
                zzawzVar = this.zza;
                i10 = 5;
                break;
            case 4:
                zzawzVar = this.zza;
                i10 = 103;
                break;
            case 5:
                zzawzVar = this.zza;
                i10 = 104;
                break;
            case 6:
                zzawzVar = this.zza;
                i10 = 105;
                break;
            case 7:
                zzawzVar = this.zza;
                i10 = 106;
                break;
            default:
                zzawzVar = this.zza;
                i10 = 4;
                break;
        }
        zzawzVar.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzb(final zzezz zzezzVar) {
        this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                zzezz zzezzVar2 = zzezzVar;
                zzaxk zzaxkVar = (zzaxk) zzayoVar.zza().zzaB();
                zzayc zzaycVar = (zzayc) zzayoVar.zza().zzd().zzaB();
                zzaycVar.zza(zzezzVar2.zzb.zzb.zzb);
                zzaxkVar.zzb(zzaycVar);
                zzayoVar.zze(zzaxkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzbA(zzbue zzbueVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zze(final zzaxu zzaxuVar) {
        this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                zzayoVar.zzf(zzaxuVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzf(final zzaxu zzaxuVar) {
        this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                zzayoVar.zzf(zzaxuVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzh(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi(final zzaxu zzaxuVar) {
        this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzawy
            public final void zza(zzayo zzayoVar) {
                zzayoVar.zzf(zzaxuVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzk(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzn() {
        this.zza.zzc(3);
    }
}
