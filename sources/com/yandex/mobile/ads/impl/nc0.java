package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface nc0 {

    public interface a {
    }

    public static final class b extends jc0 {
        public b(int i10, long j10, Object obj) {
            super(i10, j10, obj);
        }

        public b(jc0 jc0Var) {
            super(jc0Var);
        }

        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public final b b(Object obj) {
            return new b(a(obj));
        }
    }

    public interface c {
        void a(nc0 nc0Var, v61 v61Var);
    }

    hc0 a(b bVar, u8 u8Var, long j10);

    void a(Handler handler, com.yandex.mobile.ads.exo.drm.f fVar);

    void a(Handler handler, oc0 oc0Var);

    void a(com.yandex.mobile.ads.exo.drm.f fVar);

    void a(hc0 hc0Var);

    void a(c cVar);

    void a(c cVar, g81 g81Var, gr0 gr0Var);

    void a(oc0 oc0Var);

    void b(c cVar);

    void c(c cVar);

    bc0 getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
