package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f22796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kv0 f22797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f22798c;

    public lv0(Context context, AdResponse adResponse, k2 k2Var, List<String> list) {
        this.f22798c = list;
        this.f22796a = new k6(context, k2Var);
        this.f22797b = new kv0(context, adResponse, k2Var);
    }

    public final void a() {
        List<String> list = this.f22798c;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f22796a.a(it.next());
            }
        }
        this.f22797b.a();
    }

    public final void a(qk0 qk0Var) {
        this.f22797b.a(qk0Var);
    }
}
