package x0;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import x0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements x0.a.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f37342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f37343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f37344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f37345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f37346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f37347q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f37348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f37349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.c f37352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f37354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f37355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<q> f37357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<r> f37358k;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getY();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: x0.b$b, reason: collision with other inner class name */
    public static class C0459b extends s {
        public C0459b(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            return e0.i.m(view);
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.x(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends x0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.d f37359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, String str, x0.d dVar) {
            super(str);
            this.f37359a = dVar;
        }

        @Override // x0.c
        public float getValue(Object obj) {
            return this.f37359a.f37363a;
        }

        @Override // x0.c
        public void setValue(Object obj, float f10) {
            this.f37359a.f37363a = f10;
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            return e0.i.l(view);
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.w(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float getValue(View view) {
            return view.getX();
        }

        @Override // x0.c
        public void setValue(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f37360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f37361b;
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void a(b bVar, float f10, float f11);
    }

    public static abstract class s extends x0.c<View> {
        public s(String str, g gVar) {
            super(str);
        }
    }

    static {
        new g("translationX");
        new h("translationY");
        new i("translationZ");
        f37342l = new j("scaleX");
        f37343m = new k("scaleY");
        f37344n = new l("rotation");
        f37345o = new m("rotationX");
        f37346p = new n("rotationY");
        new o("x");
        new a("y");
        new C0459b("z");
        f37347q = new c("alpha");
        new d("scrollX");
        new e("scrollY");
    }

    public <K> b(K k10, x0.c<K> cVar) {
        float f10;
        this.f37348a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37349b = Float.MAX_VALUE;
        this.f37350c = false;
        this.f37353f = false;
        this.f37354g = -3.4028235E38f;
        this.f37355h = 0L;
        this.f37357j = new ArrayList<>();
        this.f37358k = new ArrayList<>();
        this.f37351d = k10;
        this.f37352e = cVar;
        if (cVar == f37344n || cVar == f37345o || cVar == f37346p) {
            f10 = 0.1f;
        } else {
            if (cVar == f37347q || cVar == f37342l || cVar == f37343m) {
                this.f37356i = 0.00390625f;
                return;
            }
            f10 = 1.0f;
        }
        this.f37356i = f10;
    }

    public b(x0.d dVar) {
        this.f37348a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37349b = Float.MAX_VALUE;
        this.f37350c = false;
        this.f37353f = false;
        this.f37354g = -3.4028235E38f;
        this.f37355h = 0L;
        this.f37357j = new ArrayList<>();
        this.f37358k = new ArrayList<>();
        this.f37351d = null;
        this.f37352e = new f(this, "FloatValueHolder", dVar);
        this.f37356i = 1.0f;
    }

    public static <T> void b(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[SYNTHETIC] */
    @Override // x0.a.b
    public boolean a(long j10) {
        double d10;
        float f10;
        boolean z10;
        x0.a aVarA;
        int iIndexOf;
        int i10;
        long j11 = this.f37355h;
        if (j11 == 0) {
            this.f37355h = j10;
            c(this.f37349b);
            return false;
        }
        long j12 = j10 - j11;
        this.f37355h = j10;
        x0.e eVar = (x0.e) this;
        if (!eVar.f37366t) {
            float f11 = eVar.f37365s;
            x0.f fVar = eVar.f37364r;
            if (f11 != Float.MAX_VALUE) {
                double d11 = fVar.f37375i;
                j12 /= 2;
                p pVarB = fVar.b(eVar.f37349b, eVar.f37348a, j12);
                fVar = eVar.f37364r;
                fVar.f37375i = eVar.f37365s;
                eVar.f37365s = Float.MAX_VALUE;
                d10 = pVarB.f37360a;
                f10 = pVarB.f37361b;
            } else {
                d10 = eVar.f37349b;
                f10 = eVar.f37348a;
            }
            p pVarB2 = fVar.b(d10, f10, j12);
            float f12 = pVarB2.f37360a;
            eVar.f37349b = f12;
            eVar.f37348a = pVarB2.f37361b;
            float fMax = Math.max(f12, eVar.f37354g);
            eVar.f37349b = fMax;
            float fMin = Math.min(fMax, Float.MAX_VALUE);
            eVar.f37349b = fMin;
            float f13 = eVar.f37348a;
            x0.f fVar2 = eVar.f37364r;
            Objects.requireNonNull(fVar2);
            if (((double) Math.abs(f13)) < fVar2.f37371e && ((double) Math.abs(fMin - ((float) fVar2.f37375i))) < fVar2.f37370d) {
                eVar.f37349b = (float) eVar.f37364r.f37375i;
                eVar.f37348a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            } else {
                z10 = false;
            }
            float fMin2 = Math.min(this.f37349b, Float.MAX_VALUE);
            this.f37349b = fMin2;
            float fMax2 = Math.max(fMin2, this.f37354g);
            this.f37349b = fMax2;
            c(fMax2);
            if (z10) {
                this.f37353f = false;
                aVarA = x0.a.a();
                aVarA.f37331a.remove(this);
                iIndexOf = aVarA.f37332b.indexOf(this);
                if (iIndexOf >= 0) {
                    aVarA.f37332b.set(iIndexOf, null);
                    aVarA.f37336f = true;
                }
                this.f37355h = 0L;
                this.f37350c = false;
                for (i10 = 0; i10 < this.f37357j.size(); i10++) {
                    if (this.f37357j.get(i10) != null) {
                        this.f37357j.get(i10).a(this, false, this.f37349b, this.f37348a);
                    }
                }
                b(this.f37357j);
            }
            return z10;
        }
        float f14 = eVar.f37365s;
        if (f14 != Float.MAX_VALUE) {
            eVar.f37364r.f37375i = f14;
            eVar.f37365s = Float.MAX_VALUE;
        }
        eVar.f37349b = (float) eVar.f37364r.f37375i;
        eVar.f37348a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        eVar.f37366t = false;
        z10 = true;
        float fMin3 = Math.min(this.f37349b, Float.MAX_VALUE);
        this.f37349b = fMin3;
        float fMax3 = Math.max(fMin3, this.f37354g);
        this.f37349b = fMax3;
        c(fMax3);
        if (z10) {
            this.f37353f = false;
            aVarA = x0.a.a();
            aVarA.f37331a.remove(this);
            iIndexOf = aVarA.f37332b.indexOf(this);
            if (iIndexOf >= 0) {
                aVarA.f37332b.set(iIndexOf, null);
                aVarA.f37336f = true;
            }
            this.f37355h = 0L;
            this.f37350c = false;
            while (i10 < this.f37357j.size()) {
                if (this.f37357j.get(i10) != null) {
                    this.f37357j.get(i10).a(this, false, this.f37349b, this.f37348a);
                }
            }
            b(this.f37357j);
        }
        return z10;
    }

    public void c(float f10) {
        this.f37352e.setValue(this.f37351d, f10);
        for (int i10 = 0; i10 < this.f37358k.size(); i10++) {
            if (this.f37358k.get(i10) != null) {
                this.f37358k.get(i10).a(this, this.f37349b, this.f37348a);
            }
        }
        b(this.f37358k);
    }
}
