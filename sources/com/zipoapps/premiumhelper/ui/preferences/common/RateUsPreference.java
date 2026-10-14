package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import vc.g;
import ya.a;

/* JADX INFO: loaded from: classes3.dex */
public final class RateUsPreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RateUsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateUsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f2289g = new a(context, 2);
    }

    public /* synthetic */ RateUsPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
