package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean U;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g0.j.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.U = true;
    }

    @Override // androidx.preference.Preference
    public void r() {
        k.b bVar;
        if (this.f2296n != null || this.f2297o != null || K() == 0 || (bVar = this.f2286d.f2385j) == null) {
            return;
        }
        g gVar = (g) bVar;
        boolean zA = false;
        for (Fragment parentFragment = gVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof g.f) {
                zA = ((g.f) parentFragment).a(gVar, this);
            }
        }
        if (!zA && (gVar.getContext() instanceof g.f)) {
            zA = ((g.f) gVar.getContext()).a(gVar, this);
        }
        if (zA || !(gVar.getActivity() instanceof g.f)) {
            return;
        }
        ((g.f) gVar.getActivity()).a(gVar, this);
    }
}
