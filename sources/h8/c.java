package h8;

import android.graphics.Canvas;
import android.text.Layout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import y9.o7;
import y9.q7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public abstract void a(Canvas canvas, Layout layout, int i10, int i11, int i12, int i13, q7 q7Var, o7 o7Var);

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    public final int b(Layout layout, int i10) {
        boolean z10;
        int lineBottom = layout.getLineBottom(i10);
        boolean z11 = i10 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            z10 = (spacingMultiplier > 1.0f ? 1 : (spacingMultiplier == 1.0f ? 0 : -1)) == 0 ? false : true;
        }
        if (z10 && !z11) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float lineTop = layout.getLineTop(i10 + 1) - layout.getLineTop(i10);
                spacingAdd = lineTop - ((lineTop - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) (lineBottom - spacingAdd);
        }
        return i10 == layout.getLineCount() - 1 ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public final int c(Layout layout, int i10) {
        int lineTop = layout.getLineTop(i10);
        return i10 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
