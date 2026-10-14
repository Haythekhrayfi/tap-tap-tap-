package l9;

import android.os.Handler;
import android.os.Looper;
import fd.j0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f33042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f33043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f33044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f33045d;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f33047d;

        public a(h hVar) {
            j0.i(hVar, "this$0");
            this.f33047d = hVar;
        }

        public final void a(Handler handler) {
            j0.i(handler, "handler");
            if (this.f33046c) {
                return;
            }
            handler.post(this);
            this.f33046c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.f33047d;
            synchronized (hVar.f33043b) {
                c cVar = hVar.f33043b;
                boolean z10 = true;
                if (cVar.f33029b.f33032b <= 0) {
                    Iterator it = ((q.g.b) cVar.f33030c.entrySet()).iterator();
                    do {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                    } while (((c.a) ((Map.Entry) it.next()).getValue()).f33032b <= 0);
                }
                if (z10) {
                    hVar.f33042a.reportEvent("view pool profiling", hVar.f33043b.a());
                }
                c cVar2 = hVar.f33043b;
                cVar2.f33028a.a();
                cVar2.f33029b.a();
                Iterator it2 = ((q.g.b) cVar2.f33030c.entrySet()).iterator();
                while (it2.hasNext()) {
                    ((c.a) ((Map.Entry) it2.next()).getValue()).a();
                }
            }
            this.f33046c = false;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33048a = new a();

        public static final class a implements b {
            @Override // l9.h.b
            public void reportEvent(String str, Map<String, ? extends Object> map) {
            }
        }

        void reportEvent(String str, Map<String, ? extends Object> map);
    }

    public h(b bVar) {
        j0.i(bVar, "reporter");
        this.f33042a = bVar;
        this.f33043b = new c();
        this.f33044c = new a(this);
        this.f33045d = new Handler(Looper.getMainLooper());
    }
}
