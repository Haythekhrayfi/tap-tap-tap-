package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] U;
    public CharSequence[] V;
    public String W;
    public String X;
    public boolean Y;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2282c;

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
            this.f2282c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f2282c);
        }
    }

    public static final class a implements Preference.e<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f2283a;

        @Override // androidx.preference.Preference.e
        public CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.K()) ? listPreference.f2285c.getString(R.string.not_set) : listPreference.K();
        }
    }

    public ListPreference(Context context) {
        this(context, null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2399e, i10, i11);
        this.U = g0.j.h(typedArrayObtainStyledAttributes, 2, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(3);
        this.V = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (a.f2283a == null) {
                a.f2283a = new a();
            }
            this.M = a.f2283a;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n.f2401g, i10, i11);
        this.X = g0.j.g(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public void D(CharSequence charSequence) {
        super.D(charSequence);
        this.X = charSequence.toString();
    }

    public int I(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.V) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.V[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] J() {
        return this.U;
    }

    public CharSequence K() {
        CharSequence[] charSequenceArr;
        int I = I(this.W);
        if (I < 0 || (charSequenceArr = this.U) == null) {
            return null;
        }
        return charSequenceArr[I];
    }

    public void L(String str) {
        boolean z10 = !TextUtils.equals(this.W, str);
        if (z10 || !this.Y) {
            this.W = str;
            this.Y = true;
            y(str);
            if (z10) {
                m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence j() {
        Preference.e eVar = this.M;
        if (eVar != null) {
            return eVar.a(this);
        }
        CharSequence charSequenceK = K();
        CharSequence charSequenceJ = super.j();
        String str = this.X;
        if (str == null) {
            return charSequenceJ;
        }
        Object[] objArr = new Object[1];
        if (charSequenceK == null) {
            charSequenceK = "";
        }
        objArr[0] = charSequenceK;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceJ)) {
            return charSequenceJ;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
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
        L(savedState.f2282c);
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        Parcelable parcelableV = super.v();
        if (this.f2301s) {
            return parcelableV;
        }
        SavedState savedState = new SavedState(parcelableV);
        savedState.f2282c = this.W;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void w(Object obj) {
        L(g((String) obj));
    }
}
