package k5;

import com.applovin.exoplayer2.j.l;
import f5.j;
import h5.a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import m5.g;
import s5.d;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f31897d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f31898e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i5.b f31899f = new i5.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator<? super File> f31900g = l.f7312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FilenameFilter f31901h = j.f29287c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f31902a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m5.j f31904c;

    public b(c cVar, m5.j jVar) {
        this.f31903b = cVar;
        this.f31904c = jVar;
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f31897d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f31897d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31903b.d());
        arrayList.addAll(this.f31903b.c());
        Comparator<? super File> comparator = f31900g;
        Collections.sort(arrayList, comparator);
        List<File> listE = this.f31903b.e();
        Collections.sort(listE, comparator);
        arrayList.addAll(listE);
        return arrayList;
    }

    public SortedSet<String> c() {
        return new TreeSet(c.j(this.f31903b.f31907c.list())).descendingSet();
    }

    public void d(a0.e.d dVar, String str, boolean z10) {
        int i10 = ((g) this.f31904c).b().f33195a.f33203a;
        Objects.requireNonNull(f31899f);
        d dVar2 = (d) i5.b.f31272a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            f(this.f31903b.g(str, androidx.activity.j.a("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f31902a.getAndIncrement())), z10 ? "_" : "")), stringWriter.toString());
        } catch (IOException e10) {
            c5.d.f3604c.g("Could not persist event for session " + str, e10);
        }
        List<File> listJ = c.j(this.f31903b.f(str).listFiles(new FilenameFilter() { // from class: k5.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                Charset charset = b.f31897d;
                return str2.startsWith("event") && !str2.endsWith("_");
            }
        }));
        Collections.sort(listJ, m0.d.f33130i);
        int size = listJ.size();
        for (File file : listJ) {
            if (size <= i10) {
                return;
            }
            c.i(file);
            size--;
        }
    }
}
