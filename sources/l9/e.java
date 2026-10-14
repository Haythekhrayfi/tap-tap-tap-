package l9;

import android.os.Process;
import cd.i;
import fd.j0;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import k9.m;
import kotlin.reflect.KProperty;
import p7.d1;
import vc.b0;
import vc.t;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f33034a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b implements Runnable, Comparable<b> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f33035f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f33037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final yc.b f33038e;

        static {
            t tVar = new t(b.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0);
            Objects.requireNonNull(b0.f36991a);
            f33035f = new i[]{tVar};
        }

        public b(l9.a.C0349a<?> c0349a, int i10) {
            j0.i(c0349a, "channel");
            this.f33036c = i10;
            this.f33037d = c0349a.f33017a;
            this.f33038e = new m(c0349a);
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            j0.i(bVar2, "other");
            int i10 = this.f33036c - bVar2.f33036c;
            return i10 != 0 ? i10 : !j0.d(this.f33037d, bVar2.f33037d) ? 1 : 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!j0.d(b.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            b bVar = (b) obj;
            return j0.d(this.f33037d, bVar.f33037d) && this.f33036c == bVar.f33036c;
        }

        public int hashCode() {
            return this.f33037d.hashCode() + ((6913 + this.f33036c) * 31);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            l9.a.C0349a c0349a = (l9.a.C0349a) this.f33038e.getValue(this, f33035f[0]);
            if (c0349a == null || c0349a.f33022f.get()) {
                return;
            }
            try {
                c0349a.f33021e.offer((T) c0349a.f33019c.a());
            } catch (Exception unused) {
            }
        }
    }

    public static final class c extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b9.a f33039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l9.b<b> f33040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile String f33041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, b9.a aVar) {
            super(str);
            j0.i(str, "name");
            j0.i(aVar, "cpuUsageHistogramReporter");
            this.f33039c = aVar;
            this.f33040d = new l9.b<>(new PriorityQueue(32));
            setPriority(5);
        }

        public final void a() throws InterruptedException {
            b bVarPoll = this.f33040d.poll();
            if (bVarPoll == null) {
                try {
                    setPriority(3);
                    bVarPoll = this.f33040d.take();
                    setPriority(5);
                    j0.h(bVarPoll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.f33041e = bVarPoll.f33037d;
            bVarPoll.run();
            this.f33041e = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d1 d1VarA = this.f33039c.a("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        a();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        Objects.requireNonNull(d1VarA);
                        return;
                    }
                } catch (Throwable th) {
                    Objects.requireNonNull(d1VarA);
                    throw th;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public e(b9.a aVar) {
        j0.i(aVar, "cpuUsageHistogramReporter");
        c cVar = new c("ViewPoolThread", aVar);
        this.f33034a = cVar;
        cVar.start();
    }

    public final void a(l9.a.C0349a<?> c0349a) {
        if (j0.d(c0349a.f33017a, this.f33034a.f33041e) || c0349a.f33023g) {
            return;
        }
        l9.b<b> bVar = this.f33034a.f33040d;
        bVar.f33025d.lock();
        try {
            if (!j0.d(c0349a.f33017a, this.f33034a.f33041e) && !c0349a.f33023g) {
                bVar = this.f33034a.f33040d;
                bVar.f33025d.lock();
                try {
                    Iterator<b> it = bVar.f33024c.iterator();
                    while (it.hasNext()) {
                        if (j0.d(it.next().f33037d, c0349a.f33017a)) {
                            it.remove();
                            break;
                        }
                    }
                    bVar.f33025d.unlock();
                    this.f33034a.f33040d.offer(new b(c0349a, -1));
                } finally {
                    bVar.f33025d.unlock();
                }
            }
        } catch (Throwable th) {
            bVar.f33025d.unlock();
            throw th;
        }
    }
}
