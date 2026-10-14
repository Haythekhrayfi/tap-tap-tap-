package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import ma.v;
import vc.g;
import xa.b;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenSettingsPreference extends Preference {
    public final String O;
    public final String P;
    public final String Q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenSettingsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSettingsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f33519c);
        String string = typedArrayObtainStyledAttributes.getString(7);
        if (string == null) {
            throw new IllegalStateException("You have to set support_email OpenSettingsPreference".toString());
        }
        this.O = string;
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        this.P = string2 != null ? string2 : string;
        this.Q = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2289g = new b(this, context);
        if (this.f2291i == null) {
            E(context.getString(R.string.ph_open_settings));
        }
        if (j() == null) {
            D(context.getString(R.string.ph_open_settings_summary));
        }
    }

    public /* synthetic */ OpenSettingsPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
