package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a T;
    public CharSequence U;
    public CharSequence V;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            Objects.requireNonNull(SwitchPreferenceCompat.this);
            SwitchPreferenceCompat.this.I(z10);
        }
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.T = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2407m, i10, i11);
        K(g0.j.g(typedArrayObtainStyledAttributes, 7, 0));
        String string = typedArrayObtainStyledAttributes.getString(6);
        J(string == null ? typedArrayObtainStyledAttributes.getString(1) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        this.U = string2 == null ? typedArrayObtainStyledAttributes.getString(3) : string2;
        m();
        String string3 = typedArrayObtainStyledAttributes.getString(8);
        this.V = string3 == null ? typedArrayObtainStyledAttributes.getString(4) : string3;
        m();
        this.S = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.U);
            switchCompat.setTextOff(this.V);
            switchCompat.setOnCheckedChangeListener(this.T);
        }
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        super.q(mVar);
        N(mVar.a(R.id.switchWidget));
        M(mVar);
    }

    @Override // androidx.preference.Preference
    public void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.f2285c.getSystemService("accessibility")).isEnabled()) {
            N(view.findViewById(R.id.switchWidget));
            L(view.findViewById(android.R.id.summary));
        }
    }
}
