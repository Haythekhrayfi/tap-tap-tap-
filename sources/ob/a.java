package ob;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Throwable> f34221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f34223e;

    /* JADX INFO: renamed from: ob.a$a, reason: collision with other inner class name */
    public static final class C0380a extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof a) {
                    linkedHashSet.addAll(((a) obj).f34221c);
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f34221c = listUnmodifiableList;
        this.f34222d = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    public a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public final void a(StringBuilder sb2, Throwable th, String str) {
        sb2.append(str);
        sb2.append(th);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f34223e == null) {
            C0380a c0380a = new C0380a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f34221c.iterator();
            C0380a c0380a2 = c0380a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th : arrayList) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        c0380a2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = c0380a2.getCause();
                    if (cause3 != null && c0380a2 != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                                break;
                            }
                            cause3 = cause4;
                        }
                        c0380a2 = cause3;
                    }
                }
            }
            this.f34223e = c0380a;
        }
        return this.f34223e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f34222d;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f34221c) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i10++;
        }
        printStream.println((Object) sb2.toString());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f34221c) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i10++;
        }
        printWriter.println((Object) sb2.toString());
    }
}
