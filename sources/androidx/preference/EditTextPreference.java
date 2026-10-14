package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String U;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2280c;

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
            this.f2280c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f2280c);
        }
    }

    public static final class a implements Preference.e<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f2281a;

        @Override // androidx.preference.Preference.e
        public CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.U) ? editTextPreference.f2285c.getString(R.string.not_set) : editTextPreference.U;
        }
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2398d, i10, i11);
        if (g0.j.b(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (a.f2281a == null) {
                a.f2281a = new a();
            }
            this.M = a.f2281a;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean G() {
        return TextUtils.isEmpty(this.U) || super.G();
    }

    public void I(String str) {
        boolean zG = G();
        this.U = str;
        y(str);
        boolean zG2 = G();
        if (zG2 != zG) {
            n(zG2);
        }
        m();
    }

    @Override // androidx.preference.Preference
    public Object t(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        I(savedState.f2280c);
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        Parcelable parcelableV = super.v();
        if (this.f2301s) {
            return parcelableV;
        }
        SavedState savedState = new SavedState(parcelableV);
        savedState.f2280c = this.U;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void w(Object obj) {
        I(g((String) obj));
    }
}
