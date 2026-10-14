package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class a20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e20 f18763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hn0.c f18764b;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e20 f18766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f18767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<j20> f18768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final s20 f18769e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18765a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final he0 f18770f = new he0();

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.a20$a$a, reason: collision with other inner class name */
        public class RunnableC0197a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f18771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map f18772c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ j20 f18773d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f18774e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f18775f;

            /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.a20$a$a$a, reason: collision with other inner class name */
            public class C0198a implements e20.d {
                public C0198a() {
                }

                @Override // com.yandex.mobile.ads.impl.gx0.a
                public final void a(bi1 bi1Var) {
                    x60.b("Failed to download a native ads image:", bi1Var);
                    RunnableC0197a runnableC0197a = RunnableC0197a.this;
                    a.a(a.this, runnableC0197a.f18772c);
                }

                @Override // com.yandex.mobile.ads.impl.e20.d
                public final void a(e20.c cVar, boolean z10) {
                    String strD = RunnableC0197a.this.f18773d.d();
                    Bitmap bitmapB = cVar.b();
                    if (bitmapB != null) {
                        if (strD != null) {
                            RunnableC0197a.this.f18772c.put(strD, bitmapB);
                        }
                        RunnableC0197a runnableC0197a = RunnableC0197a.this;
                        a.a(a.this, runnableC0197a.f18772c);
                    }
                }
            }

            public RunnableC0197a(String str, HashMap map, j20 j20Var, int i10, int i11) {
                this.f18771b = str;
                this.f18772c = map;
                this.f18773d = j20Var;
                this.f18774e = i10;
                this.f18775f = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f18766b.a(this.f18771b, new C0198a(), this.f18774e, this.f18775f);
            }
        }

        public a(e20 e20Var, HashSet hashSet, s20 s20Var) {
            this.f18766b = e20Var;
            this.f18768d = hashSet;
            this.f18769e = s20Var;
            this.f18767c = new AtomicInteger(hashSet.size());
        }

        public static void a(a aVar, Map map) {
            if (aVar.f18767c.decrementAndGet() == 0) {
                aVar.f18769e.a(map);
            }
        }

        public final void a() {
            HashMap map = new HashMap();
            for (j20 j20Var : this.f18768d) {
                String strD = j20Var.d();
                int iA = j20Var.a();
                int iE = j20Var.e();
                boolean z10 = true;
                x60.e("Loading image ... %s", strD);
                int iA2 = j20Var.a();
                int iE2 = j20Var.e();
                Objects.requireNonNull(this.f18770f);
                Runtime runtime = Runtime.getRuntime();
                float fMaxMemory = Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
                float f10 = (iA2 * iE2 * 4) + 1048576.0f;
                if (fMaxMemory < f10) {
                    x60.d("Not enough free memory to create bitmap. FreeMemory = " + fMaxMemory + ", RequiredMemory = " + f10, new Object[0]);
                    z10 = false;
                }
                if (z10) {
                    this.f18765a.post(new RunnableC0197a(strD, map, j20Var, iE, iA));
                } else if (this.f18767c.decrementAndGet() == 0) {
                    this.f18769e.a(map);
                }
            }
        }
    }

    public a20(Context context) {
        hn0 hn0VarC = hn0.c(context);
        this.f18763a = hn0VarC.a();
        this.f18764b = hn0VarC.b();
    }

    public final void a(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Bitmap bitmap = (Bitmap) entry.getValue();
            if (bitmap != null) {
                this.f18764b.a(str, bitmap);
            }
        }
    }

    public final void a(HashSet hashSet, s20 s20Var) {
        if (hashSet.size() == 0) {
            s20Var.a(Collections.emptyMap());
        } else {
            new a(this.f18763a, hashSet, s20Var).a();
        }
    }
}
