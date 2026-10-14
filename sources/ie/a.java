package ie;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0317a f31641c = new C0317a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f31643b;

    /* JADX INFO: renamed from: ie.a$a, reason: collision with other inner class name */
    public static final class C0317a {
        public C0317a() {
        }

        public C0317a(g gVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final a a() {
            return new a("", null, 2, 0 == true ? 1 : 0);
        }
    }

    public a(String str, a aVar) {
        j0.j(str, "name");
        this.f31642a = str;
        this.f31643b = aVar;
    }

    public /* synthetic */ a(String str, a aVar, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : aVar);
    }

    public final boolean a(a aVar) {
        j0.j(aVar, "p");
        if (!j0.d(this, aVar)) {
            a aVar2 = aVar.f31643b;
            if (!(aVar2 != null ? a(aVar2) : false)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j0.d(this.f31642a, aVar.f31642a) && j0.d(this.f31643b, aVar.f31643b);
    }

    public int hashCode() {
        String str = this.f31642a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f31643b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String string;
        a aVar = this.f31643b;
        if (aVar == null || (string = aVar.toString()) == null) {
            string = "";
        }
        if (!(string.length() > 0)) {
            return this.f31642a;
        }
        return string + CoreConstants.DOT + this.f31642a;
    }
}
