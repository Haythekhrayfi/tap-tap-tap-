package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.iab.omid.library.applovin.devicevolume.c, d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f12953f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12954a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f12955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f12956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f12957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f12958e;

    public h(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f12955b = eVar;
        this.f12956c = bVar;
    }

    private c a() {
        if (this.f12958e == null) {
            this.f12958e = c.c();
        }
        return this.f12958e;
    }

    public static h c() {
        if (f12953f == null) {
            f12953f = new h(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f12953f;
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f12954a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f12957d = this.f12955b.a(new Handler(), context, this.f12956c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f12954a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f12957d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f12957d.d();
    }
}
