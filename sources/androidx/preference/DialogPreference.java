package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.joran.action.Action;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence O;
    public CharSequence P;
    public Drawable Q;
    public CharSequence R;
    public CharSequence S;
    public int T;

    public interface a {
        <T extends Preference> T a(CharSequence charSequence);
    }

    public DialogPreference(Context context) {
        this(context, null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2397c, i10, i11);
        String strG = g0.j.g(typedArrayObtainStyledAttributes, 9, 0);
        this.O = strG;
        if (strG == null) {
            this.O = this.f2291i;
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        this.P = string == null ? typedArrayObtainStyledAttributes.getString(1) : string;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.Q = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = typedArrayObtainStyledAttributes.getString(11);
        this.R = string2 == null ? typedArrayObtainStyledAttributes.getString(3) : string2;
        String string3 = typedArrayObtainStyledAttributes.getString(10);
        this.S = string3 == null ? typedArrayObtainStyledAttributes.getString(4) : string3;
        this.T = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void r() {
        androidx.fragment.app.k dVar;
        k.a aVar = this.f2286d.f2384i;
        if (aVar != null) {
            g gVar = (g) aVar;
            boolean zA = false;
            for (Fragment parentFragment = gVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof g.d) {
                    zA = ((g.d) parentFragment).a(gVar, this);
                }
            }
            if (!zA && (gVar.getContext() instanceof g.d)) {
                zA = ((g.d) gVar.getContext()).a(gVar, this);
            }
            if (!zA && (gVar.getActivity() instanceof g.d)) {
                zA = ((g.d) gVar.getActivity()).a(gVar, this);
            }
            if (!zA && gVar.getParentFragmentManager().F("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f2295m;
                    dVar = new androidx.preference.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString(Action.KEY_ATTRIBUTE, str);
                    dVar.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f2295m;
                    dVar = new c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString(Action.KEY_ATTRIBUTE, str2);
                    dVar.setArguments(bundle2);
                } else {
                    if (!(this instanceof MultiSelectListPreference)) {
                        StringBuilder sbA = defpackage.a.a("Cannot display dialog for an unknown Preference type: ");
                        sbA.append(getClass().getSimpleName());
                        sbA.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    String str3 = this.f2295m;
                    dVar = new d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString(Action.KEY_ATTRIBUTE, str3);
                    dVar.setArguments(bundle3);
                }
                dVar.setTargetFragment(gVar, 0);
                dVar.show(gVar.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }
}
