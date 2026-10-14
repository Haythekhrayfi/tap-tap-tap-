package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.c;
import androidx.lifecycle.p;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveAdsPreference extends PremiumPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoveAdsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoveAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.P.f28320g = false;
        if (context instanceof p) {
            ((p) context).getLifecycle().a(new c() { // from class: com.zipoapps.premiumhelper.ui.preferences.common.RemoveAdsPreference.1
                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void a(p pVar) {
                    j0.i(pVar, "owner");
                    RemoveAdsPreference removeAdsPreference = RemoveAdsPreference.this;
                    removeAdsPreference.F(removeAdsPreference.I());
                }

                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void b(p pVar) {
                    j0.i(pVar, "owner");
                    RemoveAdsPreference removeAdsPreference = RemoveAdsPreference.this;
                    removeAdsPreference.F(removeAdsPreference.I());
                }
            });
        }
    }

    public /* synthetic */ RemoveAdsPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
