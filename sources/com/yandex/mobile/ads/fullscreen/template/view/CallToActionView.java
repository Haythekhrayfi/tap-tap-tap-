package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.m61;
import e0.a;

/* JADX INFO: loaded from: classes.dex */
public class CallToActionView extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f18739a;

    public CallToActionView(Context context) {
        this(context, null);
    }

    public CallToActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        Drawable drawableA = null;
        int i12 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.YandexAdsInternalIconButton, i10, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.YandexAdsInternalIconButton_yandex_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalIconButton_yandex_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexAdsInternalIconButton_yandex_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i11 = dimensionPixelSize2;
            i12 = dimensionPixelSize;
        } else {
            i11 = 0;
        }
        setSpannableFactory(new m61(drawableA, i12, i11));
    }

    private static Drawable a(Context context, int i10) {
        Object obj = a.f28964a;
        return a.c.b(context, i10);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f18739a);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f18739a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f18739a = charSequence;
        }
        super.setText(this.f18739a, TextView.BufferType.SPANNABLE);
    }
}
