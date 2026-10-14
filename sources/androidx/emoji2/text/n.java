package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.b f1831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f1832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1833c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f1834d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f1835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f1836b;

        public a() {
            this.f1835a = new SparseArray<>(1);
        }

        public a(int i10) {
            this.f1835a = new SparseArray<>(i10);
        }

        public void a(h hVar, int i10, int i11) {
            int iA = hVar.a(i10);
            SparseArray<a> sparseArray = this.f1835a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                this.f1835a.put(hVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(hVar, i10 + 1, i11);
            } else {
                aVar.f1836b = hVar;
            }
        }
    }

    public n(Typeface typeface, y0.b bVar) {
        this.f1834d = typeface;
        this.f1831a = bVar;
        this.f1832b = new char[bVar.c() * 2];
        int iC = bVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            h hVar = new h(this, i10);
            Character.toChars(hVar.d(), this.f1832b, i10 * 2);
            androidx.activity.i.c(hVar.b() > 0, "invalid metadata codepoint length");
            this.f1833c.a(hVar, 0, hVar.b() - 1);
        }
    }
}
