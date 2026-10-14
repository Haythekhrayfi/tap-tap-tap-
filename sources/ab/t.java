package ab;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RelaunchPremiumActivity f326d;

    public t(View view, RelaunchPremiumActivity relaunchPremiumActivity) {
        this.f325c = view;
        this.f326d = relaunchPremiumActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f325c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final RelaunchPremiumActivity relaunchPremiumActivity = this.f326d;
        View view = relaunchPremiumActivity.f28376g;
        if (view == null) {
            j0.r("buttonClose");
            throw null;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ab.s
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                RelaunchPremiumActivity relaunchPremiumActivity2 = relaunchPremiumActivity;
                j0.i(relaunchPremiumActivity2, "this$0");
                j0.i(view2, "<anonymous parameter 0>");
                j0.i(windowInsets, "insets");
                View view3 = relaunchPremiumActivity2.f28376g;
                if (view3 == null) {
                    j0.r("buttonClose");
                    throw null;
                }
                view3.setOnApplyWindowInsetsListener(null);
                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    List<Rect> boundingRects = displayCutout.getBoundingRects();
                    j0.h(boundingRects, "cutout.boundingRects");
                    if (!boundingRects.isEmpty()) {
                        Rect rect = displayCutout.getBoundingRects().get(0);
                        View view4 = relaunchPremiumActivity2.f28376g;
                        if (view4 == null) {
                            j0.r("buttonClose");
                            throw null;
                        }
                        int left = view4.getLeft();
                        View view5 = relaunchPremiumActivity2.f28376g;
                        if (view5 == null) {
                            j0.r("buttonClose");
                            throw null;
                        }
                        int top = view5.getTop();
                        View view6 = relaunchPremiumActivity2.f28376g;
                        if (view6 == null) {
                            j0.r("buttonClose");
                            throw null;
                        }
                        int right = view6.getRight();
                        View view7 = relaunchPremiumActivity2.f28376g;
                        if (view7 == null) {
                            j0.r("buttonClose");
                            throw null;
                        }
                        if (rect.intersects(left, top, right, view7.getBottom())) {
                            View view8 = relaunchPremiumActivity2.f28376g;
                            if (view8 == null) {
                                j0.r("buttonClose");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams = view8.getLayoutParams();
                            j0.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                            if (displayCutout.getBoundingRects().get(0).left == 0) {
                                bVar.f1441h = 0;
                                bVar.f1435e = -1;
                            } else {
                                bVar.f1435e = 0;
                                bVar.f1441h = -1;
                            }
                            View view9 = relaunchPremiumActivity2.f28376g;
                            if (view9 == null) {
                                j0.r("buttonClose");
                                throw null;
                            }
                            view9.setLayoutParams(bVar);
                        }
                    }
                }
                return windowInsets;
            }
        });
        View view2 = this.f326d.f28376g;
        if (view2 != null) {
            view2.requestApplyInsets();
        } else {
            j0.r("buttonClose");
            throw null;
        }
    }
}
