package com.applovin.impl.sdk.network;

import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.ActionConst;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.utils.ab;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f10820a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f10822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f10823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f10824e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10826b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f10825a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f10826b = j10;
        }

        public long a() {
            return this.f10825a;
        }

        public long b() {
            return this.f10826b;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.b$b, reason: collision with other inner class name */
    public class C0143b<T> implements o0.a<e.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.c<T> f10829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final T f10831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f10832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f10833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d<T> f10834h;

        private C0143b(String str, com.applovin.impl.sdk.network.c<T> cVar, String str2, T t10, boolean z10, a aVar, d<T> dVar) {
            this.f10828b = str;
            this.f10829c = cVar;
            this.f10830d = str2;
            this.f10831e = t10;
            this.f10832f = z10;
            this.f10833g = aVar;
            this.f10834h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v9, types: [com.applovin.impl.sdk.network.b$d] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // o0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e.c cVar) {
            int i10;
            int i11;
            String message;
            ?? r10;
            d<T> dVar;
            long jD = cVar.d();
            Object objA = null;
            int iA = 0;
            try {
                int iA2 = cVar.a();
                try {
                    if (iA2 <= 0) {
                        b.this.a(this.f10830d, this.f10828b, iA2, jD, (Throwable) null);
                        dVar = this.f10834h;
                    } else {
                        if (iA2 >= 200 && iA2 < 400) {
                            a aVar = this.f10833g;
                            if (aVar != null) {
                                aVar.a(jD);
                            }
                            b.this.a(this.f10830d, this.f10828b, iA2, jD);
                            byte[] bArrB = cVar.b();
                            if (w.g(o.au()) && (!this.f10832f || r.a(bArrB) != r.a.V2)) {
                                b.this.f10821b.X().a(bArrB != null ? new String(cVar.b(), Charset.forName("UTF-8")) : "", this.f10828b, this.f10829c.e() != null ? this.f10829c.e().toString() : "");
                            }
                            if (bArrB == null) {
                                this.f10834h.a(this.f10831e, iA2);
                                return;
                            }
                            String str = new String(cVar.b(), Charset.forName("UTF-8"));
                            a aVar2 = this.f10833g;
                            if (aVar2 != null) {
                                aVar2.b(bArrB.length);
                                if (this.f10829c.q()) {
                                    b.this.f10824e = new c(this.f10829c.a(), bArrB.length, jD);
                                }
                            }
                            if (this.f10832f) {
                                String strA = r.a(bArrB, b.this.f10821b.ax(), b.this.f10821b);
                                if (strA == null) {
                                    HashMap map = new HashMap(2);
                                    map.put("request", StringUtils.getHostAndPath(this.f10828b));
                                    map.put("response", str);
                                    b.this.f10821b.x().trackEvent("rdf", map);
                                }
                                str = strA;
                            }
                            try {
                                this.f10834h.a((T) b.this.a(str, this.f10831e), iA2);
                                return;
                            } catch (Throwable th) {
                                String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f10828b) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                y unused = b.this.f10822c;
                                if (y.a()) {
                                    b.this.f10822c.b("ConnectionManager", str2, th);
                                }
                                b.this.f10821b.J().a(com.applovin.impl.sdk.d.f.f10473k);
                                b.this.f10821b.ag().a("ConnectionManager", "failedToParseResponse:" + StringUtils.getHost(this.f10828b), th);
                                this.f10834h.a(AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                return;
                            }
                        }
                        dVar = this.f10834h;
                    }
                    dVar.a(iA2, null, null);
                } catch (MalformedURLException e10) {
                    e = e10;
                    i10 = iA2;
                    i11 = -901;
                    if (this.f10831e == null) {
                        b.this.a(this.f10830d, this.f10828b, i10, jD);
                        this.f10834h.a(this.f10831e, -901);
                        return;
                    }
                    b.this.a(this.f10830d, this.f10828b, i10, jD, e);
                    d<T> dVar2 = this.f10834h;
                    message = e.getMessage();
                    r10 = dVar2;
                    r10.a(i11, message, objA);
                } catch (Throwable th2) {
                    th = th2;
                    iA = iA2;
                    if (iA == 0) {
                        iA = b.this.a(th);
                    }
                    i11 = iA;
                    try {
                        byte[] bArrC = cVar.c();
                        String str3 = new String(bArrC);
                        if (bArrC != null) {
                            if (this.f10832f) {
                                str3 = r.a(bArrC, b.this.f10821b.ax(), b.this.f10821b);
                            }
                            objA = b.this.a(str3, this.f10831e);
                        }
                    } catch (Throwable unused2) {
                    }
                    b.this.a(this.f10830d, this.f10828b, i11, jD, th);
                    d<T> dVar3 = this.f10834h;
                    message = th.getMessage();
                    r10 = dVar3;
                    r10.a(i11, message, objA);
                }
            } catch (MalformedURLException e11) {
                e = e11;
                i10 = 0;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f10835a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f10837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f10838d;

        public c(String str, long j10, long j11) {
            this.f10836b = str;
            this.f10837c = j10;
            this.f10838d = j11;
        }

        public long a() {
            return this.f10835a;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public String b() {
            return this.f10836b;
        }

        public long c() {
            return this.f10837c;
        }

        public long d() {
            return this.f10838d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a(this) || a() != cVar.a() || c() != cVar.c() || d() != cVar.d()) {
                return false;
            }
            String strB = b();
            String strB2 = cVar.b();
            return strB != null ? strB.equals(strB2) : strB2 == null;
        }

        public int hashCode() {
            long jA = a();
            long jC = c();
            int i10 = ((((int) (jA ^ (jA >>> 32))) + 59) * 59) + ((int) (jC ^ (jC >>> 32)));
            long jD = d();
            String strB = b();
            return (((i10 * 59) + ((int) ((jD >>> 32) ^ jD))) * 59) + (strB == null ? 43 : strB.hashCode());
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ConnectionManager.RequestMeasurement(timestampMillis=");
            sbA.append(a());
            sbA.append(", urlHostAndPathString=");
            sbA.append(b());
            sbA.append(", responseSizeBytes=");
            sbA.append(c());
            sbA.append(", connectionTimeMillis=");
            sbA.append(d());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public interface d<T> {
        void a(int i10, String str, T t10);

        void a(T t10, int i10);
    }

    public b(o oVar) {
        this.f10821b = oVar;
        this.f10822c = oVar.F();
        e eVar = new e(oVar);
        this.f10823d = eVar;
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(String str, T t10) throws JSONException, SAXException, ClassCastException {
        if (t10 == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t10 instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t10 instanceof aa) {
                return (T) ab.a(str, this.f10821b);
            }
            if (t10 instanceof String) {
                return str;
            }
            if (y.a()) {
                y yVar = this.f10822c;
                StringBuilder sbA = defpackage.a.a("Failed to process response of type '");
                sbA.append(t10.getClass().getName());
                sbA.append("'");
                yVar.e("ConnectionManager", sbA.toString());
            }
        }
        return t10;
    }

    private String a(String str) {
        StringBuilder sbA = defpackage.a.a("#");
        sbA.append(str.hashCode());
        sbA.append(" \"");
        sbA.append(StringUtils.getHostAndPath(str));
        sbA.append("\"");
        return sbA.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (y.a()) {
            this.f10822c.c("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.f10821b) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (y.a()) {
            this.f10822c.b("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.f10821b) + " to " + a(str2), th);
        }
    }

    public c a() {
        return this.f10824e;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x024e A[Catch: all -> 0x02a4, TryCatch #2 {all -> 0x02a4, blocks: (B:45:0x0124, B:47:0x0134, B:51:0x0160, B:50:0x015c, B:52:0x016f, B:55:0x0194, B:57:0x01b0, B:61:0x01cf, B:77:0x0232, B:80:0x0241, B:82:0x024e, B:63:0x01d3, B:66:0x01db, B:72:0x01f3, B:74:0x01f9, B:75:0x0213, B:58:0x01be, B:83:0x0251, B:85:0x0257, B:86:0x026b, B:68:0x01ec), top: B:108:0x0124, inners: #0 }] */
    public <T> void a(com.applovin.impl.sdk.network.c<T> cVar, a aVar, d<T> dVar) {
        byte[] bytes;
        byte[] bArrB;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        String strA = cVar.a();
        String strB = cVar.b();
        if (strA == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (strB == null) {
            throw new IllegalArgumentException("No method specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!strA.toLowerCase().startsWith("http")) {
            String str = "Requested postback submission to non HTTP endpoint " + strA + "; skipping...";
            y.j("ConnectionManager", str);
            dVar.a(AppLovinErrorCodes.INVALID_URL, str, null);
            return;
        }
        if (((Boolean) this.f10821b.a(com.applovin.impl.sdk.c.b.dx)).booleanValue() && !strA.contains("https://")) {
            this.f10821b.F();
            if (y.a()) {
                this.f10821b.F().d("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            strA = strA.replace("http://", "https://");
        }
        HashMap map = new HashMap(2);
        boolean zO = cVar.o();
        r.a aVarA = ((Boolean) this.f10821b.a(com.applovin.impl.sdk.c.b.fB)).booleanValue() ? r.a.a(((Integer) this.f10821b.a(com.applovin.impl.sdk.c.b.fy)).intValue()) : cVar.p();
        long jA = w.a(this.f10821b);
        if ((cVar.c() != null && !cVar.c().isEmpty()) || cVar.i() > 0) {
            Map<String, String> mapC = cVar.c();
            Boolean bool = (Boolean) this.f10821b.a(com.applovin.impl.sdk.c.b.dM);
            if (mapC != null && cVar.i() > 0) {
                mapC.put("current_retry_attempt", String.valueOf(cVar.i()));
            }
            boolean zBooleanValue = bool.booleanValue();
            if (zO) {
                String strA2 = w.a(mapC, zBooleanValue);
                String strA3 = r.a(strA2, jA, aVarA, this.f10821b.ax(), this.f10821b);
                if (StringUtils.isValidString(strA2) && TextUtils.isEmpty(strA3)) {
                    map.put("query", strA2);
                }
                strA = StringUtils.appendQueryParameter(strA, "p", strA3);
            } else {
                strA = StringUtils.appendQueryParameters(strA, mapC, zBooleanValue);
            }
        }
        String str2 = strA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str2), f10820a);
            if (y.a()) {
                y yVar = this.f10822c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Sending ");
                sb2.append(strB);
                sb2.append(" request to id=#");
                sb2.append(str2.hashCode());
                sb2.append(" \"");
                sb2.append(boolEndsWith.booleanValue() ? str2 : StringUtils.getHostAndPath(str2));
                sb2.append("\"...");
                yVar.c("ConnectionManager", sb2.toString());
            }
            e.b.a aVarA2 = new e.b.a().a(str2).b(strB).a(cVar.d()).a(cVar.j());
            if (cVar.e() != null) {
                if (zO) {
                    bytes = r.b(cVar.e().toString(), jA, aVarA, this.f10821b.ax(), this.f10821b);
                    if (bytes == null) {
                        map.put("body", cVar.e().toString());
                    }
                } else {
                    bytes = cVar.e().toString().getBytes("UTF-8");
                }
                byte[] bArr = bytes;
                if (!(zO && aVarA == r.a.V2) && cVar.r() && bArr != null && bArr.length > ((Integer) this.f10821b.a(com.applovin.impl.sdk.c.b.fV)).intValue()) {
                    try {
                        bArrB = w.b(bArr);
                    } catch (Throwable th) {
                        if (y.a()) {
                            this.f10822c.b("ConnectionManager", "Failed to gzip POST body for request " + a(str2), th);
                        }
                        this.f10821b.ag().a("ConnectionManager", "gzip:" + StringUtils.getHost(str2), th);
                        bArrB = null;
                    }
                    aVarA2.a("Content-Type", "application/json; charset=utf-8");
                    if (!cVar.r() && bArrB != null) {
                        aVarA2.a("Content-Encoding", "gzip");
                        aVarA2.a(bArrB);
                    } else if (bArr != null) {
                        aVarA2.a(bArr);
                    }
                } else {
                    bArrB = null;
                    aVarA2.a("Content-Type", "application/json; charset=utf-8");
                    if (!cVar.r()) {
                        if (bArr != null) {
                            aVarA2.a(bArr);
                        }
                    } else if (bArr != null) {
                        aVarA2.a(bArr);
                    }
                }
                a(strB, str2, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                dVar.a(0, th.getMessage(), null);
                return;
            }
            if (!map.isEmpty()) {
                map.put("request", StringUtils.getHostAndPath(str2));
                this.f10821b.x().trackEvent(ActionConst.REF_ATTRIBUTE, map);
            }
            try {
                this.f10823d.a(aVarA2.a(new C0143b(str2, cVar, strB, cVar.g(), zO, aVar, dVar)).a(this.f10821b.G().b()).a());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
