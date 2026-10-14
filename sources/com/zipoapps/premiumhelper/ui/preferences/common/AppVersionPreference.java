package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Arrays;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class AppVersionPreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppVersionPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersionPreference(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        E(context.getString(R.string.app_name));
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "-1";
        }
        String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.ph_version), str}, 2));
        j0.h(str2, "format(format, *args)");
        D(str2);
    }

    public /* synthetic */ AppVersionPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
