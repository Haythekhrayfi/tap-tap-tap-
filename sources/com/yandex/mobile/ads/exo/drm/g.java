package com.yandex.mobile.ads.exo.drm;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.l91;
import com.yandex.mobile.ads.impl.yv;
import y9.k8;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f18499a = new a();

    public class a implements g {
        @Override // com.yandex.mobile.ads.exo.drm.g
        public final int a(yv yvVar) {
            return yvVar.f27118o != null ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.exo.drm.g
        public final e a(f.a aVar, yv yvVar) {
            if (yvVar.f27118o == null) {
                return null;
            }
            return new l(new e.a(new l91(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.yandex.mobile.ads.exo.drm.g
        public final void a(Looper looper, gr0 gr0Var) {
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18500a = k8.f41151w;

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    int a(yv yvVar);

    e a(f.a aVar, yv yvVar);

    void a(Looper looper, gr0 gr0Var);

    default b b(f.a aVar, yv yvVar) {
        return b.f18500a;
    }

    default void prepare() {
    }

    default void release() {
    }
}
