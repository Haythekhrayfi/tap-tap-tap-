package okhttp3.internal.http2;

import fd.j0;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final g PSEUDO_PREFIX;
    public static final g RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final g TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final g TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final g TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final g TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final g name;
    public final g value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }
    }

    static {
        g.a aVar = g.f34892f;
        PSEUDO_PREFIX = aVar.d(":");
        RESPONSE_STATUS = aVar.d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.d(TARGET_AUTHORITY_UTF8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        j0.i(str, "name");
        j0.i(str2, "value");
        g.a aVar = g.f34892f;
        this(aVar.d(str), aVar.d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(g gVar, String str) {
        this(gVar, g.f34892f.d(str));
        j0.i(gVar, "name");
        j0.i(str, "value");
    }

    public Header(g gVar, g gVar2) {
        j0.i(gVar, "name");
        j0.i(gVar2, "value");
        this.name = gVar;
        this.value = gVar2;
        this.hpackSize = gVar.c() + 32 + gVar2.c();
    }

    public static /* synthetic */ Header copy$default(Header header, g gVar, g gVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = header.name;
        }
        if ((i10 & 2) != 0) {
            gVar2 = header.value;
        }
        return header.copy(gVar, gVar2);
    }

    public final g component1() {
        return this.name;
    }

    public final g component2() {
        return this.value;
    }

    public final Header copy(g gVar, g gVar2) {
        j0.i(gVar, "name");
        j0.i(gVar2, "value");
        return new Header(gVar, gVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return j0.d(this.name, header.name) && j0.d(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.l() + ": " + this.value.l();
    }
}
