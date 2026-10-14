package l3;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class m<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.g<b<A>, B> f32161a;

    public class a extends b4.g<b<A>, B> {
        public a(m mVar, long j10) {
            super(j10);
        }

        @Override // b4.g
        public void c(Object obj, Object obj2) {
            ((b) obj).b();
        }
    }

    public static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Queue<b<?>> f32162d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f32165c;

        static {
            char[] cArr = b4.j.f3307a;
            f32162d = new ArrayDeque(0);
        }

        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f32162d;
            synchronized (queue) {
                bVar = (b) ((ArrayDeque) queue).poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f32165c = a10;
            bVar.f32164b = i10;
            bVar.f32163a = i11;
            return bVar;
        }

        public void b() {
            Queue<b<?>> queue = f32162d;
            synchronized (queue) {
                ((ArrayDeque) queue).offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f32164b == bVar.f32164b && this.f32163a == bVar.f32163a && this.f32165c.equals(bVar.f32165c);
        }

        public int hashCode() {
            return this.f32165c.hashCode() + (((this.f32163a * 31) + this.f32164b) * 31);
        }
    }

    public m() {
        this(250L);
    }

    public m(long j10) {
        this.f32161a = new a(this, j10);
    }
}
