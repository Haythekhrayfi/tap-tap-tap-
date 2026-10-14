package eb;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f29128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f29129d;

    public c(View view, View view2) {
        this.f29128c = view;
        this.f29129d = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f29128c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final View view = this.f29129d;
        final View view2 = this.f29128c;
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eb.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View view4 = view;
                View view5 = view2;
                j0.i(view4, "$buttonClose");
                j0.i(view3, "<anonymous parameter 0>");
                j0.i(windowInsets, "insets");
                view4.setOnApplyWindowInsetsListener(null);
                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    List<Rect> boundingRects = displayCutout.getBoundingRects();
                    j0.h(boundingRects, "cutout.boundingRects");
                    boolean z10 = !boundingRects.isEmpty();
                    float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    if (z10 && displayCutout.getBoundingRects().get(0).intersects(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom())) {
                        int i10 = displayCutout.getBoundingRects().get(0).left;
                        int width = view5.getWidth();
                        if (i10 == 0) {
                            int width2 = width - view4.getWidth();
                            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            f10 = width2 - ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) * 2);
                        } else {
                            int width3 = width - view4.getWidth();
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            f10 = -(width3 - ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) * 2));
                        }
                    }
                    xe.a.c cVarB = xe.a.b("CUTOUT");
                    StringBuilder sbA = defpackage.a.a("cutout: ");
                    sbA.append(displayCutout.getBoundingRects().get(0));
                    cVarB.g(sbA.toString(), new Object[0]);
                    xe.a.c cVarB2 = xe.a.b("CUTOUT");
                    StringBuilder sbA2 = defpackage.a.a("close button: left: ");
                    sbA2.append(view4.getLeft());
                    sbA2.append(" right: ");
                    sbA2.append(view4.getRight());
                    cVarB2.g(sbA2.toString(), new Object[0]);
                    xe.a.b("CUTOUT").g("applied translation: " + f10, new Object[0]);
                    view4.setTranslationX(f10);
                }
                return windowInsets;
            }
        });
        this.f29129d.requestApplyInsets();
    }
}
