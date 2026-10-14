package bc;

import java.io.Serializable;
import lb.k;

/* JADX INFO: loaded from: classes3.dex */
public enum f {
    COMPLETE;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nb.b f3506c;

        public a(nb.b bVar) {
            this.f3506c = bVar;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("NotificationLite.Disposable[");
            sbA.append(this.f3506c);
            sbA.append("]");
            return sbA.toString();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f3507c;

        public b(Throwable th) {
            this.f3507c = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            Throwable th = this.f3507c;
            Throwable th2 = ((b) obj).f3507c;
            return th == th2 || (th != null && th.equals(th2));
        }

        public int hashCode() {
            return this.f3507c.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("NotificationLite.Error[");
            sbA.append(this.f3507c);
            sbA.append("]");
            return sbA.toString();
        }
    }

    public static final class c implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.c f3508c;

        public c(me.c cVar) {
            this.f3508c = cVar;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("NotificationLite.Subscription[");
            sbA.append(this.f3508c);
            sbA.append("]");
            return sbA.toString();
        }
    }

    public static <T> boolean accept(Object obj, k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            kVar.a(((b) obj).f3507c);
            return true;
        }
        kVar.d(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, me.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            bVar.a(((b) obj).f3507c);
            return true;
        }
        bVar.d(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            kVar.a(((b) obj).f3507c);
            return true;
        }
        if (obj instanceof a) {
            kVar.b(((a) obj).f3506c);
            return false;
        }
        kVar.d(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, me.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            bVar.a(((b) obj).f3507c);
            return true;
        }
        if (obj instanceof c) {
            bVar.c(((c) obj).f3508c);
            return false;
        }
        bVar.d(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(nb.b bVar) {
        return new a(bVar);
    }

    public static Object error(Throwable th) {
        return new b(th);
    }

    public static nb.b getDisposable(Object obj) {
        return ((a) obj).f3506c;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f3507c;
    }

    public static me.c getSubscription(Object obj) {
        return ((c) obj).f3508c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(me.c cVar) {
        return new c(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
