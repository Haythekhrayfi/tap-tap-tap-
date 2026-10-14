package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean O;
    public CharSequence P;
    public CharSequence Q;
    public boolean R;
    public boolean S;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2319c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2319c = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2319c ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean G() {
        boolean z10;
        if (this.S) {
            z10 = this.O;
        } else {
            z10 = !this.O;
        }
        return z10 || super.G();
    }

    public void I(boolean z10) {
        boolean z11 = this.O != z10;
        if (z11 || !this.R) {
            this.O = z10;
            this.R = true;
            if (H() && z10 != e(!z10)) {
                i();
                SharedPreferences.Editor editorA = this.f2286d.a();
                editorA.putBoolean(this.f2295m, z10);
                if (!this.f2286d.f2380e) {
                    editorA.apply();
                }
            }
            if (z11) {
                n(G());
                m();
            }
        }
    }

    public void J(CharSequence charSequence) {
        this.Q = charSequence;
        if (this.O) {
            return;
        }
        m();
    }

    public void K(CharSequence charSequence) {
        this.P = charSequence;
        if (this.O) {
            m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public void L(View view) {
        CharSequence charSequence;
        int i10;
        CharSequence charSequenceJ;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            boolean z10 = true;
            if (!this.O || TextUtils.isEmpty(this.P)) {
                if (!this.O && !TextUtils.isEmpty(this.Q)) {
                    charSequence = this.Q;
                }
                if (z10) {
                    charSequenceJ = j();
                    if (!TextUtils.isEmpty(charSequenceJ)) {
                        textView.setText(charSequenceJ);
                        z10 = false;
                    }
                }
                i10 = z10 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            charSequence = this.P;
            textView.setText(charSequence);
            z10 = false;
            if (z10) {
                charSequenceJ = j();
                if (!TextUtils.isEmpty(charSequenceJ)) {
                    textView.setText(charSequenceJ);
                    z10 = false;
                }
            }
            if (z10) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    public void M(m mVar) {
        L(mVar.a(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public void r() {
        I(!this.O);
    }

    @Override // androidx.preference.Preference
    public Object t(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        I(savedState.f2319c);
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        Parcelable parcelableV = super.v();
        if (this.f2301s) {
            return parcelableV;
        }
        SavedState savedState = new SavedState(parcelableV);
        savedState.f2319c = this.O;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void w(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        I(e(((Boolean) obj).booleanValue()));
    }
}
