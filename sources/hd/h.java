package hd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f31100b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f31101c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31102a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f31103a;

        public a(Throwable th) {
            this.f31103a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && j0.d(this.f31103a, ((a) obj).f31103a);
        }

        public int hashCode() {
            Throwable th = this.f31103a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // hd.h.c
        public String toString() {
            StringBuilder sbA = defpackage.a.a("Closed(");
            sbA.append(this.f31103a);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final <E> Object a(Throwable th) {
            a aVar = new a(th);
            b bVar = h.f31100b;
            return aVar;
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T a(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a) || (th = ((a) obj).f31103a) == null) {
            throw new IllegalStateException(fd.j.a("Trying to call 'getOrThrow' on a failed channel result: ", obj));
        }
        throw th;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && j0.d(this.f31102a, ((h) obj).f31102a);
    }

    public int hashCode() {
        Object obj = this.f31102a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.f31102a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
