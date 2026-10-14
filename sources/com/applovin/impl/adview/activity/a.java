package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.s;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f8322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<AppLovinFullscreenActivity> f8323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f8324d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Messenger f8325e;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    public class C0108a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0108a() {
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message messageObtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f8325e.send(messageObtain);
            } catch (RemoteException e10) {
                y unused = a.this.f8322b;
                if (y.a()) {
                    y yVar = a.this.f8322b;
                    StringBuilder sbA = defpackage.a.a("Failed to forward callback (");
                    sbA.append(bVar.a());
                    sbA.append(")");
                    yVar.b("AppLovinFullscreenActivity", sbA.toString(), e10);
                }
            }
        }

        private void a(FullscreenAdService.b bVar) {
            a(null, bVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f8332a;

        private b(a aVar) {
            this.f8332a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.b.AD.a() || (aVar = this.f8332a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.a(com.applovin.impl.sdk.ad.b.a(message.getData().getInt(FullscreenAdService.DATA_KEY_AD_SOURCE)), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, o oVar) {
        this.f8321a = oVar;
        this.f8322b = oVar.F();
        this.f8323c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.f8323c.get();
        if (appLovinFullscreenActivity != null) {
            if (y.a()) {
                this.f8322b.b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (y.a()) {
            this.f8322b.e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (!TextUtils.isEmpty(string)) {
                this.f8321a.G().a((d) new s(jSONObject, com.applovin.impl.sdk.ad.d.a(string), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void adReceived(final AppLovinAd appLovinAd) {
                        final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f8323c.get();
                        y unused = a.this.f8322b;
                        boolean zA = y.a();
                        if (appLovinFullscreenActivity != null) {
                            if (zA) {
                                a.this.f8322b.b("AppLovinFullscreenActivity", "Presenting ad...");
                            }
                            final C0108a c0108a = new C0108a();
                            com.applovin.impl.adview.activity.b.a.a((e) appLovinAd, c0108a, c0108a, c0108a, null, a.this.f8321a, appLovinFullscreenActivity, new com.applovin.impl.adview.activity.b.a.InterfaceC0110a() { // from class: com.applovin.impl.adview.activity.a.1.1
                                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                                public void a(com.applovin.impl.adview.activity.b.a aVar) {
                                    appLovinFullscreenActivity.setPresenter(aVar);
                                    aVar.d();
                                }

                                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                                public void a(String str2, Throwable th) {
                                    q.a((e) appLovinAd, c0108a, str2, th, appLovinFullscreenActivity);
                                }
                            });
                            return;
                        }
                        if (zA) {
                            a.this.f8322b.e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                        }
                    }

                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void failedToReceiveAd(int i10) {
                        a.this.a();
                    }
                }, this.f8321a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e10) {
            if (y.a()) {
                this.f8322b.b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f8324d.compareAndSet(false, true)) {
            if (y.a()) {
                this.f8322b.b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f8325e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            messageObtain.replyTo = new Messenger(new b());
            try {
                if (y.a()) {
                    this.f8322b.b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f8325e.send(messageObtain);
            } catch (RemoteException e10) {
                if (y.a()) {
                    this.f8322b.b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f8324d.compareAndSet(true, false) && y.a()) {
            this.f8322b.b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
