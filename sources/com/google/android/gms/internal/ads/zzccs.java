package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccs extends zzcbg implements TextureView.SurfaceTextureListener, zzcbq {
    private final zzcca zzc;
    private final zzccb zzd;
    private final zzcbz zze;
    private zzcbf zzf;
    private Surface zzg;
    private zzcbr zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcby zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzccs(Context context, zzccb zzccbVar, zzcca zzccaVar, boolean z10, boolean z11, zzcbz zzcbzVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzccaVar;
        this.zzd = zzccbVar;
        this.zzn = z10;
        this.zze = zzcbzVar;
        setSurfaceTextureListener(this);
        zzccbVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return q.a(str, DialogConfigs.DIRECTORY_SEPERATOR, exc.getClass().getCanonicalName(), ":", exc.getMessage());
    }

    private final void zzU() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[LOOP:0: B:36:0x00a3->B:38:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:39:0x00b3 BREAK  A[LOOP:0: B:36:0x00a3->B:38:0x00a8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    private final void zzW(boolean z10, Integer num) {
        Uri[] uriArr;
        int i10;
        String[] strArr;
        int iZzt;
        zzcdl zzcdlVarZzp;
        String strConcat;
        String strZzF;
        ByteBuffer byteBufferZzk;
        boolean zZzl;
        String strZzi;
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null && !z10) {
            zzcbrVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (!z10) {
            if (this.zzi.startsWith("cache:")) {
                zzcdlVarZzp = this.zzc.zzp(this.zzi);
                if (zzcdlVarZzp instanceof zzcdu) {
                    zzcbr zzcbrVarZza = ((zzcdu) zzcdlVarZzp).zza();
                    this.zzh = zzcbrVarZza;
                    zzcbrVarZza.zzP(num);
                    if (!this.zzh.zzV()) {
                        strConcat = "Precached video player has been released.";
                    }
                } else if (zzcdlVarZzp instanceof zzcdr) {
                    zzcdr zzcdrVar = (zzcdr) zzcdlVarZzp;
                    strZzF = zzF();
                    byteBufferZzk = zzcdrVar.zzk();
                    zZzl = zzcdrVar.zzl();
                    strZzi = zzcdrVar.zzi();
                    if (strZzi == null) {
                        strConcat = "Stream cache URL is null.";
                    } else {
                        zzcbr zzcbrVarZzE = zzE(num);
                        this.zzh = zzcbrVarZzE;
                        zzcbrVarZzE.zzG(new Uri[]{Uri.parse(strZzi)}, strZzF, byteBufferZzk, zZzl);
                    }
                } else {
                    strConcat = "Stream cache miss: ".concat(String.valueOf(this.zzi));
                }
            } else {
                this.zzh = zzE(num);
                String strZzF2 = zzF();
                uriArr = new Uri[this.zzj.length];
                i10 = 0;
                while (true) {
                    strArr = this.zzj;
                    if (i10 < strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
                }
                this.zzh.zzF(uriArr, strZzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                iZzt = this.zzh.zzt();
                this.zzl = iZzt;
                if (iZzt == 3) {
                    zzV();
                    return;
                }
                return;
            }
            return;
        }
        if (zzad()) {
            zzcbrVar.zzU();
            zzY();
            if (this.zzi.startsWith("cache:")) {
                zzcdlVarZzp = this.zzc.zzp(this.zzi);
                if (zzcdlVarZzp instanceof zzcdu) {
                    zzcbr zzcbrVarZza2 = ((zzcdu) zzcdlVarZzp).zza();
                    this.zzh = zzcbrVarZza2;
                    zzcbrVarZza2.zzP(num);
                    if (!this.zzh.zzV()) {
                        strConcat = "Precached video player has been released.";
                    }
                } else if (zzcdlVarZzp instanceof zzcdr) {
                    zzcdr zzcdrVar2 = (zzcdr) zzcdlVarZzp;
                    strZzF = zzF();
                    byteBufferZzk = zzcdrVar2.zzk();
                    zZzl = zzcdrVar2.zzl();
                    strZzi = zzcdrVar2.zzi();
                    if (strZzi == null) {
                        strConcat = "Stream cache URL is null.";
                    } else {
                        zzcbr zzcbrVarZzE2 = zzE(num);
                        this.zzh = zzcbrVarZzE2;
                        zzcbrVarZzE2.zzG(new Uri[]{Uri.parse(strZzi)}, strZzF, byteBufferZzk, zZzl);
                    }
                } else {
                    strConcat = "Stream cache miss: ".concat(String.valueOf(this.zzi));
                }
            } else {
                this.zzh = zzE(num);
                String strZzF3 = zzF();
                uriArr = new Uri[this.zzj.length];
                i10 = 0;
                while (true) {
                    strArr = this.zzj;
                    if (i10 < strArr.length) {
                        break;
                        break;
                    } else {
                        uriArr[i10] = Uri.parse(strArr[i10]);
                        i10++;
                    }
                }
                this.zzh.zzF(uriArr, strZzF3);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                iZzt = this.zzh.zzt();
                this.zzl = iZzt;
                if (iZzt == 3) {
                    zzV();
                    return;
                }
                return;
            }
            return;
        }
        strConcat = "No valid ExoPlayerAdapter exists when switch source.";
        zzbzr.zzj(strConcat);
    }

    private final void zzX() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbr zzcbrVar = this.zzh;
            if (zzcbrVar != null) {
                zzcbrVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar == null) {
            zzbzr.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbrVar.zzS(surface, z10);
        } catch (IOException e10) {
            zzbzr.zzk("", e10);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbr zzcbrVar = this.zzh;
        return (zzcbrVar == null || !zzcbrVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcby zzcbyVar = this.zzm;
        if (zzcbyVar != null) {
            zzcbyVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcby zzcbyVar = new zzcby(getContext());
            this.zzm = zzcbyVar;
            zzcbyVar.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture surfaceTextureZzb = this.zzm.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcby zzcbyVar = this.zzm;
        if (zzcbyVar != null) {
            zzcbyVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcby zzcbyVar = this.zzm;
        if (zzcbyVar != null) {
            zzcbyVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzA(int i10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzB(int i10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z10 = this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4;
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    public final zzcbr zzE(Integer num) {
        zzcem zzcemVar = new zzcem(this.zzc.getContext(), this.zze, this.zzc, num);
        zzbzr.zzi("ExoPlayerAdapter initialized.");
        return zzcemVar;
    }

    public final String zzF() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzn().zza);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzj(i10, i11);
        }
    }

    public final /* synthetic */ void zzP() {
        float fZza = this.zzb.zza();
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar == null) {
            zzbzr.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbrVar.zzT(fZza, false);
        } catch (IOException e10) {
            zzbzr.zzk("", e10);
        }
    }

    public final /* synthetic */ void zzQ(int i10) {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcbf zzcbfVar = this.zzf;
        if (zzcbfVar != null) {
            zzcbfVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final int zzb() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            return zzcbrVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final long zzf() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            return zzcbrVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final long zzg() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            return zzcbrVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final long zzh() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            return zzcbrVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzi(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        zzbzr.zzj("ExoPlayerAdapter error: ".concat(strZzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(strZzT);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        zzbzr.zzj("ExoPlayerAdapter exception: ".concat(strZzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 == 3) {
                zzV();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg, com.google.android.gms.internal.ads.zzccd
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzr(zzcbf zzcbfVar) {
        this.zzf = zzcbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzu(float f10, float f11) {
        zzcby zzcbyVar = this.zzm;
        if (zzcbyVar != null) {
            zzcbyVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final Integer zzw() {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            return zzcbrVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzx(int i10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzy(int i10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzz(int i10) {
        zzcbr zzcbrVar = this.zzh;
        if (zzcbrVar != null) {
            zzcbrVar.zzM(i10);
        }
    }
}
