package com.yandex.metrica.impl.ob;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2047w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f17740c = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f17741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nm f17742b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f17743a;

        public a(C2047w c2047w, c cVar) {
            this.f17743a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17743a.a();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17744a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f17745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C2047w f17746c;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w$b$a */
        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f17747a;

            public a(Runnable runnable) {
                this.f17747a = runnable;
            }

            @Override // com.yandex.metrica.impl.ob.C2047w.c
            public void a() {
                b.this.f17744a = true;
                this.f17747a.run();
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w$b$b, reason: collision with other inner class name */
        public class RunnableC0187b implements Runnable {
            public RunnableC0187b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f17745b.a();
            }
        }

        public b(Runnable runnable, C2047w c2047w) {
            this.f17745b = new a(runnable);
            this.f17746c = c2047w;
        }

        public void a(long j10, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
            if (!this.f17744a) {
                this.f17746c.a(j10, interfaceExecutorC1966sn, this.f17745b);
            } else {
                ((C1941rn) interfaceExecutorC1966sn).execute(new RunnableC0187b());
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w$c */
    public interface c {
        void a();
    }

    public C2047w() {
        this(new Nm());
    }

    public C2047w(Nm nm) {
        this.f17742b = nm;
    }

    public void a() {
        Objects.requireNonNull(this.f17742b);
        this.f17741a = System.currentTimeMillis();
    }

    public void a(long j10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, c cVar) {
        Objects.requireNonNull(this.f17742b);
        C1941rn c1941rn = (C1941rn) interfaceExecutorC1966sn;
        c1941rn.a(new a(this, cVar), Math.max(j10 - (System.currentTimeMillis() - this.f17741a), 0L));
    }
}
