package w8;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ed.u;
import fd.j0;
import h9.h;
import java.util.Iterator;
import jc.w;
import l8.a1;
import org.json.JSONException;
import org.json.JSONObject;
import p7.i1;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1<l<d, w>> f37170a = new i1<>();

    public static class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10) {
            super(null);
            j0.i(str, "name");
            this.f37171b = str;
            this.f37172c = z10;
            this.f37173d = z10;
        }

        @Override // w8.d
        public String a() {
            return this.f37171b;
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(null);
            j0.i(str, "name");
            this.f37174b = str;
            this.f37175c = i10;
            a9.a.C0007a c0007a = a9.a.f201b;
            this.f37176d = i10;
        }

        @Override // w8.d
        public String a() {
            return this.f37174b;
        }
    }

    public static class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f37178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f37179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JSONObject jSONObject) {
            super(null);
            j0.i(str, "name");
            j0.i(jSONObject, "defaultValue");
            this.f37177b = str;
            this.f37178c = jSONObject;
            this.f37179d = jSONObject;
        }

        @Override // w8.d
        public String a() {
            return this.f37177b;
        }
    }

    /* JADX INFO: renamed from: w8.d$d, reason: collision with other inner class name */
    public static class C0447d extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f37181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f37182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0447d(String str, double d10) {
            super(null);
            j0.i(str, "name");
            this.f37180b = str;
            this.f37181c = d10;
            this.f37182d = d10;
        }

        @Override // w8.d
        public String a() {
            return this.f37180b;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f37184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f37185d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long j10) {
            super(null);
            j0.i(str, "name");
            this.f37183b = str;
            this.f37184c = j10;
            this.f37185d = j10;
        }

        @Override // w8.d
        public String a() {
            return this.f37183b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f37187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37188d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(null);
            j0.i(str, "name");
            j0.i(str2, "defaultValue");
            this.f37186b = str;
            this.f37187c = str2;
            this.f37188d = str2;
        }

        @Override // w8.d
        public String a() {
            return this.f37186b;
        }
    }

    public static class g extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f37190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f37191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Uri uri) {
            super(null);
            j0.i(str, "name");
            j0.i(uri, "defaultValue");
            this.f37189b = str;
            this.f37190c = uri;
            this.f37191d = uri;
        }

        @Override // w8.d
        public String a() {
            return this.f37189b;
        }
    }

    public d() {
    }

    public d(vc.g gVar) {
    }

    public abstract String a();

    public Object b() {
        if (this instanceof f) {
            return ((f) this).f37188d;
        }
        if (this instanceof e) {
            return Long.valueOf(((e) this).f37185d);
        }
        if (this instanceof a) {
            return Boolean.valueOf(((a) this).f37173d);
        }
        if (this instanceof C0447d) {
            return Double.valueOf(((C0447d) this).f37182d);
        }
        if (this instanceof b) {
            return new a9.a(((b) this).f37176d);
        }
        if (this instanceof g) {
            return ((g) this).f37191d;
        }
        if (this instanceof c) {
            return ((c) this).f37179d;
        }
        throw new jc.g();
    }

    public void c(d dVar) {
        e9.a.b();
        Iterator<l<d, w>> it = this.f37170a.iterator();
        while (true) {
            i1.b bVar = (i1.b) it;
            if (!bVar.hasNext()) {
                return;
            } else {
                ((l) bVar.next()).invoke(dVar);
            }
        }
    }

    public void d(String str) throws w8.f {
        j0.i(str, "newValue");
        if (this instanceof f) {
            f fVar = (f) this;
            j0.i(str, "value");
            if (j0.d(fVar.f37188d, str)) {
                return;
            }
            fVar.f37188d = str;
            fVar.c(fVar);
            return;
        }
        boolean zBooleanValue = true;
        if (this instanceof e) {
            e eVar = (e) this;
            try {
                long j10 = Long.parseLong(str);
                if (eVar.f37185d == j10) {
                    return;
                }
                eVar.f37185d = j10;
                eVar.c(eVar);
                return;
            } catch (NumberFormatException e10) {
                throw new w8.f(null, e10, 1, null);
            }
        }
        if (this instanceof a) {
            a aVar = (a) this;
            try {
                Boolean boolX = u.X(str);
                if (boolX == null) {
                    try {
                        int i10 = Integer.parseInt(str);
                        l<Object, Integer> lVar = h.f30978a;
                        if (i10 == 0) {
                            zBooleanValue = false;
                        } else if (i10 != 1) {
                            throw new IllegalArgumentException("Unable to convert " + i10 + " to boolean");
                        }
                    } catch (NumberFormatException e11) {
                        throw new w8.f(null, e11, 1, null);
                    }
                } else {
                    zBooleanValue = boolX.booleanValue();
                }
                if (aVar.f37173d == zBooleanValue) {
                    return;
                }
                aVar.f37173d = zBooleanValue;
                aVar.c(aVar);
                return;
            } catch (IllegalArgumentException e12) {
                throw new w8.f(null, e12, 1, null);
            }
        }
        if (this instanceof C0447d) {
            C0447d c0447d = (C0447d) this;
            try {
                double d10 = Double.parseDouble(str);
                if (c0447d.f37182d == d10) {
                    return;
                }
                c0447d.f37182d = d10;
                c0447d.c(c0447d);
                return;
            } catch (NumberFormatException e13) {
                throw new w8.f(null, e13, 1, null);
            }
        }
        if (this instanceof b) {
            Integer num = (Integer) ((h.d) h.f30978a).invoke(str);
            if (num == null) {
                throw new w8.f(a1.a("Wrong value format for color variable: '", str, CoreConstants.SINGLE_QUOTE_CHAR), null, 2, null);
            }
            int iIntValue = num.intValue();
            b bVar = (b) this;
            a9.a.C0007a c0007a = a9.a.f201b;
            if (bVar.f37176d == iIntValue) {
                return;
            }
            bVar.f37176d = iIntValue;
            bVar.c(bVar);
            return;
        }
        if (this instanceof g) {
            g gVar = (g) this;
            try {
                Uri uri = Uri.parse(str);
                j0.h(uri, "{\n            Uri.parse(this)\n        }");
                j0.i(uri, "value");
                if (j0.d(gVar.f37191d, uri)) {
                    return;
                }
                gVar.f37191d = uri;
                gVar.c(gVar);
                return;
            } catch (IllegalArgumentException e14) {
                throw new w8.f(null, e14, 1, null);
            }
        }
        if (!(this instanceof c)) {
            throw new jc.g();
        }
        c cVar = (c) this;
        try {
            JSONObject jSONObject = new JSONObject(str);
            j0.i(jSONObject, "value");
            if (j0.d(cVar.f37179d, jSONObject)) {
                return;
            }
            cVar.f37179d = jSONObject;
            cVar.c(cVar);
        } catch (JSONException e15) {
            throw new w8.f(null, e15, 1, null);
        }
    }
}
