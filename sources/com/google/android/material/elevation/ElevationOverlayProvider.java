package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import h0.e;

/* JADX INFO: loaded from: classes2.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z10, int i10, int i11, int i12, float f10) {
        this.elevationOverlayEnabled = z10;
        this.elevationOverlayColor = i10;
        this.elevationOverlayAccentColor = i11;
        this.colorSurface = i12;
        this.displayDensity = f10;
    }

    private boolean isThemeSurfaceColor(int i10) {
        return e.e(i10, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        float f11 = this.displayDensity;
        return (f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : Math.min(((((float) Math.log1p(f10 / f11)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i10, float f10) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i10);
        int iLayer = MaterialColors.layer(e.e(i10, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (i11 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, e.e(i11, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return e.e(iLayer, iAlpha);
    }

    public int compositeOverlay(int i10, float f10, View view) {
        return compositeOverlay(i10, getParentAbsoluteElevation(view) + f10);
    }

    public int compositeOverlayIfNeeded(int i10, float f10) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i10)) ? compositeOverlay(i10, f10) : i10;
    }

    public int compositeOverlayIfNeeded(int i10, float f10, View view) {
        return compositeOverlayIfNeeded(i10, getParentAbsoluteElevation(view) + f10);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.colorSurface, f10);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f10);
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }
}
