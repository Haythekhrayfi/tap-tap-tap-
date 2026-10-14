package com.iab.omid.library.applovin.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f12931f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.applovin.utils.f f12932a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f12933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f12935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12936e;

    private a(d dVar) {
        this.f12935d = dVar;
    }

    public static a a() {
        return f12931f;
    }

    private void c() {
        if (!this.f12934c || this.f12933b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.f12934c) {
            return;
        }
        this.f12935d.a(context);
        this.f12935d.a(this);
        this.f12935d.e();
        this.f12936e = this.f12935d.c();
        this.f12934c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f12936e && z10) {
            d();
        }
        this.f12936e = z10;
    }

    public Date b() {
        Date date = this.f12933b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f12932a.a();
        Date date = this.f12933b;
        if (date == null || dateA.after(date)) {
            this.f12933b = dateA;
            c();
        }
    }
}
