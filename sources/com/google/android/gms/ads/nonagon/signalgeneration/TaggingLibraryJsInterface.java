package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfwn;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaqs zzc;
    private final int zzd;
    private final zzdqf zze;
    private final boolean zzf;
    private final zzfwn zzg = zzcae.zze;
    private final zzfgr zzh;

    public TaggingLibraryJsInterface(WebView webView, zzaqs zzaqsVar, zzdqf zzdqfVar, zzfgr zzfgrVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaqsVar;
        this.zze = zzdqfVar;
        zzbbm.zza(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbbm.zziV)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbbm.zziW)).booleanValue();
        this.zzh = zzfgrVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String strZze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZze;
        } catch (RuntimeException e10) {
            zzbzr.zzh("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            zzbzr.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcae.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzbzr.zzh("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzar zzarVar = new zzar(this, string);
        if (((Boolean) zzba.zzc().zzb(zzbbm.zziY)).booleanValue()) {
            this.zzg.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(bundle, zzarVar);
                }
            });
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzarVar);
        }
        return string;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String strZzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e10) {
            zzbzr.zzh("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzbzr.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcae.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i10, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzbzr.zzh("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzja)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i12 = jSONObject.getInt("x");
            int i13 = jSONObject.getInt("y");
            int i14 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i15 = jSONObject.getInt("type");
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        i11 = 1;
                    } else if (i15 == 2) {
                        i11 = 2;
                    } else if (i15 != 3) {
                        i10 = -1;
                    } else {
                        i11 = 3;
                    }
                    this.zzc.zzd(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                i10 = 0;
                this.zzc.zzd(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e10) {
                e = e10;
                zzbzr.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e11) {
                e = e11;
                zzbzr.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i11 = i10;
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }

    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZzb != null ? cookieManagerZzb.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzc(String str) {
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = this.zzc.zza(uriZza, this.zza, this.zzb, null);
        } catch (zzaqt e10) {
            zzbzr.zzf("Failed to append the click signal to URL: ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(uriZza.toString(), null);
    }
}
