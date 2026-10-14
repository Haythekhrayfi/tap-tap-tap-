package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B6 f13763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G6 f13764c;

    public C6(Context context) {
        this(context, new B6(context), new G6(context));
    }

    public C6(Context context, B6 b10, G6 g10) {
        this.f13762a = context;
        this.f13763b = b10;
        this.f13764c = g10;
    }

    public void a() {
        this.f13762a.getPackageName();
        this.f13764c.a().a(this.f13763b.a());
    }
}
