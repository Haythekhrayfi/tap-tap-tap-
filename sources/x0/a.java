package x0;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import q.h;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f37330g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f37334d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<b, Long> f37331a = new h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f37332b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0457a f37333c = new C0457a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37335e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37336f = false;

    /* JADX INFO: renamed from: x0.a$a, reason: collision with other inner class name */
    public class C0457a {
        public C0457a() {
        }

        public void a() {
            boolean z10;
            a.this.f37335e = SystemClock.uptimeMillis();
            a aVar = a.this;
            long j10 = aVar.f37335e;
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (int i10 = 0; i10 < aVar.f37332b.size(); i10++) {
                b bVar = aVar.f37332b.get(i10);
                if (bVar != null) {
                    Long orDefault = aVar.f37331a.getOrDefault(bVar, null);
                    if (orDefault == null) {
                        z10 = true;
                    } else if (orDefault.longValue() < jUptimeMillis) {
                        aVar.f37331a.remove(bVar);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        bVar.a(j10);
                    }
                }
            }
            if (aVar.f37336f) {
                int size = aVar.f37332b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (aVar.f37332b.get(size) == null) {
                        aVar.f37332b.remove(size);
                    }
                }
                aVar.f37336f = false;
            }
            if (a.this.f37332b.size() > 0) {
                a aVar2 = a.this;
                if (aVar2.f37334d == null) {
                    aVar2.f37334d = new d(aVar2.f37333c);
                }
                d dVar = (d) aVar2.f37334d;
                dVar.f37339b.postFrameCallback(dVar.f37340c);
            }
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0457a f37338a;

        public c(C0457a c0457a) {
            this.f37338a = c0457a;
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f37339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f37340c;

        /* JADX INFO: renamed from: x0.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0458a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0458a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f37338a.a();
            }
        }

        public d(C0457a c0457a) {
            super(c0457a);
            this.f37339b = Choreographer.getInstance();
            this.f37340c = new ChoreographerFrameCallbackC0458a();
        }
    }

    public static a a() {
        ThreadLocal<a> threadLocal = f37330g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }
}
