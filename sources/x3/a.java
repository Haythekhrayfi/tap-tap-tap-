package x3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b4.j;
import ch.qos.logback.core.util.FileUtil;
import g3.k;
import java.util.Map;
import java.util.Objects;
import o3.m;
import okhttp3.internal.http2.Http2;
import x3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37425c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f37429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f37431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37432j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37437o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f37439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37440r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Resources.Theme f37445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f37448z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f37426d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f37427e = k.f29862d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a3.g f37428f = a3.g.NORMAL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37433k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37434l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37435m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d3.c f37436n = a4.b.f75b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37438p = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d3.e f37441s = new d3.e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<Class<?>, d3.g<?>> f37442t = new b4.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Class<?> f37443u = Object.class;
    public boolean A = true;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T b(a<?> aVar) {
        if (this.f37446x) {
            return (T) clone().b(aVar);
        }
        if (f(aVar.f37425c, 2)) {
            this.f37426d = aVar.f37426d;
        }
        if (f(aVar.f37425c, 262144)) {
            this.f37447y = aVar.f37447y;
        }
        if (f(aVar.f37425c, 1048576)) {
            this.B = aVar.B;
        }
        if (f(aVar.f37425c, 4)) {
            this.f37427e = aVar.f37427e;
        }
        if (f(aVar.f37425c, 8)) {
            this.f37428f = aVar.f37428f;
        }
        if (f(aVar.f37425c, 16)) {
            this.f37429g = aVar.f37429g;
            this.f37430h = 0;
            this.f37425c &= -33;
        }
        if (f(aVar.f37425c, 32)) {
            this.f37430h = aVar.f37430h;
            this.f37429g = null;
            this.f37425c &= -17;
        }
        if (f(aVar.f37425c, 64)) {
            this.f37431i = aVar.f37431i;
            this.f37432j = 0;
            this.f37425c &= -129;
        }
        if (f(aVar.f37425c, 128)) {
            this.f37432j = aVar.f37432j;
            this.f37431i = null;
            this.f37425c &= -65;
        }
        if (f(aVar.f37425c, 256)) {
            this.f37433k = aVar.f37433k;
        }
        if (f(aVar.f37425c, 512)) {
            this.f37435m = aVar.f37435m;
            this.f37434l = aVar.f37434l;
        }
        if (f(aVar.f37425c, 1024)) {
            this.f37436n = aVar.f37436n;
        }
        if (f(aVar.f37425c, 4096)) {
            this.f37443u = aVar.f37443u;
        }
        if (f(aVar.f37425c, 8192)) {
            this.f37439q = aVar.f37439q;
            this.f37440r = 0;
            this.f37425c &= -16385;
        }
        if (f(aVar.f37425c, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f37440r = aVar.f37440r;
            this.f37439q = null;
            this.f37425c &= -8193;
        }
        if (f(aVar.f37425c, FileUtil.BUF_SIZE)) {
            this.f37445w = aVar.f37445w;
        }
        if (f(aVar.f37425c, 65536)) {
            this.f37438p = aVar.f37438p;
        }
        if (f(aVar.f37425c, 131072)) {
            this.f37437o = aVar.f37437o;
        }
        if (f(aVar.f37425c, 2048)) {
            this.f37442t.putAll(aVar.f37442t);
            this.A = aVar.A;
        }
        if (f(aVar.f37425c, 524288)) {
            this.f37448z = aVar.f37448z;
        }
        if (!this.f37438p) {
            this.f37442t.clear();
            int i10 = this.f37425c & (-2049);
            this.f37425c = i10;
            this.f37437o = false;
            this.f37425c = i10 & (-131073);
            this.A = true;
        }
        this.f37425c |= aVar.f37425c;
        this.f37441s.d(aVar.f37441s);
        k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            d3.e eVar = new d3.e();
            t10.f37441s = eVar;
            eVar.d(this.f37441s);
            b4.b bVar = new b4.b();
            t10.f37442t = bVar;
            bVar.putAll(this.f37442t);
            t10.f37444v = false;
            t10.f37446x = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T d(Class<?> cls) {
        if (this.f37446x) {
            return (T) clone().d(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.f37443u = cls;
        this.f37425c |= 4096;
        k();
        return this;
    }

    public T e(k kVar) {
        if (this.f37446x) {
            return (T) clone().e(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f37427e = kVar;
        this.f37425c |= 4;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f37426d, this.f37426d) == 0 && this.f37430h == aVar.f37430h && j.b(this.f37429g, aVar.f37429g) && this.f37432j == aVar.f37432j && j.b(this.f37431i, aVar.f37431i) && this.f37440r == aVar.f37440r && j.b(this.f37439q, aVar.f37439q) && this.f37433k == aVar.f37433k && this.f37434l == aVar.f37434l && this.f37435m == aVar.f37435m && this.f37437o == aVar.f37437o && this.f37438p == aVar.f37438p && this.f37447y == aVar.f37447y && this.f37448z == aVar.f37448z && this.f37427e.equals(aVar.f37427e) && this.f37428f == aVar.f37428f && this.f37441s.equals(aVar.f37441s) && this.f37442t.equals(aVar.f37442t) && this.f37443u.equals(aVar.f37443u) && j.b(this.f37436n, aVar.f37436n) && j.b(this.f37445w, aVar.f37445w);
    }

    public final T g(o3.j jVar, d3.g<Bitmap> gVar) {
        if (this.f37446x) {
            return (T) clone().g(jVar, gVar);
        }
        d3.d dVar = o3.j.f33909f;
        Objects.requireNonNull(jVar, "Argument must not be null");
        l(dVar, jVar);
        return (T) o(gVar, false);
    }

    public T h(int i10, int i11) {
        if (this.f37446x) {
            return (T) clone().h(i10, i11);
        }
        this.f37435m = i10;
        this.f37434l = i11;
        this.f37425c |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f10 = this.f37426d;
        char[] cArr = j.f3307a;
        return j.f(this.f37445w, j.f(this.f37436n, j.f(this.f37443u, j.f(this.f37442t, j.f(this.f37441s, j.f(this.f37428f, j.f(this.f37427e, (((((((((((((j.f(this.f37439q, (j.f(this.f37431i, (j.f(this.f37429g, ((Float.floatToIntBits(f10) + 527) * 31) + this.f37430h) * 31) + this.f37432j) * 31) + this.f37440r) * 31) + (this.f37433k ? 1 : 0)) * 31) + this.f37434l) * 31) + this.f37435m) * 31) + (this.f37437o ? 1 : 0)) * 31) + (this.f37438p ? 1 : 0)) * 31) + (this.f37447y ? 1 : 0)) * 31) + (this.f37448z ? 1 : 0))))))));
    }

    public T i(Drawable drawable) {
        if (this.f37446x) {
            return (T) clone().i(drawable);
        }
        this.f37431i = drawable;
        int i10 = this.f37425c | 64;
        this.f37425c = i10;
        this.f37432j = 0;
        this.f37425c = i10 & (-129);
        k();
        return this;
    }

    public T j(a3.g gVar) {
        if (this.f37446x) {
            return (T) clone().j(gVar);
        }
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f37428f = gVar;
        this.f37425c |= 8;
        k();
        return this;
    }

    public final T k() {
        if (this.f37444v) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public <Y> T l(d3.d<Y> dVar, Y y10) {
        if (this.f37446x) {
            return (T) clone().l(dVar, y10);
        }
        Objects.requireNonNull(dVar, "Argument must not be null");
        Objects.requireNonNull(y10, "Argument must not be null");
        this.f37441s.f28638b.put(dVar, y10);
        k();
        return this;
    }

    public T m(d3.c cVar) {
        if (this.f37446x) {
            return (T) clone().m(cVar);
        }
        Objects.requireNonNull(cVar, "Argument must not be null");
        this.f37436n = cVar;
        this.f37425c |= 1024;
        k();
        return this;
    }

    public T n(boolean z10) {
        if (this.f37446x) {
            return (T) clone().n(true);
        }
        this.f37433k = !z10;
        this.f37425c |= 256;
        k();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T o(d3.g<Bitmap> gVar, boolean z10) {
        if (this.f37446x) {
            return (T) clone().o(gVar, z10);
        }
        m mVar = new m(gVar, z10);
        p(Bitmap.class, gVar, z10);
        p(Drawable.class, mVar, z10);
        p(BitmapDrawable.class, mVar, z10);
        p(s3.c.class, new s3.f(gVar), z10);
        k();
        return this;
    }

    public <Y> T p(Class<Y> cls, d3.g<Y> gVar, boolean z10) {
        if (this.f37446x) {
            return (T) clone().p(cls, gVar, z10);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f37442t.put(cls, gVar);
        int i10 = this.f37425c | 2048;
        this.f37425c = i10;
        this.f37438p = true;
        int i11 = i10 | 65536;
        this.f37425c = i11;
        this.A = false;
        if (z10) {
            this.f37425c = i11 | 131072;
            this.f37437o = true;
        }
        k();
        return this;
    }

    public T q(boolean z10) {
        if (this.f37446x) {
            return (T) clone().q(z10);
        }
        this.B = z10;
        this.f37425c |= 1048576;
        k();
        return this;
    }
}
