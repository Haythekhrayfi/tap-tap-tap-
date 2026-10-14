package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A8 f14868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cc f14869b;

    public Rc(Context context) {
        this(Qa.a(context).e(), new Cc(context));
    }

    public Rc(A8 a10, Cc cc2) {
        this.f14868a = a10;
        this.f14869b = cc2;
    }

    public void a(Tc tc2) {
        String strA = this.f14869b.a(tc2);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f14868a.a(tc2.d(), strA);
    }
}
