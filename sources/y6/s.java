package y6;

import android.app.Activity;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f38376d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7.a f38377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.g f38378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6.r f38379c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f38380c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            xe.a.f37601c.c(th);
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f38381c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            xe.a.f37601c.c(th);
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<jc.w, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f38382c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(jc.w wVar) {
            fd.j0.i(wVar, "it");
            return Boolean.TRUE;
        }
    }

    public static final class e extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f38383c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            xe.a.f37601c.c(th);
            return jc.w.f31842a;
        }
    }

    static {
        new a(null);
    }

    public s(a7.a aVar, d7.g gVar, z6.r rVar) {
        fd.j0.i(aVar, "manualSettingsProvider");
        fd.j0.i(gVar, "recordSettingsProvider");
        fd.j0.i(rVar, "combineSettingsProvider");
        this.f38377a = aVar;
        this.f38378b = gVar;
        this.f38379c = rVar;
    }

    public final lb.m<String> a(Activity activity, File file, Object obj, String str, String str2) {
        fd.j0.i(activity, "activity");
        fd.j0.i(file, "directory");
        fd.j0.i(str, "name");
        return new wb.c(new wb.f(new d6.c0(activity, str, str2, obj, file)), new x6.b(b.f38380c, 7));
    }

    public final lb.m<String> b(Activity activity, Uri uri, Object obj, String str, String str2) {
        fd.j0.i(uri, Action.FILE_ATTRIBUTE);
        fd.j0.i(str, "name");
        return new wb.c(new wb.f(new d6.c0(activity, str, str2, obj, uri)), new x6.b(c.f38381c, 6));
    }

    public final lb.m<Boolean> c(final Activity activity, final String str, final File file) {
        fd.j0.i(activity, "activity");
        return new wb.c(new wb.h(new wb.f(new Callable() { // from class: y6.r
            /* JADX WARN: Bottom block not found for handler: all -> 0x0289 */
            /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
            
                throw r0;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 700
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: y6.r.call():java.lang.Object");
            }
        }), new p6.a(d.f38382c, 12)), new x6.b(e.f38383c, 8));
    }

    public final List<r6.d> d(List<r6.d> list, float f10, float f11) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (r6.c cVar : ((r6.d) it.next()).a()) {
                cVar.g(cVar.e() * f10);
                cVar.h(cVar.f() * f11);
            }
        }
        return list;
    }
}
