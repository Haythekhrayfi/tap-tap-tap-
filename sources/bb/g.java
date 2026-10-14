package bb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.activity.i;
import androidx.fragment.app.n;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.j;
import androidx.preference.k;
import com.google.android.gms.common.Scopes;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.preferences.common.PersonalizedAdsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PremiumSupportPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PrivacyPolicyPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.RateUsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.RemoveAdsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.TermsConditionsPreference;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import fd.j0;
import java.util.Objects;
import jc.w;
import vc.l;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public class g extends androidx.preference.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f3496m = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f3497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PhDeleteAccountActivity.c f3498l;

    public static final class a extends l implements uc.a<w> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public w invoke() {
            g gVar = g.this;
            j0.i(gVar, "fragment");
            Bundle bundle = new Bundle();
            bundle.putInt("RESULT", 13627834);
            gVar.requireActivity().getSupportFragmentManager().d0("REQUEST_ACCOUNT_DELETE", bundle);
            gVar.getChildFragmentManager().d0("REQUEST_ACCOUNT_DELETE", bundle);
            n nVarRequireActivity = gVar.requireActivity();
            PHSettingsActivity pHSettingsActivity = nVarRequireActivity instanceof PHSettingsActivity ? (PHSettingsActivity) nVarRequireActivity : null;
            if (pHSettingsActivity != null) {
                pHSettingsActivity.setResult(13627834);
            }
            return w.f31842a;
        }
    }

    public g() {
        PhDeleteAccountActivity.a aVar = PhDeleteAccountActivity.f28393f;
        a aVar2 = new a();
        Objects.requireNonNull(aVar);
        j0.i(this, "fragment");
        j0.i(aVar2, "doOnDelete");
        androidx.activity.result.b bVarRegisterForActivityResult = registerForActivityResult(new PhDeleteAccountActivity.b(), new bb.a(aVar2, 1));
        j0.h(bVarRegisterForActivityResult, "fragment.registerForActi…          }\n            }");
        this.f3498l = new PhDeleteAccountActivity.c(bVarRegisterForActivityResult);
    }

    @Override // androidx.preference.g
    public void b(Bundle bundle, String str) {
        boolean z10;
        String string;
        String string2;
        String string3;
        String string4;
        String str2;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Preference preferenceI;
        TypedValue typedValue = new TypedValue();
        final int i10 = 1;
        requireContext().getTheme().resolveAttribute(R.attr.settingsTheme, typedValue, true);
        int i11 = typedValue.resourceId;
        if (i11 == 0) {
            i11 = R.style.PhSettingsTheme;
        }
        final int i12 = 0;
        requireContext().getTheme().applyStyle(i11, false);
        this.f3497k = b.E.a(getArguments());
        k kVar = this.f2343d;
        if (kVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        kVar.f2380e = true;
        j jVar = new j(contextRequireContext, kVar);
        XmlResourceParser xml = jVar.f2372a.getResources().getXml(R.xml.ph_settings);
        try {
            Preference preferenceC = jVar.c(xml, null);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceC;
            preferenceScreen.p(kVar);
            SharedPreferences.Editor editor = kVar.f2379d;
            if (editor != null) {
                editor.apply();
            }
            kVar.f2380e = false;
            Preference preference = preferenceScreen;
            if (str != null) {
                preferenceI = preferenceScreen.I(str);
                if (!(preferenceI instanceof PreferenceScreen)) {
                    preference = preferenceI;
                    throw new IllegalArgumentException(androidx.activity.j.a("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            preference = preferenceI;
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
            k kVar2 = this.f2343d;
            PreferenceScreen preferenceScreen3 = kVar2.f2382g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.s();
                }
                kVar2.f2382g = preferenceScreen2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && preferenceScreen2 != null) {
                this.f2345f = true;
                if (this.f2346g && !this.f2348i.hasMessages(1)) {
                    this.f2348i.obtainMessage(1).sendToTarget();
                }
            }
            b bVar = this.f3497k;
            int iIntValue = (bVar == null || (num9 = bVar.f3469i) == null) ? R.drawable.ph_ic_remove_ads : num9.intValue();
            b bVar2 = this.f3497k;
            if (bVar2 == null || (string = bVar2.f3467g) == null) {
                string = getString(R.string.ph_remove_ads);
                j0.h(string, "getString(R.string.ph_remove_ads)");
            }
            b bVar3 = this.f3497k;
            if (bVar3 == null || (string2 = bVar3.f3468h) == null) {
                string2 = getString(R.string.ph_remove_ads_summary);
                j0.h(string2, "getString(R.string.ph_remove_ads_summary)");
            }
            Preference preference2 = (RemoveAdsPreference) a("pref_remove_ads");
            if (preference2 != null) {
                preference2.F = R.layout.ph_settings_section;
                if (!TextUtils.equals(string, preference2.f2291i)) {
                    preference2.f2291i = string;
                    preference2.m();
                }
                preference2.D(string2);
                c(preference2, iIntValue);
            }
            b bVar4 = this.f3497k;
            int iIntValue2 = (bVar4 == null || (num8 = bVar4.f3472l) == null) ? R.drawable.ph_ic_consent : num8.intValue();
            b bVar5 = this.f3497k;
            if (bVar5 == null || (string3 = bVar5.f3470j) == null) {
                string3 = getString(R.string.ph_personalized_ads);
                j0.h(string3, "getString(R.string.ph_personalized_ads)");
            }
            b bVar6 = this.f3497k;
            if (bVar6 == null || (string4 = bVar6.f3471k) == null) {
                string4 = getString(R.string.ph_personalized_ads_summary);
                j0.h(string4, "getString(R.string.ph_personalized_ads_summary)");
            }
            Preference preference3 = (PersonalizedAdsPreference) a("pref_personalized_ads");
            if (preference3 != null) {
                preference3.F = R.layout.ph_settings_section;
                if (!TextUtils.equals(string3, preference3.f2291i)) {
                    preference3.f2291i = string3;
                    preference3.m();
                }
                preference3.D(string4);
                c(preference3, iIntValue2);
            }
            b bVar7 = this.f3497k;
            if (bVar7 == null || (str2 = bVar7.f3461a) == null) {
                throw new IllegalStateException("Please provide support email".toString());
            }
            String str3 = bVar7.f3462b;
            if (str3 == null) {
                throw new IllegalStateException("Please provide VIP support email".toString());
            }
            String string17 = bVar7.f3463c;
            if (string17 == null) {
                string17 = getString(R.string.ph_customer_support);
                j0.h(string17, "getString(R.string.ph_customer_support)");
            }
            b bVar8 = this.f3497k;
            if (bVar8 == null || (string5 = bVar8.f3464d) == null) {
                string5 = getString(R.string.ph_vip_customer_support);
                j0.h(string5, "getString(R.string.ph_vip_customer_support)");
            }
            b bVar9 = this.f3497k;
            if (bVar9 == null || (string6 = bVar9.f3465e) == null) {
                string6 = getString(R.string.ph_customer_support_summary);
                j0.h(string6, "getString(R.string.ph_customer_support_summary)");
            }
            b bVar10 = this.f3497k;
            int iIntValue3 = (bVar10 == null || (num7 = bVar10.f3466f) == null) ? R.drawable.ph_ic_customer_support : num7.intValue();
            PremiumSupportPreference premiumSupportPreference = (PremiumSupportPreference) a("pref_support");
            if (premiumSupportPreference != null) {
                j0.i(str2, Scopes.EMAIL);
                j0.i(str3, "vipEmail");
                premiumSupportPreference.R = str2;
                premiumSupportPreference.S = str3;
                premiumSupportPreference.K(string17, string5);
                premiumSupportPreference.D(string6);
                c(premiumSupportPreference, iIntValue3);
            }
            b bVar11 = this.f3497k;
            if (bVar11 == null || (string7 = bVar11.f3473m) == null) {
                string7 = getString(R.string.ph_rate_us);
                j0.h(string7, "getString(R.string.ph_rate_us)");
            }
            b bVar12 = this.f3497k;
            if (bVar12 == null || (string8 = bVar12.f3474n) == null) {
                string8 = getString(R.string.ph_rate_us_summary);
                j0.h(string8, "getString(R.string.ph_rate_us_summary)");
            }
            b bVar13 = this.f3497k;
            int iIntValue4 = (bVar13 == null || (num6 = bVar13.f3466f) == null) ? R.drawable.ph_ic_rate_us : num6.intValue();
            Preference preference4 = (RateUsPreference) a("pref_rate_us");
            if (preference4 != null) {
                if (!TextUtils.equals(string7, preference4.f2291i)) {
                    preference4.f2291i = string7;
                    preference4.m();
                }
                preference4.D(string8);
                c(preference4, iIntValue4);
            }
            b bVar14 = this.f3497k;
            if (bVar14 == null || (string9 = bVar14.f3476p) == null) {
                string9 = getString(R.string.ph_share_app);
                j0.h(string9, "getString(R.string.ph_share_app)");
            }
            b bVar15 = this.f3497k;
            if (bVar15 == null || (string10 = bVar15.f3477q) == null) {
                string10 = getString(R.string.ph_share_app_summary);
                j0.h(string10, "getString(R.string.ph_share_app_summary)");
            }
            b bVar16 = this.f3497k;
            int iIntValue5 = (bVar16 == null || (num5 = bVar16.f3478r) == null) ? R.drawable.ph_ic_share : num5.intValue();
            Preference preferenceA = a("pref_share_app");
            if (preferenceA != null) {
                if (!TextUtils.equals(string9, preferenceA.f2291i)) {
                    preferenceA.f2291i = string9;
                    preferenceA.m();
                }
                preferenceA.D(string10);
                c(preferenceA, iIntValue5);
                final int i13 = 2;
                preferenceA.B(new Preference.c(this) { // from class: bb.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f3495b;

                    {
                        this.f3495b = this;
                    }

                    @Override // androidx.preference.Preference.c
                    public final boolean a(Preference preference5) {
                        String str4;
                        switch (i13) {
                            case 0:
                                g gVar = this.f3495b;
                                int i14 = g.f3496m;
                                j0.i(gVar, "this$0");
                                c0.z(i.l(gVar), null, null, new h(gVar, null), 3, null);
                                break;
                            case 1:
                                g gVar2 = this.f3495b;
                                int i15 = g.f3496m;
                                j0.i(gVar2, "this$0");
                                b bVar17 = gVar2.f3497k;
                                if (bVar17 != null && (str4 = bVar17.D) != null) {
                                    PhDeleteAccountActivity.c cVar = gVar2.f3498l;
                                    Objects.requireNonNull(cVar);
                                    cVar.b(str4, null);
                                }
                                break;
                            default:
                                g gVar3 = this.f3495b;
                                int i16 = g.f3496m;
                                j0.i(gVar3, "this$0");
                                e eVarB = ma.g.b();
                                Context contextRequireContext2 = gVar3.requireContext();
                                j0.h(contextRequireContext2, "requireContext()");
                                Objects.requireNonNull(eVarB);
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + contextRequireContext2.getPackageName() + "&referrer=utm_source%3Dshare_my_app");
                                intent.setType("text/plain");
                                contextRequireContext2.startActivity(Intent.createChooser(intent, null));
                                ma.h.f33410y.a().j();
                                break;
                        }
                        return true;
                    }
                });
            }
            b bVar17 = this.f3497k;
            if (bVar17 == null || (string11 = bVar17.f3479s) == null) {
                string11 = getString(R.string.ph_privacy_policy);
                j0.h(string11, "getString(R.string.ph_privacy_policy)");
            }
            b bVar18 = this.f3497k;
            if (bVar18 == null || (string12 = bVar18.f3480t) == null) {
                string12 = getString(R.string.ph_privacy_policy_summary);
                j0.h(string12, "getString(R.string.ph_privacy_policy_summary)");
            }
            b bVar19 = this.f3497k;
            int iIntValue6 = (bVar19 == null || (num4 = bVar19.f3481u) == null) ? R.drawable.ph_ic_privacy_policy : num4.intValue();
            Preference preference5 = (PrivacyPolicyPreference) a("pref_privacy_policy");
            if (preference5 != null) {
                if (!TextUtils.equals(string11, preference5.f2291i)) {
                    preference5.f2291i = string11;
                    preference5.m();
                }
                preference5.D(string12);
                c(preference5, iIntValue6);
            }
            b bVar20 = this.f3497k;
            if (bVar20 == null || (string13 = bVar20.f3482v) == null) {
                string13 = getString(R.string.ph_terms);
                j0.h(string13, "getString(R.string.ph_terms)");
            }
            b bVar21 = this.f3497k;
            if (bVar21 == null || (string14 = bVar21.f3483w) == null) {
                string14 = getString(R.string.ph_terms_summary);
                j0.h(string14, "getString(R.string.ph_terms_summary)");
            }
            b bVar22 = this.f3497k;
            int iIntValue7 = (bVar22 == null || (num3 = bVar22.f3484x) == null) ? R.drawable.ph_ic_terms : num3.intValue();
            Preference preference6 = (TermsConditionsPreference) a("pref_terms");
            if (preference6 != null) {
                if (!TextUtils.equals(string13, preference6.f2291i)) {
                    preference6.f2291i = string13;
                    preference6.m();
                }
                preference6.D(string14);
                c(preference6, iIntValue7);
            }
            b bVar23 = this.f3497k;
            if (bVar23 == null || (string15 = bVar23.f3485y) == null) {
                string15 = getString(R.string.ph_delete_account);
                j0.h(string15, "getString(R.string.ph_delete_account)");
            }
            b bVar24 = this.f3497k;
            if (bVar24 == null || (string16 = bVar24.f3486z) == null) {
                string16 = getString(R.string.ph_delete_account_summary);
                j0.h(string16, "getString(R.string.ph_delete_account_summary)");
            }
            b bVar25 = this.f3497k;
            int iIntValue8 = (bVar25 == null || (num2 = bVar25.A) == null) ? R.drawable.ph_ic_delete_account : num2.intValue();
            Preference preferenceA2 = a("pref_delete_account");
            if (preferenceA2 != null) {
                if (!TextUtils.equals(string15, preferenceA2.f2291i)) {
                    preferenceA2.f2291i = string15;
                    preferenceA2.m();
                }
                preferenceA2.D(string16);
                c(preferenceA2, iIntValue8);
                b bVar26 = this.f3497k;
                preferenceA2.F((bVar26 != null ? bVar26.D : null) != null);
                preferenceA2.B(new Preference.c(this) { // from class: bb.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f3495b;

                    {
                        this.f3495b = this;
                    }

                    @Override // androidx.preference.Preference.c
                    public final boolean a(Preference preference7) {
                        String str4;
                        switch (i10) {
                            case 0:
                                g gVar = this.f3495b;
                                int i14 = g.f3496m;
                                j0.i(gVar, "this$0");
                                c0.z(i.l(gVar), null, null, new h(gVar, null), 3, null);
                                break;
                            case 1:
                                g gVar2 = this.f3495b;
                                int i15 = g.f3496m;
                                j0.i(gVar2, "this$0");
                                b bVar110 = gVar2.f3497k;
                                if (bVar110 != null && (str4 = bVar110.D) != null) {
                                    PhDeleteAccountActivity.c cVar = gVar2.f3498l;
                                    Objects.requireNonNull(cVar);
                                    cVar.b(str4, null);
                                }
                                break;
                            default:
                                g gVar3 = this.f3495b;
                                int i16 = g.f3496m;
                                j0.i(gVar3, "this$0");
                                e eVarB = ma.g.b();
                                Context contextRequireContext2 = gVar3.requireContext();
                                j0.h(contextRequireContext2, "requireContext()");
                                Objects.requireNonNull(eVarB);
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + contextRequireContext2.getPackageName() + "&referrer=utm_source%3Dshare_my_app");
                                intent.setType("text/plain");
                                contextRequireContext2.startActivity(Intent.createChooser(intent, null));
                                ma.h.f33410y.a().j();
                                break;
                        }
                        return true;
                    }
                });
            }
            b bVar27 = this.f3497k;
            int iIntValue9 = (bVar27 == null || (num = bVar27.B) == null) ? R.drawable.ph_app_version : num.intValue();
            Preference preferenceA3 = a("pref_app_version");
            if (preferenceA3 != null) {
                c(preferenceA3, iIntValue9);
                preferenceA3.B(new Preference.c(this) { // from class: bb.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f3495b;

                    {
                        this.f3495b = this;
                    }

                    @Override // androidx.preference.Preference.c
                    public final boolean a(Preference preference7) {
                        String str4;
                        switch (i12) {
                            case 0:
                                g gVar = this.f3495b;
                                int i14 = g.f3496m;
                                j0.i(gVar, "this$0");
                                c0.z(i.l(gVar), null, null, new h(gVar, null), 3, null);
                                break;
                            case 1:
                                g gVar2 = this.f3495b;
                                int i15 = g.f3496m;
                                j0.i(gVar2, "this$0");
                                b bVar110 = gVar2.f3497k;
                                if (bVar110 != null && (str4 = bVar110.D) != null) {
                                    PhDeleteAccountActivity.c cVar = gVar2.f3498l;
                                    Objects.requireNonNull(cVar);
                                    cVar.b(str4, null);
                                }
                                break;
                            default:
                                g gVar3 = this.f3495b;
                                int i16 = g.f3496m;
                                j0.i(gVar3, "this$0");
                                e eVarB = ma.g.b();
                                Context contextRequireContext2 = gVar3.requireContext();
                                j0.h(contextRequireContext2, "requireContext()");
                                Objects.requireNonNull(eVarB);
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + contextRequireContext2.getPackageName() + "&referrer=utm_source%3Dshare_my_app");
                                intent.setType("text/plain");
                                contextRequireContext2.startActivity(Intent.createChooser(intent, null));
                                ma.h.f33410y.a().j();
                                break;
                        }
                        return true;
                    }
                });
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void c(Preference preference, int i10) {
        int i11;
        b bVar = this.f3497k;
        if ((bVar == null || bVar.C) ? false : true) {
            if (preference.C) {
                preference.C = false;
                preference.m();
            }
            if (preference.f2294l != null) {
                preference.f2294l = null;
                preference.f2293k = 0;
                preference.m();
                return;
            }
            return;
        }
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.settingsSectionIconColor, typedValue, true);
        int i12 = typedValue.data;
        preference.A(i10);
        if (preference.f2294l == null && (i11 = preference.f2293k) != 0) {
            preference.f2294l = e.a.b(preference.f2285c, i11);
        }
        Drawable drawable = preference.f2294l;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b.g(drawable, i12);
        }
    }
}
