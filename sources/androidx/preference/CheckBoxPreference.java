package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a T;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            Objects.requireNonNull(CheckBoxPreference.this);
            CheckBoxPreference.this.I(z10);
        }
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.T = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2396b, i10, i11);
        K(g0.j.g(typedArrayObtainStyledAttributes, 5, 0));
        String string = typedArrayObtainStyledAttributes.getString(4);
        J(string == null ? typedArrayObtainStyledAttributes.getString(1) : string);
        this.S = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.T);
        }
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        super.q(mVar);
        N(mVar.a(android.R.id.checkbox));
        M(mVar);
    }

    @Override // androidx.preference.Preference
    public void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.f2285c.getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(android.R.id.checkbox));
            L(view.findViewById(android.R.id.summary));
        }
    }
}
