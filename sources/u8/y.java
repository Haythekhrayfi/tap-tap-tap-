package u8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Iterator;
import p0.i0;

/* JADX INFO: loaded from: classes2.dex */
public class y extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f36166c;

    public static final class a extends vc.l implements uc.l<RecyclerView, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36167c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            j0.i(recyclerView2, "$this$withRecyclerView");
            recyclerView2.getRecycledViewPool().a();
            Iterator<View> it = ((i0.a) i0.b(recyclerView2)).iterator();
            while (true) {
                p0.j0 j0Var = (p0.j0) it;
                if (!j0Var.hasNext()) {
                    return jc.w.f31842a;
                }
                View view = (View) j0Var.next();
                view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
        }
    }

    public static final class b extends vc.l implements uc.l<RecyclerView, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.u f36168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.u uVar) {
            super(1);
            this.f36168c = uVar;
        }

        @Override // uc.l
        public jc.w invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            j0.i(recyclerView2, "$this$withRecyclerView");
            recyclerView2.setRecycledViewPool(this.f36168c);
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setDescendantFocusability(393216);
        this.f36166c = viewPager2;
        super.addView(getViewPager());
    }

    public /* synthetic */ y(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
    }

    public final void b(uc.l<? super RecyclerView, jc.w> lVar) {
        View childAt = getViewPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        lVar.invoke(recyclerView);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    public ViewPager2 getViewPager() {
        return this.f36166c;
    }

    public final void setOrientation(int i10) {
        if (getViewPager().getOrientation() == i10) {
            return;
        }
        getViewPager().setOrientation(i10);
        b(a.f36167c);
    }

    public final void setRecycledViewPool(RecyclerView.u uVar) {
        j0.i(uVar, "viewPool");
        b(new b(uVar));
    }
}
