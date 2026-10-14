package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException(a.a(33, "Unknown color scheme: ", i10));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public final void zaa(Resources resources, int i10, int i11) {
        int i12;
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i13 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i13);
        setMinWidth(i13);
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i15 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i11, i14, i15, i15);
        int i16 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i17 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i11, i16, i17, i17);
        if (i10 == 0 || i10 == 1) {
            iZab = iZab2;
        } else if (i10 != 2) {
            throw new IllegalStateException(a.a(32, "Unknown button size: ", i10));
        }
        Drawable drawable = resources.getDrawable(iZab);
        androidx.core.graphics.drawable.a.b.h(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        androidx.core.graphics.drawable.a.b.i(drawable, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i18 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i19 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i11, i18, i19, i19))));
        if (i10 != 0) {
            if (i10 == 1) {
                i12 = com.google.android.gms.base.R.string.common_signin_button_text_long;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(a.a(32, "Unknown button size: ", i10));
                }
                setText((CharSequence) null);
            }
            setTransformationMethod(null);
            if (DeviceProperties.isWearable(getContext())) {
                setGravity(19);
            }
        }
        i12 = com.google.android.gms.base.R.string.common_signin_button_text;
        setText(resources.getString(i12));
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
