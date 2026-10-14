package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.c.h;
import com.applovin.impl.c.k;
import com.applovin.impl.c.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f10138h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.c.a f10139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f10140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaEvents f10141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final VastProperties f10142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f10143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f10144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f10145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f10146p;

    public g(com.applovin.impl.c.a aVar) {
        super(aVar);
        this.f10140j = new AtomicBoolean();
        this.f10143m = new AtomicBoolean();
        this.f10144n = new AtomicBoolean();
        this.f10145o = new AtomicBoolean();
        this.f10146p = new AtomicBoolean();
        this.f10139i = aVar;
        this.f10142l = aVar.i() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia(aVar.i(), true, Position.STANDALONE);
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (y.a()) {
                this.f10113c.b(this.f10114d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        com.applovin.impl.c.f fVar;
        Set<k> setD;
        if (!f10138h && this.f10139i.bd() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (com.applovin.impl.c.b bVar : this.f10139i.bd().a()) {
            List<h> listB = bVar.b();
            if (!listB.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (h hVar : listB) {
                    if ("omid".equalsIgnoreCase(hVar.a())) {
                        arrayList2.add(hVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    setD = bVar.d();
                    fVar = com.applovin.impl.c.f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                    m.a(setD, fVar, this.f10112b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((h) it.next()).b()));
                        } catch (Throwable th) {
                            if (y.a()) {
                                this.f10113c.b(this.f10114d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        String strC = bVar.c();
                        String strA = bVar.a();
                        if (!StringUtils.isValidString(strC) || StringUtils.isValidString(strA)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strC) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strA, url, strC) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        }
                    }
                }
            }
            setD = bVar.d();
            fVar = com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE;
            m.a(setD, fVar, this.f10112b);
        }
        String strE = this.f10112b.ad().e();
        if (TextUtils.isEmpty(strE)) {
            if (y.a()) {
                this.f10113c.e(this.f10114d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f10112b.ad().d(), strE, arrayList, this.f10139i.getOpenMeasurementContentUrl(), this.f10139i.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!y.a()) {
                return null;
            }
            this.f10113c.b(this.f10114d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void a(final float f10, final boolean z10) {
        if (this.f10143m.compareAndSet(false, true)) {
            a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.start(f10, z10 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void a(AdSession adSession) {
        try {
            this.f10141k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (y.a()) {
                this.f10113c.b(this.f10114d, "Failed to create media events", th);
            }
        }
    }

    public void a(final boolean z10) {
        a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.volumeChange(z10 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f10117g.loaded(gVar.f10142l);
            }
        });
    }

    public void f() {
        if (this.f10144n.compareAndSet(false, true)) {
            a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.f10145o.compareAndSet(false, true)) {
            a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.f10146p.compareAndSet(false, true)) {
            a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.complete();
            }
        });
    }

    public void j() {
        a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.resume();
            }
        });
    }

    public void l() {
        if (this.f10140j.compareAndSet(false, true)) {
            a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.f10140j.compareAndSet(true, false)) {
            a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10141k.bufferFinish();
                }
            });
        }
    }

    public void n() {
        a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.f10141k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
