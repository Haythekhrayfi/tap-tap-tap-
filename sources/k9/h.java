package k9;

import fd.j0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f31949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Runnable> f31950e;

    public final class a extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f31951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(hVar.f31947b);
            j0.i(hVar, "this$0");
            this.f31951d = hVar;
        }

        @Override // k9.f
        public void a() {
            List<Runnable> list;
            h hVar = this.f31951d;
            synchronized (hVar.f31948c) {
                if (j0.d(hVar.f31949d, this) && (list = hVar.f31950e) != null) {
                    hVar.f31950e = null;
                    boolean z10 = true;
                    while (z10) {
                        if (list != null) {
                            try {
                                h hVar2 = this.f31951d;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException e10) {
                                        hVar2.a(e10);
                                    }
                                }
                            } catch (Throwable th) {
                                h hVar3 = this.f31951d;
                                synchronized (hVar3.f31948c) {
                                    hVar3.f31949d = null;
                                    throw th;
                                }
                            }
                        }
                        h hVar4 = this.f31951d;
                        synchronized (hVar4.f31948c) {
                            List<Runnable> list2 = hVar4.f31950e;
                            if (list2 != null) {
                                hVar4.f31950e = null;
                                list = list2;
                            } else {
                                hVar4.f31949d = null;
                                z10 = false;
                            }
                        }
                    }
                    return;
                }
                int i10 = e9.a.f29114a;
            }
        }
    }

    public h(Executor executor, String str) {
        j0.i(executor, "executor");
        j0.i(str, "threadNameSuffix");
        this.f31946a = executor;
        this.f31947b = str;
        this.f31948c = new Object();
    }

    public abstract void a(RuntimeException runtimeException);
}
