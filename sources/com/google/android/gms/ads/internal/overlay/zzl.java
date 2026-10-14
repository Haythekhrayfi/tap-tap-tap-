package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbqw;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcez;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcgk;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzdcu;
import com.google.android.gms.internal.ads.zzebm;
import com.google.android.gms.internal.ads.zzebn;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfmd;
import java.util.Collections;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class zzl extends zzbrs implements zzad {
    public static final int zza = Color.argb(0, 0, 0, 0);
    public final Activity zzb;
    public AdOverlayInfoParcel zzc;
    public zzcez zzd;
    public zzh zze;
    public zzr zzf;
    public FrameLayout zzh;
    public WebChromeClient.CustomViewCallback zzi;
    public zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    public boolean zzg = false;
    public boolean zzj = false;
    public boolean zzk = false;
    public boolean zzm = false;
    public int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzI(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        int i10;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zZze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z12) && !zZze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z11 = true;
            }
        } else {
            z10 = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzbb)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z10) {
                i10 = z11 ? 5894 : 5380;
            } else {
                i10 = 256;
            }
            decorView.setSystemUiVisibility(i10);
            return;
        }
        if (!z10) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z11) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void zzJ(zzfgw zzfgwVar, View view) {
        if (zzfgwVar == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfgwVar, view);
    }

    public final void zzA(int i10) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbbm.zzfL)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbbm.zzfM)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().zzb(zzbbm.zzfN)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().zzb(zzbbm.zzfO)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z10) {
        zzg zzgVar;
        int i10;
        if (z10) {
            zzgVar = this.zzl;
            i10 = 0;
        } else {
            zzgVar = this.zzl;
            i10 = -16777216;
        }
        zzgVar.setBackgroundColor(i10);
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    public final void zzD(boolean z10) throws zzf {
        zzg zzgVar;
        int i10;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcez zzcezVar = this.zzc.zzd;
        zzcgm zzcgmVarZzN = zzcezVar != null ? zzcezVar.zzN() : null;
        boolean z11 = false;
        boolean z12 = zzcgmVarZzN != null && zzcgmVarZzN.zzK();
        this.zzm = false;
        if (z12) {
            int i11 = this.zzc.zzj;
            if (i11 == 6) {
                if (this.zzb.getResources().getConfiguration().orientation == 1) {
                    z11 = true;
                }
                this.zzm = z11;
            } else if (i11 == 7) {
                if (this.zzb.getResources().getConfiguration().orientation == 2) {
                    z11 = true;
                }
                this.zzm = z11;
            }
        }
        zzbzr.zze("Delay onShow to next orientation change: " + z11);
        zzA(this.zzc.zzj);
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        zzbzr.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            zzgVar = this.zzl;
            i10 = zza;
        } else {
            zzgVar = this.zzl;
            i10 = -16777216;
        }
        zzgVar.setBackgroundColor(i10);
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z10) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                Activity activity = this.zzb;
                zzcez zzcezVar2 = this.zzc.zzd;
                zzcgo zzcgoVarZzO = zzcezVar2 != null ? zzcezVar2.zzO() : null;
                zzcez zzcezVar3 = this.zzc.zzd;
                String strZzS = zzcezVar3 != null ? zzcezVar3.zzS() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzbzx zzbzxVar = adOverlayInfoParcel.zzm;
                zzcez zzcezVar4 = adOverlayInfoParcel.zzd;
                zzcez zzcezVarZza = zzcfl.zza(activity, zzcgoVarZzO, strZzS, true, z12, null, null, zzbzxVar, null, null, zzcezVar4 != null ? zzcezVar4.zzj() : null, zzawz.zza(), null, null, null);
                this.zzd = zzcezVarZza;
                zzcgm zzcgmVarZzN2 = zzcezVarZza.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbhc zzbhcVar = adOverlayInfoParcel2.zzp;
                zzbhe zzbheVar = adOverlayInfoParcel2.zze;
                zzz zzzVar = adOverlayInfoParcel2.zzi;
                zzcez zzcezVar5 = adOverlayInfoParcel2.zzd;
                zzcgmVarZzN2.zzM(null, zzbhcVar, null, zzbheVar, zzzVar, true, null, zzcezVar5 != null ? zzcezVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.google.android.gms.internal.ads.zzcgk
                    public final void zza(boolean z13) {
                        zzcez zzcezVar6 = this.zza.zzd;
                        if (zzcezVar6 != null) {
                            zzcezVar6.zzX();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzcez zzcezVar6 = this.zzc.zzd;
                if (zzcezVar6 != null) {
                    zzcezVar6.zzar(this);
                }
            } catch (Exception e10) {
                zzbzr.zzh("Error obtaining webview.", e10);
                throw new zzf("Could not obtain webview for the overlay.", e10);
            }
        } else {
            zzcez zzcezVar7 = this.zzc.zzd;
            this.zzd = zzcezVar7;
            zzcezVar7.zzak(this.zzb);
        }
        this.zzd.zzaf(this);
        zzcez zzcezVar8 = this.zzc.zzd;
        if (zzcezVar8 != null) {
            zzJ(zzcezVar8.zzQ(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.zzaj();
            }
            this.zzl.addView(this.zzd.zzF(), -1, -1);
        }
        if (!z10 && !this.zzm) {
            zze();
        }
        if (this.zzc.zzk != 5) {
            zzw(z12);
            if (this.zzd.zzaw()) {
                zzy(z12, true);
                return;
            }
            return;
        }
        zzebm zzebmVarZzf = zzebn.zzf();
        zzebmVarZzf.zza(this.zzb);
        zzebmVarZzf.zzb(this);
        zzebmVarZzf.zze(this.zzc.zzr);
        zzebmVarZzf.zzc(this.zzc.zzq);
        zzebmVarZzf.zzd(this.zzc.zzs);
        try {
            zzf(zzebmVarZzf.zzf());
        } catch (RemoteException | zzf e11) {
            throw new zzf(e11.getMessage(), e11);
        }
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfmd zzfmdVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfmdVar.removeCallbacks(runnable);
                zzfmdVar.post(this.zzp);
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcez zzcezVar = this.zzd;
        if (zzcezVar != null) {
            zzcezVar.zzW(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzax()) {
                    if (((Boolean) zzba.zzc().zzb(zzbbm.zzeA)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzby();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc();
                        }
                    };
                    this.zzp = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().zzb(zzbbm.zzaU)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final boolean zzG() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzaC = this.zzd.zzaC();
        if (!zZzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zZzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        zzcez zzcezVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcez zzcezVar2 = this.zzd;
        if (zzcezVar2 != null) {
            this.zzl.removeView(zzcezVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(viewZzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcezVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzJ(zzcezVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzebn zzebnVar) throws RemoteException, zzf {
        zzbrm zzbrmVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbrmVar = adOverlayInfoParcel.zzw) == null) {
            throw new zzf("noioou");
        }
        zzbrmVar.zzg(ObjectWrapper.wrap(zzebnVar));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzI((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public void zzl(Bundle bundle) {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzf("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzm.zzc > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z10 = zzjVar.zza;
                this.zzk = z10;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzu) {
                    zzcvt zzcvtVar = this.zzc.zzu;
                    if (zzcvtVar != null) {
                        zzcvtVar.zze();
                    }
                    zzo zzoVar = this.zzc.zzc;
                    if (zzoVar != null) {
                        zzoVar.zzb();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdcu zzdcuVar = this.zzc.zzv;
                    if (zzdcuVar != null) {
                        zzdcuVar.zzr();
                    }
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzt);
            this.zzl = zzgVar;
            zzgVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zzb);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i10 = adOverlayInfoParcel4.zzk;
            if (i10 == 1) {
                zzD(false);
                return;
            }
            if (i10 == 2) {
                this.zze = new zzh(adOverlayInfoParcel4.zzd);
                zzD(false);
            } else if (i10 == 3) {
                zzD(true);
            } else {
                if (i10 != 5) {
                    throw new zzf("Could not determine ad overlay type.");
                }
                zzD(false);
            }
        } catch (zzf e10) {
            zzbzr.zzj(e10.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzm() {
        zzcez zzcezVar = this.zzd;
        if (zzcezVar != null) {
            try {
                this.zzl.removeView(zzcezVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzo() {
        zzo zzoVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzeC)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            zzebm zzebmVarZzf = zzebn.zzf();
            zzebmVarZzf.zza(this.zzb);
            zzebmVarZzf.zzb(this.zzc.zzk == 5 ? this : null);
            zzebmVarZzf.zze(this.zzc.zzr);
            try {
                this.zzc.zzw.zzf(strArr, iArr, ObjectWrapper.wrap(zzebmVarZzf.zzf()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzr() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbF();
        }
        zzI(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzeC)).booleanValue()) {
            return;
        }
        zzcez zzcezVar = this.zzd;
        if (zzcezVar == null || zzcezVar.zzaz()) {
            zzbzr.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzt() {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzeC)).booleanValue()) {
            zzcez zzcezVar = this.zzd;
            if (zzcezVar == null || zzcezVar.zzaz()) {
                zzbzr.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzu() {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzeC)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzv() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzw(boolean z10) {
        int iIntValue = ((Integer) zzba.zzc().zzb(zzbbm.zzeF)).intValue();
        boolean z11 = ((Boolean) zzba.zzc().zzb(zzbbm.zzaX)).booleanValue() || z10;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z11 ? 0 : iIntValue;
        zzqVar.zzb = true != z11 ? iIntValue : 0;
        zzqVar.zzc = iIntValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzy(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzx() {
        this.zzr = true;
    }

    public final void zzy(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzba.zzc().zzb(zzbbm.zzaV)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z14 = ((Boolean) zzba.zzc().zzb(zzbbm.zzaW)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbqw(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzrVar.zzb(z12);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
