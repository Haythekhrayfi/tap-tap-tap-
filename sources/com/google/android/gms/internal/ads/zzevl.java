package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevl implements zzcvj, zzcxf, zzexb, com.google.android.gms.ads.internal.overlay.zzo, zzcxr, zzcvw, zzdcu {
    private final zzfbq zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzevl zzh = null;

    public zzevl(zzfbq zzfbqVar) {
        this.zza = zzfbqVar;
    }

    public static zzevl zzi(zzevl zzevlVar) {
        zzevl zzevlVar2 = new zzevl(zzevlVar.zza);
        zzevlVar2.zzh = zzevlVar;
        return zzevlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zza(zzeVar);
        } else {
            zzews.zza(this.zzb, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeuw
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((zzavw) obj).zzc(zzeVar);
                }
            });
            zzews.zza(this.zzb, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevc
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((zzavw) obj).zzb(zzeVar.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzb();
            return;
        }
        zzews.zza(this.zzf, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevf
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzawa) obj).zzf();
            }
        });
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevg
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzawa) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.internal.ads.zzexb
    public final void zzbG(zzexb zzexbVar) {
        this.zzh = (zzevl) zzexbVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzby();
        } else {
            zzews.zza(this.zzf, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevb
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzby();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zze();
        } else {
            zzews.zza(this.zzf, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevi
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i10) {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzf(i10);
        } else {
            zzews.zza(this.zzf, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeva
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzg() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzg();
        } else {
            zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevk
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) {
                    ((zzcxf) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzh(zzsVar);
        } else {
            zzews.zza(this.zzg, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeuz
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
                }
            });
        }
    }

    public final void zzj() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzj();
            return;
        }
        this.zza.zza();
        zzews.zza(this.zzc, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeux
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzavx) obj).zza();
            }
        });
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzawa) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzk(zzeVar);
        } else {
            zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevh
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((zzawa) obj).zzd(zzeVar);
                }
            });
        }
    }

    public final void zzl(final zzavt zzavtVar) {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzl(zzavtVar);
        } else {
            zzews.zza(this.zzb, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevd
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((zzavw) obj).zzd(zzavtVar);
                }
            });
        }
    }

    public final void zzn(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzp(zzavw zzavwVar) {
        this.zzb.set(zzavwVar);
    }

    public final void zzq(zzawa zzawaVar) {
        this.zzd.set(zzawaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzr() {
        zzevl zzevlVar = this.zzh;
        if (zzevlVar != null) {
            zzevlVar.zzr();
        } else {
            zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzevj
                @Override // com.google.android.gms.internal.ads.zzewr
                public final void zza(Object obj) throws RemoteException {
                    ((zzawa) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzs() {
    }
}
