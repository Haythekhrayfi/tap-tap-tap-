package com.applovin.exoplayer2.d;

import android.os.Looper;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final h f5148c;

    public interface a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f5149b = com.applovin.exoplayer2.a.p.f3998n;

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void a() {
        }

        void release();
    }

    static {
        h hVar = new h() { // from class: com.applovin.exoplayer2.d.h.1
            @Override // com.applovin.exoplayer2.d.h
            public int a(com.applovin.exoplayer2.v vVar) {
                return vVar.f8201o != null ? 1 : 0;
            }

            @Override // com.applovin.exoplayer2.d.h
            public f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
                if (vVar.f8201o == null) {
                    return null;
                }
                return new l(new f.a(new t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
        };
        f5147b = hVar;
        f5148c = hVar;
    }

    int a(com.applovin.exoplayer2.v vVar);

    default a a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        return a.f5149b;
    }

    default void a() {
    }

    f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar);

    default void b() {
    }
}
