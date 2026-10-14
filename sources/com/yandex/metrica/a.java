package com.yandex.metrica;

import com.yandex.metrica.impl.ob.C1941rn;
import com.yandex.metrica.impl.ob.InterfaceExecutorC1966sn;
import com.yandex.metrica.impl.ob.Y;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceExecutorC1966sn f13501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<b> f13502b;

    /* JADX INFO: renamed from: com.yandex.metrica.a$a, reason: collision with other inner class name */
    public interface InterfaceC0171a {
        void a();

        void b();
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceExecutorC1966sn f13503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0171a f13504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f13505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13506d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Runnable f13507e = new RunnableC0172a();

        /* JADX INFO: renamed from: com.yandex.metrica.a$b$a, reason: collision with other inner class name */
        public class RunnableC0172a implements Runnable {
            public RunnableC0172a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f13504b.a();
            }
        }

        public b(a aVar, InterfaceC0171a interfaceC0171a, InterfaceExecutorC1966sn interfaceExecutorC1966sn, long j10) {
            this.f13504b = interfaceC0171a;
            this.f13503a = interfaceExecutorC1966sn;
            this.f13505c = j10;
        }
    }

    public a(long j10) {
        C1941rn c1941rnB = Y.g().d().b();
        this.f13502b = new HashSet();
        this.f13501a = c1941rnB;
    }
}
