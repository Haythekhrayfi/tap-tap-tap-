package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }
}
