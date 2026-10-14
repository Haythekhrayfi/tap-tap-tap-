package com.google.android.ads.nativetemplates;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class NativeTemplateStyle {
    private ColorDrawable callToActionBackgroundColor;
    private float callToActionTextSize;
    private Typeface callToActionTextTypeface;
    private int callToActionTypefaceColor;
    private ColorDrawable mainBackgroundColor;
    private ColorDrawable primaryTextBackgroundColor;
    private float primaryTextSize;
    private Typeface primaryTextTypeface;
    private int primaryTextTypefaceColor;
    private ColorDrawable secondaryTextBackgroundColor;
    private float secondaryTextSize;
    private Typeface secondaryTextTypeface;
    private int secondaryTextTypefaceColor;
    private ColorDrawable tertiaryTextBackgroundColor;
    private float tertiaryTextSize;
    private Typeface tertiaryTextTypeface;
    private int tertiaryTextTypefaceColor;

    public static class Builder {
        private NativeTemplateStyle styles = new NativeTemplateStyle();

        public NativeTemplateStyle build() {
            return this.styles;
        }

        public Builder withCallToActionBackgroundColor(ColorDrawable colorDrawable) {
            this.styles.callToActionBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withCallToActionTextSize(float f10) {
            this.styles.callToActionTextSize = f10;
            return this;
        }

        public Builder withCallToActionTextTypeface(Typeface typeface) {
            this.styles.callToActionTextTypeface = typeface;
            return this;
        }

        public Builder withCallToActionTypefaceColor(int i10) {
            this.styles.callToActionTypefaceColor = i10;
            return this;
        }

        public Builder withMainBackgroundColor(ColorDrawable colorDrawable) {
            this.styles.mainBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withPrimaryTextBackgroundColor(ColorDrawable colorDrawable) {
            this.styles.primaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withPrimaryTextSize(float f10) {
            this.styles.primaryTextSize = f10;
            return this;
        }

        public Builder withPrimaryTextTypeface(Typeface typeface) {
            this.styles.primaryTextTypeface = typeface;
            return this;
        }

        public Builder withPrimaryTextTypefaceColor(int i10) {
            this.styles.primaryTextTypefaceColor = i10;
            return this;
        }

        public Builder withSecondaryTextBackgroundColor(ColorDrawable colorDrawable) {
            this.styles.secondaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withSecondaryTextSize(float f10) {
            this.styles.secondaryTextSize = f10;
            return this;
        }

        public Builder withSecondaryTextTypeface(Typeface typeface) {
            this.styles.secondaryTextTypeface = typeface;
            return this;
        }

        public Builder withSecondaryTextTypefaceColor(int i10) {
            this.styles.secondaryTextTypefaceColor = i10;
            return this;
        }

        public Builder withTertiaryTextBackgroundColor(ColorDrawable colorDrawable) {
            this.styles.tertiaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withTertiaryTextSize(float f10) {
            this.styles.tertiaryTextSize = f10;
            return this;
        }

        public Builder withTertiaryTextTypeface(Typeface typeface) {
            this.styles.tertiaryTextTypeface = typeface;
            return this;
        }

        public Builder withTertiaryTextTypefaceColor(int i10) {
            this.styles.tertiaryTextTypefaceColor = i10;
            return this;
        }
    }

    public ColorDrawable getCallToActionBackgroundColor() {
        return this.callToActionBackgroundColor;
    }

    public float getCallToActionTextSize() {
        return this.callToActionTextSize;
    }

    public Typeface getCallToActionTextTypeface() {
        return this.callToActionTextTypeface;
    }

    public int getCallToActionTypefaceColor() {
        return this.callToActionTypefaceColor;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public ColorDrawable getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    public float getPrimaryTextSize() {
        return this.primaryTextSize;
    }

    public Typeface getPrimaryTextTypeface() {
        return this.primaryTextTypeface;
    }

    public int getPrimaryTextTypefaceColor() {
        return this.primaryTextTypefaceColor;
    }

    public ColorDrawable getSecondaryTextBackgroundColor() {
        return this.secondaryTextBackgroundColor;
    }

    public float getSecondaryTextSize() {
        return this.secondaryTextSize;
    }

    public Typeface getSecondaryTextTypeface() {
        return this.secondaryTextTypeface;
    }

    public int getSecondaryTextTypefaceColor() {
        return this.secondaryTextTypefaceColor;
    }

    public ColorDrawable getTertiaryTextBackgroundColor() {
        return this.tertiaryTextBackgroundColor;
    }

    public float getTertiaryTextSize() {
        return this.tertiaryTextSize;
    }

    public Typeface getTertiaryTextTypeface() {
        return this.tertiaryTextTypeface;
    }

    public int getTertiaryTextTypefaceColor() {
        return this.tertiaryTextTypefaceColor;
    }
}
