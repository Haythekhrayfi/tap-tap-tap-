package xa;

import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
import bb.e;
import com.google.android.gms.common.Scopes;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.OpenSettingsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PremiumSupportPreference;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import fd.j0;
import gb.q;
import java.util.Objects;
import ma.g;
import ma.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Preference.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37579a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37581c;

    public /* synthetic */ b(Context context, PremiumSupportPreference premiumSupportPreference) {
        this.f37581c = context;
        this.f37580b = premiumSupportPreference;
    }

    public /* synthetic */ b(PremiumPreference premiumPreference, Context context) {
        this.f37580b = premiumPreference;
        this.f37581c = context;
    }

    public /* synthetic */ b(OpenSettingsPreference openSettingsPreference, Context context) {
        this.f37580b = openSettingsPreference;
        this.f37581c = context;
    }

    @Override // androidx.preference.Preference.c
    public final boolean a(Preference preference) {
        switch (this.f37579a) {
            case 0:
                PremiumPreference premiumPreference = (PremiumPreference) this.f37580b;
                Context context = this.f37581c;
                j0.i(premiumPreference, "this$0");
                j0.i(context, "$context");
                if (!premiumPreference.I()) {
                    Preference.c cVar = premiumPreference.Q;
                    if (cVar != null) {
                        return cVar.a(preference);
                    }
                    return false;
                }
                if (!(context instanceof Activity)) {
                    return true;
                }
                h.q(h.f33410y.a(), com.zipoapps.premiumhelper.a.EnumC0235a.PREFERENCE + '_' + premiumPreference.f2295m, 0, 0, 6);
                return true;
            case 1:
                OpenSettingsPreference openSettingsPreference = (OpenSettingsPreference) this.f37580b;
                Context context2 = this.f37581c;
                j0.i(openSettingsPreference, "this$0");
                j0.i(context2, "$context");
                bb.b.a aVar = new bb.b.a(openSettingsPreference.O, openSettingsPreference.P);
                String str = openSettingsPreference.Q;
                if (str != null) {
                    aVar.f3490d = str;
                }
                PHSettingsActivity.Companion.a(context2, aVar.a(), PHSettingsActivity.class);
                return true;
            default:
                Context context3 = this.f37581c;
                PremiumSupportPreference premiumSupportPreference = (PremiumSupportPreference) this.f37580b;
                j0.i(context3, "$context");
                j0.i(premiumSupportPreference, "this$0");
                e eVarB = g.b();
                String str2 = premiumSupportPreference.R;
                String str3 = premiumSupportPreference.S;
                Objects.requireNonNull(eVarB);
                j0.i(str2, Scopes.EMAIL);
                Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                if (activity != null) {
                    q.c(activity, str2, str3);
                }
                return true;
        }
    }
}
