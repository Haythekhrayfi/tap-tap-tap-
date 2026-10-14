package g9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import jc.k;
import kc.j;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f30072g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f30073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f30074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f30075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f30076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f30077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RectF f30078f;

    public static abstract class a {

        /* JADX INFO: renamed from: g9.d$a$a, reason: collision with other inner class name */
        public static final class C0272a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f30079a;

            public C0272a(float f10) {
                super(null);
                this.f30079a = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0272a) && j0.d(Float.valueOf(this.f30079a), Float.valueOf(((C0272a) obj).f30079a));
            }

            public int hashCode() {
                return Float.hashCode(this.f30079a);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Fixed(value=");
                sbA.append(this.f30079a);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f30080a;

            public b(float f10) {
                super(null);
                this.f30080a = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && j0.d(Float.valueOf(this.f30080a), Float.valueOf(((b) obj).f30080a));
            }

            public int hashCode() {
                return Float.hashCode(this.f30080a);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Relative(value=");
                sbA.append(this.f30080a);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public a() {
        }

        public a(g gVar) {
        }
    }

    public static final class b {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30081a;

            static {
                int[] iArr = new int[c.b.a.values().length];
                iArr[c.b.a.NEAREST_CORNER.ordinal()] = 1;
                iArr[c.b.a.FARTHEST_CORNER.ordinal()] = 2;
                iArr[c.b.a.NEAREST_SIDE.ordinal()] = 3;
                iArr[c.b.a.FARTHEST_SIDE.ordinal()] = 4;
                f30081a = iArr;
            }
        }

        /* JADX INFO: renamed from: g9.d$b$b, reason: collision with other inner class name */
        public static final class C0273b extends l implements uc.a<Float[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f30082c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ float f30083d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ float f30084e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ float f30085f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f30086g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ float f30087h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0273b(float f10, float f11, float f12, float f13, float f14, float f15) {
                super(0);
                this.f30082c = f10;
                this.f30083d = f11;
                this.f30084e = f12;
                this.f30085f = f13;
                this.f30086g = f14;
                this.f30087h = f15;
            }

            @Override // uc.a
            public Float[] invoke() {
                return new Float[]{Float.valueOf(b.a(this.f30086g, this.f30087h, this.f30082c, this.f30083d)), Float.valueOf(b.a(this.f30086g, this.f30087h, this.f30084e, this.f30083d)), Float.valueOf(b.a(this.f30086g, this.f30087h, this.f30084e, this.f30085f)), Float.valueOf(b.a(this.f30086g, this.f30087h, this.f30082c, this.f30085f))};
            }
        }

        public static final class c extends l implements uc.a<Float[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f30088c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ float f30089d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ float f30090e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ float f30091f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f30092g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ float f30093h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f10, float f11, float f12, float f13, float f14, float f15) {
                super(0);
                this.f30088c = f10;
                this.f30089d = f11;
                this.f30090e = f12;
                this.f30091f = f13;
                this.f30092g = f14;
                this.f30093h = f15;
            }

            @Override // uc.a
            public Float[] invoke() {
                return new Float[]{Float.valueOf(Math.abs(this.f30092g - this.f30088c)), Float.valueOf(Math.abs(this.f30092g - this.f30089d)), Float.valueOf(Math.abs(this.f30093h - this.f30090e)), Float.valueOf(Math.abs(this.f30093h - this.f30091f))};
            }
        }

        public b() {
        }

        public b(g gVar) {
        }

        public static final float a(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        public static final float c(a aVar, int i10) {
            if (aVar instanceof a.C0272a) {
                return ((a.C0272a) aVar).f30079a;
            }
            if (aVar instanceof a.b) {
                return ((a.b) aVar).f30080a * i10;
            }
            throw new jc.g();
        }

        public final RadialGradient b(c cVar, a aVar, a aVar2, int[] iArr, int i10, int i11) {
            Float fX;
            float fFloatValue;
            j0.i(cVar, "radius");
            j0.i(aVar, "centerX");
            j0.i(aVar2, "centerY");
            j0.i(iArr, "colors");
            float fC = c(aVar, i10);
            float fC2 = c(aVar2, i11);
            float f10 = i10;
            float f11 = i11;
            jc.e eVarB = jc.f.b(new C0273b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, f11, fC, fC2));
            jc.e eVarB2 = jc.f.b(new c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, f11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fC, fC2));
            if (cVar instanceof c.a) {
                fFloatValue = ((c.a) cVar).f30094a;
            } else {
                if (!(cVar instanceof c.b)) {
                    throw new jc.g();
                }
                int i12 = a.f30081a[((c.b) cVar).f30095a.ordinal()];
                if (i12 == 1) {
                    fX = j.x((Float[]) ((k) eVarB).getValue());
                } else if (i12 == 2) {
                    fX = j.w((Float[]) ((k) eVarB).getValue());
                } else if (i12 == 3) {
                    fX = j.x((Float[]) ((k) eVarB2).getValue());
                } else {
                    if (i12 != 4) {
                        throw new jc.g();
                    }
                    fX = j.w((Float[]) ((k) eVarB2).getValue());
                }
                j0.f(fX);
                fFloatValue = fX.floatValue();
            }
            if (fFloatValue <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(fC, fC2, fFloatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f30094a;

            public a(float f10) {
                super(null);
                this.f30094a = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && j0.d(Float.valueOf(this.f30094a), Float.valueOf(((a) obj).f30094a));
            }

            public int hashCode() {
                return Float.hashCode(this.f30094a);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Fixed(value=");
                sbA.append(this.f30094a);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f30095a;

            public enum a {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar) {
                super(null);
                j0.i(aVar, "type");
                this.f30095a = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f30095a == ((b) obj).f30095a;
            }

            public int hashCode() {
                return this.f30095a.hashCode();
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Relative(type=");
                sbA.append(this.f30095a);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public c() {
        }

        public c(g gVar) {
        }
    }

    public d(c cVar, a aVar, a aVar2, int[] iArr) {
        j0.i(cVar, "radius");
        j0.i(aVar, "centerX");
        j0.i(aVar2, "centerY");
        j0.i(iArr, "colors");
        this.f30073a = cVar;
        this.f30074b = aVar;
        this.f30075c = aVar2;
        this.f30076d = iArr;
        this.f30077e = new Paint();
        this.f30078f = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        canvas.drawRect(this.f30078f, this.f30077e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30077e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        j0.i(rect, "bounds");
        super.onBoundsChange(rect);
        this.f30077e.setShader(f30072g.b(this.f30073a, this.f30074b, this.f30075c, this.f30076d, rect.width(), rect.height()));
        this.f30078f.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30077e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
