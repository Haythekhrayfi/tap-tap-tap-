package m0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class p<T> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Callable<T> f33165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0.a<T> f33166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f33167e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0.a f33168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f33169d;

        public a(p pVar, o0.a aVar, Object obj) {
            this.f33168c = aVar;
            this.f33169d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f33168c.accept(this.f33169d);
        }
    }

    public p(Handler handler, Callable<T> callable, o0.a<T> aVar) {
        this.f33165c = callable;
        this.f33166d = aVar;
        this.f33167e = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T tCall;
        try {
            tCall = this.f33165c.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f33167e.post(new a(this, this.f33166d, tCall));
    }
}
