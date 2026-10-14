package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Preference {
    public long O;

    public b(Context context, List<Preference> list, long j10) {
        super(context);
        this.F = R.layout.expand_button;
        A(R.drawable.ic_arrow_down_24dp);
        E(this.f2285c.getString(R.string.expand_button_title));
        C(androidx.room.g.MAX_BIND_PARAMETER_CNT);
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequence = preference.f2291i;
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.J)) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.f2285c.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        D(string);
        this.O = j10 + 1000000;
    }

    @Override // androidx.preference.Preference
    public long d() {
        return this.O;
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        super.q(mVar);
        mVar.f2393d = false;
    }
}
