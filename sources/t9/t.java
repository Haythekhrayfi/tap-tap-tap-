package t9;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p0.e0;
import p0.i0;
import p0.m0;
import y9.f7;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public class t extends LinearLayout implements o8.c, f9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<?> f35856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f35857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f35858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n8.c f35860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f7 f35861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o8.a f35862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<p7.d> f35863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35864k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f35863j = new ArrayList();
        setId(R.id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        q<?> qVar = new q<>(context, null, R.attr.divTabIndicatorLayoutStyle);
        qVar.setId(R.id.base_tabbed_title_container_scroller);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.title_tab_title_height));
        layoutParams.gravity = 8388611;
        qVar.setLayoutParams(layoutParams);
        int dimensionPixelSize = qVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = qVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_horizontal);
        qVar.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        qVar.setClipToPadding(false);
        this.f35856c = qVar;
        View view = new View(context);
        view.setId(R.id.div_tabs_divider);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(R.color.div_separator_color);
        this.f35857d = view;
        l lVar = new l(context);
        lVar.setId(R.id.div_tabs_pager_container);
        lVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lVar.setOverScrollMode(2);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.i.t(lVar, true);
        this.f35859f = lVar;
        u uVar = new u(context, null, 0, 6, null);
        uVar.setId(R.id.div_tabs_container_helper);
        uVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        uVar.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        uVar.addView(getViewPager());
        uVar.addView(frameLayout);
        this.f35858e = uVar;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    public /* synthetic */ t(Context context, AttributeSet attributeSet, int i10, vc.g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f35862i = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        o8.a aVar;
        o8.a divBorderDrawer;
        j0.i(canvas, "canvas");
        for (KeyEvent.Callback callback : (i0.a) i0.b(this)) {
            o8.c cVar = callback instanceof o8.c ? (o8.c) callback : null;
            if (cVar != null && (divBorderDrawer = cVar.getDivBorderDrawer()) != null) {
                divBorderDrawer.f(canvas);
            }
        }
        if (this.f35864k || (aVar = this.f35862i) == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            aVar.c(canvas);
            super.dispatchDraw(canvas);
            aVar.e(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f35864k = true;
        o8.a aVar = this.f35862i;
        if (aVar != null) {
            int iSave = canvas.save();
            try {
                aVar.c(canvas);
                super.draw(canvas);
                aVar.e(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            super.draw(canvas);
        }
        this.f35864k = false;
    }

    @Override // o8.c
    public k0 getBorder() {
        o8.a aVar = this.f35862i;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public f7 getDiv() {
        return this.f35861h;
    }

    @Override // o8.c
    public o8.a getDivBorderDrawer() {
        return this.f35862i;
    }

    public n8.c getDivTabsAdapter() {
        return this.f35860g;
    }

    public View getDivider() {
        return this.f35857d;
    }

    public u getPagerLayout() {
        return this.f35858e;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f35863j;
    }

    public q<?> getTitleLayout() {
        return this.f35856c;
    }

    public l getViewPager() {
        return this.f35859f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        o8.a aVar = this.f35862i;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        o8.a aVar = this.f35862i;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void setDiv(f7 f7Var) {
        this.f35861h = f7Var;
    }

    public void setDivTabsAdapter(n8.c cVar) {
        this.f35860g = cVar;
    }
}
