package f5;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements FilenameFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j f29286b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j f29287c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j f29288d = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29289a;

    public /* synthetic */ j(int i10) {
        this.f29289a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f29289a) {
            case 0:
                int i10 = q.f29318p;
                return str.startsWith(".ae");
            case 1:
                Charset charset = k5.b.f31897d;
                return str.startsWith("event");
            default:
                fd.j0.h(str, "name");
                return ed.q.h(str, ".log", false, 2);
        }
    }
}
