package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g implements AppLovinBroadcastManager.Receiver, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f10927d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<j> f10929f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10928e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<j> f10930g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<j> f10931h = new ArrayList();

    public g(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10924a = oVar;
        this.f10925b = oVar.F();
        int iIntValue = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.f0do)).intValue();
        this.f10926c = iIntValue;
        if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.ds)).booleanValue()) {
            this.f10927d = null;
            this.f10929f = new ArrayList();
        } else {
            i iVar = new i(this, oVar);
            this.f10927d = iVar;
            this.f10929f = iVar.a(iIntValue);
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.f10925b.b("PersistentPostbackManagerV2", "Preparing to submit postback: " + jVar);
        }
        if (this.f10924a.c() && !jVar.q()) {
            if (y.a()) {
                this.f10925b.b("PersistentPostbackManagerV2", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.f10925b.e("PersistentPostbackManagerV2", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f10928e) {
            if (this.f10930g.contains(jVar)) {
                if (y.a()) {
                    this.f10925b.b("PersistentPostbackManagerV2", "Skipping in progress postback: " + jVar.b());
                }
                return;
            }
            jVar.m();
            Integer num = (Integer) this.f10924a.a(com.applovin.impl.sdk.c.b.dm);
            if (jVar.l() > num.intValue()) {
                if (y.a()) {
                    this.f10925b.d("PersistentPostbackManagerV2", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + jVar);
                }
                d(jVar);
                return;
            }
            synchronized (this.f10928e) {
                this.f10930g.add(jVar);
            }
            l lVarB = l.b(this.f10924a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).f(jVar.i()).d(jVar.h()).a(jVar.g()).i(jVar.j()).g(jVar.k()).a();
            if (y.a()) {
                this.f10925b.b("PersistentPostbackManagerV2", "Submitting postback: " + jVar);
            }
            this.f10924a.ah().dispatchPostbackRequest(lVarB, new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.g.3
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i10) {
                    y unused = g.this.f10925b;
                    if (y.a()) {
                        y yVar = g.this.f10925b;
                        StringBuilder sbA = defpackage.a.a("Failed to submit postback: ");
                        sbA.append(jVar);
                        sbA.append(" with error code: ");
                        sbA.append(i10);
                        sbA.append("; will retry later...");
                        yVar.c("PersistentPostbackManagerV2", sbA.toString());
                    }
                    g.this.e(jVar);
                    com.applovin.impl.sdk.utils.o.a(appLovinPostbackListener, str, i10);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    g.this.d(jVar);
                    y unused = g.this.f10925b;
                    if (y.a()) {
                        y yVar = g.this.f10925b;
                        StringBuilder sbA = defpackage.a.a("Successfully submit postback: ");
                        sbA.append(jVar);
                        yVar.b("PersistentPostbackManagerV2", sbA.toString());
                    }
                    g.this.b();
                    com.applovin.impl.sdk.utils.o.a(appLovinPostbackListener, str);
                }
            });
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (!z10) {
            runnable.run();
        } else {
            this.f10924a.G().a(new ac(this.f10924a, z11, "runPostbackTask", runnable), r.b.POSTBACKS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this.f10928e) {
            Iterator<j> it = this.f10931h.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            this.f10931h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        synchronized (this.f10928e) {
            while (this.f10929f.size() > this.f10926c) {
                this.f10929f.remove(0);
            }
            this.f10929f.add(jVar);
        }
        if (y.a()) {
            this.f10925b.b("PersistentPostbackManagerV2", "Enqueued postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.f10928e) {
            this.f10930g.remove(jVar);
            this.f10929f.remove(jVar);
        }
        if (y.a()) {
            this.f10925b.b("PersistentPostbackManagerV2", "Dequeued postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.f10928e) {
            this.f10930g.remove(jVar);
            this.f10931h.add(jVar);
        }
    }

    public List<j> a() {
        List<j> list;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f10928e) {
            if (((Boolean) this.f10924a.a(com.applovin.impl.sdk.c.b.dr)).booleanValue()) {
                arrayList.ensureCapacity(this.f10931h.size());
                list = this.f10931h;
            } else {
                arrayList.ensureCapacity(this.f10929f.size());
                list = this.f10929f;
            }
            arrayList.addAll(list);
        }
        return arrayList;
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
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.f10925b.e("PersistentPostbackManagerV2", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                jVar.n();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (g.this.f10928e) {
                        g.this.c(jVar);
                        g.this.a(jVar, appLovinPostbackListener);
                    }
                }
            }, w.b(), jVar.q());
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (g.this.f10928e) {
                    Iterator it = new ArrayList(g.this.f10929f).iterator();
                    while (it.hasNext()) {
                        g.this.b((j) it.next());
                    }
                }
            }
        }, ((Boolean) this.f10924a.a(com.applovin.impl.sdk.c.b.dn)).booleanValue(), false);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        this.f10924a.G().a(this.f10927d, r.b.POSTBACKS);
    }
}
