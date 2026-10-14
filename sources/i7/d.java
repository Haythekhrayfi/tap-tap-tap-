package i7;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.accessibility.AccessibilityManager;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f31301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f31302b;

    public d(AccessibilityManager accessibilityManager, SharedPreferences sharedPreferences) {
        j0.i(accessibilityManager, "accessibilityManager");
        j0.i(sharedPreferences, "sharedPreferences");
        this.f31301a = accessibilityManager;
        this.f31302b = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x003f A[ORIG_RETURN, RETURN] */
    public final boolean a(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String string = context.getString(R.string.service_id);
        j0.h(string, "context.getString(R.string.service_id)");
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f31301a.getEnabledAccessibilityServiceList(16);
        j0.h(enabledAccessibilityServiceList, "list");
        for (Object obj : enabledAccessibilityServiceList) {
            if (j0.d(((AccessibilityServiceInfo) obj).getId(), string)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void b(boolean z10) {
        this.f31302b.edit().putBoolean("battery_optimization_settin", z10).apply();
    }
}
