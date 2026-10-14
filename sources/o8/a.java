package o8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import fd.j0;
import i8.v0;
import i8.w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y8.c0;
import y9.b1;
import y9.c7;
import y9.f5;
import y9.f6;
import y9.k0;
import y9.n6;
import y9.o1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements f9.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f34003q = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DisplayMetrics f34004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f34005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v9.d f34006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0 f34007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f34008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jc.e f34009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f34010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f34011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f34012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f34013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f34014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<p7.d> f34017p;

    /* JADX INFO: renamed from: o8.a$a, reason: collision with other inner class name */
    public final class C0375a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f34018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f34019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f34020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f34021d;

        public C0375a(a aVar) {
            j0.i(aVar, "this$0");
            this.f34021d = aVar;
            Paint paint = new Paint();
            this.f34018a = paint;
            this.f34019b = new Path();
            this.f34020c = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f34022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f34023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f34024c;

        public b(a aVar) {
            j0.i(aVar, "this$0");
            this.f34024c = aVar;
            this.f34022a = new Path();
            this.f34023b = new RectF();
        }

        public final void a(float[] fArr) {
            this.f34023b.set(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f34024c.f34005d.getWidth(), this.f34024c.f34005d.getHeight());
            this.f34022a.reset();
            this.f34022a.addRoundRect(this.f34023b, (float[]) fArr.clone(), Path.Direction.CW);
            this.f34022a.close();
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f34025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f34026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f34028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rect f34029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public NinePatch f34030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f34031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f34032h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a f34033i;

        public d(a aVar) {
            j0.i(aVar, "this$0");
            this.f34033i = aVar;
            float dimension = aVar.f34005d.getContext().getResources().getDimension(R.dimen.div_shadow_elevation);
            this.f34025a = dimension;
            this.f34026b = dimension;
            this.f34027c = -16777216;
            this.f34028d = new Paint();
            this.f34029e = new Rect();
            this.f34032h = 0.5f;
        }
    }

    public static final class e extends vc.l implements uc.a<C0375a> {
        public e() {
            super(0);
        }

        @Override // uc.a
        public C0375a invoke() {
            return new C0375a(a.this);
        }
    }

    public static final class f extends ViewOutlineProvider {
        public f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            a aVar = a.this;
            float[] fArr = aVar.f34012k;
            if (fArr != null) {
                outline.setRoundRect(0, 0, width, height, aVar.b(kc.j.o(fArr), view.getWidth(), view.getHeight()));
            } else {
                j0.r("cornerRadii");
                throw null;
            }
        }
    }

    public static final class g extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0 f34037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f34038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k0 k0Var, v9.d dVar) {
            super(1);
            this.f34037d = k0Var;
            this.f34038e = dVar;
        }

        @Override // uc.l
        public jc.w invoke(Object obj) {
            j0.i(obj, "$noName_0");
            a aVar = a.this;
            k0 k0Var = this.f34037d;
            v9.d dVar = this.f34038e;
            int i10 = a.f34003q;
            aVar.a(k0Var, dVar);
            a.this.f34005d.invalidate();
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.a<d> {
        public h() {
            super(0);
        }

        @Override // uc.a
        public d invoke() {
            return new d(a.this);
        }
    }

    static {
        new c(null);
    }

    public a(DisplayMetrics displayMetrics, View view, v9.d dVar, k0 k0Var) {
        j0.i(displayMetrics, "metrics");
        j0.i(view, "view");
        j0.i(dVar, "expressionResolver");
        j0.i(k0Var, "divBorder");
        this.f34004c = displayMetrics;
        this.f34005d = view;
        this.f34006e = dVar;
        this.f34007f = k0Var;
        this.f34008g = new b(this);
        this.f34009h = jc.f.b(new e());
        this.f34010i = jc.f.b(new h());
        this.f34017p = new ArrayList();
        m(this.f34006e, this.f34007f);
    }

    public final void a(k0 k0Var, v9.d dVar) {
        boolean z10;
        v9.b<Integer> bVar;
        Integer numB;
        float fA = o8.b.a(k0Var.f41000e, dVar, this.f34004c);
        this.f34011j = fA;
        float dimension = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        boolean z11 = fA > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f34014m = z11;
        if (z11) {
            c7 c7Var = k0Var.f41000e;
            int iIntValue = (c7Var == null || (bVar = c7Var.f39543a) == null || (numB = bVar.b(dVar)) == null) ? 0 : numB.intValue();
            C0375a c0375aH = h();
            c0375aH.f34018a.setStrokeWidth(this.f34011j);
            c0375aH.f34018a.setColor(iIntValue);
        }
        DisplayMetrics displayMetrics = this.f34004c;
        j0.i(k0Var, "<this>");
        j0.i(displayMetrics, "metrics");
        j0.i(dVar, "resolver");
        b1 b1Var = k0Var.f40997b;
        v9.b<Long> bVar2 = b1Var == null ? null : b1Var.f39126c;
        if (bVar2 == null) {
            bVar2 = k0Var.f40996a;
        }
        float fU = l8.b.u(bVar2 == null ? null : bVar2.b(dVar), displayMetrics);
        b1 b1Var2 = k0Var.f40997b;
        v9.b<Long> bVar3 = b1Var2 == null ? null : b1Var2.f39127d;
        if (bVar3 == null) {
            bVar3 = k0Var.f40996a;
        }
        float fU2 = l8.b.u(bVar3 == null ? null : bVar3.b(dVar), displayMetrics);
        b1 b1Var3 = k0Var.f40997b;
        v9.b<Long> bVar4 = b1Var3 == null ? null : b1Var3.f39124a;
        if (bVar4 == null) {
            bVar4 = k0Var.f40996a;
        }
        float fU3 = l8.b.u(bVar4 == null ? null : bVar4.b(dVar), displayMetrics);
        b1 b1Var4 = k0Var.f40997b;
        v9.b<Long> bVar5 = b1Var4 == null ? null : b1Var4.f39125b;
        if (bVar5 == null) {
            bVar5 = k0Var.f40996a;
        }
        float fU4 = l8.b.u(bVar5 == null ? null : bVar5.b(dVar), displayMetrics);
        float[] fArr = {fU, fU, fU2, fU2, fU4, fU4, fU3, fU3};
        this.f34012k = fArr;
        float fO = kc.j.o(fArr);
        int length = fArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            float f10 = fArr[i10];
            i10++;
            if (!Float.valueOf(f10).equals(Float.valueOf(fO))) {
                z10 = false;
                break;
            }
        }
        this.f34013l = !z10;
        boolean z12 = this.f34015n;
        boolean zBooleanValue = k0Var.f40998c.b(dVar).booleanValue();
        this.f34016o = zBooleanValue;
        boolean z13 = k0Var.f40999d != null && zBooleanValue;
        this.f34015n = z13;
        View view = this.f34005d;
        if (zBooleanValue && !z13) {
            dimension = view.getContext().getResources().getDimension(R.dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
        k();
        j();
        if (this.f34015n || z12) {
            Object parent = this.f34005d.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null) {
                return;
            }
            view2.invalidate();
        }
    }

    public final float b(float f10, float f11, float f12) {
        if (f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float fMin = Math.min(f12, f11) / 2;
        if (f10 > fMin) {
            e9.c cVar = e9.c.f29122a;
        }
        return Math.min(f10, fMin);
    }

    public final void c(Canvas canvas) {
        if (l()) {
            canvas.clipPath(this.f34008g.f34022a);
        }
    }

    public final void e(Canvas canvas) {
        if (this.f34014m) {
            canvas.drawPath(h().f34019b, h().f34018a);
        }
    }

    public final void f(Canvas canvas) {
        if (this.f34015n) {
            float f10 = i().f34031g;
            float f11 = i().f34032h;
            int iSave = canvas.save();
            canvas.translate(f10, f11);
            try {
                NinePatch ninePatch = i().f34030f;
                if (ninePatch != null) {
                    ninePatch.draw(canvas, i().f34029e, i().f34028d);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34017p;
    }

    public final C0375a h() {
        return (C0375a) this.f34009h.getValue();
    }

    public final d i() {
        return (d) this.f34010i.getValue();
    }

    public final void j() {
        if (l()) {
            this.f34005d.setClipToOutline(false);
            this.f34005d.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        } else {
            this.f34005d.setOutlineProvider(new f());
            this.f34005d.setClipToOutline(true);
        }
    }

    public final void k() {
        Number numberValueOf;
        Number numberValueOf2;
        f5 f5Var;
        o1 o1Var;
        f5 f5Var2;
        o1 o1Var2;
        v9.b<Double> bVar;
        Double dB;
        v9.b<Integer> bVar2;
        Integer numB;
        v9.b<Long> bVar3;
        Long lB;
        float[] fArr = this.f34012k;
        if (fArr == null) {
            j0.r("cornerRadii");
            throw null;
        }
        float[] fArr2 = (float[]) fArr.clone();
        int length = fArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = b(fArr2[i10], this.f34005d.getWidth(), this.f34005d.getHeight());
        }
        this.f34008g.a(fArr2);
        float f10 = this.f34011j / 2.0f;
        int length2 = fArr2.length;
        for (int i11 = 0; i11 < length2; i11++) {
            fArr2[i11] = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr2[i11] - f10);
        }
        if (this.f34014m) {
            C0375a c0375aH = h();
            Objects.requireNonNull(c0375aH);
            j0.i(fArr2, "radii");
            a aVar = c0375aH.f34021d;
            float f11 = aVar.f34011j / 2.0f;
            c0375aH.f34020c.set(f11, f11, aVar.f34005d.getWidth() - f11, c0375aH.f34021d.f34005d.getHeight() - f11);
            c0375aH.f34019b.reset();
            c0375aH.f34019b.addRoundRect(c0375aH.f34020c, fArr2, Path.Direction.CW);
            c0375aH.f34019b.close();
        }
        if (this.f34015n) {
            d dVarI = i();
            Objects.requireNonNull(dVarI);
            j0.i(fArr2, "radii");
            float f12 = 2;
            dVarI.f34029e.set(0, 0, (int) ((dVarI.f34026b * f12) + dVarI.f34033i.f34005d.getWidth()), (int) ((dVarI.f34026b * f12) + dVarI.f34033i.f34005d.getHeight()));
            a aVar2 = dVarI.f34033i;
            f6 f6Var = aVar2.f34007f.f40999d;
            Float fValueOf = (f6Var == null || (bVar3 = f6Var.f39971b) == null || (lB = bVar3.b(aVar2.f34006e)) == null) ? null : Float.valueOf(l8.b.v(lB, dVarI.f34033i.f34004c));
            dVarI.f34026b = fValueOf == null ? dVarI.f34025a : fValueOf.floatValue();
            int iIntValue = -16777216;
            if (f6Var != null && (bVar2 = f6Var.f39972c) != null && (numB = bVar2.b(dVarI.f34033i.f34006e)) != null) {
                iIntValue = numB.intValue();
            }
            dVarI.f34027c = iIntValue;
            float fDoubleValue = 0.23f;
            if (f6Var != null && (bVar = f6Var.f39970a) != null && (dB = bVar.b(dVarI.f34033i.f34006e)) != null) {
                fDoubleValue = (float) dB.doubleValue();
            }
            if (f6Var == null || (f5Var2 = f6Var.f39973d) == null || (o1Var2 = f5Var2.f39960a) == null) {
                numberValueOf = null;
            } else {
                a aVar3 = dVarI.f34033i;
                numberValueOf = Integer.valueOf(l8.b.X(o1Var2, aVar3.f34004c, aVar3.f34006e));
            }
            if (numberValueOf == null) {
                numberValueOf = Float.valueOf(k9.i.a(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
            }
            dVarI.f34031g = numberValueOf.floatValue() - dVarI.f34026b;
            if (f6Var == null || (f5Var = f6Var.f39973d) == null || (o1Var = f5Var.f39961b) == null) {
                numberValueOf2 = null;
            } else {
                a aVar4 = dVarI.f34033i;
                numberValueOf2 = Integer.valueOf(l8.b.X(o1Var, aVar4.f34004c, aVar4.f34006e));
            }
            if (numberValueOf2 == null) {
                numberValueOf2 = Float.valueOf(k9.i.a(0.5f));
            }
            dVarI.f34032h = numberValueOf2.floatValue() - dVarI.f34026b;
            dVarI.f34028d.setColor(dVarI.f34027c);
            dVarI.f34028d.setAlpha((int) (fDoubleValue * 255));
            w0 w0Var = w0.f31480a;
            Context context = dVarI.f34033i.f34005d.getContext();
            j0.h(context, "view.context");
            float f13 = dVarI.f34026b;
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(fArr2, "radii");
            Map<w0.a, NinePatch> map = w0.f31482c;
            w0.a aVar5 = new w0.a(fArr2, f13);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object ninePatch = linkedHashMap.get(aVar5);
            if (ninePatch == null) {
                float fMax = Math.max(fArr2[1] + fArr2[2], fArr2[5] + fArr2[6]) + f13;
                float fMax2 = Math.max(fArr2[0] + fArr2[7], fArr2[3] + fArr2[4]) + f13;
                float fD = bd.e.d(f13, 1.0f, 25.0f);
                float f14 = f13 > 25.0f ? 25.0f / f13 : 1.0f;
                float f15 = f13 * f12;
                int i12 = (int) ((fMax + f15) * f14);
                int i13 = (int) ((f15 + fMax2) * f14);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ALPHA_8);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i12, i13, Bitmap.Config.ALPHA_8);
                j0.h(bitmapCreateBitmap, "inBitmap");
                RoundRectShape roundRectShape = new RoundRectShape(fArr2, null, null);
                roundRectShape.resize(fMax, fMax2);
                Canvas canvas = new Canvas();
                canvas.setBitmap(bitmapCreateBitmap);
                int iSave = canvas.save();
                canvas.translate(fD, fD);
                try {
                    int iSave2 = canvas.save();
                    canvas.scale(f14, f14, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    try {
                        roundRectShape.draw(canvas, w0.f31481b);
                        canvas.restoreToCount(iSave2);
                        canvas.restoreToCount(iSave);
                        j0.h(bitmapCreateBitmap2, "outBitmap");
                        RenderScript renderScriptCreate = RenderScript.create(context);
                        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.A_8(renderScriptCreate));
                        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                        scriptIntrinsicBlurCreate.setRadius(fD);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                        bitmapCreateBitmap.recycle();
                        if (f14 < 1.0f) {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap2, (int) (bitmapCreateBitmap2.getWidth() / f14), (int) (bitmapCreateBitmap2.getHeight() / f14), true);
                            j0.h(bitmapCreateScaledBitmap, "createScaledBitmap(this, width, height, filter)");
                            bitmapCreateBitmap2.recycle();
                            bitmapCreateBitmap2 = bitmapCreateScaledBitmap;
                        }
                        int width = bitmapCreateBitmap2.getWidth();
                        int height = bitmapCreateBitmap2.getHeight() / 2;
                        int i14 = width / 2;
                        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                        byteBufferOrder.put((byte) 1);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 9);
                        int i15 = 0;
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        v0.a(byteBufferOrder, 0, 0, 0, 0);
                        v0.a(byteBufferOrder, i14 - 1, i14 + 1, height - 1, height + 1);
                        while (i15 < 9) {
                            i15++;
                            byteBufferOrder.putInt(1);
                        }
                        byte[] bArrArray = byteBufferOrder.array();
                        j0.h(bArrArray, "buffer.array()");
                        ninePatch = new NinePatch(bitmapCreateBitmap2, bArrArray);
                        linkedHashMap.put(aVar5, ninePatch);
                    } catch (Throwable th) {
                        canvas.restoreToCount(iSave2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave);
                    throw th2;
                }
            }
            dVarI.f34030f = (NinePatch) ninePatch;
        }
    }

    public final boolean l() {
        return this.f34015n || (!this.f34016o && (this.f34013l || this.f34014m || c0.u(this.f34005d)));
    }

    public final void m(v9.d dVar, k0 k0Var) {
        v9.b<Long> bVar;
        v9.b<Long> bVar2;
        v9.b<Long> bVar3;
        v9.b<Long> bVar4;
        v9.b<Integer> bVar5;
        v9.b<Long> bVar6;
        v9.b<n6> bVar7;
        v9.b<Double> bVar8;
        v9.b<Long> bVar9;
        v9.b<Integer> bVar10;
        f5 f5Var;
        o1 o1Var;
        v9.b<n6> bVar11;
        f5 f5Var2;
        o1 o1Var2;
        v9.b<Double> bVar12;
        f5 f5Var3;
        o1 o1Var3;
        v9.b<n6> bVar13;
        f5 f5Var4;
        o1 o1Var4;
        v9.b<Double> bVar14;
        a(k0Var, dVar);
        g gVar = new g(k0Var, dVar);
        v9.b<Long> bVar15 = k0Var.f40996a;
        p7.d dVarE = null;
        p7.d dVarE2 = bVar15 == null ? null : bVar15.e(dVar, gVar);
        if (dVarE2 == null) {
            int i10 = p7.d.C1;
            dVarE2 = p7.c.f34476c;
        }
        d(dVarE2);
        b1 b1Var = k0Var.f40997b;
        p7.d dVarE3 = (b1Var == null || (bVar = b1Var.f39126c) == null) ? null : bVar.e(dVar, gVar);
        if (dVarE3 == null) {
            int i11 = p7.d.C1;
            dVarE3 = p7.c.f34476c;
        }
        d(dVarE3);
        b1 b1Var2 = k0Var.f40997b;
        p7.d dVarE4 = (b1Var2 == null || (bVar2 = b1Var2.f39127d) == null) ? null : bVar2.e(dVar, gVar);
        if (dVarE4 == null) {
            int i12 = p7.d.C1;
            dVarE4 = p7.c.f34476c;
        }
        d(dVarE4);
        b1 b1Var3 = k0Var.f40997b;
        p7.d dVarE5 = (b1Var3 == null || (bVar3 = b1Var3.f39125b) == null) ? null : bVar3.e(dVar, gVar);
        if (dVarE5 == null) {
            int i13 = p7.d.C1;
            dVarE5 = p7.c.f34476c;
        }
        d(dVarE5);
        b1 b1Var4 = k0Var.f40997b;
        p7.d dVarE6 = (b1Var4 == null || (bVar4 = b1Var4.f39124a) == null) ? null : bVar4.e(dVar, gVar);
        if (dVarE6 == null) {
            int i14 = p7.d.C1;
            dVarE6 = p7.c.f34476c;
        }
        d(dVarE6);
        d(k0Var.f40998c.e(dVar, gVar));
        c7 c7Var = k0Var.f41000e;
        p7.d dVarE7 = (c7Var == null || (bVar5 = c7Var.f39543a) == null) ? null : bVar5.e(dVar, gVar);
        if (dVarE7 == null) {
            int i15 = p7.d.C1;
            dVarE7 = p7.c.f34476c;
        }
        d(dVarE7);
        c7 c7Var2 = k0Var.f41000e;
        p7.d dVarE8 = (c7Var2 == null || (bVar6 = c7Var2.f39545c) == null) ? null : bVar6.e(dVar, gVar);
        if (dVarE8 == null) {
            int i16 = p7.d.C1;
            dVarE8 = p7.c.f34476c;
        }
        d(dVarE8);
        c7 c7Var3 = k0Var.f41000e;
        p7.d dVarE9 = (c7Var3 == null || (bVar7 = c7Var3.f39544b) == null) ? null : bVar7.e(dVar, gVar);
        if (dVarE9 == null) {
            int i17 = p7.d.C1;
            dVarE9 = p7.c.f34476c;
        }
        d(dVarE9);
        f6 f6Var = k0Var.f40999d;
        p7.d dVarE10 = (f6Var == null || (bVar8 = f6Var.f39970a) == null) ? null : bVar8.e(dVar, gVar);
        if (dVarE10 == null) {
            int i18 = p7.d.C1;
            dVarE10 = p7.c.f34476c;
        }
        d(dVarE10);
        f6 f6Var2 = k0Var.f40999d;
        p7.d dVarE11 = (f6Var2 == null || (bVar9 = f6Var2.f39971b) == null) ? null : bVar9.e(dVar, gVar);
        if (dVarE11 == null) {
            int i19 = p7.d.C1;
            dVarE11 = p7.c.f34476c;
        }
        d(dVarE11);
        f6 f6Var3 = k0Var.f40999d;
        p7.d dVarE12 = (f6Var3 == null || (bVar10 = f6Var3.f39972c) == null) ? null : bVar10.e(dVar, gVar);
        if (dVarE12 == null) {
            int i20 = p7.d.C1;
            dVarE12 = p7.c.f34476c;
        }
        d(dVarE12);
        f6 f6Var4 = k0Var.f40999d;
        p7.d dVarE13 = (f6Var4 == null || (f5Var = f6Var4.f39973d) == null || (o1Var = f5Var.f39960a) == null || (bVar11 = o1Var.f41739a) == null) ? null : bVar11.e(dVar, gVar);
        if (dVarE13 == null) {
            int i21 = p7.d.C1;
            dVarE13 = p7.c.f34476c;
        }
        d(dVarE13);
        f6 f6Var5 = k0Var.f40999d;
        p7.d dVarE14 = (f6Var5 == null || (f5Var2 = f6Var5.f39973d) == null || (o1Var2 = f5Var2.f39960a) == null || (bVar12 = o1Var2.f41740b) == null) ? null : bVar12.e(dVar, gVar);
        if (dVarE14 == null) {
            int i22 = p7.d.C1;
            dVarE14 = p7.c.f34476c;
        }
        d(dVarE14);
        f6 f6Var6 = k0Var.f40999d;
        p7.d dVarE15 = (f6Var6 == null || (f5Var3 = f6Var6.f39973d) == null || (o1Var3 = f5Var3.f39961b) == null || (bVar13 = o1Var3.f41739a) == null) ? null : bVar13.e(dVar, gVar);
        if (dVarE15 == null) {
            int i23 = p7.d.C1;
            dVarE15 = p7.c.f34476c;
        }
        d(dVarE15);
        f6 f6Var7 = k0Var.f40999d;
        if (f6Var7 != null && (f5Var4 = f6Var7.f39973d) != null && (o1Var4 = f5Var4.f39961b) != null && (bVar14 = o1Var4.f41740b) != null) {
            dVarE = bVar14.e(dVar, gVar);
        }
        if (dVarE == null) {
            int i24 = p7.d.C1;
            dVarE = p7.c.f34476c;
        }
        d(dVarE);
    }
}
