package com.google.gson.internal.bind;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.r;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends o6.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Reader f12837w = new C0164a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f12838x = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f12839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f12841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f12842v;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public static class C0164a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public a(i iVar) {
        super(f12837w);
        this.f12839s = new Object[32];
        this.f12840t = 0;
        this.f12841u = new String[32];
        this.f12842v = new int[32];
        j0(iVar);
    }

    private String m() {
        StringBuilder sbA = defpackage.a.a(" at path ");
        sbA.append(j());
        return sbA.toString();
    }

    @Override // o6.a
    public long C() throws IOException {
        o6.b bVarV = V();
        o6.b bVar = o6.b.NUMBER;
        if (bVarV != bVar && bVarV != o6.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarV + m());
        }
        n nVar = (n) h0();
        long jLongValue = nVar.f12900a instanceof Number ? nVar.f().longValue() : Long.parseLong(nVar.g());
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jLongValue;
    }

    @Override // o6.a
    public String J() throws IOException {
        g0(o6.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) h0()).next();
        String str = (String) entry.getKey();
        this.f12841u[this.f12840t - 1] = str;
        j0(entry.getValue());
        return str;
    }

    @Override // o6.a
    public void O() throws IOException {
        g0(o6.b.NULL);
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // o6.a
    public String R() throws IOException {
        o6.b bVarV = V();
        o6.b bVar = o6.b.STRING;
        if (bVarV == bVar || bVarV == o6.b.NUMBER) {
            String strG = ((n) i0()).g();
            int i10 = this.f12840t;
            if (i10 > 0) {
                int[] iArr = this.f12842v;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strG;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarV + m());
    }

    @Override // o6.a
    public o6.b V() throws IOException {
        if (this.f12840t == 0) {
            return o6.b.END_DOCUMENT;
        }
        Object objH0 = h0();
        if (objH0 instanceof Iterator) {
            boolean z10 = this.f12839s[this.f12840t - 2] instanceof l;
            Iterator it = (Iterator) objH0;
            if (!it.hasNext()) {
                return z10 ? o6.b.END_OBJECT : o6.b.END_ARRAY;
            }
            if (z10) {
                return o6.b.NAME;
            }
            j0(it.next());
            return V();
        }
        if (objH0 instanceof l) {
            return o6.b.BEGIN_OBJECT;
        }
        if (objH0 instanceof f) {
            return o6.b.BEGIN_ARRAY;
        }
        if (!(objH0 instanceof n)) {
            if (objH0 instanceof k) {
                return o6.b.NULL;
            }
            if (objH0 == f12838x) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((n) objH0).f12900a;
        if (obj instanceof String) {
            return o6.b.STRING;
        }
        if (obj instanceof Boolean) {
            return o6.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return o6.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // o6.a
    public void a() throws IOException {
        g0(o6.b.BEGIN_ARRAY);
        j0(((f) h0()).iterator());
        this.f12842v[this.f12840t - 1] = 0;
    }

    @Override // o6.a
    public void b() throws IOException {
        g0(o6.b.BEGIN_OBJECT);
        j0(new r.b.a((r.b) ((l) h0()).f12898a.entrySet()));
    }

    @Override // o6.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12839s = new Object[]{f12838x};
        this.f12840t = 1;
    }

    @Override // o6.a
    public void e0() throws IOException {
        if (V() == o6.b.NAME) {
            J();
            this.f12841u[this.f12840t - 2] = "null";
        } else {
            i0();
            int i10 = this.f12840t;
            if (i10 > 0) {
                this.f12841u[i10 - 1] = "null";
            }
        }
        int i11 = this.f12840t;
        if (i11 > 0) {
            int[] iArr = this.f12842v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // o6.a
    public void g() throws IOException {
        g0(o6.b.END_ARRAY);
        i0();
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void g0(o6.b bVar) throws IOException {
        if (V() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + V() + m());
    }

    @Override // o6.a
    public void h() throws IOException {
        g0(o6.b.END_OBJECT);
        i0();
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final Object h0() {
        return this.f12839s[this.f12840t - 1];
    }

    public final Object i0() {
        Object[] objArr = this.f12839s;
        int i10 = this.f12840t - 1;
        this.f12840t = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // o6.a
    public String j() {
        StringBuilder sbA = o2.b.a(CoreConstants.DOLLAR);
        int i10 = 0;
        while (i10 < this.f12840t) {
            Object[] objArr = this.f12839s;
            if (objArr[i10] instanceof f) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sbA.append('[');
                    sbA.append(this.f12842v[i10]);
                    sbA.append(']');
                }
            } else if (objArr[i10] instanceof l) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sbA.append(CoreConstants.DOT);
                    String[] strArr = this.f12841u;
                    if (strArr[i10] != null) {
                        sbA.append(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return sbA.toString();
    }

    public final void j0(Object obj) {
        int i10 = this.f12840t;
        Object[] objArr = this.f12839s;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f12842v, 0, iArr, 0, this.f12840t);
            System.arraycopy(this.f12841u, 0, strArr, 0, this.f12840t);
            this.f12839s = objArr2;
            this.f12842v = iArr;
            this.f12841u = strArr;
        }
        Object[] objArr3 = this.f12839s;
        int i11 = this.f12840t;
        this.f12840t = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // o6.a
    public boolean k() throws IOException {
        o6.b bVarV = V();
        return (bVarV == o6.b.END_OBJECT || bVarV == o6.b.END_ARRAY) ? false : true;
    }

    @Override // o6.a
    public boolean n() throws IOException {
        g0(o6.b.BOOLEAN);
        boolean zE = ((n) i0()).e();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zE;
    }

    @Override // o6.a
    public double p() throws IOException {
        o6.b bVarV = V();
        o6.b bVar = o6.b.NUMBER;
        if (bVarV != bVar && bVarV != o6.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarV + m());
        }
        n nVar = (n) h0();
        double dDoubleValue = nVar.f12900a instanceof Number ? nVar.f().doubleValue() : Double.parseDouble(nVar.g());
        if (!this.f33969d && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dDoubleValue;
    }

    @Override // o6.a
    public int q() throws IOException {
        o6.b bVarV = V();
        o6.b bVar = o6.b.NUMBER;
        if (bVarV != bVar && bVarV != o6.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarV + m());
        }
        n nVar = (n) h0();
        int iIntValue = nVar.f12900a instanceof Number ? nVar.f().intValue() : Integer.parseInt(nVar.g());
        i0();
        int i10 = this.f12840t;
        if (i10 > 0) {
            int[] iArr = this.f12842v;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iIntValue;
    }

    @Override // o6.a
    public String toString() {
        return a.class.getSimpleName();
    }
}
