package l8;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y9.u6;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.d f32703a;

    public static abstract class a {

        /* JADX INFO: renamed from: l8.p$a$a, reason: collision with other inner class name */
        public static final class C0342a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f32704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final y9.t f32705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final y9.u f32706c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Uri f32707d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f32708e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final y9.h3 f32709f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final List<AbstractC0343a> f32710g;

            /* JADX INFO: renamed from: l8.p$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0343a {

                /* JADX INFO: renamed from: l8.p$a$a$a$a, reason: collision with other inner class name */
                public static final class C0344a extends AbstractC0343a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f32711a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final y9.d2.a f32712b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0344a(int i10, y9.d2.a aVar) {
                        super(null);
                        fd.j0.i(aVar, "div");
                        this.f32711a = i10;
                        this.f32712b = aVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0344a)) {
                            return false;
                        }
                        C0344a c0344a = (C0344a) obj;
                        return this.f32711a == c0344a.f32711a && fd.j0.d(this.f32712b, c0344a.f32712b);
                    }

                    public int hashCode() {
                        return this.f32712b.hashCode() + (Integer.hashCode(this.f32711a) * 31);
                    }

                    public String toString() {
                        StringBuilder sbA = defpackage.a.a("Blur(radius=");
                        sbA.append(this.f32711a);
                        sbA.append(", div=");
                        sbA.append(this.f32712b);
                        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        return sbA.toString();
                    }
                }

                public AbstractC0343a() {
                }

                public AbstractC0343a(vc.g gVar) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0342a(double d10, y9.t tVar, y9.u uVar, Uri uri, boolean z10, y9.h3 h3Var, List<? extends AbstractC0343a> list) {
                super(null);
                fd.j0.i(tVar, "contentAlignmentHorizontal");
                fd.j0.i(uVar, "contentAlignmentVertical");
                fd.j0.i(uri, "imageUrl");
                fd.j0.i(h3Var, "scale");
                this.f32704a = d10;
                this.f32705b = tVar;
                this.f32706c = uVar;
                this.f32707d = uri;
                this.f32708e = z10;
                this.f32709f = h3Var;
                this.f32710g = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0342a)) {
                    return false;
                }
                C0342a c0342a = (C0342a) obj;
                return fd.j0.d(Double.valueOf(this.f32704a), Double.valueOf(c0342a.f32704a)) && this.f32705b == c0342a.f32705b && this.f32706c == c0342a.f32706c && fd.j0.d(this.f32707d, c0342a.f32707d) && this.f32708e == c0342a.f32708e && this.f32709f == c0342a.f32709f && fd.j0.d(this.f32710g, c0342a.f32710g);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v8, types: [int] */
            /* JADX WARN: Type inference failed for: r1v8, types: [int] */
            public int hashCode() {
                int iHashCode = (this.f32707d.hashCode() + ((this.f32706c.hashCode() + ((this.f32705b.hashCode() + (Double.hashCode(this.f32704a) * 31)) * 31)) * 31)) * 31;
                boolean z10 = this.f32708e;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                int iHashCode2 = (this.f32709f.hashCode() + ((iHashCode + r10) * 31)) * 31;
                List<AbstractC0343a> list = this.f32710g;
                return iHashCode2 + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Image(alpha=");
                sbA.append(this.f32704a);
                sbA.append(", contentAlignmentHorizontal=");
                sbA.append(this.f32705b);
                sbA.append(", contentAlignmentVertical=");
                sbA.append(this.f32706c);
                sbA.append(", imageUrl=");
                sbA.append(this.f32707d);
                sbA.append(", preloadRequired=");
                sbA.append(this.f32708e);
                sbA.append(", scale=");
                sbA.append(this.f32709f);
                sbA.append(", filters=");
                return l1.f.a(sbA, this.f32710g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f32713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<Integer> f32714b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, List<Integer> list) {
                super(null);
                fd.j0.i(list, "colors");
                this.f32713a = i10;
                this.f32714b = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f32713a == bVar.f32713a && fd.j0.d(this.f32714b, bVar.f32714b);
            }

            public int hashCode() {
                return this.f32714b.hashCode() + (Integer.hashCode(this.f32713a) * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("LinearGradient(angle=");
                sbA.append(this.f32713a);
                sbA.append(", colors=");
                return l1.f.a(sbA, this.f32714b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f32715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Rect f32716b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, Rect rect) {
                super(null);
                fd.j0.i(uri, "imageUrl");
                fd.j0.i(rect, "insets");
                this.f32715a = uri;
                this.f32716b = rect;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return fd.j0.d(this.f32715a, cVar.f32715a) && fd.j0.d(this.f32716b, cVar.f32716b);
            }

            public int hashCode() {
                return this.f32716b.hashCode() + (this.f32715a.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("NinePatch(imageUrl=");
                sbA.append(this.f32715a);
                sbA.append(", insets=");
                sbA.append(this.f32716b);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbstractC0345a f32717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AbstractC0345a f32718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<Integer> f32719c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final b f32720d;

            /* JADX INFO: renamed from: l8.p$a$d$a, reason: collision with other inner class name */
            public static abstract class AbstractC0345a {

                /* JADX INFO: renamed from: l8.p$a$d$a$a, reason: collision with other inner class name */
                public static final class C0346a extends AbstractC0345a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final float f32721a;

                    public C0346a(float f10) {
                        super(null);
                        this.f32721a = f10;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0346a) && fd.j0.d(Float.valueOf(this.f32721a), Float.valueOf(((C0346a) obj).f32721a));
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f32721a);
                    }

                    public String toString() {
                        StringBuilder sbA = defpackage.a.a("Fixed(valuePx=");
                        sbA.append(this.f32721a);
                        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        return sbA.toString();
                    }
                }

                /* JADX INFO: renamed from: l8.p$a$d$a$b */
                public static final class b extends AbstractC0345a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final float f32722a;

                    public b(float f10) {
                        super(null);
                        this.f32722a = f10;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && fd.j0.d(Float.valueOf(this.f32722a), Float.valueOf(((b) obj).f32722a));
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f32722a);
                    }

                    public String toString() {
                        StringBuilder sbA = defpackage.a.a("Relative(value=");
                        sbA.append(this.f32722a);
                        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        return sbA.toString();
                    }
                }

                public AbstractC0345a() {
                }

                public AbstractC0345a(vc.g gVar) {
                }

                public final g9.d.a a() {
                    if (this instanceof C0346a) {
                        return new g9.d.a.C0272a(((C0346a) this).f32721a);
                    }
                    if (this instanceof b) {
                        return new g9.d.a.b(((b) this).f32722a);
                    }
                    throw new jc.g();
                }
            }

            public static abstract class b {

                /* JADX INFO: renamed from: l8.p$a$d$b$a, reason: collision with other inner class name */
                public static final class C0347a extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final float f32723a;

                    public C0347a(float f10) {
                        super(null);
                        this.f32723a = f10;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0347a) && fd.j0.d(Float.valueOf(this.f32723a), Float.valueOf(((C0347a) obj).f32723a));
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f32723a);
                    }

                    public String toString() {
                        StringBuilder sbA = defpackage.a.a("Fixed(valuePx=");
                        sbA.append(this.f32723a);
                        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        return sbA.toString();
                    }
                }

                /* JADX INFO: renamed from: l8.p$a$d$b$b, reason: collision with other inner class name */
                public static final class C0348b extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final y9.q5.c f32724a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0348b(y9.q5.c cVar) {
                        super(null);
                        fd.j0.i(cVar, "value");
                        this.f32724a = cVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0348b) && this.f32724a == ((C0348b) obj).f32724a;
                    }

                    public int hashCode() {
                        return this.f32724a.hashCode();
                    }

                    public String toString() {
                        StringBuilder sbA = defpackage.a.a("Relative(value=");
                        sbA.append(this.f32724a);
                        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        return sbA.toString();
                    }
                }

                public /* synthetic */ class c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f32725a;

                    static {
                        int[] iArr = new int[y9.q5.c.values().length];
                        iArr[y9.q5.c.FARTHEST_CORNER.ordinal()] = 1;
                        iArr[y9.q5.c.NEAREST_CORNER.ordinal()] = 2;
                        iArr[y9.q5.c.FARTHEST_SIDE.ordinal()] = 3;
                        iArr[y9.q5.c.NEAREST_SIDE.ordinal()] = 4;
                        f32725a = iArr;
                    }
                }

                public b() {
                }

                public b(vc.g gVar) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractC0345a abstractC0345a, AbstractC0345a abstractC0345a2, List<Integer> list, b bVar) {
                super(null);
                fd.j0.i(abstractC0345a, "centerX");
                fd.j0.i(abstractC0345a2, "centerY");
                fd.j0.i(list, "colors");
                fd.j0.i(bVar, "radius");
                this.f32717a = abstractC0345a;
                this.f32718b = abstractC0345a2;
                this.f32719c = list;
                this.f32720d = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return fd.j0.d(this.f32717a, dVar.f32717a) && fd.j0.d(this.f32718b, dVar.f32718b) && fd.j0.d(this.f32719c, dVar.f32719c) && fd.j0.d(this.f32720d, dVar.f32720d);
            }

            public int hashCode() {
                return this.f32720d.hashCode() + ((this.f32719c.hashCode() + ((this.f32718b.hashCode() + (this.f32717a.hashCode() * 31)) * 31)) * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("RadialGradient(centerX=");
                sbA.append(this.f32717a);
                sbA.append(", centerY=");
                sbA.append(this.f32718b);
                sbA.append(", colors=");
                sbA.append(this.f32719c);
                sbA.append(", radius=");
                sbA.append(this.f32720d);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f32726a;

            public e(int i10) {
                super(null);
                this.f32726a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f32726a == ((e) obj).f32726a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f32726a);
            }

            public String toString() {
                return h0.f.a(defpackage.a.a("Solid(color="), this.f32726a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public p(z7.d dVar) {
        fd.j0.i(dVar, "imageLoader");
        this.f32703a = dVar;
    }

    public static final a a(p pVar, y9.e0 e0Var, DisplayMetrics displayMetrics, v9.d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        a.d.b c0348b;
        int i15;
        Objects.requireNonNull(pVar);
        if (e0Var instanceof y9.e0.d) {
            y9.e0.d dVar2 = (y9.e0.d) e0Var;
            long jLongValue = dVar2.f39730c.f40163a.b(dVar).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i15 = (int) jLongValue;
            } else {
                int i16 = e9.a.f29114a;
                i15 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new a.b(i15, dVar2.f39730c.f40164b.b(dVar));
        }
        if (e0Var instanceof y9.e0.f) {
            y9.e0.f fVar = (y9.e0.f) e0Var;
            a.d.AbstractC0345a abstractC0345aE = pVar.e(fVar.f39732c.f40285a, displayMetrics, dVar);
            a.d.AbstractC0345a abstractC0345aE2 = pVar.e(fVar.f39732c.f40286b, displayMetrics, dVar);
            List<Integer> listB = fVar.f39732c.f40287c.b(dVar);
            y9.m5 m5Var = fVar.f39732c.f40288d;
            if (m5Var instanceof y9.m5.c) {
                c0348b = new a.d.b.C0347a(b.a0(((y9.m5.c) m5Var).f41446c, displayMetrics, dVar));
            } else {
                if (!(m5Var instanceof y9.m5.d)) {
                    throw new jc.g();
                }
                c0348b = new a.d.b.C0348b(((y9.m5.d) m5Var).f41447c.f42155a.b(dVar));
            }
            return new a.d(abstractC0345aE, abstractC0345aE2, listB, c0348b);
        }
        if (e0Var instanceof y9.e0.c) {
            y9.e0.c cVar = (y9.e0.c) e0Var;
            double dDoubleValue = cVar.f39729c.f39754a.b(dVar).doubleValue();
            y9.t tVarB = cVar.f39729c.f39755b.b(dVar);
            y9.u uVarB = cVar.f39729c.f39756c.b(dVar);
            Uri uriB = cVar.f39729c.f39758e.b(dVar);
            boolean zBooleanValue = cVar.f39729c.f39759f.b(dVar).booleanValue();
            y9.h3 h3VarB = cVar.f39729c.f39760g.b(dVar);
            List<y9.d2> list = cVar.f39729c.f39757d;
            if (list == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(kc.m.j(list, 10));
                for (y9.d2 d2Var : list) {
                    if (!(d2Var instanceof y9.d2.a)) {
                        throw new jc.g();
                    }
                    y9.d2.a aVar = (y9.d2.a) d2Var;
                    long jLongValue2 = aVar.f39562c.f40530a.b(dVar).longValue();
                    long j11 = jLongValue2 >> 31;
                    if (j11 == 0 || j11 == -1) {
                        i14 = (int) jLongValue2;
                    } else {
                        int i17 = e9.a.f29114a;
                        i14 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    arrayList2.add(new a.C0342a.AbstractC0343a.C0344a(i14, aVar));
                }
                arrayList = arrayList2;
            }
            return new a.C0342a(dDoubleValue, tVarB, uVarB, uriB, zBooleanValue, h3VarB, arrayList);
        }
        if (e0Var instanceof y9.e0.g) {
            return new a.e(((y9.e0.g) e0Var).f39733c.f43113a.b(dVar).intValue());
        }
        if (!(e0Var instanceof y9.e0.e)) {
            throw new jc.g();
        }
        y9.e0.e eVar = (y9.e0.e) e0Var;
        Uri uriB2 = eVar.f39731c.f41441a.b(dVar);
        long jLongValue3 = eVar.f39731c.f41442b.f41164b.b(dVar).longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i10 = (int) jLongValue3;
        } else {
            int i18 = e9.a.f29114a;
            i10 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue4 = eVar.f39731c.f41442b.f41166d.b(dVar).longValue();
        long j13 = jLongValue4 >> 31;
        if (j13 == 0 || j13 == -1) {
            i11 = (int) jLongValue4;
        } else {
            int i19 = e9.a.f29114a;
            i11 = jLongValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue5 = eVar.f39731c.f41442b.f41165c.b(dVar).longValue();
        long j14 = jLongValue5 >> 31;
        if (j14 == 0 || j14 == -1) {
            i12 = (int) jLongValue5;
        } else {
            int i20 = e9.a.f29114a;
            i12 = jLongValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue6 = eVar.f39731c.f41442b.f41163a.b(dVar).longValue();
        long j15 = jLongValue6 >> 31;
        if (j15 == 0 || j15 == -1) {
            i13 = (int) jLongValue6;
        } else {
            int i21 = e9.a.f29114a;
            i13 = jLongValue6 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new a.c(uriB2, new Rect(i10, i11, i12, i13));
    }

    public static final Drawable b(p pVar, List list, View view, i8.k kVar, Drawable drawable, v9.d dVar) {
        Iterator it;
        g9.d.c.b.a aVar;
        g9.d.c bVar;
        Drawable dVar2;
        Drawable bVar2;
        Objects.requireNonNull(pVar);
        if (drawable != null) {
            drawable.mutate();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            z7.d dVar3 = pVar.f32703a;
            Objects.requireNonNull(aVar2);
            fd.j0.i(kVar, "divView");
            fd.j0.i(view, "target");
            fd.j0.i(dVar3, "imageLoader");
            fd.j0.i(dVar, "resolver");
            if (aVar2 instanceof a.C0342a) {
                a.C0342a c0342a = (a.C0342a) aVar2;
                g9.f fVar = new g9.f();
                String string = c0342a.f32707d.toString();
                fd.j0.h(string, "imageUrl.toString()");
                it = it2;
                z7.e eVarLoadImage = dVar3.loadImage(string, new q(kVar, view, c0342a, dVar, fVar));
                fd.j0.h(eVarLoadImage, "fun getDivImageBackgroun…aleDrawable\n            }");
                kVar.m(eVarLoadImage, view);
                dVar2 = fVar;
            } else {
                it = it2;
                if (aVar2 instanceof a.c) {
                    a.c cVar = (a.c) aVar2;
                    g9.c cVar2 = new g9.c();
                    String string2 = cVar.f32715a.toString();
                    fd.j0.h(string2, "imageUrl.toString()");
                    z7.e eVarLoadImage2 = dVar3.loadImage(string2, new r(kVar, cVar2, cVar));
                    fd.j0.h(eVarLoadImage2, "fun getNinePatchDrawable…tchDrawable\n            }");
                    kVar.m(eVarLoadImage2, view);
                    bVar2 = cVar2;
                } else if (aVar2 instanceof a.e) {
                    bVar2 = new ColorDrawable(((a.e) aVar2).f32726a);
                } else if (aVar2 instanceof a.b) {
                    a.b bVar3 = (a.b) aVar2;
                    bVar2 = new g9.b(bVar3.f32713a, kc.t.G(bVar3.f32714b));
                } else {
                    if (!(aVar2 instanceof a.d)) {
                        throw new jc.g();
                    }
                    a.d dVar4 = (a.d) aVar2;
                    a.d.b bVar4 = dVar4.f32720d;
                    Objects.requireNonNull(bVar4);
                    if (bVar4 instanceof a.d.b.C0347a) {
                        bVar = new g9.d.c.a(((a.d.b.C0347a) bVar4).f32723a);
                    } else {
                        if (!(bVar4 instanceof a.d.b.C0348b)) {
                            throw new jc.g();
                        }
                        int i10 = a.d.b.c.f32725a[((a.d.b.C0348b) bVar4).f32724a.ordinal()];
                        if (i10 == 1) {
                            aVar = g9.d.c.b.a.FARTHEST_CORNER;
                        } else if (i10 == 2) {
                            aVar = g9.d.c.b.a.NEAREST_CORNER;
                        } else if (i10 == 3) {
                            aVar = g9.d.c.b.a.FARTHEST_SIDE;
                        } else {
                            if (i10 != 4) {
                                throw new jc.g();
                            }
                            aVar = g9.d.c.b.a.NEAREST_SIDE;
                        }
                        bVar = new g9.d.c.b(aVar);
                    }
                    dVar2 = new g9.d(bVar, dVar4.f32717a.a(), dVar4.f32718b.a(), kc.t.G(dVar4.f32719c));
                }
                dVar2 = bVar2;
            }
            Drawable drawableMutate = dVar2.mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
            it2 = it;
        }
        List listJ = kc.t.J(arrayList);
        if (drawable != null) {
            ((ArrayList) listJ).add(drawable);
        }
        ArrayList arrayList2 = (ArrayList) listJ;
        if (!(true ^ arrayList2.isEmpty())) {
            return null;
        }
        Object[] array = arrayList2.toArray(new Drawable[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new LayerDrawable((Drawable[]) array);
    }

    public static final void c(p pVar, View view, Drawable drawable) {
        boolean z10;
        Objects.requireNonNull(pVar);
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.drawable.native_animation_background) : null) != null) {
            Context context = view.getContext();
            Object obj = e0.a.f28964a;
            Drawable drawableB = e0.a.c.b(context, R.drawable.native_animation_background);
            if (drawableB != null) {
                arrayList.add(drawableB);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] array = arrayList.toArray(new Drawable[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        view.setBackground(new LayerDrawable((Drawable[]) array));
        if (z10) {
            Drawable background2 = view.getBackground();
            Objects.requireNonNull(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            Objects.requireNonNull(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R.drawable.native_animation_background);
        }
    }

    public final void d(List<? extends y9.e0> list, v9.d dVar, f9.b bVar, uc.l<Object, jc.w> lVar) {
        u9.a aVar;
        p7.d dVarE;
        v9.c<Integer> cVar;
        if (list == null) {
            return;
        }
        for (y9.e0 e0Var : list) {
            Objects.requireNonNull(e0Var);
            if (e0Var instanceof y9.e0.d) {
                aVar = ((y9.e0.d) e0Var).f39730c;
            } else if (e0Var instanceof y9.e0.f) {
                aVar = ((y9.e0.f) e0Var).f39732c;
            } else if (e0Var instanceof y9.e0.c) {
                aVar = ((y9.e0.c) e0Var).f39729c;
            } else if (e0Var instanceof y9.e0.g) {
                aVar = ((y9.e0.g) e0Var).f39733c;
            } else {
                if (!(e0Var instanceof y9.e0.e)) {
                    throw new jc.g();
                }
                aVar = ((y9.e0.e) e0Var).f39731c;
            }
            if (aVar instanceof u6) {
                dVarE = ((u6) aVar).f43113a.e(dVar, lVar);
            } else {
                if (aVar instanceof y9.g4) {
                    y9.g4 g4Var = (y9.g4) aVar;
                    bVar.d(g4Var.f40163a.e(dVar, lVar));
                    cVar = g4Var.f40164b;
                } else if (aVar instanceof y9.h5) {
                    y9.h5 h5Var = (y9.h5) aVar;
                    b.I(h5Var.f40285a, dVar, bVar, lVar);
                    b.I(h5Var.f40286b, dVar, bVar, lVar);
                    b.J(h5Var.f40288d, dVar, bVar, lVar);
                    cVar = h5Var.f40287c;
                } else if (aVar instanceof y9.e3) {
                    y9.e3 e3Var = (y9.e3) aVar;
                    bVar.d(e3Var.f39754a.e(dVar, lVar));
                    bVar.d(e3Var.f39758e.e(dVar, lVar));
                    bVar.d(e3Var.f39755b.e(dVar, lVar));
                    bVar.d(e3Var.f39756c.e(dVar, lVar));
                    bVar.d(e3Var.f39759f.e(dVar, lVar));
                    bVar.d(e3Var.f39760g.e(dVar, lVar));
                    List<y9.d2> list2 = e3Var.f39757d;
                    if (list2 == null) {
                        list2 = kc.w.f32009c;
                    }
                    for (y9.d2 d2Var : list2) {
                        if (d2Var instanceof y9.d2.a) {
                            bVar.d(((y9.d2.a) d2Var).f39562c.f40530a.e(dVar, lVar));
                        }
                    }
                }
                dVarE = cVar.a(dVar, lVar);
            }
            bVar.d(dVarE);
        }
    }

    public final a.d.AbstractC0345a e(y9.i5 i5Var, DisplayMetrics displayMetrics, v9.d dVar) {
        if (!(i5Var instanceof y9.i5.c)) {
            if (i5Var instanceof y9.i5.d) {
                return new a.d.AbstractC0345a.b((float) ((y9.i5.d) i5Var).f40611c.f41823a.b(dVar).doubleValue());
            }
            throw new jc.g();
        }
        y9.k5 k5Var = ((y9.i5.c) i5Var).f40610c;
        fd.j0.i(k5Var, "<this>");
        fd.j0.i(displayMetrics, "metrics");
        fd.j0.i(dVar, "resolver");
        return new a.d.AbstractC0345a.C0346a(b.z(k5Var.f41101b.b(dVar).longValue(), k5Var.f41100a.b(dVar), displayMetrics));
    }
}
