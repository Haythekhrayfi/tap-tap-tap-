package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.c;
import androidx.lifecycle.p;
import androidx.preference.Preference;
import ch.qos.logback.core.CoreConstants;
import com.google.android.ump.ConsentInformation;
import fd.j0;
import java.util.Objects;
import ma.h;
import vc.g;
import ya.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PersonalizedAdsPreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalizedAdsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f2289g = new a(context, 0);
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().a(new c() { // from class: com.zipoapps.premiumhelper.ui.preferences.common.PersonalizedAdsPreference.2
                /* JADX WARN: Code duplicated, block: B:21:0x0049  */
                @Override // androidx.lifecycle.c, androidx.lifecycle.f
                public void a(p pVar) {
                    j0.i(pVar, "owner");
                    PersonalizedAdsPreference personalizedAdsPreference = PersonalizedAdsPreference.this;
                    h.a aVar = h.f33410y;
                    com.zipoapps.ads.c cVarC = aVar.a().f33421j.c();
                    Objects.requireNonNull(cVarC);
                    boolean z10 = true;
                    if (aVar.a().i() || !cVarC.b()) {
                        z10 = false;
                    } else {
                        ConsentInformation consentInformation = cVarC.f28153b;
                        if (!(consentInformation != null && consentInformation.getConsentStatus() == 3)) {
                            ConsentInformation consentInformation2 = cVarC.f28153b;
                            if (!(consentInformation2 != null && consentInformation2.getConsentStatus() == 2)) {
                                z10 = false;
                            }
                        }
                    }
                    personalizedAdsPreference.F(z10);
                }
            });
        }
    }

    public /* synthetic */ PersonalizedAdsPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
