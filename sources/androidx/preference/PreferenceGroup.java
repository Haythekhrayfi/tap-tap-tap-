package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final q.h<String, Long> O;
    public final List<Preference> P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2311c;

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
            this.f2311c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f2311c = i10;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2311c);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.O = new q.h<>();
        new Handler(Looper.getMainLooper());
        this.Q = true;
        this.R = 0;
        this.S = false;
        this.T = Integer.MAX_VALUE;
        this.P = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2403i, i10, i11);
        this.Q = g0.j.b(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            L(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public <T extends Preference> T I(CharSequence charSequence) {
        T t10;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f2295m, charSequence)) {
            return this;
        }
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            PreferenceGroup preferenceGroup = (T) J(i10);
            if (TextUtils.equals(preferenceGroup.f2295m, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t10 = (T) preferenceGroup.I(charSequence)) != null) {
                return t10;
            }
        }
        return null;
    }

    public Preference J(int i10) {
        return this.P.get(i10);
    }

    public int K() {
        return this.P.size();
    }

    public void L(int i10) {
        if (i10 != Integer.MAX_VALUE && !k()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.T = i10;
    }

    @Override // androidx.preference.Preference
    public void b(Bundle bundle) {
        super.b(bundle);
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            J(i10).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void c(Bundle bundle) {
        super.c(bundle);
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            J(i10).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void n(boolean z10) {
        super.n(z10);
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            Preference preferenceJ = J(i10);
            if (preferenceJ.f2305w == z10) {
                preferenceJ.f2305w = !z10;
                preferenceJ.n(preferenceJ.G());
                preferenceJ.m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public void o() {
        super.o();
        this.S = true;
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            J(i10).o();
        }
    }

    @Override // androidx.preference.Preference
    public void s() {
        super.s();
        this.S = false;
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            J(i10).s();
        }
    }

    @Override // androidx.preference.Preference
    public void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.T = savedState.f2311c;
        super.u(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        return new SavedState(super.v(), this.T);
    }
}
