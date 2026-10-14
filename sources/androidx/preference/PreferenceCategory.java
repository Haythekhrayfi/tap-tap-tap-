package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean G() {
        return !super.l();
    }

    @Override // androidx.preference.Preference
    public boolean l() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        super.q(mVar);
        if (Build.VERSION.SDK_INT >= 28) {
            mVar.itemView.setAccessibilityHeading(true);
        }
    }
}
