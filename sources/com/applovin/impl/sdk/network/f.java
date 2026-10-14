package com.applovin.impl.sdk.network;

import androidx.appcompat.widget.r0;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f10911d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<j> f10913f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10912e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<j> f10914g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10915h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set<j> f10916i = new HashSet();

    public f(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10908a = oVar;
        this.f10909b = oVar.F();
        int iIntValue = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.f0do)).intValue();
        this.f10910c = iIntValue;
        if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.ds)).booleanValue()) {
            this.f10911d = null;
            this.f10913f = new ArrayList<>();
        } else {
            h hVar = new h(this, oVar);
            this.f10911d = hVar;
            this.f10913f = hVar.a(iIntValue);
            hVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.f10909b.b("PersistentPostbackManager", "Preparing to submit postback..." + jVar);
        }
        if (this.f10908a.c() && !jVar.q()) {
            if (y.a()) {
                this.f10909b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        synchronized (this.f10912e) {
            if (this.f10916i.contains(jVar)) {
                if (y.a()) {
                    this.f10909b.b("PersistentPostbackManager", "Skip pending postback: " + jVar.b());
                }
                return;
            }
            jVar.m();
            d();
            int iIntValue = ((Integer) this.f10908a.a(com.applovin.impl.sdk.c.b.dm)).intValue();
            if (jVar.l() <= iIntValue) {
                synchronized (this.f10912e) {
                    this.f10916i.add(jVar);
                }
                this.f10908a.ah().dispatchPostbackRequest(l.b(this.f10908a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).f(jVar.i()).d(jVar.h()).a(jVar.g()).i(jVar.j()).g(jVar.k()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i10) {
                        y unused = f.this.f10909b;
                        if (y.a()) {
                            y yVar = f.this.f10909b;
                            StringBuilder sbA = r0.a("Failed to submit postback with errorCode ", i10, ". Will retry later...  Postback: ");
                            sbA.append(jVar);
                            yVar.c("PersistentPostbackManager", sbA.toString());
                        }
                        f.this.e(jVar);
                        com.applovin.impl.sdk.utils.o.a(appLovinPostbackListener, str, i10);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        f.this.d(jVar);
                        y unused = f.this.f10909b;
                        if (y.a()) {
                            y yVar = f.this.f10909b;
                            StringBuilder sbA = defpackage.a.a("Successfully submitted postback: ");
                            sbA.append(jVar);
                            yVar.b("PersistentPostbackManager", sbA.toString());
                        }
                        f.this.e();
                        com.applovin.impl.sdk.utils.o.a(appLovinPostbackListener, str);
                    }
                });
                return;
            }
            if (y.a()) {
                this.f10909b.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + iIntValue + ". Dequeuing postback: " + jVar);
            }
            d(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        synchronized (this.f10912e) {
            while (this.f10913f.size() > this.f10910c) {
                this.f10913f.remove(0);
            }
            this.f10913f.add(jVar);
            d();
            if (y.a()) {
                this.f10909b.b("PersistentPostbackManager", "Enqueued postback: " + jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    private void d() {
        this.f10915h = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.f10912e) {
            this.f10916i.remove(jVar);
            this.f10913f.remove(jVar);
            d();
        }
        if (y.a()) {
            this.f10909b.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (this.f10912e) {
            Iterator<j> it = this.f10914g.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f10914g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.f10912e) {
            this.f10916i.remove(jVar);
            this.f10914g.add(jVar);
        }
    }

    public long a() {
        return this.f10915h;
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar) {
        a(jVar, true);
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar, boolean z10) {
        a(jVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final j jVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(jVar.b())) {
            if (z10) {
                jVar.n();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (f.this.f10912e) {
                        f.this.b(jVar);
                        f.this.a(jVar, appLovinPostbackListener);
                    }
                }
            };
            if (!w.b()) {
                runnable.run();
            } else {
                this.f10908a.G().a(new ac(this.f10908a, jVar.q(), "submitPostback", runnable), r.b.POSTBACKS);
            }
        }
    }

    public List<j> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f10912e) {
            arrayList.ensureCapacity(this.f10913f.size());
            arrayList.addAll(this.f10913f);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.f10912e) {
                    if (f.this.f10913f != null) {
                        Iterator it = new ArrayList(f.this.f10913f).iterator();
                        while (it.hasNext()) {
                            f.this.c((j) it.next());
                        }
                    }
                }
            }
        };
        if (!((Boolean) this.f10908a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue()) {
            runnable.run();
        } else {
            this.f10908a.G().a(new ac(this.f10908a, "flushPostbacksQueue", runnable), r.b.POSTBACKS);
        }
    }
}
