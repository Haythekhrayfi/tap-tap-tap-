package rb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Runnable f35358a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pb.a f35359b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pb.b<Object> f35360c = new c();

    /* JADX INFO: renamed from: rb.a$a, reason: collision with other inner class name */
    public static final class CallableC0404a<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35361c;

        public CallableC0404a(int i10) {
            this.f35361c = i10;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            return new ArrayList(this.f35361c);
        }
    }

    public static final class b implements pb.a {
        @Override // pb.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class c implements pb.b<Object> {
        @Override // pb.b
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }
}
