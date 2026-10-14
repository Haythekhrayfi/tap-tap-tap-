package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenThemedActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f8587c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f8588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f8589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f8590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f8591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f8592h;

    /* JADX INFO: renamed from: com.applovin.impl.adview.q$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppLovinFullscreenAdViewObserver f8600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f8601d;

        public AnonymousClass3(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j10) {
            this.f8598a = context;
            this.f8599b = viewGroup;
            this.f8600c = appLovinFullscreenAdViewObserver;
            this.f8601d = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.f8598a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.q.3.1
                @Override // java.lang.Runnable
                public void run() {
                    q.this.f8585a.F();
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVarF = q.this.f8585a.F();
                        StringBuilder sbA = defpackage.a.a("Presenting ad in a containerView(");
                        sbA.append(AnonymousClass3.this.f8599b);
                        sbA.append(")");
                        yVarF.b("InterstitialAdDialogWrapper", sbA.toString());
                    }
                    AnonymousClass3.this.f8599b.setBackgroundColor(-16777216);
                    com.applovin.impl.sdk.ad.e eVar = q.this.f8592h;
                    AppLovinAdClickListener appLovinAdClickListener = q.this.f8591g;
                    AppLovinAdDisplayListener appLovinAdDisplayListener = q.this.f8589e;
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = q.this.f8590f;
                    Map map = q.this.f8587c;
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    com.applovin.impl.adview.activity.b.a.a(eVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener, map, q.this.f8585a, (Activity) anonymousClass3.f8598a, new com.applovin.impl.adview.activity.b.a.InterfaceC0110a() { // from class: com.applovin.impl.adview.q.3.1.1
                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                        public void a(com.applovin.impl.adview.activity.b.a aVar) {
                            if (com.applovin.impl.sdk.utils.b.a((Activity) AnonymousClass3.this.f8598a)) {
                                com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                                q.a(q.this.f8592h, q.this.f8589e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                                return;
                            }
                            AnonymousClass3.this.f8600c.setPresenter(aVar);
                            try {
                                aVar.a(AnonymousClass3.this.f8599b);
                            } catch (Throwable th) {
                                String str = "Failed to show interstitial: presenter threw exception " + th;
                                com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", str);
                                q.a(q.this.f8592h, q.this.f8589e, str, null, null);
                            }
                        }

                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                        public void a(String str, Throwable th) {
                            q.a(q.this.f8592h, q.this.f8589e, str, th, null);
                        }
                    });
                }
            }, this.f8601d);
        }
    }

    public q(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f8585a = appLovinSdk.a();
        this.f8586b = new WeakReference<>(context);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f8585a.a(com.applovin.impl.sdk.c.b.cr)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.q.6
            @Override // java.lang.Runnable
            public void run() {
                if (q.this.f8588d != null) {
                    q.this.f8588d.failedToReceiveAd(i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (((Boolean) this.f8585a.a(com.applovin.impl.sdk.c.b.dj)).booleanValue() ? AppLovinFullscreenThemedActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f8585a.ax());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f8585a.E().b() == null && ((Boolean) this.f8585a.a(com.applovin.impl.sdk.c.b.f10362de)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, final Context context) {
        g();
        this.f8592h = eVar;
        final long jMax = Math.max(0L, ((Long) this.f8585a.a(com.applovin.impl.sdk.c.b.cJ)).longValue());
        this.f8585a.F();
        if (com.applovin.impl.sdk.y.a()) {
            this.f8585a.F().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + jMax);
        }
        a(eVar, context, new Runnable() { // from class: com.applovin.impl.adview.q.2
            @Override // java.lang.Runnable
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.q.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        q.this.f8585a.F();
                        if (com.applovin.impl.sdk.y.a()) {
                            q.this.f8585a.F().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        q.this.a(context);
                    }
                }, jMax);
            }
        });
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.Q()) || !eVar.am() || com.applovin.impl.sdk.utils.i.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(eVar.an()).setMessage(eVar.ao()).setPositiveButton(eVar.ap(), (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.q.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        alertDialogCreate.show();
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        g();
        this.f8592h = eVar;
        long jMax = Math.max(0L, ((Long) this.f8585a.a(com.applovin.impl.sdk.c.b.cJ)).longValue());
        this.f8585a.F();
        if (com.applovin.impl.sdk.y.a()) {
            this.f8585a.F().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + jMax);
        }
        a(eVar, context, new AnonymousClass3(context, viewGroup, appLovinFullscreenAdViewObserver, jMax));
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.y.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
            com.applovin.impl.sdk.utils.o.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.o.b(appLovinAdDisplayListener, eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.q.5
            @Override // java.lang.Runnable
            public void run() {
                if (q.this.f8588d != null) {
                    q.this.f8588d.adReceived(appLovinAd);
                }
            }
        });
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f8589e != null) {
            if (this.f8589e instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) this.f8589e).onAdDisplayFailed(str);
            } else {
                this.f8589e.adHidden(appLovinAd);
            }
        }
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8585a.v().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private void g() {
        if (this.f8585a.E().b() == null) {
            this.f8585a.J().a(com.applovin.impl.sdk.d.f.f10477o);
        }
    }

    private Context h() {
        return this.f8586b.get();
    }

    public void a() {
        this.f8591g = null;
        this.f8588d = null;
        this.f8590f = null;
        this.f8589e = null;
    }

    public Map<String, Object> b() {
        return this.f8587c;
    }

    public AppLovinAdDisplayListener c() {
        return this.f8589e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f8590f;
    }

    public AppLovinAdClickListener e() {
        return this.f8591g;
    }

    public com.applovin.impl.sdk.ad.e f() {
        return this.f8592h;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f8591g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f8589e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8588d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8590f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f8587c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.q.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                q.this.a(appLovinAd);
                q.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i10) {
                q.this.a(i10);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAdA = com.applovin.impl.sdk.utils.w.a(appLovinAd, this.f8585a);
        Context contextH = h();
        String strA = a(appLovinAdA, appLovinAd, contextH);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAd, strA);
        } else {
            a((com.applovin.impl.sdk.ad.e) appLovinAdA, contextH);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        if (viewGroup == null || iVar == null) {
            com.applovin.impl.sdk.y.j("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            return;
        }
        AppLovinAd appLovinAdA = com.applovin.impl.sdk.utils.w.a(appLovinAd, this.f8585a);
        Context contextH = h();
        String strA = a(appLovinAdA, appLovinAd, contextH);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAd, strA);
            return;
        }
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(iVar, this, this.f8585a);
        iVar.a(appLovinFullscreenAdViewObserver);
        a((com.applovin.impl.sdk.ad.e) appLovinAdA, viewGroup, appLovinFullscreenAdViewObserver, contextH);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
