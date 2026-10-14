package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.q20;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.s20;
import com.yandex.mobile.ads.impl.ti;
import com.yandex.mobile.ads.impl.vc0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qh0 f27813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f27814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a20 f27815c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jm0 f27817e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f27819g = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f27818f = new s();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q20 f27816d = new q20();

    public class a implements s20 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.s20
        public final void a(Map<String, Bitmap> map) {
            r.this.f27817e.a();
            for (NativeAdImageLoadingListener nativeAdImageLoadingListener : r.this.f27819g) {
                if (nativeAdImageLoadingListener != null) {
                    nativeAdImageLoadingListener.onFinishLoadingImages();
                }
            }
        }
    }

    public r(Context context, qh0 qh0Var, g20 g20Var, jm0 jm0Var) {
        this.f27813a = qh0Var;
        this.f27814b = g20Var;
        this.f27817e = jm0Var;
        this.f27815c = new a20(context);
    }

    public static <T> T a(qa<T> qaVar) {
        if (qaVar != null) {
            return qaVar.d();
        }
        return null;
    }

    public final f a() {
        f fVar = new f();
        List<qa<?>> listB = this.f27813a.b();
        HashMap map = new HashMap();
        for (qa<?> qaVar : listB) {
            map.put(qaVar.b(), qaVar);
        }
        vc0 vc0Var = (vc0) a((qa) map.get("media"));
        fVar.a((String) a((qa) map.get("age")));
        fVar.b((String) a((qa) map.get("body")));
        fVar.a(a((qa) map.get("feedback")) != null);
        fVar.c((String) a((qa) map.get("call_to_action")));
        fVar.a((ti) a((qa) map.get("close_button")));
        fVar.d((String) a((qa) map.get("domain")));
        fVar.a((j20) a((qa) map.get("favicon")), this.f27814b);
        fVar.b((j20) a((qa) map.get("icon")), this.f27814b);
        j20 j20Var = null;
        List<j20> listA = vc0Var != null ? vc0Var.a() : null;
        if (listA != null && !listA.isEmpty()) {
            j20Var = listA.get(0);
        }
        fVar.c(j20Var, this.f27814b);
        fVar.a(this.f27818f.a(vc0Var));
        fVar.e((String) a((qa) map.get("price")));
        fVar.f((String) a((qa) map.get("rating")));
        fVar.g((String) a((qa) map.get("review_count")));
        fVar.h((String) a((qa) map.get("sponsored")));
        fVar.i((String) a((qa) map.get("title")));
        fVar.j((String) a((qa) map.get("warning")));
        return fVar;
    }

    public final void a(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f27819g.add(nativeAdImageLoadingListener);
    }

    public final int b() {
        return this.f27813a.g();
    }

    public final void b(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f27819g.remove(nativeAdImageLoadingListener);
    }

    public final String c() {
        return this.f27813a.d();
    }

    public final void d() {
        this.f27815c.a(this.f27816d.a(Collections.singletonList(this.f27813a)), new a());
    }
}
