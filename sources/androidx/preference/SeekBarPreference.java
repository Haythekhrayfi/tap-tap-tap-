package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public SeekBar T;
    public TextView U;
    public boolean V;
    public boolean W;
    public boolean X;
    public final SeekBar.OnSeekBarChangeListener Y;
    public final View.OnKeyListener Z;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2314e;

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
            this.f2312c = parcel.readInt();
            this.f2313d = parcel.readInt();
            this.f2314e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2312c);
            parcel.writeInt(this.f2313d);
            parcel.writeInt(this.f2314e);
        }
    }

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.X || !seekBarPreference.S) {
                    int progress = seekBar.getProgress() + seekBarPreference.P;
                    if (progress != seekBarPreference.O) {
                        seekBarPreference.I(progress, false);
                        return;
                    }
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.J(i10 + seekBarPreference2.P);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.S = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference.this.S = false;
            int progress2 = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            int i10 = seekBarPreference.P;
            if (progress2 + i10 == seekBarPreference.O || (progress = seekBar.getProgress() + i10) == seekBarPreference.O) {
                return;
            }
            seekBarPreference.I(progress, false);
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.V && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.T;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context) {
        this(context, null);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Y = new a();
        this.Z = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2405k, i10, i11);
        this.P = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i13 = this.P;
        i12 = i12 < i13 ? i13 : i12;
        if (i12 != this.Q) {
            this.Q = i12;
            m();
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i14 != this.R) {
            this.R = Math.min(this.Q - this.P, Math.abs(i14));
            m();
        }
        this.V = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.W = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.X = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void I(int i10, boolean z10) {
        int i11 = this.P;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.Q;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.O) {
            this.O = i10;
            J(i10);
            if (H() && i10 != f(~i10)) {
                i();
                SharedPreferences.Editor editorA = this.f2286d.a();
                editorA.putInt(this.f2295m, i10);
                if (!this.f2286d.f2380e) {
                    editorA.apply();
                }
            }
            if (z10) {
                m();
            }
        }
    }

    public void J(int i10) {
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        super.q(mVar);
        mVar.itemView.setOnKeyListener(this.Z);
        this.T = (SeekBar) mVar.a(R.id.seekbar);
        TextView textView = (TextView) mVar.a(R.id.seekbar_value);
        this.U = textView;
        if (this.W) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.U = null;
        }
        SeekBar seekBar = this.T;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.Y);
        this.T.setMax(this.Q - this.P);
        int i10 = this.R;
        if (i10 != 0) {
            this.T.setKeyProgressIncrement(i10);
        } else {
            this.R = this.T.getKeyProgressIncrement();
        }
        this.T.setProgress(this.O - this.P);
        J(this.O);
        this.T.setEnabled(l());
    }

    @Override // androidx.preference.Preference
    public Object t(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        this.O = savedState.f2312c;
        this.P = savedState.f2313d;
        this.Q = savedState.f2314e;
        m();
    }

    @Override // androidx.preference.Preference
    public Parcelable v() {
        Parcelable parcelableV = super.v();
        if (this.f2301s) {
            return parcelableV;
        }
        SavedState savedState = new SavedState(parcelableV);
        savedState.f2312c = this.O;
        savedState.f2313d = this.P;
        savedState.f2314e = this.Q;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void w(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        I(f(((Integer) obj).intValue()), true);
    }
}
