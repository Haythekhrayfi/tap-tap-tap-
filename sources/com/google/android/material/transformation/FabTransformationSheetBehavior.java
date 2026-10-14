package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void updateImportantForAccessibility(View view, boolean z10) {
        int iIntValue;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1620a instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    Map<View, Integer> map = this.importantForAccessibilityMap;
                    if (z10) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        iIntValue = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        iIntValue = this.importantForAccessibilityMap.get(childAt).intValue();
                    }
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.d.s(childAt, iIntValue);
                }
            }
            if (z10) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.timings = MotionSpec.createFromResource(context, i10);
        fabTransformationSpec.positioning = new Positioning(17, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        return fabTransformationSpec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean onExpandedStateChange(View view, View view2, boolean z10, boolean z11) {
        updateImportantForAccessibility(view2, z10);
        return super.onExpandedStateChange(view, view2, z10, z11);
    }
}
