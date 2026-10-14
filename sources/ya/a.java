package ya;

import android.app.Activity;
import android.content.Context;
import androidx.activity.i;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import bb.c;
import fd.j0;
import java.util.Objects;
import ma.g;
import ma.h;
import oa.b;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Preference.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f44804b;

    public /* synthetic */ a(Context context, int i10) {
        this.f44803a = i10;
        if (i10 != 1) {
        }
        this.f44804b = context;
    }

    @Override // androidx.preference.Preference.c
    public final boolean a(Preference preference) {
        Activity activity;
        switch (this.f44803a) {
            case 0:
                Context context = this.f44804b;
                j0.i(context, "$context");
                Objects.requireNonNull(g.b());
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    c0.z(i.l(appCompatActivity), null, null, new c(context, null), 3, null);
                }
                break;
            case 1:
                Context context2 = this.f44804b;
                j0.i(context2, "$context");
                Objects.requireNonNull(g.b());
                activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    com.zipoapps.premiumhelper.util.c.o(activity, (String) h.f33410y.a().f33418g.h(b.f34203z));
                }
                break;
            case 2:
                Context context3 = this.f44804b;
                j0.i(context3, "$context");
                Objects.requireNonNull(g.b());
                AppCompatActivity appCompatActivity2 = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                if (appCompatActivity2 != null) {
                    FragmentManager supportFragmentManager = appCompatActivity2.getSupportFragmentManager();
                    j0.h(supportFragmentManager, "it.supportFragmentManager");
                    h.f33410y.a().f33424m.e(supportFragmentManager, -1, "preferences", null);
                }
                break;
            default:
                Context context4 = this.f44804b;
                j0.i(context4, "$context");
                Objects.requireNonNull(g.b());
                activity = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity != null) {
                    com.zipoapps.premiumhelper.util.c.o(activity, (String) h.f33410y.a().f33418g.h(b.f34202y));
                }
                break;
        }
        return true;
    }
}
