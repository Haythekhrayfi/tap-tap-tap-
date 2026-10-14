package g3;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final StackTraceElement[] f29934h = new StackTraceElement[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Throwable> f29935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d3.c f29936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.a f29937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Class<?> f29938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29939g;

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Appendable f29940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29941d = true;

        public a(Appendable appendable) {
            this.f29940c = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f29941d) {
                this.f29941d = false;
                this.f29940c.append("  ");
            }
            this.f29941d = c10 == '\n';
            this.f29940c.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = false;
            if (this.f29941d) {
                this.f29941d = false;
                this.f29940c.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f29941d = z10;
            this.f29940c.append(charSequence, i10, i11);
            return this;
        }
    }

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public q(String str, List<Throwable> list) {
        this.f29939g = str;
        setStackTrace(f29934h);
        this.f29935c = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof q) {
                ((q) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((q) th).f29935c.iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sbA = defpackage.a.a("Root cause (");
            int i11 = i10 + 1;
            sbA.append(i11);
            sbA.append(" of ");
            sbA.append(size);
            sbA.append(")");
            Log.i(str, sbA.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f29935c, new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        String string2;
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f29939g);
        String string3 = "";
        if (this.f29938f != null) {
            StringBuilder sbA = defpackage.a.a(", ");
            sbA.append(this.f29938f);
            string = sbA.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        if (this.f29937e != null) {
            StringBuilder sbA2 = defpackage.a.a(", ");
            sbA2.append(this.f29937e);
            string2 = sbA2.toString();
        } else {
            string2 = "";
        }
        sb2.append(string2);
        if (this.f29936d != null) {
            StringBuilder sbA3 = defpackage.a.a(", ");
            sbA3.append(this.f29936d);
            string3 = sbA3.toString();
        }
        sb2.append(string3);
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            str = "\nThere was 1 cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            str = " causes:";
        }
        sb2.append(str);
        for (Throwable th : arrayList) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb2.append(th.getMessage());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
