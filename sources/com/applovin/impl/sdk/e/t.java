package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t extends d implements com.applovin.impl.mediation.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f10649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinAdLoadListener f10650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.adview.d f10651c;

    public class a extends com.applovin.impl.adview.e {
        private a(com.applovin.impl.sdk.o oVar) {
            super(null, oVar);
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            Iterator<String> it = t.this.f10534f.b(bVar).iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.e
        public boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.y yVar = t.this.f10536h;
            if (com.applovin.impl.sdk.y.a()) {
                t tVar = t.this;
                tVar.f10536h.c(tVar.f10535g, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.d)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (!a(scheme, com.applovin.impl.sdk.c.b.cs)) {
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.ct)) {
                com.applovin.impl.sdk.y yVar2 = t.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    t tVar2 = t.this;
                    tVar2.f10536h.b(tVar2.f10535g, "Ad load succeeded");
                }
                if (t.this.f10650b == null) {
                    return true;
                }
                t.this.f10650b.adReceived(t.this.f10649a);
            } else {
                if (!a(host, com.applovin.impl.sdk.c.b.cu)) {
                    com.applovin.impl.sdk.y yVar3 = t.this.f10536h;
                    if (!com.applovin.impl.sdk.y.a()) {
                        return true;
                    }
                    t tVar3 = t.this;
                    tVar3.f10536h.e(tVar3.f10535g, "Unrecognized webview event");
                    return true;
                }
                com.applovin.impl.sdk.y yVar4 = t.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    t tVar4 = t.this;
                    tVar4.f10536h.b(tVar4.f10535g, "Ad load failed");
                }
                if (t.this.f10650b == null) {
                    return true;
                }
                t.this.f10650b.failedToReceiveAd(204);
            }
            t.this.f10650b = null;
            return true;
        }
    }

    public t(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskProcessJavaScriptTagAd", oVar);
        this.f10649a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, oVar);
        this.f10650b = appLovinAdLoadListener;
        oVar.ao().a(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.j().equalsIgnoreCase(this.f10649a.Q())) {
            this.f10534f.ao().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f10650b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f10649a);
                this.f10650b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Rendering AppLovin ad #");
            sbA.append(this.f10649a.getAdIdNumber());
            yVar.b(str, sbA.toString());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.t.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    t tVar = t.this;
                    t tVar2 = t.this;
                    a aVar = new a(tVar2.f10534f);
                    t tVar3 = t.this;
                    tVar.f10651c = new com.applovin.impl.adview.d(aVar, tVar3.f10534f, tVar3.f());
                    t.this.f10651c.loadDataWithBaseURL(t.this.f10649a.aB(), t.this.f10649a.b(), "text/html", null, "");
                } catch (Throwable th) {
                    t.this.f10534f.ao().b(t.this);
                    com.applovin.impl.sdk.y yVar2 = t.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        t tVar4 = t.this;
                        tVar4.f10536h.b(tVar4.f10535g, "Failed to initialize WebView", th);
                    }
                    if (t.this.f10650b != null) {
                        t.this.f10650b.failedToReceiveAd(-1);
                        t.this.f10650b = null;
                    }
                }
            }
        });
    }
}
