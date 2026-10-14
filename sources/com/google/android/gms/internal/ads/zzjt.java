package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
final class zzjt implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzzr, zzot, zzvq, zzso, zzhw, zzhs, zzii {
    public static final /* synthetic */ int zzb = 0;
    public final /* synthetic */ zzjx zza;

    public /* synthetic */ zzjt(zzjx zzjxVar, zzjs zzjsVar) {
        this.zza = zzjxVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjx.zzP(this.zza, surfaceTexture);
        this.zza.zzag(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzaj(null);
        this.zza.zzag(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzag(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzag(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzag(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zza(boolean z10) {
        this.zza.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzb(Exception exc) {
        this.zza.zzr.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzc(String str, long j10, long j11) {
        this.zza.zzr.zzw(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzd(String str) {
        this.zza.zzr.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zze(zzhz zzhzVar) {
        this.zza.zzr.zzy(zzhzVar);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzf(zzhz zzhzVar) {
        this.zza.zzS = zzhzVar;
        this.zza.zzr.zzz(zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzg(zzam zzamVar, zzia zziaVar) {
        this.zza.zzL = zzamVar;
        this.zza.zzr.zzA(zzamVar, zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzh(long j10) {
        this.zza.zzr.zzB(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzi(Exception exc) {
        this.zza.zzr.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzj(int i10, long j10, long j11) {
        this.zza.zzr.zzD(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzk(int i10, long j10) {
        this.zza.zzr.zzE(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzl(Object obj, long j10) {
        this.zza.zzr.zzF(obj, j10);
        zzjx zzjxVar = this.zza;
        if (zzjxVar.zzN == obj) {
            zzeo zzeoVar = zzjxVar.zzl;
            zzeoVar.zzd(26, new zzel() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj2) {
                }
            });
            zzeoVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzm(final boolean z10) {
        zzjx zzjxVar = this.zza;
        if (zzjxVar.zzW == z10) {
            return;
        }
        zzjxVar.zzW = z10;
        zzeo zzeoVar = this.zza.zzl;
        zzeoVar.zzd(23, new zzel() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcm) obj).zzn(z10);
            }
        });
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzn(Exception exc) {
        this.zza.zzr.zzG(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzo(String str, long j10, long j11) {
        this.zza.zzr.zzH(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzp(String str) {
        this.zza.zzr.zzI(str);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzq(zzhz zzhzVar) {
        this.zza.zzr.zzJ(zzhzVar);
        this.zza.zzK = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzr(zzhz zzhzVar) {
        this.zza.zzR = zzhzVar;
        this.zza.zzr.zzK(zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzs(long j10, int i10) {
        this.zza.zzr.zzL(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzt(zzam zzamVar, zzia zziaVar) {
        this.zza.zzK = zzamVar;
        this.zza.zzr.zzM(zzamVar, zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzu(final zzdn zzdnVar) {
        this.zza.zzab = zzdnVar;
        zzeo zzeoVar = this.zza.zzl;
        zzeoVar.zzd(25, new zzel() { // from class: com.google.android.gms.internal.ads.zzjr
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcm) obj).zzr(zzdnVar);
            }
        });
        zzeoVar.zzc();
    }
}
