package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzauz extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzauq zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzauz() {
        zzauq zzauqVar = new zzauq();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzauqVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbcx.zzd.zze()).intValue();
        this.zzg = ((Long) zzbcx.zza.zze()).intValue();
        this.zzh = ((Long) zzbcx.zze.zze()).intValue();
        this.zzi = ((Long) zzbcx.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzT)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzU)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzV)).intValue();
        this.zze = ((Long) zzbcx.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzX);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzY)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzZ)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaa)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ec */
    /* JADX WARN: Code duplicated, block: B:64:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00da->B:71:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauz.run():void");
    }

    public final zzaup zza() {
        return this.zzd.zza(this.zzp);
    }

    public final zzauy zzb(View view, zzaup zzaupVar) {
        if (view == null) {
            return new zzauy(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzauy(this, 0, 0);
            }
            zzaupVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzauy(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcez)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzauy(this, 0, 0);
            }
            zzaupVar.zzh();
            webView.post(new zzaux(this, zzaupVar, webView, globalVisibleRect));
            return new zzauy(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzauy(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            zzauy zzauyVarZzb = zzb(viewGroup.getChildAt(i12), zzaupVar);
            i10 += zzauyVarZzb.zza;
            i11 += zzauyVarZzb.zzb;
        }
        return new zzauy(this, i10, i11);
    }

    public final void zzc(View view) {
        try {
            zzaup zzaupVar = new zzaup(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzW), FacebookMediationAdapter.KEY_ID, contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzauy zzauyVarZzb = zzb(view, zzaupVar);
            zzaupVar.zzm();
            if (zzauyVarZzb.zza == 0 && zzauyVarZzb.zzb == 0) {
                return;
            }
            int i10 = zzauyVarZzb.zzb;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.zzd.zzb(zzaupVar);
            } else if (zzaupVar.zzc() == 0) {
                return;
            }
            if (this.zzd.zzd(zzaupVar)) {
                return;
            }
            this.zzd.zzb(zzaupVar);
        } catch (Exception e10) {
            zzbzr.zzh("Exception in fetchContentOnUIThread", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "ContentFetchTask.fetchContent");
        }
    }

    public final void zzd(zzaup zzaupVar, WebView webView, String str, boolean z10) {
        zzaupVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzaupVar.zzl(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzaupVar.zzl(webView.getTitle() + "\n" + strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzaupVar.zzo()) {
                this.zzd.zzc(zzaupVar);
            }
        } catch (JSONException unused) {
            zzbzr.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzbzr.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzbzr.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzbzr.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzbzr.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
