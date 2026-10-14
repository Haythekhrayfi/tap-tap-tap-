package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.m;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import g0.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ma.h;
import vc.g;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PremiumListPreference extends ListPreference {
    public final a Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumListPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.Z = new a(context, attributeSet);
    }

    public /* synthetic */ PremiumListPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.preference.ListPreference
    public CharSequence[] J() {
        a aVar = this.Z;
        CharSequence[] charSequenceArr = this.U;
        j0.h(charSequenceArr, "super.getEntries()");
        Objects.requireNonNull(aVar);
        j0.i(charSequenceArr, "entries");
        if (aVar.b()) {
            return charSequenceArr;
        }
        List<Integer> list = aVar.f37578k;
        if (list != null && list.isEmpty()) {
            return charSequenceArr;
        }
        int i10 = aVar.f28316c;
        if (i10 == -1) {
            i10 = R.drawable.ic_preference_lock;
        }
        Resources resources = aVar.f37577j.getResources();
        Resources.Theme theme = aVar.f37577j.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f29675a;
        Drawable drawableA = f.a.a(resources, i10, theme);
        if (drawableA == null) {
            throw new IllegalStateException("Cannot load icon".toString());
        }
        drawableA.setBounds(0, 0, 48, 48);
        TextView textView = aVar.f28314a;
        if (textView != null) {
            ColorStateList colorStateList = aVar.f28319f;
            androidx.core.graphics.drawable.a.b.g(drawableA, colorStateList != null ? colorStateList.getDefaultColor() : textView.getCurrentTextColor());
        }
        ArrayList arrayList = new ArrayList(charSequenceArr.length);
        int length = charSequenceArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            CharSequence charSequence = charSequenceArr[i11];
            int i13 = i12 + 1;
            List<Integer> list2 = aVar.f37578k;
            if (!(list2 != null && list2.contains(Integer.valueOf(i12)))) {
                SpannableString spannableString = new SpannableString(((Object) charSequence) + "   ");
                spannableString.setSpan(new ImageSpan(drawableA, 1), spannableString.length() + (-2), spannableString.length() - 1, 33);
                charSequence = spannableString;
            }
            arrayList.add(charSequence);
            i11++;
            i12 = i13;
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // androidx.preference.Preference
    public boolean a(Object obj) {
        boolean z10;
        if (this.Z.b()) {
            z10 = true;
        } else {
            j0.g(obj, "null cannot be cast to non-null type kotlin.String");
            int I = I((String) obj);
            List<Integer> list = this.Z.f37578k;
            if (list == null || !list.contains(Integer.valueOf(I))) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10 && (this.f2285c instanceof Activity)) {
            h.q(h.f33410y.a(), com.zipoapps.premiumhelper.a.EnumC0235a.PREFERENCE + '_' + this.f2295m, 0, 0, 6);
        }
        return z10;
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        j0.i(mVar, "holder");
        super.q(mVar);
        this.Z.a(mVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void r() {
        if (!this.Z.b()) {
            List<Integer> list = this.Z.f37578k;
            if (!(list != null && (list.isEmpty() ^ true))) {
                if (this.f2285c instanceof Activity) {
                    h.q(h.f33410y.a(), com.zipoapps.premiumhelper.a.EnumC0235a.PREFERENCE + '_' + this.f2295m, 0, 0, 6);
                    return;
                }
                return;
            }
        }
        super.r();
    }
}
