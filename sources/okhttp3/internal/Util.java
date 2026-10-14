package okhttp3.internal;

import androidx.recyclerview.widget.RecyclerView;
import bd.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.joran.action.Action;
import com.yandex.mobile.ads.impl.xn1;
import d0.a;
import ed.c;
import ed.f;
import ed.u;
import fd.j0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import kc.j;
import kc.m;
import kc.t;
import kc.w;
import kc.x;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import qd.a0;
import qd.b0;
import qd.g;
import qd.q;
import qd.y;
import uc.l;
import vc.b;
import vc.f0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final q UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final f VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.11.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        q.a aVar = q.f34913f;
        g.a aVar2 = g.f34892f;
        UNICODE_BOMS = aVar.c(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        j0.f(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = u.N(u.M(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        j0.i(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        j0.i(eventListener, "<this>");
        return new a(eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: asFactory$lambda-8, reason: not valid java name */
    public static final EventListener m138asFactory$lambda8(EventListener eventListener, Call call) {
        j0.i(eventListener, "$this_asFactory");
        j0.i(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        j0.i(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(obj);
            throw new AssertionError(sbA.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        j0.i(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sbA = defpackage.a.a("Thread ");
        sbA.append((Object) Thread.currentThread().getName());
        sbA.append(" MUST hold lock on ");
        sbA.append(obj);
        throw new AssertionError(sbA.toString());
    }

    public static final boolean canParseAsIpAddress(String str) {
        j0.i(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        j0.i(httpUrl, "<this>");
        j0.i(httpUrl2, "other");
        return j0.d(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && j0.d(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j10, TimeUnit timeUnit) {
        j0.i(str, "name");
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(j0.p(str, " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(j0.p(str, " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(j0.p(str, " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        j0.i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        j0.i(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Socket socket) {
        j0.i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!j0.d(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        j0.i(strArr, "<this>");
        j0.i(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        j0.h(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[j.t(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, char c10, int i10, int i11) {
        j0.i(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int delimiterOffset(String str, String str2, int i10, int i11) {
        j0.i(str, "<this>");
        j0.i(str2, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (u.w(str2, str.charAt(i10), false, 2)) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final boolean discard(a0 a0Var, int i10, TimeUnit timeUnit) {
        j0.i(a0Var, "<this>");
        j0.i(timeUnit, "timeUnit");
        try {
            return skipAll(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        j0.i(iterable, "<this>");
        j0.i(lVar, "predicate");
        ArrayList arrayList = w.f32009c;
        for (T t10 : iterable) {
            if (lVar.invoke(t10).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                f0.b(arrayList).add(t10);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        j0.i(str, "format");
        j0.i(objArr, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        j0.h(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        b bVar;
        j0.i(strArr, "<this>");
        j0.i(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator itY = c0.y(strArr2);
                    do {
                        bVar = (b) itY;
                        if (bVar.hasNext()) {
                        }
                    } while (comparator.compare(str, (String) bVar.next()) != 0);
                    return true;
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        j0.i(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(uc.a<jc.w> aVar) {
        j0.i(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        j0.i(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(kc.l.c(Arrays.copyOf(objArr, objArr.length)));
        j0.h(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        j0.i(strArr, "<this>");
        j0.i(str, "value");
        j0.i(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        j0.i(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (j0.k(cCharAt, 31) <= 0 || j0.k(cCharAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i10, int i11) {
        j0.i(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i10, int i11) {
        j0.i(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12 = i13;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(String str, int i10) {
        j0.i(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        j0.i(strArr, "<this>");
        j0.i(strArr2, "other");
        j0.i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                String str2 = strArr2[i11];
                i11++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) throws IOException {
        j0.i(fileSystem, "<this>");
        j0.i(file, Action.FILE_ATTRIBUTE);
        y yVarSink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            c0.g(yVarSink, null);
            return true;
        } catch (IOException unused) {
            c0.g(yVarSink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(yVarSink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, qd.f fVar) {
        j0.i(socket, "<this>");
        j0.i(fVar, "source");
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

    public static final boolean isSensitiveHeader(String str) {
        j0.i(str, "name");
        return ed.q.i(str, "Authorization", true) || ed.q.i(str, "Cookie", true) || ed.q.i(str, "Proxy-Authorization", true) || ed.q.i(str, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        j0.i(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        j0.i(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
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

    public static final String peerName(Socket socket) {
        j0.i(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        j0.h(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(qd.f fVar, Charset charset) throws IOException {
        Charset charset2;
        String str;
        Charset charsetForName;
        j0.i(fVar, "<this>");
        j0.i(charset, "default");
        int iW = fVar.W(UNICODE_BOMS);
        if (iW == -1) {
            return charset;
        }
        if (iW == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iW == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iW != 2) {
                if (iW == 3) {
                    c cVar = c.f29138a;
                    charsetForName = c.f29141d;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32BE");
                        j0.h(charsetForName, "forName(\"UTF-32BE\")");
                        c.f29141d = charsetForName;
                    }
                } else {
                    if (iW != 4) {
                        throw new AssertionError();
                    }
                    c cVar2 = c.f29138a;
                    charsetForName = c.f29140c;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32LE");
                        j0.h(charsetForName, "forName(\"UTF-32LE\")");
                        c.f29140c = charsetForName;
                    }
                }
                return charsetForName;
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        String str2 = str;
        Charset charset3 = charset2;
        j0.h(charset3, str2);
        return charset3;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException {
        Object fieldOrNull;
        j0.i(obj, "instance");
        j0.i(cls, "fieldType");
        j0.i(str, "fieldName");
        Class<?> superclass = obj.getClass();
        while (true) {
            T tCast = null;
            if (j0.d(superclass, Object.class)) {
                if (j0.d(str, "delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    tCast = cls.cast(obj2);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                j0.h(superclass, "c.superclass");
            }
        }
    }

    public static final int readMedium(qd.f fVar) throws IOException {
        j0.i(fVar, "<this>");
        return and(fVar.readByte(), 255) | (and(fVar.readByte(), 255) << 16) | (and(fVar.readByte(), 255) << 8);
    }

    public static final int skipAll(qd.c cVar, byte b10) throws EOFException {
        j0.i(cVar, "<this>");
        int i10 = 0;
        while (!cVar.y() && cVar.g(0L) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d A[PHI: r12
  0x005d: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:23:0x007b, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
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
    public static final boolean skipAll(a0 a0Var, int i10, TimeUnit timeUnit) throws IOException {
        boolean z10;
        j0.i(a0Var, "<this>");
        j0.i(timeUnit, "timeUnit");
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
            if (jDeadlineNanoTime != RecyclerView.FOREVER_NS) {
                a0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
        } catch (Throwable th) {
            b0 b0VarTimeout = a0Var.timeout();
            if (jDeadlineNanoTime == RecyclerView.FOREVER_NS) {
                b0VarTimeout.clearDeadline();
            } else {
                b0VarTimeout.deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
        return z10;
    }

    public static final ThreadFactory threadFactory(String str, boolean z10) {
        j0.i(str, "name");
        return new xn1(str, z10, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: threadFactory$lambda-1, reason: not valid java name */
    public static final Thread m139threadFactory$lambda1(String str, boolean z10, Runnable runnable) {
        j0.i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final void threadName(String str, uc.a<jc.w> aVar) {
        j0.i(str, "name");
        j0.i(aVar, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        j0.i(headers, "<this>");
        bd.c cVarH = e.h(0, headers.size());
        ArrayList arrayList = new ArrayList(m.j(cVarH, 10));
        Iterator<Integer> it = cVarH.iterator();
        while (it.hasNext()) {
            int iA = ((kc.c0) it).a();
            arrayList.add(new Header(headers.name(iA), headers.value(iA)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        j0.i(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().l(), header.component2().l());
        }
        return builder.build();
    }

    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        j0.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        j0.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z10) {
        String strHost;
        j0.i(httpUrl, "<this>");
        if (u.x(httpUrl.host(), ":", false, 2)) {
            StringBuilder sbA = o2.b.a('[');
            sbA.append(httpUrl.host());
            sbA.append(']');
            strHost = sbA.toString();
        } else {
            strHost = httpUrl.host();
        }
        if (!z10 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + CoreConstants.COLON_CHAR + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        j0.i(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(t.J(list));
        j0.h(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        j0.i(map, "<this>");
        if (map.isEmpty()) {
            return x.f32010c;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        j0.h(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j10) {
        j0.i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(String str, int i10) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String trimSubstring(String str, int i10, int i11) {
        j0.i(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i11));
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final void wait(Object obj) throws InterruptedException {
        j0.i(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        j0.i(exc, "<this>");
        j0.i(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            jc.a.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(qd.e eVar, int i10) throws IOException {
        j0.i(eVar, "<this>");
        eVar.z((i10 >>> 16) & 255);
        eVar.z((i10 >>> 8) & 255);
        eVar.z(i10 & 255);
    }
}
