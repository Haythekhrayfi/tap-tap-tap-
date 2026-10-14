package a3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o3.o;
import u3.l;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Cloneable] */
/* JADX INFO: loaded from: classes.dex */
public class i<TranscodeType> extends x3.a<i<TranscodeType>> {
    public final Context C;
    public final j D;
    public final Class<TranscodeType> E;
    public final e F;
    public k<?, ? super TranscodeType> G;
    public Object H;
    public List<x3.d<TranscodeType>> I;
    public boolean J;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f57b;

        static {
            int[] iArr = new int[g.values().length];
            f57b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f56a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new x3.e().e(g3.k.f29861c).j(g.LOW).n(true);
    }

    @SuppressLint({"CheckResult"})
    public i(c cVar, j jVar, Class<TranscodeType> cls, Context context) {
        x3.e eVar;
        this.D = jVar;
        this.E = cls;
        this.C = context;
        e eVar2 = jVar.f59a.f15e;
        k kVar = eVar2.f42f.get(cls);
        if (kVar == null) {
            for (Map.Entry<Class<?>, k<?, ?>> entry : eVar2.f42f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        this.G = kVar == null ? e.f36j : kVar;
        this.F = cVar.f15e;
        for (x3.d<Object> dVar : jVar.f68j) {
            if (dVar != null) {
                if (this.I == null) {
                    this.I = new ArrayList();
                }
                this.I.add((x3.d<TranscodeType>) dVar);
            }
        }
        synchronized (jVar) {
            eVar = jVar.f69k;
        }
        b(eVar);
    }

    @Override // x3.a
    /* JADX INFO: renamed from: c */
    public x3.a clone() {
        i iVar = (i) super.clone();
        iVar.G = iVar.G.b();
        return iVar;
    }

    @Override // x3.a
    public Object clone() throws CloneNotSupportedException {
        i iVar = (i) super.clone();
        iVar.G = iVar.G.b();
        return iVar;
    }

    @Override // x3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> b(x3.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (i) super.b(aVar);
    }

    public final x3.b s(y3.h<TranscodeType> hVar, x3.d<TranscodeType> dVar, x3.c cVar, k<?, ? super TranscodeType> kVar, g gVar, int i10, int i11, x3.a<?> aVar, Executor executor) {
        return v(hVar, dVar, aVar, null, kVar, gVar, i10, i11, executor);
    }

    public final <Y extends y3.h<TranscodeType>> Y t(Y y10, x3.d<TranscodeType> dVar, x3.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y10, "Argument must not be null");
        if (!this.J) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        x3.b bVarS = s(y10, dVar, null, this.G, aVar.f37428f, aVar.f37435m, aVar.f37434l, aVar, executor);
        x3.b bVarG = y10.g();
        x3.g gVar = (x3.g) bVarS;
        if (gVar.k(bVarG)) {
            if (!(!aVar.f37433k && bVarG.e())) {
                gVar.a();
                Objects.requireNonNull(bVarG, "Argument must not be null");
                if (!bVarG.isRunning()) {
                    bVarG.d();
                }
                return y10;
            }
        }
        this.D.i(y10);
        y10.d(bVarS);
        j jVar = this.D;
        synchronized (jVar) {
            jVar.f64f.f36002a.add(y10);
            l lVar = jVar.f62d;
            lVar.f35992a.add(bVarS);
            if (lVar.f35994c) {
                gVar.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                lVar.f35993b.add(bVarS);
            } else {
                gVar.d();
            }
        }
        return y10;
    }

    public y3.i<ImageView, TranscodeType> u(ImageView imageView) {
        x3.a aVarG;
        y3.i<ImageView, TranscodeType> cVar;
        x3.a aVarClone;
        o3.j jVar;
        o3.h hVar;
        b4.j.a();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!x3.a.f(this.f37425c, 2048) && this.f37438p && imageView.getScaleType() != null) {
            switch (a.f56a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarG = clone().g(o3.j.f33905b, new o3.g());
                    break;
                case 2:
                    aVarClone = clone();
                    jVar = o3.j.f33906c;
                    hVar = new o3.h();
                    aVarG = aVarClone.g(jVar, hVar);
                    aVarG.A = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarG = clone().g(o3.j.f33904a, new o());
                    aVarG.A = true;
                    break;
                case 6:
                    aVarClone = clone();
                    jVar = o3.j.f33906c;
                    hVar = new o3.h();
                    aVarG = aVarClone.g(jVar, hVar);
                    aVarG.A = true;
                    break;
                default:
                    aVarG = this;
                    break;
            }
        } else {
            aVarG = this;
        }
        e eVar = this.F;
        Class<TranscodeType> cls = this.E;
        Objects.requireNonNull(eVar.f39c);
        if (Bitmap.class.equals(cls)) {
            cVar = new y3.b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            cVar = new y3.c(imageView);
        }
        t(cVar, null, aVarG, b4.e.f3295a);
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x3.b v(y3.h<TranscodeType> hVar, x3.d<TranscodeType> dVar, x3.a<?> aVar, x3.c cVar, k<?, ? super TranscodeType> kVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.C;
        e eVar = this.F;
        Object obj = this.H;
        Class<TranscodeType> cls = this.E;
        List<x3.d<TranscodeType>> list = this.I;
        g3.l lVar = eVar.f43g;
        z3.c<? super Object> cVar2 = kVar.f73c;
        x3.g gVar2 = (x3.g) ((c4.a.c) x3.g.E).b();
        if (gVar2 == null) {
            gVar2 = new x3.g();
        }
        synchronized (gVar2) {
            gVar2.f37454h = context;
            gVar2.f37455i = eVar;
            gVar2.f37456j = obj;
            gVar2.f37457k = cls;
            gVar2.f37458l = aVar;
            gVar2.f37459m = i10;
            gVar2.f37460n = i11;
            gVar2.f37461o = gVar;
            gVar2.f37462p = hVar;
            gVar2.f37452f = dVar;
            gVar2.f37463q = list;
            gVar2.f37453g = cVar;
            gVar2.f37464r = lVar;
            gVar2.f37465s = cVar2;
            gVar2.f37466t = executor;
            gVar2.f37470x = x3.g.b.PENDING;
            if (gVar2.D == null && eVar.f44h) {
                gVar2.D = new RuntimeException("Glide request origin trace");
            }
        }
        return gVar2;
    }
}
