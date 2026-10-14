package l9;

import android.view.View;
import fd.j0;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f33014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f33015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, C0349a<? extends View>> f33016c;

    /* JADX INFO: renamed from: l9.a$a, reason: collision with other inner class name */
    public static final class C0349a<T extends View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f33018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f<T> f33019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f33020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BlockingQueue<T> f33021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f33022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f33023g;

        /* JADX INFO: renamed from: l9.a$a$a, reason: collision with other inner class name */
        public static final class C0350a {
            public C0350a() {
            }

            public C0350a(vc.g gVar) {
            }
        }

        static {
            new C0350a(null);
        }

        public C0349a(String str, h hVar, f<T> fVar, e eVar, int i10) {
            j0.i(str, "viewName");
            j0.i(fVar, "viewFactory");
            j0.i(eVar, "viewCreator");
            this.f33017a = str;
            this.f33018b = hVar;
            this.f33019c = fVar;
            this.f33020d = eVar;
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10, false);
            this.f33021e = arrayBlockingQueue;
            this.f33022f = new AtomicBoolean(false);
            this.f33023g = !arrayBlockingQueue.isEmpty();
            int i11 = 0;
            while (i11 < i10) {
                i11++;
                e eVar2 = this.f33020d;
                Objects.requireNonNull(eVar2);
                eVar2.f33034a.f33040d.offer(new e.b(this, 0));
            }
        }
    }

    public a(h hVar, e eVar) {
        j0.i(eVar, "viewCreator");
        this.f33014a = hVar;
        this.f33015b = eVar;
        this.f33016c = new q.a();
    }

    @Override // l9.g
    public <T extends View> void a(String str, f<T> fVar, int i10) {
        synchronized (this.f33016c) {
            if (this.f33016c.containsKey(str)) {
                int i11 = e9.a.f29114a;
            } else {
                this.f33016c.put(str, new C0349a<>(str, this.f33014a, fVar, this.f33015b, i10));
            }
        }
    }

    @Override // l9.g
    public <T extends View> T b(String str) {
        C0349a<? extends View> c0349a;
        j0.i(str, "tag");
        synchronized (this.f33016c) {
            Map<String, C0349a<? extends View>> map = this.f33016c;
            j0.i(map, "<this>");
            C0349a<? extends View> c0349a2 = map.get(str);
            if (c0349a2 == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            c0349a = c0349a2;
        }
        long jNanoTime = System.nanoTime();
        T tPoll = c0349a.f33021e.poll();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (tPoll == null) {
            long jNanoTime3 = System.nanoTime();
            try {
                c0349a.f33020d.a(c0349a);
                tPoll = c0349a.f33021e.poll(16L, TimeUnit.MILLISECONDS);
                if (tPoll == null) {
                    tPoll = c0349a.f33019c.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                tPoll = c0349a.f33019c.a();
            }
            long jNanoTime4 = System.nanoTime() - jNanoTime3;
            h hVar = c0349a.f33018b;
            if (hVar != null) {
                String str2 = c0349a.f33017a;
                j0.i(str2, "viewName");
                synchronized (hVar.f33043b) {
                    hVar.f33043b.b(str2, jNanoTime4);
                    hVar.f33044c.a(hVar.f33045d);
                }
            }
        } else {
            h hVar2 = c0349a.f33018b;
            if (hVar2 != null) {
                synchronized (hVar2.f33043b) {
                    c.a aVar = hVar2.f33043b.f33028a;
                    aVar.f33031a += jNanoTime2;
                    aVar.f33032b++;
                    hVar2.f33044c.a(hVar2.f33045d);
                }
            }
        }
        long jNanoTime5 = System.nanoTime();
        int size = c0349a.f33021e.size();
        e eVar = c0349a.f33020d;
        Objects.requireNonNull(eVar);
        eVar.f33034a.f33040d.offer(new e.b(c0349a, size));
        long jNanoTime6 = System.nanoTime() - jNanoTime5;
        h hVar3 = c0349a.f33018b;
        if (hVar3 != null) {
            synchronized (hVar3.f33043b) {
                c cVar = hVar3.f33043b;
                cVar.f33028a.f33031a += jNanoTime6;
                if (jNanoTime6 >= 1000000) {
                    c.a aVar2 = cVar.f33029b;
                    aVar2.f33031a += jNanoTime6;
                    aVar2.f33032b++;
                }
                hVar3.f33044c.a(hVar3.f33045d);
            }
        }
        j0.f(tPoll);
        return (T) tPoll;
    }
}
