package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.impl.yl;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18493a;

        public a(Throwable th, int i10) {
            super(th);
            this.f18493a = i10;
        }
    }

    void a(f.a aVar);

    boolean a(String str);

    void b(f.a aVar);

    int c();

    default boolean d() {
        return false;
    }

    Map<String, String> e();

    UUID f();

    a g();

    yl h();
}
