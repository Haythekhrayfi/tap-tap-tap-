package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.inscode.autoclicker.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] U;
    public CharSequence[] V;
    public Set<String> W;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f2284c;

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
            int i10 = parcel.readInt();
            this.f2284c = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f2284c, strArr);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2284c.size());
            Set<String> set = this.f2284c;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context) {
        this(context, null);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.W = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2400f, i10, i11);
        this.U = g0.j.h(typedArrayObtainStyledAttributes, 2, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(3);
        this.V = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray;
        typedArrayObtainStyledAttributes.recycle();
    }

    public void I(Set<String> set) {
        this.W.clear();
        this.W.addAll(set);
        if (H() && !set.equals(h(null))) {
            i();
            SharedPreferences.Editor editorA = this.f2286d.a();
            editorA.putStringSet(this.f2295m, set);
            if (!this.f2286d.f2380e) {
                editorA.apply();
            }
        }
        m();
    }

    @Override // androidx.preference.Preference
    public Object t(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        I(savedState.f2284c);
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        Parcelable parcelableV = super.v();
        if (this.f2301s) {
            return parcelableV;
        }
        SavedState savedState = new SavedState(parcelableV);
        savedState.f2284c = this.W;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void w(Object obj) {
        I(h((Set) obj));
    }
}
