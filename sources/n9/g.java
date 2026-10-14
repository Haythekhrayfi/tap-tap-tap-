package n9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class g extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f33746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f33747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f33748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewPager2.g f33749f;

    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageScrolled(int i10, float f10, int i11) {
            g gVar = g.this;
            f fVar = gVar.f33746c;
            if (fVar == null) {
                return;
            }
            if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            fVar.f33741l = i10;
            fVar.f33742m = f10;
            fVar.f33732c.g(i10, f10);
            fVar.a(i10, f10);
            gVar.invalidate();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i10) {
            g gVar = g.this;
            f fVar = gVar.f33746c;
            if (fVar == null) {
                return;
            }
            fVar.f33741l = i10;
            fVar.f33742m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            fVar.f33732c.onPageSelected(i10);
            fVar.a(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            gVar.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33749f = new a();
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void b(f fVar) {
        ViewPager2 viewPager2 = this.f33747d;
        if (viewPager2 == null) {
            return;
        }
        RecyclerView.g adapter = viewPager2.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            fVar.f33733d = itemCount;
            fVar.f33732c.d(itemCount);
            fVar.b();
            fVar.f33736g = (fVar.f33739j - (fVar.f33737h * (fVar.f33734e - 1))) / 2.0f;
            fVar.f33735f = fVar.f33740k / 2.0f;
        }
        int currentItem = viewPager2.getCurrentItem();
        fVar.f33741l = currentItem;
        fVar.f33742m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        fVar.f33732c.onPageSelected(currentItem);
        fVar.a(currentItem, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        j0.i(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        f fVar = this.f33746c;
        if (fVar == null) {
            return;
        }
        j0.i(canvas, "canvas");
        int i10 = fVar.f33744o;
        int i11 = fVar.f33745p;
        if (i10 <= i11) {
            while (true) {
                int i12 = i10 + 1;
                float fD = fVar.d(i10) - fVar.f33743n;
                if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD <= fD && fD <= ((float) fVar.f33739j)) {
                    c cVarA = fVar.f33732c.a(i10);
                    float f10 = fVar.f33738i;
                    if (!(f10 == 1.0f) && (cVarA instanceof c.b)) {
                        c.b bVar = (c.b) cVarA;
                        c.b bVar2 = new c.b(bVar.f33716a * f10, bVar.f33717b, bVar.f33718c);
                        fVar.f33732c.e(bVar2.f33716a);
                        cVarA = bVar2;
                    }
                    if (fVar.f33733d > fVar.f33734e) {
                        float f11 = fVar.f33737h * 1.3f;
                        float fB = fVar.f33730a.f33727c.b().b() / 2;
                        if (i10 == 0 || i10 == fVar.f33733d - 1) {
                            f11 = fB;
                        }
                        int i13 = fVar.f33739j;
                        if (fD < f11) {
                            float fB2 = (cVarA.b() * fD) / f11;
                            if (fB2 <= fVar.f33730a.f33728d.b().b()) {
                                cVarA = fVar.f33730a.f33728d.b();
                            } else if (fB2 < cVarA.b()) {
                                if (cVarA instanceof c.b) {
                                    c.b bVar3 = (c.b) cVarA;
                                    bVar3.f33716a = fB2;
                                    bVar3.f33717b = (bVar3.f33717b * fD) / f11;
                                } else if (cVarA instanceof c.a) {
                                    ((c.a) cVarA).f33715a = fB2;
                                }
                            }
                        } else {
                            float f12 = i13;
                            if (fD > f12 - f11) {
                                float f13 = (-fD) + f12;
                                float fB3 = (cVarA.b() * f13) / f11;
                                if (fB3 <= fVar.f33730a.f33728d.b().b()) {
                                    cVarA = fVar.f33730a.f33728d.b();
                                } else if (fB3 < cVarA.b()) {
                                    if (cVarA instanceof c.b) {
                                        c.b bVar4 = (c.b) cVarA;
                                        bVar4.f33716a = fB3;
                                        bVar4.f33717b = (bVar4.f33717b * f13) / f11;
                                    } else if (cVarA instanceof c.a) {
                                        ((c.a) cVarA).f33715a = fB3;
                                    }
                                }
                            }
                        }
                    }
                    fVar.f33731b.b(canvas, fD, fVar.f33735f, cVarA, fVar.f33732c.f(i10), fVar.f33732c.i(i10), fVar.f33732c.c(i10));
                }
                if (i10 == i11) {
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        RectF rectFH = fVar.f33732c.h(fVar.d(fVar.f33741l) - fVar.f33743n, fVar.f33735f);
        if (rectFH != null) {
            fVar.f33731b.a(canvas, rectFH);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        d dVar;
        c cVarB;
        int i12;
        int paddingRight;
        f fVar;
        RecyclerView.g adapter;
        d dVar2;
        c cVarB2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        e eVar = this.f33748e;
        float fB = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        int iA = (int) (((eVar == null || (dVar = eVar.f33726b) == null || (cVarB = dVar.b()) == null) ? 0.0f : cVarB.a()) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iA, size);
        } else if (mode != 1073741824) {
            size = iA;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        e eVar2 = this.f33748e;
        if (eVar2 != null && (dVar2 = eVar2.f33726b) != null && (cVarB2 = dVar2.b()) != null) {
            fB = cVarB2.b();
        }
        e eVar3 = this.f33748e;
        b bVar = eVar3 == null ? null : eVar3.f33729e;
        if (!(bVar instanceof b.a)) {
            if (bVar instanceof b.C0368b) {
                paddingRight = size2;
            } else {
                if (bVar != null) {
                    throw new jc.g();
                }
                i12 = (int) fB;
            }
            if (mode2 != Integer.MIN_VALUE) {
                size2 = Math.min(paddingRight, size2);
            } else if (mode2 != 1073741824) {
                size2 = paddingRight;
            }
            setMeasuredDimension(size2, size);
            fVar = this.f33746c;
            if (fVar == null) {
                return;
            }
            fVar.c((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
        }
        float f10 = ((b.a) bVar).f33712a;
        ViewPager2 viewPager2 = this.f33747d;
        int itemCount = 0;
        if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null) {
            itemCount = adapter.getItemCount();
        }
        i12 = (int) ((f10 * itemCount) + fB);
        paddingRight = getPaddingRight() + getPaddingLeft() + i12;
        if (mode2 != Integer.MIN_VALUE) {
            size2 = Math.min(paddingRight, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingRight;
        }
        setMeasuredDimension(size2, size);
        fVar = this.f33746c;
        if (fVar == null) {
            return;
        }
        fVar.c((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
    }

    public final void setStyle(e eVar) {
        p9.c aVar;
        o9.a cVar;
        j0.i(eVar, "style");
        this.f33748e = eVar;
        j0.i(eVar, "style");
        d dVar = eVar.f33726b;
        if (dVar instanceof d.b) {
            aVar = new p9.b(eVar);
        } else {
            if (!(dVar instanceof d.a)) {
                throw new jc.g();
            }
            aVar = new p9.a(eVar);
        }
        j0.i(eVar, "style");
        int i10 = o9.b.f34152a[eVar.f33725a.ordinal()];
        if (i10 == 1) {
            cVar = new o9.c(eVar);
        } else if (i10 == 2) {
            cVar = new o9.e(eVar);
        } else {
            if (i10 != 3) {
                throw new jc.g();
            }
            cVar = new o9.d(eVar);
        }
        f fVar = new f(eVar, aVar, cVar);
        fVar.c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        b(fVar);
        this.f33746c = fVar;
        requestLayout();
    }
}
