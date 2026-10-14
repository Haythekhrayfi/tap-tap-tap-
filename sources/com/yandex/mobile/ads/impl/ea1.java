package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ea1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f20131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ry f20132b = ry.b.a(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hx0 f20133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f20134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ed.f f20135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f20136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20137g;

    static {
        byte[] bArr = new byte[0];
        f20131a = bArr;
        f20133c = ix0.a.a(bArr);
        qw0.a.b(bArr);
        qd.q.a aVar = qd.q.f34913f;
        qd.g.a aVar2 = qd.g.f34892f;
        aVar.c(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        fd.j0.f(timeZone);
        f20134d = timeZone;
        f20135e = new ed.f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f20136f = false;
        f20137g = ed.u.N(ed.u.M(yn0.class.getName(), "com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib."), "Client");
    }

    public static final int a(byte b10) {
        return b10 & 255;
    }

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final int a(int i10, int i11, String str) {
        fd.j0.i(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int a(int i10, int i11, String str, String str2) {
        fd.j0.i(str, "<this>");
        fd.j0.i(str2, "delimiters");
        while (i10 < i11) {
            if (ed.u.w(str2, str.charAt(i10), false, 2)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int a(int i10, String str) {
        fd.j0.i(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final int a(long j10, TimeUnit timeUnit) {
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(fn1.a("timeout", " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(fn1.a("timeout", " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(fn1.a("timeout", " too small.").toString());
    }

    public static final int a(String str, char c10, int i10, int i11) {
        fd.j0.i(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int a(qd.c cVar) throws EOFException {
        fd.j0.i(cVar, "<this>");
        int i10 = 0;
        while (!cVar.y() && cVar.g(0L) == 61) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    public static final int a(qd.f fVar) throws IOException {
        fd.j0.i(fVar, "<this>");
        return (fVar.readByte() & 255) | ((fVar.readByte() & 255) << 16) | ((fVar.readByte() & 255) << 8);
    }

    public static final int a(short s10) {
        return s10 & 65535;
    }

    public static final int a(String[] strArr, uh.a aVar) {
        fd.j0.i(strArr, "<this>");
        fd.j0.i(aVar, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (aVar.compare(strArr[i10], "TLS_FALLBACK_SCSV") == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final long a(int i10) {
        return ((long) i10) & 2147483647L;
    }

    public static final long a(ex0 ex0Var) {
        fd.j0.i(ex0Var, "<this>");
        String strA = ex0Var.h().a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final cs.b a(cs.a aVar) {
        fd.j0.i(aVar, "<this>");
        return new ho1(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cs a(cs csVar, vg vgVar) {
        fd.j0.i(csVar, "$this_asFactory");
        fd.j0.i(vgVar, "it");
        return csVar;
    }

    public static final ry a(List<py> list) {
        fd.j0.i(list, "<this>");
        ry.a aVar = new ry.a();
        for (py pyVar : list) {
            aVar.b(pyVar.a().l(), pyVar.b().l());
        }
        return aVar.a();
    }

    public static final Exception a(IOException iOException, List list) {
        fd.j0.i(iOException, "<this>");
        fd.j0.i(list, "suppressed");
        if (list.size() > 1) {
            Objects.requireNonNull(System.out);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc.a.a(iOException, (Exception) it.next());
        }
        return iOException;
    }

    public static final String a(d10 d10Var, boolean z10) {
        String strG;
        fd.j0.i(d10Var, "<this>");
        if (ed.u.x(d10Var.g(), ":", false, 2)) {
            StringBuilder sbA = o2.b.a('[');
            sbA.append(d10Var.g());
            sbA.append(']');
            strG = sbA.toString();
        } else {
            strG = d10Var.g();
        }
        if (!z10 && d10Var.i() == d10.b.a(d10Var.l())) {
            return strG;
        }
        return strG + CoreConstants.COLON_CHAR + d10Var.i();
    }

    public static final String a(String str, Object... objArr) {
        fd.j0.i(str, "format");
        fd.j0.i(objArr, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        fd.j0.h(str2, "format(locale, format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String str, boolean z10, Runnable runnable) {
        fd.j0.i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    @SafeVarargs
    public static final <T> List<T> a(T... tArr) {
        fd.j0.i(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(kc.l.c(Arrays.copyOf(objArr, objArr.length)));
        fd.j0.h(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> a(Map<K, ? extends V> map) {
        fd.j0.i(map, "<this>");
        if (map.isEmpty()) {
            return kc.x.f32010c;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        fd.j0.h(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final ThreadFactory a(String str, boolean z10) {
        fd.j0.i(str, "name");
        return new xn1(str, z10, 0);
    }

    public static final void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void a(Closeable closeable) {
        fd.j0.i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void a(Socket socket) {
        fd.j0.i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!fd.j0.d(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(ArrayList arrayList, Object obj) {
        fd.j0.i(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    public static final void a(qd.e eVar, int i10) throws IOException {
        fd.j0.i(eVar, "<this>");
        eVar.z((i10 >>> 16) & 255);
        eVar.z((i10 >>> 8) & 255);
        eVar.z(i10 & 255);
    }

    public static final boolean a(d10 d10Var, d10 d10Var2) {
        fd.j0.i(d10Var, "<this>");
        fd.j0.i(d10Var2, "other");
        return fd.j0.d(d10Var.g(), d10Var2.g()) && d10Var.i() == d10Var2.i() && fd.j0.d(d10Var.l(), d10Var2.l());
    }

    public static final boolean a(String str) {
        fd.j0.i(str, "<this>");
        return f20135e.a(str);
    }

    public static final boolean a(Socket socket, qd.f fVar) {
        fd.j0.i(socket, "<this>");
        fd.j0.i(fVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !fVar.y();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d A[PHI: r12
  0x006d: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:22:0x006b, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public static final boolean a(qd.a0 a0Var, int i10, TimeUnit timeUnit) throws IOException {
        boolean z10;
        fd.j0.i(a0Var, "<this>");
        fd.j0.i(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = a0Var.timeout().hasDeadline() ? a0Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        a0Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            qd.c cVar = new qd.c();
            while (a0Var.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
                cVar.skip(cVar.f34879d);
            }
            z10 = true;
            if (jDeadlineNanoTime == RecyclerView.FOREVER_NS) {
                a0Var.timeout().clearDeadline();
            } else {
                a0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
        } catch (InterruptedIOException unused) {
            z10 = false;
            if (jDeadlineNanoTime == RecyclerView.FOREVER_NS) {
                a0Var.timeout().clearDeadline();
            }
        } catch (Throwable th) {
            qd.b0 b0VarTimeout = a0Var.timeout();
            if (jDeadlineNanoTime == RecyclerView.FOREVER_NS) {
                b0VarTimeout.clearDeadline();
            } else {
                b0VarTimeout.deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
        return z10;
    }

    public static final boolean a(qd.a0 a0Var, TimeUnit timeUnit) {
        fd.j0.i(a0Var, "<this>");
        fd.j0.i(timeUnit, "timeUnit");
        try {
            return a(a0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        vc.b bVar;
        fd.j0.i(strArr, "<this>");
        fd.j0.i(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    Iterator itY = y8.c0.y(strArr2);
                    do {
                        bVar = (vc.b) itY;
                        if (!bVar.hasNext()) {
                        }
                    } while (comparator.compare(str, (String) bVar.next()) != 0);
                    return true;
                }
            }
        }
        return false;
    }

    public static final String[] a(String str, String[] strArr) {
        fd.j0.i(strArr, "<this>");
        fd.j0.i(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        fd.j0.h(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[kc.j.t(strArr2)] = str;
        return strArr2;
    }

    public static final int b(int i10, int i11, String str) {
        fd.j0.i(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static final int b(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final int b(String str) {
        fd.j0.i(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (fd.j0.k(cCharAt, 31) <= 0 || fd.j0.k(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ int b(String str, char c10, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return a(str, c10, 0, i10);
    }

    public static final <T> List<T> b(List<? extends T> list) {
        fd.j0.i(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(kc.t.J(list));
        fd.j0.h(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final String[] b(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        fd.j0.i(strArr, "<this>");
        fd.j0.i(strArr2, "other");
        fd.j0.i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public static final String c(int i10, int i11, String str) {
        fd.j0.i(str, "<this>");
        int iA = a(i10, i11, str);
        String strSubstring = str.substring(iA, b(iA, i11, str));
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final boolean d(String str) {
        fd.j0.i(str, "name");
        return ed.q.i(str, "Authorization", true) || ed.q.i(str, "Cookie", true) || ed.q.i(str, "Proxy-Authorization", true) || ed.q.i(str, "Set-Cookie", true);
    }
}
