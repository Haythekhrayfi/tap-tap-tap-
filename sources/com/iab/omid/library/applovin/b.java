package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12918a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.1-Applovin";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.applovin.internal.b.g().a(context);
        com.iab.omid.library.applovin.utils.a.a(context);
        com.iab.omid.library.applovin.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.applovin.internal.a.a().a(context);
    }

    public void a(boolean z10) {
        this.f12918a = z10;
    }

    public boolean b() {
        return this.f12918a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.applovin.internal.a.a().d();
    }
}
