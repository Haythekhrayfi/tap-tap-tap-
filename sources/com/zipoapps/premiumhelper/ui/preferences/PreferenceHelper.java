package com.zipoapps.premiumhelper.ui.preferences;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.j;
import androidx.lifecycle.c;
import androidx.lifecycle.p;
import androidx.preference.m;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import g0.f;
import java.util.Locale;
import ma.h;
import ma.v;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f28314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f28317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f28319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f28322i;

    public enum a {
        START,
        END
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28324a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28324a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceHelper(Context context, AttributeSet attributeSet) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f28316c = -1;
        this.f28317d = a.END;
        this.f28318e = -1;
        this.f28320g = true;
        if (context instanceof p) {
            ((p) context).getLifecycle().a(new c() { // from class: com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper.1
                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void a(p pVar) {
                    TextView textView;
                    TextView textView2;
                    j0.i(pVar, "owner");
                    PreferenceHelper.this.d();
                    PreferenceHelper preferenceHelper = PreferenceHelper.this;
                    String str = preferenceHelper.f28321h;
                    if (str != null && preferenceHelper.b() && (textView2 = preferenceHelper.f28314a) != null) {
                        textView2.setText(str);
                    }
                    PreferenceHelper preferenceHelper2 = PreferenceHelper.this;
                    String str2 = preferenceHelper2.f28322i;
                    if (str2 == null || !preferenceHelper2.b() || (textView = preferenceHelper2.f28315b) == null) {
                        return;
                    }
                    textView.setText(str2);
                }
            });
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f33519c);
        this.f28316c = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f28318e = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.f28319f = typedArrayObtainStyledAttributes.getColorStateList(3);
        String nonResourceString = typedArrayObtainStyledAttributes.getNonResourceString(4);
        String upperCase = (nonResourceString == null ? "END" : nonResourceString).toUpperCase(Locale.ROOT);
        j0.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        this.f28317d = a.valueOf(upperCase);
        this.f28321h = typedArrayObtainStyledAttributes.getString(8);
        this.f28322i = typedArrayObtainStyledAttributes.getString(6);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(m mVar) {
        TextView textView;
        TextView textView2;
        View viewA = mVar.a(R.id.title);
        if (viewA instanceof TextView) {
            this.f28314a = (TextView) viewA;
            d();
            String str = this.f28321h;
            if (str != null && b() && (textView2 = this.f28314a) != null) {
                textView2.setText(str);
            }
        }
        View viewA2 = mVar.a(R.id.summary);
        if (viewA2 instanceof TextView) {
            this.f28315b = (TextView) viewA2;
            String str2 = this.f28322i;
            if (str2 == null || !b() || (textView = this.f28315b) == null) {
                return;
            }
            textView.setText(str2);
        }
    }

    public final boolean b() {
        return h.f33410y.a().i();
    }

    public final void c() {
        TextView textView;
        if (!this.f28320g || (textView = this.f28314a) == null) {
            return;
        }
        textView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 10.0f, textView.getResources().getDisplayMetrics()));
        ColorStateList colorStateListValueOf = this.f28319f;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(textView.getCurrentTextColor());
            j0.h(colorStateListValueOf, "valueOf(this.currentTextColor)");
        }
        j.c.f(textView, colorStateListValueOf);
        int i10 = this.f28316c;
        if (i10 == -1) {
            i10 = com.inscode.autoclicker.R.drawable.ic_preference_lock;
        }
        if (this.f28318e == -1) {
            int i11 = b.f28324a[this.f28317d.ordinal()];
            if (i11 == 1) {
                textView.setCompoundDrawablesWithIntrinsicBounds(i10, 0, 0, 0);
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i10, 0);
                return;
            }
        }
        Resources resources = textView.getResources();
        Resources.Theme theme = textView.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f29675a;
        Drawable drawableA = f.a.a(resources, i10, theme);
        if (drawableA == null) {
            throw new IllegalStateException("Failed to load icon".toString());
        }
        int i12 = this.f28318e;
        drawableA.setBounds(0, 0, i12, i12);
        int i13 = b.f28324a[this.f28317d.ordinal()];
        if (i13 == 1) {
            textView.setCompoundDrawables(drawableA, null, null, null);
        } else {
            if (i13 != 2) {
                return;
            }
            textView.setCompoundDrawables(null, null, drawableA, null);
        }
    }

    public void d() {
        if (!b()) {
            c();
            return;
        }
        TextView textView = this.f28314a;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }
}
