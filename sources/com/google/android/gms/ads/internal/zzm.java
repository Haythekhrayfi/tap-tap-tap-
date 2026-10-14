package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfbi;

/* JADX INFO: loaded from: classes.dex */
final class zzm extends WebViewClient {
    public final /* synthetic */ zzs zza;

    public zzm(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzg != null) {
            try {
                zzsVar.zzg.zzf(zzfbi.zzd(1, null, null));
            } catch (RemoteException e10) {
                zzbzr.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzs zzsVar2 = this.zza;
        if (zzsVar2.zzg != null) {
            try {
                zzsVar2.zzg.zze(0);
            } catch (RemoteException e11) {
                zzbzr.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzsVar = this.zza;
            if (zzsVar.zzg != null) {
                try {
                    zzsVar.zzg.zzf(zzfbi.zzd(3, null, null));
                } catch (RemoteException e10) {
                    zzbzr.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzs zzsVar2 = this.zza;
            if (zzsVar2.zzg != null) {
                try {
                    zzsVar2.zzg.zze(3);
                } catch (RemoteException e11) {
                    zzbzr.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.zza;
            if (zzsVar3.zzg != null) {
                try {
                    zzsVar3.zzg.zzf(zzfbi.zzd(1, null, null));
                } catch (RemoteException e12) {
                    zzbzr.zzl("#007 Could not call remote method.", e12);
                }
            }
            zzs zzsVar4 = this.zza;
            if (zzsVar4.zzg != null) {
                try {
                    zzsVar4.zzg.zze(0);
                } catch (RemoteException e13) {
                    zzbzr.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.zza;
            if (zzsVar5.zzg != null) {
                try {
                    zzsVar5.zzg.zzi();
                } catch (RemoteException e14) {
                    zzbzr.zzl("#007 Could not call remote method.", e14);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar6 = this.zza;
        if (zzsVar6.zzg != null) {
            try {
                zzsVar6.zzg.zzc();
                this.zza.zzg.zzh();
            } catch (RemoteException e15) {
                zzbzr.zzl("#007 Could not call remote method.", e15);
            }
        }
        zzs.zzw(this.zza, zzs.zzo(this.zza, str));
        return true;
    }
}
