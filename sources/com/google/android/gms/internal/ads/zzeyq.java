package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyq implements OnAdMetadataChangedListener, zzcwu, zzcvj, zzcvg, zzcvw, zzcxr, zzexb, zzdcu {
    private final zzfbq zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzeyq(zzfbq zzfbqVar) {
        this.zza = zzfbqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzews.zza(this.zzb, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i10 = zzeVar.zza;
        zzews.zza(this.zzc, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvu) obj).zzf(zzeVar);
            }
        });
        zzews.zza(this.zzc, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexx
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvu) obj).zze(i10);
            }
        });
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexy
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzg(i10);
            }
        });
    }

    public final void zzb(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzexb
    public final void zzbG(zzexb zzexbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzbr() {
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzl();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzd(zzbvq zzbvqVar) {
        this.zzd.set(zzbvqVar);
    }

    public final void zze(zzbvu zzbvuVar) {
        this.zzc.set(zzbvuVar);
    }

    @Deprecated
    public final void zzf(zzbva zzbvaVar) {
        this.zze.set(zzbvaVar);
    }

    @Deprecated
    public final void zzg(zzbuv zzbuvVar) {
        this.zzg.set(zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzews.zza(this.zzh, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final void zzi(zzbvv zzbvvVar) {
        this.zzf.set(zzbvvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzj() {
        this.zza.zza();
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyc
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zzg();
            }
        });
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zzi(zzeVar);
            }
        });
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzm() {
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzn() {
        zzews.zza(this.zzc, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyi
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvu) obj).zzg();
            }
        });
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzo() {
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zzj();
            }
        });
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyg
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzj();
            }
        });
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzp(final zzbuu zzbuuVar, final String str, final String str2) {
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeym
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                zzbuu zzbuuVar2 = zzbuuVar;
                ((zzbvq) obj).zzk(new zzbwe(zzbuuVar2.zzc(), zzbuuVar2.zzb()));
            }
        });
        zzews.zza(this.zzf, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                zzbuu zzbuuVar2 = zzbuuVar;
                ((zzbvv) obj).zze(new zzbwe(zzbuuVar2.zzc(), zzbuuVar2.zzb()), str, str2);
            }
        });
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyo
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zze(zzbuuVar);
            }
        });
        zzews.zza(this.zzg, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyp
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbuv) obj).zze(zzbuuVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq() {
        zzews.zza(this.zze, new zzewr() { // from class: com.google.android.gms.internal.ads.zzeyb
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbva) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzr() {
        zzews.zza(this.zzd, new zzewr() { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // com.google.android.gms.internal.ads.zzewr
            public final void zza(Object obj) throws RemoteException {
                ((zzbvq) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzs() {
    }
}
