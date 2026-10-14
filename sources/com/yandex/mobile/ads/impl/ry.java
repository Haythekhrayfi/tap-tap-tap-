package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ry implements Iterable<jc.h<? extends String, ? extends String>>, wc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f24883a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f24884a = new ArrayList(20);

        public final ry a() {
            Object[] array = this.f24884a.toArray(new String[0]);
            fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new ry((String[]) array, 0);
        }

        public final void a(String str) {
            fd.j0.i(str, "line");
            int iD = ed.u.D(str, CoreConstants.COLON_CHAR, 1, false, 4);
            if (iD == -1) {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    fd.j0.h(str, "this as java.lang.String).substring(startIndex)");
                }
                b("", str);
                return;
            }
            String strSubstring = str.substring(0, iD);
            fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iD + 1);
            fd.j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
            b(strSubstring, strSubstring2);
        }

        public final void a(String str, String str2) {
            fd.j0.i(str, "name");
            fd.j0.i(str2, "value");
            b.b(str);
            b.b(str2, str);
            b(str, str2);
        }

        public final a b(String str) {
            fd.j0.i(str, "name");
            int i10 = 0;
            while (i10 < this.f24884a.size()) {
                if (ed.q.i(str, (String) this.f24884a.get(i10), true)) {
                    this.f24884a.remove(i10);
                    this.f24884a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final ArrayList b() {
            return this.f24884a;
        }

        public final void b(String str, String str2) {
            fd.j0.i(str, "name");
            fd.j0.i(str2, "value");
            this.f24884a.add(str);
            this.f24884a.add(ed.u.Y(str2).toString());
        }

        public final void c(String str, String str2) {
            fd.j0.i(str, "name");
            fd.j0.i(str2, "value");
            b.b(str);
            b.b(str2, str);
            b(str);
            b(str, str2);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(int i10) {
            this();
        }

        public static ry a(Map map) {
            fd.j0.i(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = ed.u.Y(str).toString();
                String string2 = ed.u.Y(str2).toString();
                b(string);
                b(string2, string);
                strArr[i11] = string;
                strArr[i11 + 1] = string2;
                i11 += 2;
            }
            return new ry(strArr, i10);
        }

        public static ry a(String... strArr) throws CloneNotSupportedException {
            fd.j0.i(strArr, "namesAndValues");
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = strArr.clone();
            fd.j0.g(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr2 = (String[]) objClone;
            int length = strArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = ed.u.Y(str).toString();
            }
            int iL = y8.c0.l(0, strArr2.length - 1, 2);
            if (iL >= 0) {
                int i12 = 0;
                while (true) {
                    String str2 = strArr2[i12];
                    String str3 = strArr2[i12 + 1];
                    b(str2);
                    b(str3, str2);
                    if (i12 == iL) {
                        break;
                    }
                    i12 += 2;
                }
            }
            return new ry(strArr2, i10);
        }

        public static final String a(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iL = y8.c0.l(length, 0, -2);
            if (iL <= length) {
                while (!ed.q.i(str, strArr[length], true)) {
                    if (length != iL) {
                        length -= 2;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(ea1.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        public static void b(String str, String str2) {
            boolean z10;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\t') {
                    z10 = true;
                } else if (' ' <= cCharAt && cCharAt < 127) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ea1.a("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(ea1.d(str2) ? "" : fn1.a(": ", str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }
    }

    static {
        new b(0);
    }

    private ry(String[] strArr) {
        this.f24883a = strArr;
    }

    public /* synthetic */ ry(String[] strArr, int i10) {
        this(strArr);
    }

    public final String a(int i10) {
        return this.f24883a[i10 * 2];
    }

    public final String a(String str) {
        fd.j0.i(str, "name");
        return b.a(this.f24883a, str);
    }

    public final a b() {
        a aVar = new a();
        kc.q.m(aVar.b(), this.f24883a);
        return aVar;
    }

    public final String b(int i10) {
        return this.f24883a[(i10 * 2) + 1];
    }

    public final TreeMap c() {
        ed.q.j(vc.e0.f37000a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = a(i10);
            Locale locale = Locale.US;
            fd.j0.h(locale, "US");
            String lowerCase = strA.toLowerCase(locale);
            fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(b(i10));
        }
        return treeMap;
    }

    public final List d() {
        ArrayList arrayList = null;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ed.q.i("Set-Cookie", a(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i10));
            }
        }
        if (arrayList == null) {
            return kc.w.f32009c;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        fd.j0.h(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ry) && Arrays.equals(this.f24883a, ((ry) obj).f24883a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24883a);
    }

    @Override // java.lang.Iterable
    public final Iterator<jc.h<? extends String, ? extends String>> iterator() {
        int size = size();
        jc.h[] hVarArr = new jc.h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = new jc.h(a(i10), b(i10));
        }
        return y8.c0.y(hVarArr);
    }

    public final int size() {
        return this.f24883a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = a(i10);
            String strB = b(i10);
            sb2.append(strA);
            sb2.append(": ");
            if (ea1.d(strA)) {
                strB = "██";
            }
            sb2.append(strB);
            sb2.append("\n");
        }
        String string = sb2.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
