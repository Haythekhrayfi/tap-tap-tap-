package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class nk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nk f23403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nk f23404f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f23407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f23408d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f23410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f23411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23412d;

        public a(nk nkVar) {
            fd.j0.i(nkVar, "connectionSpec");
            this.f23409a = nkVar.a();
            this.f23410b = nkVar.f23407c;
            this.f23411c = nkVar.f23408d;
            this.f23412d = nkVar.b();
        }

        public a(boolean z10) {
            this.f23409a = z10;
        }

        public final a a(b71... b71VarArr) {
            fd.j0.i(b71VarArr, "tlsVersions");
            if (!this.f23409a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(b71VarArr.length);
            for (b71 b71Var : b71VarArr) {
                arrayList.add(b71Var.a());
            }
            Object[] array = arrayList.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a a(uh... uhVarArr) {
            fd.j0.i(uhVarArr, "cipherSuites");
            if (!this.f23409a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(uhVarArr.length);
            for (uh uhVar : uhVarArr) {
                arrayList.add(uhVar.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a a(String... strArr) throws CloneNotSupportedException {
            fd.j0.i(strArr, "cipherSuites");
            if (!this.f23409a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = strArr.clone();
            fd.j0.g(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f23410b = (String[]) objClone;
            return this;
        }

        public final nk a() {
            return new nk(this.f23409a, this.f23412d, this.f23410b, this.f23411c);
        }

        public final a b() {
            if (!this.f23409a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f23412d = true;
            return this;
        }

        public final a b(String... strArr) throws CloneNotSupportedException {
            fd.j0.i(strArr, "tlsVersions");
            if (!this.f23409a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = strArr.clone();
            fd.j0.g(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f23411c = (String[]) objClone;
            return this;
        }
    }

    static {
        uh uhVar = uh.f25650r;
        uh uhVar2 = uh.f25651s;
        uh uhVar3 = uh.f25652t;
        uh uhVar4 = uh.f25644l;
        uh uhVar5 = uh.f25646n;
        uh uhVar6 = uh.f25645m;
        uh uhVar7 = uh.f25647o;
        uh uhVar8 = uh.f25649q;
        uh uhVar9 = uh.f25648p;
        uh[] uhVarArr = {uhVar, uhVar2, uhVar3, uhVar4, uhVar5, uhVar6, uhVar7, uhVar8, uhVar9, uh.f25642j, uh.f25643k, uh.f25640h, uh.f25641i, uh.f25638f, uh.f25639g, uh.f25637e};
        a aVarA = new a(true).a((uh[]) Arrays.copyOf(new uh[]{uhVar, uhVar2, uhVar3, uhVar4, uhVar5, uhVar6, uhVar7, uhVar8, uhVar9}, 9));
        b71 b71Var = b71.f19136b;
        b71 b71Var2 = b71.f19137c;
        aVarA.a(b71Var, b71Var2).b().a();
        f23403e = new a(true).a((uh[]) Arrays.copyOf(uhVarArr, 16)).a(b71Var, b71Var2).b().a();
        new a(true).a((uh[]) Arrays.copyOf(uhVarArr, 16)).a(b71Var, b71Var2, b71.f19138d, b71.f19139e).b().a();
        f23404f = new a(false).a();
    }

    public nk(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f23405a = z10;
        this.f23406b = z11;
        this.f23407c = strArr;
        this.f23408d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z10) throws CloneNotSupportedException {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        List listH;
        fd.j0.i(sSLSocket, "sslSocket");
        if (this.f23407c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            fd.j0.h(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            String[] strArr = this.f23407c;
            uh.b bVar = uh.f25634b;
            enabledCipherSuites = ea1.b(enabledCipherSuites2, strArr, uh.b.a());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f23408d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            fd.j0.h(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = ea1.b(enabledProtocols2, this.f23408d, lc.b.f33069c);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        fd.j0.h(supportedCipherSuites, "supportedCipherSuites");
        uh.b bVar2 = uh.f25634b;
        int iA = ea1.a(supportedCipherSuites, uh.b.a());
        if (z10 && iA != -1) {
            fd.j0.h(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iA];
            fd.j0.h(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = ea1.a(str, enabledCipherSuites);
        }
        a aVar = new a(this);
        fd.j0.h(enabledCipherSuites, "cipherSuitesIntersection");
        a aVarA = aVar.a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        fd.j0.h(enabledProtocols, "tlsVersionsIntersection");
        nk nkVarA = aVarA.b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
        String[] strArr2 = nkVarA.f23408d;
        List listH2 = null;
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList.add(b71.a.a(str2));
            }
            listH = kc.t.H(arrayList);
        } else {
            listH = null;
        }
        if (listH != null) {
            sSLSocket.setEnabledProtocols(nkVarA.f23408d);
        }
        String[] strArr3 = nkVarA.f23407c;
        if (strArr3 != null) {
            ArrayList arrayList2 = new ArrayList(strArr3.length);
            for (String str3 : strArr3) {
                arrayList2.add(uh.f25634b.a(str3));
            }
            listH2 = kc.t.H(arrayList2);
        }
        if (listH2 != null) {
            sSLSocket.setEnabledCipherSuites(nkVarA.f23407c);
        }
    }

    public final boolean a() {
        return this.f23405a;
    }

    public final boolean a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "socket");
        if (!this.f23405a) {
            return false;
        }
        String[] strArr = this.f23408d;
        if (strArr != null && !ea1.a(strArr, sSLSocket.getEnabledProtocols(), lc.b.f33069c)) {
            return false;
        }
        String[] strArr2 = this.f23407c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        uh.b bVar = uh.f25634b;
        return ea1.a(strArr2, enabledCipherSuites, uh.b.a());
    }

    public final boolean b() {
        return this.f23406b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f23405a;
        nk nkVar = (nk) obj;
        if (z10 != nkVar.f23405a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f23407c, nkVar.f23407c) && Arrays.equals(this.f23408d, nkVar.f23408d) && this.f23406b == nkVar.f23406b);
    }

    public final int hashCode() {
        if (!this.f23405a) {
            return 17;
        }
        String[] strArr = this.f23407c;
        int iHashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + 527) * 31;
        String[] strArr2 = this.f23408d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f23406b ? 1 : 0);
    }

    public final String toString() {
        List listH;
        if (!this.f23405a) {
            return "ConnectionSpec()";
        }
        StringBuilder sbA = v60.a("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f23407c;
        List listH2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(uh.f25634b.a(str));
            }
            listH = kc.t.H(arrayList);
        } else {
            listH = null;
        }
        sbA.append(Objects.toString(listH, "[all enabled]"));
        sbA.append(", tlsVersions=");
        String[] strArr2 = this.f23408d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(b71.a.a(str2));
            }
            listH2 = kc.t.H(arrayList2);
        }
        sbA.append(Objects.toString(listH2, "[all enabled]"));
        sbA.append(", supportsTlsExtensions=");
        return androidx.recyclerview.widget.s.a(sbA, this.f23406b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
