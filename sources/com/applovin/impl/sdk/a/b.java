package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppLovinAdBase f10111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f10112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f10113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f10116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdEvents f10117g;

    public b(AppLovinAdBase appLovinAdBase) {
        this.f10111a = appLovinAdBase;
        this.f10112b = appLovinAdBase.getSdk();
        this.f10113c = appLovinAdBase.getSdk().F();
        StringBuilder sbA = defpackage.a.a("AdEventTracker:");
        sbA.append(appLovinAdBase.getAdIdNumber());
        String string = sbA.toString();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbA2 = android.support.v4.media.c.a(string, ":");
            sbA2.append(appLovinAdBase.getDspName());
            string = sbA2.toString();
        }
        this.f10114d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        a(view, Collections.emptyList());
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.f10116f.registerAdView(view);
                b.this.f10116f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f10116f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            y yVar = b.this.f10113c;
                            if (y.a()) {
                                b bVar = b.this;
                                bVar.f10113c.b(bVar.f10114d, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    public void a(AdSession adSession) {
    }

    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.f10116f.error(ErrorType.VIDEO, str);
            }
        });
    }

    public void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    b bVar = b.this;
                    if (bVar.f10115e) {
                        y yVar = bVar.f10113c;
                        if (y.a()) {
                            b bVar2 = b.this;
                            bVar2.f10113c.b(bVar2.f10114d, "Running operation: " + str);
                        }
                        runnable.run();
                    }
                } catch (Throwable th) {
                    y yVar2 = b.this.f10113c;
                    if (y.a()) {
                        b bVar3 = b.this;
                        y yVar3 = bVar3.f10113c;
                        String str2 = bVar3.f10114d;
                        StringBuilder sbA = defpackage.a.a("Failed to run operation: ");
                        sbA.append(str);
                        yVar3.b(str2, sbA.toString(), th);
                    }
                }
            }
        });
    }

    public void b() {
        b(null);
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext adSessionContextA;
                if (!b.this.f10111a.isOpenMeasurementEnabled()) {
                    y yVar = b.this.f10113c;
                    if (y.a()) {
                        b bVar = b.this;
                        bVar.f10113c.c(bVar.f10114d, "Skip starting session - Open Measurement disabled");
                        return;
                    }
                    return;
                }
                b bVar2 = b.this;
                AdSession adSession = bVar2.f10116f;
                y yVar2 = bVar2.f10113c;
                boolean zA = y.a();
                if (adSession != null) {
                    if (zA) {
                        b bVar3 = b.this;
                        y yVar3 = bVar3.f10113c;
                        String str = bVar3.f10114d;
                        StringBuilder sbA = defpackage.a.a("Attempting to start session again for ad: ");
                        sbA.append(b.this.f10111a);
                        yVar3.d(str, sbA.toString());
                        return;
                    }
                    return;
                }
                if (zA) {
                    b bVar4 = b.this;
                    bVar4.f10113c.b(bVar4.f10114d, "Starting session");
                }
                AdSessionConfiguration adSessionConfigurationA = b.this.a();
                if (adSessionConfigurationA == null || (adSessionContextA = b.this.a(webView)) == null) {
                    return;
                }
                try {
                    b.this.f10116f = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
                    try {
                        b bVar5 = b.this;
                        bVar5.f10117g = AdEvents.createAdEvents(bVar5.f10116f);
                        b bVar6 = b.this;
                        bVar6.a(bVar6.f10116f);
                        b.this.f10116f.start();
                        b bVar7 = b.this;
                        bVar7.f10115e = true;
                        y yVar4 = bVar7.f10113c;
                        if (y.a()) {
                            b bVar8 = b.this;
                            bVar8.f10113c.b(bVar8.f10114d, "Session started");
                        }
                    } catch (Throwable th) {
                        y yVar5 = b.this.f10113c;
                        if (y.a()) {
                            b bVar9 = b.this;
                            bVar9.f10113c.b(bVar9.f10114d, "Failed to create ad events", th);
                        }
                    }
                } catch (Throwable th2) {
                    y yVar6 = b.this.f10113c;
                    if (y.a()) {
                        b bVar10 = b.this;
                        bVar10.f10113c.b(bVar10.f10114d, "Failed to create session", th2);
                    }
                }
            }
        });
    }

    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f10117g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.f10117g.impressionOccurred();
            }
        });
    }

    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f10115e = false;
                bVar.f10116f.finish();
                b bVar2 = b.this;
                bVar2.f10116f = null;
                bVar2.f10117g = null;
            }
        });
    }
}
