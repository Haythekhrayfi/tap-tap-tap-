package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31813c = new a(null);

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f31814c;

        public b(Throwable th) {
            j0.i(th, "exception");
            this.f31814c = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && j0.d(this.f31814c, ((b) obj).f31814c);
        }

        public int hashCode() {
            return this.f31814c.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Failure(");
            sbA.append(this.f31814c);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f31814c;
        }
        return null;
    }
}
