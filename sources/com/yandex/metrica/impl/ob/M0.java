package com.yandex.metrica.impl.ob;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f14451a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qi f14452b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14453a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f14454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f14455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f14456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c f14457e;

        public b(Qi qi, c cVar, String str) {
            this.f14457e = cVar;
            this.f14455c = qi == null ? 0L : qi.p();
            this.f14454b = qi != null ? qi.B() : 0L;
            this.f14456d = RecyclerView.FOREVER_NS;
        }

        public void a() {
            this.f14453a = true;
        }

        public void a(long j10, TimeUnit timeUnit) {
            this.f14456d = timeUnit.toMillis(j10);
        }

        public void a(Qi qi) {
            this.f14454b = qi.B();
            this.f14455c = qi.p();
        }

        public boolean b() {
            if (this.f14453a) {
                return true;
            }
            c cVar = this.f14457e;
            long j10 = this.f14455c;
            long j11 = this.f14454b;
            long j12 = this.f14456d;
            Objects.requireNonNull(cVar);
            return j11 - j10 >= j12;
        }
    }

    public static class c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f14458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C2047w.b f14459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceExecutorC1966sn f14460c;

        private d(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2047w.b bVar, b bVar2) {
            this.f14459b = bVar;
            this.f14458a = bVar2;
            this.f14460c = interfaceExecutorC1966sn;
        }

        public void a(long j10) {
            this.f14458a.a(j10, TimeUnit.SECONDS);
        }

        public void a(Qi qi) {
            this.f14458a.a(qi);
        }

        public boolean a(int i10) {
            if (!this.f14458a.b()) {
                return false;
            }
            this.f14459b.a(TimeUnit.SECONDS.toMillis(i10), this.f14460c);
            this.f14458a.a();
            return true;
        }
    }

    public synchronized d a(Runnable runnable, InterfaceExecutorC1966sn interfaceExecutorC1966sn, String str) {
        d dVar;
        C2047w.b bVar = new C2047w.b(runnable, P0.i().a());
        b bVar2 = new b(this.f14452b, new c(), str);
        synchronized (this) {
            dVar = new d(interfaceExecutorC1966sn, bVar, bVar2);
            this.f14451a.add(dVar);
        }
        return dVar;
        return dVar;
    }

    public void a(Qi qi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f14452b = qi;
            arrayList = new ArrayList(this.f14451a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(qi);
        }
    }
}
