package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R;
import e.a;

/* JADX INFO: loaded from: classes2.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabItem);
        this.text = typedArrayObtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        int i10 = R.styleable.TabItem_android_icon;
        this.icon = (!typedArrayObtainStyledAttributes.hasValue(i10) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i10, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i10) : a.b(context, resourceId);
        this.customLayout = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
