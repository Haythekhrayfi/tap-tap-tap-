package n8;

import android.util.DisplayMetrics;
import fd.j0;
import y9.f7;
import y9.l6;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements t9.c.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7.e f33625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f33626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.d f33627c;

    public a(f7.e eVar, DisplayMetrics displayMetrics, v9.d dVar) {
        j0.i(eVar, "item");
        j0.i(displayMetrics, "displayMetrics");
        j0.i(dVar, "resolver");
        this.f33625a = eVar;
        this.f33626b = displayMetrics;
        this.f33627c = dVar;
    }

    @Override // t9.c.g.a
    public Object a() {
        return this.f33625a.f40028c;
    }

    @Override // t9.c.g.a
    public Integer b() {
        l6 height = this.f33625a.f40026a.a().getHeight();
        if (height instanceof l6.c) {
            return Integer.valueOf(l8.b.U(height, this.f33626b, this.f33627c, null));
        }
        return null;
    }

    @Override // t9.c.g.a
    public String getTitle() {
        return this.f33625a.f40027b.b(this.f33627c);
    }
}
