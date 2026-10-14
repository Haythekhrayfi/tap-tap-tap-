package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import fd.j0;
import ma.h;
import ma.v;
import vc.g;
import xa.b;

/* JADX INFO: loaded from: classes3.dex */
public final class PremiumSupportPreference extends PremiumPreference {
    public String R;
    public String S;
    public String T;
    public String U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumSupportPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumSupportPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.T = "";
        this.U = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f33519c);
        String string = typedArrayObtainStyledAttributes.getString(7);
        if (string == null) {
            throw new IllegalStateException("You have to set support_email value for Support Preference".toString());
        }
        this.R = string;
        this.S = typedArrayObtainStyledAttributes.getString(9);
        typedArrayObtainStyledAttributes.recycle();
        if (this.S != null) {
            this.P.f28320g = false;
        }
        this.Q = new b(context, this);
    }

    public /* synthetic */ PremiumSupportPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PremiumPreference
    public boolean I() {
        return this.S == null && super.I();
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PremiumPreference
    public void J(boolean z10) {
        K(this.T, this.U);
    }

    public final void K(String str, String str2) {
        j0.i(str, "title");
        j0.i(str2, "vipTitle");
        this.T = str;
        this.U = str2;
        if (h.f33410y.a().i()) {
            str = str2;
        }
        if (TextUtils.equals(str, this.f2291i)) {
            return;
        }
        this.f2291i = str;
        m();
    }
}
