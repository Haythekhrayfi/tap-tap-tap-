package xe;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<c> f37599a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c[] f37600b = new c[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f37601c = new C0464a();

    /* JADX INFO: renamed from: xe.a$a, reason: collision with other inner class name */
    public static class C0464a extends c {
        @Override // xe.a.c
        public void a(String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.a(str, objArr);
            }
        }

        @Override // xe.a.c
        public void b(String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.b(str, objArr);
            }
        }

        @Override // xe.a.c
        public void c(Throwable th) {
            for (c cVar : a.f37600b) {
                cVar.c(th);
            }
        }

        @Override // xe.a.c
        public void d(Throwable th, String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.d(th, str, objArr);
            }
        }

        @Override // xe.a.c
        public void g(String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.g(str, objArr);
            }
        }

        @Override // xe.a.c
        public void i(int i10, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // xe.a.c
        public void j(int i10, Throwable th, String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.j(i10, th, str, objArr);
            }
        }

        @Override // xe.a.c
        public void l(String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.l(str, objArr);
            }
        }

        @Override // xe.a.c
        public void m(String str, Object... objArr) {
            for (c cVar : a.f37600b) {
                cVar.m(str, objArr);
            }
        }

        @Override // xe.a.c
        public void n(Throwable th) {
            for (c cVar : a.f37600b) {
                cVar.n(th);
            }
        }

        @Override // xe.a.c
        public void o(Throwable th) {
            for (c cVar : a.f37600b) {
                cVar.o(th);
            }
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f37602b = Pattern.compile("(\\$\\d+)+$");

        @Override // xe.a.c
        public final String f() {
            String str = this.f37603a.get();
            if (str != null) {
                this.f37603a.remove();
            }
            if (str != null) {
                return str;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length <= 5) {
                throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
            }
            String className = stackTrace[5].getClassName();
            Matcher matcher = f37602b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String strSubstring = className.substring(className.lastIndexOf(46) + 1);
            strSubstring.length();
            return strSubstring;
        }

        @Override // xe.a.c
        public void i(int i10, String str, String str2, Throwable th) {
            int iMin;
            if (str2.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i10, str, str2);
                    return;
                }
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                int iIndexOf = str2.indexOf(10, i11);
                if (iIndexOf == -1) {
                    iIndexOf = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    if (i10 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i10, str, strSubstring);
                    }
                    if (iMin >= iIndexOf) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadLocal<String> f37603a = new ThreadLocal<>();

        public void a(String str, Object... objArr) {
            k(3, null, str, objArr);
        }

        public void b(String str, Object... objArr) {
            k(6, null, str, objArr);
        }

        public void c(Throwable th) {
            k(6, th, null, new Object[0]);
        }

        public void d(Throwable th, String str, Object... objArr) {
            k(6, th, str, objArr);
        }

        public final String e(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        public String f() {
            String str = this.f37603a.get();
            if (str != null) {
                this.f37603a.remove();
            }
            return str;
        }

        public void g(String str, Object... objArr) {
            k(4, null, str, objArr);
        }

        public boolean h(String str, int i10) {
            return true;
        }

        public abstract void i(int i10, String str, String str2, Throwable th);

        public void j(int i10, Throwable th, String str, Object... objArr) {
            k(i10, th, str, objArr);
        }

        public final void k(int i10, Throwable th, String str, Object... objArr) {
            String strF = f();
            if (h(strF, i10)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = String.format(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sbA = android.support.v4.media.c.a(str, "\n");
                        sbA.append(e(th));
                        str = sbA.toString();
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = e(th);
                }
                i(i10, strF, str, th);
            }
        }

        public void l(String str, Object... objArr) {
            k(2, null, str, objArr);
        }

        public void m(String str, Object... objArr) {
            k(5, null, str, objArr);
        }

        public void n(Throwable th) {
            k(5, th, null, new Object[0]);
        }

        public void o(Throwable th) {
            k(7, th, null, new Object[0]);
        }
    }

    public static void a(c cVar) {
        if (cVar == f37601c) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<c> list = f37599a;
        synchronized (list) {
            ((ArrayList) list).add(cVar);
            f37600b = (c[]) ((ArrayList) list).toArray(new c[((ArrayList) list).size()]);
        }
    }

    public static c b(String str) {
        for (c cVar : f37600b) {
            cVar.f37603a.set(str);
        }
        return f37601c;
    }
}
