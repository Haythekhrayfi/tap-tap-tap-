package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.m;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.a;
import fd.j0;
import ma.h;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class PremiumSwitchPreference extends SwitchPreferenceCompat {
    public final PreferenceHelper W;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumSwitchPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.W = new PreferenceHelper(context, attributeSet);
    }

    public /* synthetic */ PremiumSwitchPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void q(m mVar) {
        j0.i(mVar, "holder");
        super.q(mVar);
        this.W.a(mVar);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void r() {
        if (this.W.b()) {
            super.r();
            return;
        }
        if (this.f2285c instanceof Activity) {
            h.q(h.f33410y.a(), a.EnumC0235a.PREFERENCE + '_' + this.f2295m, 0, 0, 6);
        }
    }
}
